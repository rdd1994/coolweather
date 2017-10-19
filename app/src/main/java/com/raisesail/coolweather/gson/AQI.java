package com.raisesail.coolweather.gson;

/**
 * Created by ruandongdong on 10/19/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        
       public String aqi;

       public String pm25;
    }
}
