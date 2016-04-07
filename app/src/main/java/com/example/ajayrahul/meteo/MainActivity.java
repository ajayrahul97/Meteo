package com.example.ajayrahul.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ajayrahul.meteo.data.model.Query;
import com.example.ajayrahul.meteo.data.model.Weather;
import com.example.ajayrahul.meteo.data.remote.WeatherApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView city,info,temp,cond;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = (TextView) findViewById(R.id.city);
        info = (TextView) findViewById(R.id.info);
        temp = (TextView) findViewById(R.id.temp);
        cond = (TextView) findViewById(R.id.cond);
        b = (Button) findViewById(R.id.ref);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WeatherApi.Factory.getInstance().getWeather().enqueue(new Callback<Weather>() {
                    @Override
                    public void onResponse(Call<Weather> call, Response<Weather> response) {
                        Query wquery=response.body().getQuery();
                        temp.setText(wquery.getResults().getChannel().getItem().getCondition().getTemp()+" C");
                        city.setText(wquery.getResults().getChannel().getLocation().getCity());
                        info.setText(wquery.getResults().getChannel().getLastBuildDate());
                        cond.setText(wquery.getResults().getChannel().getItem().getCondition().getText());

                    }

                    @Override
                    public void onFailure(Call<Weather> call, Throwable t) {
                        Log.e("Failed", t.getMessage());
                    }
                });

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        b.performClick();

    }
}
