package yulongproductions.com.stormy.weather;

/**
 * Created by Yulong on 11/19/2015.
 */
public class Forecast {
    private Current mCurrentWeather;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;

    public Current getCurrentWeather() {
        return mCurrentWeather;
    }

    public void setCurrentWeather(Current currentWeather) {
        mCurrentWeather = currentWeather;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
