package cn.asdf.jecharts.util.component;

import cn.asdf.jecharts.util.EColor;
import cn.asdf.jecharts.util.Component;

/**
 * Created by ddfan on 2016/10/8.
 */
@Component
public class Shadow {
    private Double shadowBlur;//图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
    private EColor shadowColor;//阴影颜色
    private Double shadowOffsetX;//阴影水平方向上的偏移距离
    private Double shadowOffsetY;//阴影垂直方向上的偏移距离

    public Double getShadowBlur() {
        return shadowBlur;
    }

    public Shadow setShadowBlur(Double shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public EColor getShadowColor() {
        return shadowColor;
    }

    public Shadow setShadowColor(EColor shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Double getShadowOffsetX() {
        return shadowOffsetX;
    }

    public Shadow setShadowOffsetX(Double shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Double getShadowOffsetY() {
        return shadowOffsetY;
    }

    public Shadow setShadowOffsetY(Double shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }
}
