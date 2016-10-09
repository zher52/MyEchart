package cn.asdf.jecharts.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 内边距，单位px
 * Created by ddfan on 2016/9/29.
 */
public class Padding implements ObjectValue{

    private List<Double> value=new ArrayList();

     private  Padding(double both){
         value.add(both);
     }
    private Padding(double topAndBottom,double leftAndRight) {
        value.add(topAndBottom);
        value.add(leftAndRight);
     }
    private Padding(double top,double right,double bottom,double left){
        value.add(top);
        value.add(right);
        value.add(bottom);
        value.add(left);
     }

    @Override
    public Object getValue() {
        return value.size()==1?value.get(0):value;
    }

    public static Padding padding(double both){
         return new Padding(both);
     }
    public static Padding padding(double topAndBottom,double leftAndRight){
        return new Padding(topAndBottom,leftAndRight);
    }
    public static Padding padding(double top,double right,double bottom,double left){
        return new Padding(top,right,bottom,left);
    }

}
