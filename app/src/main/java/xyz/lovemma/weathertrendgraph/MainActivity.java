package xyz.lovemma.weathertrendgraph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private WeatherTrendGraph mWeatherTrendGraph;
    private List<Weather> mWeathers = new ArrayList<>();
    private Weather weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeatherTrendGraph = (WeatherTrendGraph) findViewById(R.id.weatherTrendGraph);
        weather = new Weather(28, 16, "2017-04-18");
        mWeathers.add(weather);
        weather = new Weather(30, 17, "2017-04-19");
        mWeathers.add(weather);
        weather = new Weather(23, 13, "2017-04-20");
        mWeathers.add(weather);
        weather = new Weather(20, 13, "2017-04-21");
        mWeathers.add(weather);
        weather = new Weather(25, 17, "2017-04-22");
        mWeathers.add(weather);
        weather = new Weather(27, 17, "2017-04-23");
        mWeathers.add(weather);
        weather = new Weather(22, 16, "2017-04-24");
        mWeathers.add(weather);
        weather = new Weather(20, 14, "2017-04-25");
        mWeathers.add(weather);
        mWeatherTrendGraph.setWeathers(mWeathers);
    }
}
