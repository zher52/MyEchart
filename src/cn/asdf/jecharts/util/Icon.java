package cn.asdf.jecharts.util;

/**
 * Created by ddfan on 2016/10/9.
 */
public class Icon implements ObjectValue{
    private String value;

    public final static Icon CIRCLE = new Icon("circle");
    public final static Icon RECT = new Icon("rect");
    public final static Icon ROUND_RECT = new Icon("roundRect");
    public final static Icon TRIANGLE = new Icon("triangle");
    public final static Icon DIAMOND = new Icon("diamond");
    public final static Icon PIN = new Icon("pin");
    public final static Icon ARROW = new Icon("arrow");

    public static Icon image(String path){
        if(path==null||path.length()<1)
            return null;
        return new Icon("image://"+path);
    }

    public static Icon svg(String path){
        if(path==null||path.length()<1)
            return null;
        return new Icon("path://"+path);
    }



    private Icon(String value){
        this.value=value;
    }



    @Override
    public Object getValue() {
        return value;
    }
}
