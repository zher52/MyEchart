package cn.asdf.jecharts.util;

/**
 * 距离
 * Created by ddfan on 2016/9/29.
 */
public class Range implements ObjectValue{

    public static final Range AUTO=new Range("auto");//自动
    private Object value;

    public static class LeftOrRight{
        public static final Range CENTER=new Range("center");//居中
        public static final Range LEFT=new Range("left");//靠左
        public static final Range RIGHT=new Range("right");//靠右
    }
    public  static class TopOrBottom{
        public static final Range CENTER=new Range("center");//居中
        public static final Range TOP=new Range("top");//靠上
        public static final Range BOTTOM=new Range("bottom");//靠下
    }

    public Range(){
      this("auto");
    }
    Range(Object value){
        this.value=value;
    }

    @Override
    public Object getValue() {
        return value;
    }

    /**
     * 固定大小的距离
     * @param number    大小
     * @return
     */
    public static Range number(double number){
        return new Range(number);
    }

    /**
     * 百分比距离
     * @param number    百分比
     * @return
     */
    public static Range percent(double number){
        return new Range(number+"%");
    }

}
