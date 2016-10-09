package cn.asdf.jecharts.util;

import java.awt.*;

/**
 * 颜色
 * Created by ddfan on 2016/9/29.
 */
public class EColor implements ObjectValue{


    public static final EColor TRANSPARENT=new EColor("transparent");//透明

    public static final EColor ALICE_BLUE	= new EColor(	"#F0F8FF");
    public static final EColor ANTIQUE_WHITE	= new EColor(	"#FAEBD7");
    public static final EColor AQUA	= new EColor(	"#00FFFF");
    public static final EColor AQUAMARINE	= new EColor(	"#7FFFD4");
    public static final EColor AZURE	= new EColor(	"#F0FFFF");
    public static final EColor BEIGE	= new EColor(	"#F5F5DC");
    public static final EColor BISQUE	= new EColor(	"#FFE4C4");
    public static final EColor BLACK	= new EColor(	"#000000");
    public static final EColor BLANCHED_ALMOND	= new EColor(	"#FFEBCD");
    public static final EColor BLUE	= new EColor(	"#0000FF");
    public static final EColor BLUE_VIOLET	= new EColor(	"#8A2BE2");
    public static final EColor BROWN	= new EColor(	"#A52A2A");
    public static final EColor BURLY_WOOD	= new EColor(	"#DEB887");
    public static final EColor CADET_BLUE	= new EColor(	"#5F9EA0");
    public static final EColor CHARTREUSE	= new EColor(	"#7FFF00");
    public static final EColor CHOCOLATE	= new EColor(	"#D2691E");
    public static final EColor CORAL	= new EColor(	"#FF7F50");
    public static final EColor CORNFLOWER_BLUE	= new EColor(	"#6495ED");
    public static final EColor CORN_SILK	= new EColor(	"#FFF8DC");
    public static final EColor CRIMSON	= new EColor(	"#DC143C");
    public static final EColor CYAN	= new EColor(	"#00FFFF");
    public static final EColor DARK_BLUE	= new EColor(	"#00008B");
    public static final EColor DARK_CYAN	= new EColor(	"#008B8B");
    public static final EColor DARK_GOLDENROD	= new EColor(	"#B8860B");
    public static final EColor DARK_GRAY	= new EColor(	"#A9A9A9");
    public static final EColor DARK_GREEN	= new EColor(	"#006400");
    public static final EColor DARK_KHAKI	= new EColor(	"#BDB76B");
    public static final EColor DARK_MAGENTA	= new EColor(	"#8B008B");
    public static final EColor DARK_OLIVE_GREEN	= new EColor(	"#556B2F");
    public static final EColor DARK_ORANGE	= new EColor(	"#FF8C00");
    public static final EColor DARK_ORCHID	= new EColor(	"#9932CC");
    public static final EColor DARK_RED	= new EColor(	"#8B0000");
    public static final EColor DARK_SALMON	= new EColor(	"#E9967A");
    public static final EColor DARK_SEA_GREEN	= new EColor(	"#8FBC8F");
    public static final EColor DARK_SLATE_BLUE	= new EColor(	"#483D8B");
    public static final EColor DARK_SLATE_GRAY	= new EColor(	"#2F4F4F");
    public static final EColor DARK_TURQUOISE	= new EColor(	"#00CED1");
    public static final EColor DARK_VIOLET	= new EColor(	"#9400D3");
    public static final EColor DEEP_PINK	= new EColor(	"#FF1493");
    public static final EColor DEEP_SKY_BLUE	= new EColor(	"#00BFFF");
    public static final EColor DIM_GRAY	= new EColor(	"#696969");
    public static final EColor DODGER_BLUE	= new EColor(	"#1E90FF");
    public static final EColor FELDSPAR	= new EColor(	"#D19275");
    public static final EColor FIRE_BRICK	= new EColor(	"#B22222");
    public static final EColor FLORAL_WHITE	= new EColor(	"#FFFAF0");
    public static final EColor FOREST_GREEN	= new EColor(	"#228B22");
    public static final EColor FUCHSIA	= new EColor(	"#FF00FF");
    public static final EColor GAINSBORO	= new EColor(	"#DCDCDC");
    public static final EColor GHOST_WHITE	= new EColor(	"#F8F8FF");
    public static final EColor GOLD	= new EColor(	"#FFD700");
    public static final EColor GOLDEN_ROD	= new EColor(	"#DAA520");
    public static final EColor GRAY	= new EColor(	"#808080");
    public static final EColor GREEN	= new EColor(	"#008000");
    public static final EColor GREEN_YELLOW	= new EColor(	"#ADFF2F");
    public static final EColor HONEY_DEW	= new EColor(	"#F0FFF0");
    public static final EColor HOT_PINK	= new EColor(	"#FF69B4");
    public static final EColor INDIAN_RED	= new EColor(	"#CD5C5C");
    public static final EColor INDIGO	= new EColor(	"#4B0082");
    public static final EColor IVORY	= new EColor(	"#FFFFF0");
    public static final EColor KHAKI	= new EColor(	"#F0E68C");
    public static final EColor LAVENDER	= new EColor(	"#E6E6FA");
    public static final EColor LAVENDER_BLUSH	= new EColor(	"#FFF0F5");
    public static final EColor LAWN_GREEN	= new EColor(	"#7CFC00");
    public static final EColor LEMON_CHIFFON	= new EColor(	"#FFFACD");
    public static final EColor LIGHT_BLUE	= new EColor(	"#ADD8E6");
    public static final EColor LIGHT_CORAL	= new EColor(	"#F08080");
    public static final EColor LIGHT_CYAN	= new EColor(	"#E0FFFF");
    public static final EColor LIGHT_GOLDEN_ROD_YELLOW	= new EColor(	"#FAFAD2");
    public static final EColor LIGHT_GREY	= new EColor(	"#D3D3D3");
    public static final EColor LIGHT_GREEN	= new EColor(	"#90EE90");
    public static final EColor LIGHT_PINK	= new EColor(	"#FFB6C1");
    public static final EColor LIGHT_SALMON	= new EColor(	"#FFA07A");
    public static final EColor LIGHT_SEA_GREEN	= new EColor(	"#20B2AA");
    public static final EColor LIGHT_SKY_BLUE	= new EColor(	"#87CEFA");
    public static final EColor LIGHT_SLATE_BLUE	= new EColor(	"#8470FF");
    public static final EColor LIGHT_SLATE_GRAY	= new EColor(	"#778899");
    public static final EColor LIGHT_STEEL_BLUE	= new EColor(	"#B0C4DE");
    public static final EColor LIGHT_YELLOW	= new EColor(	"#FFFFE0");
    public static final EColor LIME	= new EColor(	"#00FF00");
    public static final EColor LIME_GREEN	= new EColor(	"#32CD32");
    public static final EColor LINEN	= new EColor(	"#FAF0E6");
    public static final EColor MAGENTA	= new EColor(	"#FF00FF");
    public static final EColor MAROON	= new EColor(	"#800000");
    public static final EColor MEDIUM_AQUAMARINE	= new EColor(	"#66CDAA");
    public static final EColor MEDIUM_BLUE	= new EColor(	"#0000CD");
    public static final EColor MEDIUM_ORCHID	= new EColor(	"#BA55D3");
    public static final EColor MEDIUM_PURPLE	= new EColor(	"#9370D8");
    public static final EColor MEDIUM_SEA_GREEN	= new EColor(	"#3CB371");
    public static final EColor MEDIUM_SLATE_BLUE	= new EColor(	"#7B68EE");
    public static final EColor MEDIUM_SPRING_GREEN	= new EColor(	"#00FA9A");
    public static final EColor MEDIUM_TURQUOISE	= new EColor(	"#48D1CC");
    public static final EColor MEDIUM_VIOLET_RED	= new EColor(	"#C71585");
    public static final EColor MIDNIGHT_BLUE	= new EColor(	"#191970");
    public static final EColor MINT_CREAM	= new EColor(	"#F5FFFA");
    public static final EColor MISTY_ROSE	= new EColor(	"#FFE4E1");
    public static final EColor MOCCASIN	= new EColor(	"#FFE4B5");
    public static final EColor NAVAJO_WHITE	= new EColor(	"#FFDEAD");
    public static final EColor NAVY	= new EColor(	"#000080");
    public static final EColor OLD_LACE	= new EColor(	"#FDF5E6");
    public static final EColor OLIVE	= new EColor(	"#808000");
    public static final EColor OLIVE_DRAB	= new EColor(	"#6B8E23");
    public static final EColor ORANGE	= new EColor(	"#FFA500");
    public static final EColor ORANGE_RED	= new EColor(	"#FF4500");
    public static final EColor ORCHID	= new EColor(	"#DA70D6");
    public static final EColor PALE_GOLDENROD	= new EColor(	"#EEE8AA");
    public static final EColor PALE_GREEN	= new EColor(	"#98FB98");
    public static final EColor PALE_TURQUOISE	= new EColor(	"#AFEEEE");
    public static final EColor PALE_VIOLET_RED	= new EColor(	"#D87093");
    public static final EColor PAPAYA_WHIP	= new EColor(	"#FFEFD5");
    public static final EColor PEACH_PUFF	= new EColor(	"#FFDAB9");
    public static final EColor PERU	= new EColor(	"#CD853F");
    public static final EColor PINK	= new EColor(	"#FFC0CB");
    public static final EColor PLUM	= new EColor(	"#DDA0DD");
    public static final EColor POWDER_BLUE	= new EColor(	"#B0E0E6");
    public static final EColor PURPLE	= new EColor(	"#800080");
    public static final EColor RED	= new EColor(	"#FF0000");
    public static final EColor ROSY_BROWN	= new EColor(	"#BC8F8F");
    public static final EColor ROYAL_BLUE	= new EColor(	"#4169E1");
    public static final EColor SADDLE_BROWN	= new EColor(	"#8B4513");
    public static final EColor SALMON	= new EColor(	"#FA8072");
    public static final EColor SANDY_BROWN	= new EColor(	"#F4A460");
    public static final EColor SEA_GREEN	= new EColor(	"#2E8B57");
    public static final EColor SEA_SHELL	= new EColor(	"#FFF5EE");
    public static final EColor SIENNA	= new EColor(	"#A0522D");
    public static final EColor SILVER	= new EColor(	"#C0C0C0");
    public static final EColor SKY_BLUE	= new EColor(	"#87CEEB");
    public static final EColor SLATE_BLUE	= new EColor(	"#6A5ACD");
    public static final EColor SLATE_GRAY	= new EColor(	"#708090");
    public static final EColor SNOW	= new EColor(	"#FFFAFA");
    public static final EColor SPRING_GREEN	= new EColor(	"#00FF7F");
    public static final EColor STEEL_BLUE	= new EColor(	"#4682B4");
    public static final EColor TAN	= new EColor(	"#D2B48C");
    public static final EColor TEAL	= new EColor(	"#008080");
    public static final EColor THISTLE	= new EColor(	"#D8BFD8");
    public static final EColor TOMATO	= new EColor(	"#FF6347");
    public static final EColor TURQUOISE	= new EColor(	"#40E0D0");
    public static final EColor VIOLET	= new EColor(	"#EE82EE");
    public static final EColor VIOLET_RED	= new EColor(	"#D02090");
    public static final EColor WHEAT	= new EColor(	"#F5DEB3");
    public static final EColor WHITE	= new EColor(	"#FFFFFF");
    public static final EColor WHITE_SMOKE	= new EColor(	"#F5F5F5");
    public static final EColor YELLOW	= new EColor(	"#FFFF00");
    public static final EColor YELLOW_GREEN	= new EColor(	"#9ACD32");


    private String value;

    private EColor(String value){
        this.value=value;
    }

    @Override
    public Object getValue() {
        return this.value;
    }


    /**
     * 转义指定的颜色
     * @param color 颜色
     * @return
     */
    public static EColor color(Color color){
        return rgba(color.getRed(),color.getGreen(),color.getBlue(),color.getAlpha());
    }

    /**
     * 转义指定的颜色字符串 支持red green等颜色名称及#FFFFFF等16禁止颜色样式
     * @param color 颜色字符
     * @return
     */
    public static EColor color(String color){
        return new EColor(color);
    }

    /**
     * 转义RGB颜色
     * @param red   红色值
     * @param green 绿色值
     * @param blue  蓝色值
     * @return
     */
    public static EColor rgb(int red, int green, int blue){
        return new EColor("rgb("+red+","+green+","+blue+")");
    }

    /**
     * 转义RGBA颜色
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @return
     */
    public static EColor rgba(int red, int green, int blue, int alpha){
        return new EColor("rgba("+red+","+green+","+blue+","+alpha+")");
    }
}
