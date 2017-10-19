package com.raisesail.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ruandongdong on 10/19/17.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }


}
