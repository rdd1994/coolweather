package com.raisesail.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ruandongdong on 10/19/17.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
