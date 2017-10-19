package com.raisesail.coolweather.util;

import android.text.TextUtils;

import com.raisesail.coolweather.db.City;
import com.raisesail.coolweather.db.County;
import com.raisesail.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ruandongdong on 9/28/17.
 */

public class Utility {


    /**
     * 解析和处理服务器返回的省级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);

                for(int i =0 ;i<allProvinces.length();i++){
                    JSONObject provincesObject = allProvinces.getJSONObject(i);

                    Province province = new Province();
                    province.setProvinceCode(provincesObject.getInt("id"));
                    province.setProvinceName(provincesObject.getString("name"));
                    province.save();

                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }


    /**
     * 解析和处理服务器返回的市级数据
     * @param response
     * @return
     */
    public static boolean handleCityResponse(String response , int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);

                for(int i =0 ;i<allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);

                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();

                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 解析处理服务器返回的县级数据
     * @param response
     * @param cityId
     * @return
     */
    public static boolean handleCountyResponse(String response , int cityId){

        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for(int i=0; i<allCounties.length();i++){
                    JSONObject countyObject= allCounties.getJSONObject(i);
                    County county= new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);

                    county.save();

                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }



}