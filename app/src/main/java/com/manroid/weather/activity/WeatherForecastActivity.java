package com.manroid.weather.activity;

import android.os.Bundle;

import com.manroid.weather.GoodWeatherApp;
import com.manroid.weather.R;
import com.manroid.weather.base.BaseActivity;

public class WeatherForecastActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((GoodWeatherApp) getApplication()).applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_forecast);
    }
}
