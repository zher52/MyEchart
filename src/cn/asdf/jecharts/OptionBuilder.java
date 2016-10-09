package cn.asdf.jecharts;

import cn.asdf.jecharts.util.JSObject;
import cn.asdf.jecharts.util.Component;
import cn.asdf.jecharts.util.json.EJson;
import cn.asdf.jecharts.util.ObjectValue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 配置项生成工具
 * @author ddfan
 * @version 2016-10-9
 * Created by ddfan on 2016/9/29.
 */
public class OptionBuilder {

    /**
     * 获取option的Json格式
     * @param option    Option对象
     * @param json  Json转换工具
     * @return  Json格式串
     */
    public static String getOptionJson(Option option, EJson json){
        return getOptionJson(option,null,json);
    }

    /**
     *获取Option的Json格式
     * @param option    Option对象
     * @param jsObjMap  JS对象列表(列表中的对象原样输出)
     * @param json  Json转换工具
     * @return  Json格式串
     */
    public static String getOptionJson(Option option,Map<String,String>jsObjMap, EJson json){
        return getObjectJson(option,jsObjMap,json);

    }

    /**
     * 获取对象的Json格式
     * @param object    转换对象
     * @param jsObjMap  JS对象列表(列表中的对象原样输出)
     * @param json  Json转换工具
     * @return  Json格式串
     */
    public static String getObjectJson(Object object,Map<String,String>jsObjMap, EJson json){
        if(jsObjMap==null)
            jsObjMap=new HashMap<>();
        String value=json.toJson(warp(object,jsObjMap));
        for(String key:jsObjMap.keySet()){
            value=value.replace("\""+key+"\"",jsObjMap.get(key));
        }
        return value;
    }

    /**
     * 对象预处理方法
     *  将对象转换成map,去除null值,预转义JSObject,处理类的混合
     * @param obj   待处理对象
     * @param jsObjMap  JS对象表
     * @return  基本数据类型及ObjectValue类型返回值,对象返回map
     */
    private static Object warp(Object obj, Map<String,String>jsObjMap){
        if (obj!=null&&obj.getClass().getPackage().getName().startsWith("cn.asdf.jecharts")) {
            if(obj instanceof JSObject){//判断是否为JSObject
                String strVal=((JSObject) obj).getValue();
                String uuid="$"+UUID.randomUUID().toString()+"$";
                jsObjMap.put(uuid,strVal);
                return uuid;
            }
            if (obj instanceof ObjectValue){
                ObjectValue objValue = (ObjectValue) obj;
                return warp(objValue.getValue(),jsObjMap);
            }
            Map<String, Object> map = null;
            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (Modifier.isFinal(field.getModifiers())) {
                    continue;
                }
                String name = field.getName();
                if(name==null||name.length()==0){
                    continue;
                }
                Method m = null;
                try {
                    // (field.getType().equals(Boolean.class) ? "is" : "get")
                    String getMethodName ="get"+ name.substring(0, 1).toUpperCase() + name.substring(1);
                    m = obj.getClass().getMethod(getMethodName);
                    Object value = m.invoke(obj);
                    if (value != null) {
                        if(map==null){
                            map=new HashMap<>();
                        }
                        if(value.getClass().isAnnotationPresent(Component.class)){//混合对象属性到所属对象
                            map.putAll((Map) warp(value,jsObjMap));
                        }else if(value.getClass().isEnum()){//混合对象属性到所属对象
                            map.put(name,value.toString());
                        }else{
                            map.put(name, warp(value,jsObjMap));
                        }
                    }
                } catch (NoSuchMethodException e) {
                    System.out.println("不存在方法:["+e.getMessage()+"]");
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return map;
        } else {
            return obj;
        }

    }
}
