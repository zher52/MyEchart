package cn.asdf.jecharts.util.text;

import cn.asdf.jecharts.util.EColor;
import cn.asdf.jecharts.util.text.font.FontStyle;
import cn.asdf.jecharts.util.text.font.FontWeight;


/**
 * 文本样式
 * Created by ddfan on 2016/9/29.
 */
public class TextStyle {
    private EColor color;//文字颜色
    private FontStyle fontStyle;//字体风格
    private FontWeight fontWeight;//文字字体的粗细
    private String fontFamily;//文字字体
    private Double fontSize;//字体大小

    public EColor getColor() {
        return color;
    }

    public TextStyle setColor(EColor color) {
        this.color = color;
        return this;
    }

    public FontStyle getFontStyle() {
        return fontStyle;
    }

    public TextStyle setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public Object getFontWeight() {
        return fontWeight;
    }

    public TextStyle setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public TextStyle setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public TextStyle setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }
}
