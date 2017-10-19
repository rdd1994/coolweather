package com.raisesail.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ruandongdong on 9/28/17.
 */

public class HttpUitl {

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();

        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
