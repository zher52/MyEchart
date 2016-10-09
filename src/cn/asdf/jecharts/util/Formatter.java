package cn.asdf.jecharts.util;

/**
 * Created by ddfan on 2016/9/30.
 */
public class Formatter implements ObjectValue{
    private Object value;

    private Formatter(Object value){
        this.value=value;
    }

    public static Formatter formatter(String template){
        return new Formatter(template);
    }

    public static Formatter formatter(Function function){
        return new Formatter(function);
    }

    @Override
    public Object getValue() {
        return value;
    }
}
