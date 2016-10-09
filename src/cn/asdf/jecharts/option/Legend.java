package cn.asdf.jecharts.option;

import cn.asdf.jecharts.option.legend.LegendData;
import cn.asdf.jecharts.util.*;
import cn.asdf.jecharts.util.component.Border;
import cn.asdf.jecharts.util.component.Margin;
import cn.asdf.jecharts.util.component.Shadow;
import cn.asdf.jecharts.util.text.TextStyle;

import java.util.Map;

/**
 *图例
 * @author ddfan
 * @version 2016-10-9
 */
public class Legend {
    private Boolean show;
    private Double zlevel;
    private Double z;
    private Range width;
    private Range height;
    private Orient orient;
    private Align align;
    private Padding padding;
    private Double itemGap;
    private Double itemWidth;
    private Double itemHeight;
    private Formatter formatter;
    private SelectedMode selectedMode;
    private EColor inactiveColor;
    private Map<String,Boolean> selected;
    private TextStyle textStyle;
    private Tooltip tooltip;
    private LegendData[]data;//图例
    private Border border;//边框
    private Shadow shadow;//阴影
    private EColor backgroundColor;//背景颜色
    private Margin margin;//边距

    public Formatter getFormatter() {
        return formatter;
    }

    public Legend setFormatter(Formatter formatter) {
        this.formatter = formatter;
        return this;
    }

    public Boolean getShow() {
        return show;
    }

    public Legend setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public Double getZlevel() {
        return zlevel;
    }

    public Legend setZlevel(Double zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public Double getZ() {
        return z;
    }

    public Legend setZ(Double z) {
        this.z = z;
        return this;
    }

    public Range getWidth() {
        return width;
    }

    public Legend setWidth(Range width) {
        this.width = width;
        return this;
    }

    public Range getHeight() {
        return height;
    }

    public Legend setHeight(Range height) {
        this.height = height;
        return this;
    }

    public Orient getOrient() {
        return orient;
    }

    public Legend setOrient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Align getAlign() {
        return align;
    }

    public Legend setAlign(Align align) {
        this.align = align;
        return this;
    }

    public Padding getPadding() {
        return padding;
    }

    public Legend setPadding(Padding padding) {
        this.padding = padding;
        return this;
    }

    public Double getItemGap() {
        return itemGap;
    }

    public Legend setItemGap(Double itemGap) {
        this.itemGap = itemGap;
        return this;
    }

    public Double getItemWidth() {
        return itemWidth;
    }

    public Legend setItemWidth(Double itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Double getItemHeight() {
        return itemHeight;
    }

    public Legend setItemHeight(Double itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public SelectedMode getSelectedMode() {
        return selectedMode;
    }

    public Legend setSelectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public EColor getInactiveColor() {
        return inactiveColor;
    }

    public Legend setInactiveColor(EColor inactiveColor) {
        this.inactiveColor = inactiveColor;
        return this;
    }

    public Map<String, Boolean> getSelected() {
        return selected;
    }

    public Legend setSelected(Map<String, Boolean> selected) {
        this.selected = selected;
        return this;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public Legend setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public Legend setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public LegendData[] getData() {
        return data;
    }

    public Legend setData(LegendData[] data) {
        this.data = data;
        return this;
    }

    public Border getBorder() {
        return border;
    }

    public Legend setBorder(Border border) {
        this.border = border;
        return this;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public Legend setShadow(Shadow shadow) {
        this.shadow = shadow;
        return this;
    }

    public EColor getBackgroundColor() {
        return backgroundColor;
    }

    public Legend setBackgroundColor(EColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Margin getMargin() {
        return margin;
    }

    public Legend setMargin(Margin margin) {
        this.margin = margin;
        return this;
    }
}
