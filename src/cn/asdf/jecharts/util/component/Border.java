package cn.asdf.jecharts.util.component;

import cn.asdf.jecharts.util.EColor;
import cn.asdf.jecharts.util.Component;

/**
 * Created by ddfan on 2016/10/8.
 */
@Component
public class Border{

    private EColor borderColor;//标题的边框颜色
    private Double borderWidth;//标题的边框线宽

    public EColor getBorderColor() {
        return borderColor;
    }

    public Border setBorderColor(EColor borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Double getBorderWidth() {
        return borderWidth;
    }

    public Border setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }
}
