package cn.asdf.jecharts.test;

import cn.asdf.jecharts.Option;
import cn.asdf.jecharts.OptionBuilder;
import cn.asdf.jecharts.option.Title;
import cn.asdf.jecharts.util.*;
import cn.asdf.jecharts.util.component.Border;
import cn.asdf.jecharts.util.component.Margin;
import cn.asdf.jecharts.util.json.GsonJson;


/**
 * Created by ddfan on 2016/9/29.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(OptionBuilder
                .getObjectJson(new Option().setTitle(
                        new Title().setText("Confidence Band")
                                .setSubtext("Example in MetricsGraphics.js")
                                .setMargin(new Margin().setLeft(Range.AUTO))
                                .setBorder(new Border().setBorderColor(EColor.Aqua).setBorderWidth(12d))
                                .setTarget(Target.BLANK)
                        ),null,new GsonJson()));




    }

}
