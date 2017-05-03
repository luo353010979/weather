package android.weather.com.weather.gson;

/**
 * Created by Administrator on 2017/5/2 0002.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
