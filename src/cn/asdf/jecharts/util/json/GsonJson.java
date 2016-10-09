package cn.asdf.jecharts.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by ddfan on 2016/9/29.
 */
public class GsonJson implements EJson {
    @Override
    public String toJson(Object obj) {
        GsonBuilder builder=new GsonBuilder();
        return new Gson().toJson(obj);
    }
}
