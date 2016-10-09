package cn.asdf.jecharts.util;

/**
 * Created by ddfan on 2016/9/30.
 */
public class SelectedMode implements ObjectValue{
    private Object value;

    public static final SelectedMode TRUE=new SelectedMode(true);
    public static final SelectedMode FALSE=new SelectedMode(false);
    public static final SelectedMode SINGLE=new SelectedMode("single");
    public static final SelectedMode MULTIPLE=new SelectedMode("multiple");

    private SelectedMode(Object value){
        this.value=value;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
