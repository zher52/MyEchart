package cn.asdf.jecharts.util;

/**
 * Created by ddfan on 2016/9/30.
 */
public enum Orient {

    HORIZONTAL("horizontal"),VERTICAL("vertical");
    private String value;
    Orient(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
