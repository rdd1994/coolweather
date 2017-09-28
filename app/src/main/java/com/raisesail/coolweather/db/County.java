package com.raisesail.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ruandongdong on 9/28/17.
 */

public class County extends DataSupport {

    private int id;

    private String CountyName;

    private String weatherId;

    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
