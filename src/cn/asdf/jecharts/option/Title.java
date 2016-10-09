package cn.asdf.jecharts.option;

import cn.asdf.jecharts.util.*;
import cn.asdf.jecharts.util.Align;
import cn.asdf.jecharts.util.component.Border;
import cn.asdf.jecharts.util.component.Margin;
import cn.asdf.jecharts.util.component.Shadow;
import cn.asdf.jecharts.util.text.TextBaseline;
import cn.asdf.jecharts.util.text.TextStyle;



/**
 * 标题
 * Created by ddfan on 2016/9/29.
 */
public class Title {
    private Boolean show;  //是否显示标题组件 [ default: true ]
    private String text;    //主标题文本，支持使用 \n 换行。[ default: '' ]
    private String link;    //主标题文本超链接。[ default: '' ]
    private Target target;  //指定窗口打开主标题超链接。[ default: Target.blank]
    private TextStyle textStyle;    //标题文本格式
    private Align textAlign;    //标题文本水平对齐
    private TextBaseline textBaseline;  //标题文本垂直对齐
    private String subtext; //副标题文本，支持使用 \n 换行
    private String sublink; //副标题文本超链接
    private Target subtarget;   //指定窗口打开副标题超链接
    private TextStyle subtextStyle;//副标题文本格式
    private Padding padding;    //标题内边距，单位px，默认各方向内边距为5，
    private Double itemGap; //主副标题之间的间距。
    /*
     zlevel用于 Canvas 分层，不同zlevel值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。
     我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的zlevel。
     需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃。
    zlevel 大的 Canvas 会放在 zlevel 小的 Canvas 的上面。
    * */
    private Double zlevel;  //所有图形的 zlevel 值。
    /*
    z相比zlevel优先级更低，而且不会创建新的 Canvas。
    *  */
    private Double z;   //组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖。
    private Border border;
    private Margin margin;
    private Shadow shadow;

    private EColor backgroundColor;//标题背景色，默认透明


    public Title setShow(Boolean show) {
        this.show = show;
        return this;
    }

    public String getText() {
        return text;
    }

    public Title setText(String text) {
        this.text = text;
        return this;
    }

    public String getLink() {
        return link;
    }

    public Title setLink(String link) {
        this.link = link;
        return this;
    }

    public Target getTarget() {
        return target;
    }

    public Title setTarget(Target target) {
        this.target = target;
        return this;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public Title setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Align getTextAlign() {
        return textAlign;
    }

    public Title setTextAlign(Align textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public TextBaseline getTextBaseline() {
        return textBaseline;
    }

    public Title setTextBaseline(TextBaseline textBaseline) {
        this.textBaseline = textBaseline;
        return this;
    }

    public String getSubtext() {
        return subtext;
    }

    public Title setSubtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    public String getSublink() {
        return sublink;
    }

    public Title setSublink(String sublink) {
        this.sublink = sublink;
        return this;
    }

    public Target getSubtarget() {
        return subtarget;
    }

    public Title setSubtarget(Target subtarget) {
        this.subtarget = subtarget;
        return this;
    }

    public TextStyle getSubtextStyle() {
        return subtextStyle;
    }

    public Title setSubtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        return this;
    }

    public Padding getPadding() {
        return padding;
    }

    public Title setPadding(Padding padding) {
        this.padding = padding;
        return this;
    }

    public Double getItemGap() {
        return itemGap;
    }

    public Title setItemGap(Double itemGap) {
        this.itemGap = itemGap;
        return this;
    }

    public Double getZlevel() {
        return zlevel;
    }

    public Title setZlevel(Double zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public Double getZ() {
        return z;
    }

    public Title setZ(Double z) {
        this.z = z;
        return this;
    }



    public EColor getBackgroundColor() {
        return backgroundColor;
    }

    public Title setBackgroundColor(EColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Border getBorder() {
        return border;
    }

    public Title setBorder(Border border) {
        this.border = border;
        return this;
    }

    public Boolean getShow() {
        return show;
    }

    public Margin getMargin() {
        return margin;
    }

    public Title setMargin(Margin margin) {
        this.margin = margin;
        return this;
    }

    public Shadow getShadow() {
        return shadow;
    }

    public Title setShadow(Shadow shadow) {
        this.shadow = shadow;
        return this;
    }
}
