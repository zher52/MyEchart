package cn.asdf.jecharts.util;

/**
 * 超链接打开方式
 * Created by ddfan on 2016/9/29.
 */
public enum Target {


    SELF("self"),BLANK("blank");
    private String value;
    Target(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
