package cn.asdf.jecharts.util;

/**
 * 文本水平对齐
 * Created by ddfan on 2016/9/29.
 */
public enum Align {
    LEFT("left"),CENTER("center"),RIGHT("right");

    private String value;

    Align(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
}
