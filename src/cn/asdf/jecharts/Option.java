package cn.asdf.jecharts;

import cn.asdf.jecharts.option.Legend;
import cn.asdf.jecharts.option.Title;

/**
 * Created by ddfan on 2016/9/29.
 */
public class Option {
    private Title title;
    private Legend legend;


    public Title getTitle() {
        return title;
    }

    public Option setTitle(Title title) {
        this.title = title;
        return this;
    }

    public Legend getLegend() {
        return legend;
    }

    public Option setLegend(Legend legend) {
        this.legend = legend;
        return this;
    }
}
