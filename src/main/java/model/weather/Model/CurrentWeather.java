package model.weather.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {

    @JsonAlias("dt")
    private long dateTime;

    private long sunrise;
    private long sunset;
    private int temp;

    @JsonAlias("feels_like")
    private int feelsLike;

    private int pressure;
    private int humidity;

    @JsonAlias("dew_point")
    private int dewPoint;

    private int uvi;
    private int clouds;
    private int visibility;

    @JsonAlias("wind_speed")
    private int windSpeed;

    @JsonAlias("wind_deg")
    private int windDegree;

    @JsonAlias("wind_gust")
    private int windGust;

    private List<WeatherCondition> weather;

    // Assuming the "rain" field is optional and may not always be present
    private Rain rain;

    // Getters and Setters for all fields
    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(int dewPoint) {
        this.dewPoint = dewPoint;
    }

    public int getUvi() {
        return uvi;
    }

    public void setUvi(int uvi) {
        this.uvi = uvi;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    public int getWindGust() {
        return windGust;
    }

    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    public List<WeatherCondition> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherCondition> weather) {
        this.weather = weather;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WeatherCondition {
        private int id;
        private String main;
        private String description;
        private String icon;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getMain() {
            return main;
        }
        public void setMain(String main) {
            this.main = main;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getIcon() {
            return icon;
        }
        public void setIcon(String icon) {
            this.icon = icon;
        }

        // Getters and Setters
    }



    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rain {

        @JsonAlias("1h")
        private int rain1h;

        public int getRain1h() {
            return rain1h;
        }

        public void setRain1h(int rain1h) {
            this.rain1h = rain1h;
        }

        // Getters and Setters
    }
    
    // Standard getters and setters...
}
