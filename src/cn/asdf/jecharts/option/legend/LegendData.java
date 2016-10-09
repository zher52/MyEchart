package cn.asdf.jecharts.option.legend;

import cn.asdf.jecharts.util.Icon;
import cn.asdf.jecharts.util.text.TextStyle;

/**
 * 图例数据
 * @author ddfan
 * @version 2016-10-9
 */
public class LegendData {
    private String name;//图例名称
    private Icon icon;//图例图标
    private TextStyle textStyle;//图例文本样式

    public String getName() {
        return name;
    }

    public LegendData setName(String name) {
        this.name = name;
        return this;
    }

    public Icon getIcon() {
        return icon;
    }

    public LegendData setIcon(Icon icon) {
        this.icon = icon;
        return this;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public LegendData setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
