package com.zhou.demo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 15:08 2017/7/3
 */
public class GsonUtils {
    /**
     *  不忽略null
     */
   private static Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd").create();

    public static Gson GsonInstance() {
        return gson;
    }

}
