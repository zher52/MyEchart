package cn.asdf.jecharts.util.text.font;

import cn.asdf.jecharts.util.ObjectValue;

/**
 * 文字字体的粗细
 * 值越大越粗
 * Created by ddfan on 2016/9/29.
 */
public class FontWeight implements ObjectValue{
    public static final FontWeight normal=new FontWeight("normal");//普通
    public static final FontWeight bold=new FontWeight("bold");//粗体
    public static final FontWeight bolder=new FontWeight("bolder");//粗体
    public static final FontWeight lighter=new FontWeight("lighter");//效果与普通相等
    public static final FontWeight _100=new FontWeight(100);
    public static final FontWeight _200=new FontWeight(200);
    public static final FontWeight _300=new FontWeight(300);
    public static final FontWeight _400=new FontWeight(400);
    public static final FontWeight _500=new FontWeight(500);
    public static final FontWeight _600=new FontWeight(600);
    public static final FontWeight _700=new FontWeight(700);
    public static final FontWeight _800=new FontWeight(800);
    public static final FontWeight _900=new FontWeight(900);

    private Object value;
    private FontWeight(Object value){
        this.value=value;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
