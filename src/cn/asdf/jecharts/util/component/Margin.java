package cn.asdf.jecharts.util.component;

import cn.asdf.jecharts.util.Component;
import cn.asdf.jecharts.util.Range;

/**
 * Created by ddfan on 2016/10/8.
 */
@Component
public class Margin {
    private Range left;//grid 组件离容器左侧的距离。
    private Range top;//grid 组件离容器顶部的距离。
    private Range right;//grid 组件离容器右侧的距离。
    private Range bottom;//grid 组件离容器底部的距离。

    public Range getLeft() {
        return left;
    }

    public Margin setLeft(Range left) {
        this.left = left;
        return this;
    }

    public Range getTop() {
        return top;
    }

    public Margin setTop(Range top) {
        this.top = top;
        return this;
    }

    public Range getRight() {
        return right;
    }

    public Margin setRight(Range right) {
        this.right = right;
        return this;
    }

    public Range getBottom() {
        return bottom;
    }

    public Margin setBottom(Range bottom) {
        this.bottom = bottom;
        return this;
    }
}
