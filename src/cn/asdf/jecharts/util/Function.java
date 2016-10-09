package cn.asdf.jecharts.util;

import java.io.*;
import java.util.Map;

/**
 * Created by ddfan on 2016/9/30.
 */

public class Function implements JSObject{

    private String value;

    private Function(String function){
        this.value=function;
    }
    public static Function function(String function){
        return new Function(function);
    }

    public static Function function(File funcJsFile) throws FileNotFoundException,IOException{
        String function=null;
        if(funcJsFile!=null&&funcJsFile.exists()){
            FileReader fr=new FileReader(funcJsFile);
            BufferedReader br=new BufferedReader(fr);
            String str=null;
            while((str=br.readLine())!=null){
                function=function==null?"":function+" ";
                function+=str;
            }
            br.close();
            fr.close();
        }
        return new Function(function);
    }

    @Override
    public String getValue() {
        return value;
    }

}
