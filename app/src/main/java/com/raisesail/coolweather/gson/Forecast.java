package com.raisesail.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ruandongdong on 10/19/17.
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More{

        @SerializedName("txt_d")
        public String info;
    }

    private class Temperature {

        public String max;

        public String min;
    }
}
