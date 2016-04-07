package com.example.ajayrahul.meteo.data.remote;

import com.example.ajayrahul.meteo.data.model.Weather;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ajayrahul on 7/4/16.
 */
public interface WeatherApi {

    String BASE_URL= " https://query.yahooapis.com/v1/public/";

        @GET("yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22Roorkee%2C%20in%22)%20and%20u%3D%27c%27&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
        Call<Weather> getWeather();



    class Factory{

        private static WeatherApi service;
        public  static WeatherApi getInstance(){

            if (service==null) {

                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();

                WeatherApi service = retrofit.create(WeatherApi.class);
                return service;
            }
            else
                return service;


        }
    }



}
