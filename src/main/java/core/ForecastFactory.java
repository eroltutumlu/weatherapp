package core;

import constant.WeatherApiType;
import dao.OpenWeathermap;
import dao.YahooWeather;

public class ForecastFactory {
	public IForecast getForecast(WeatherApiType type){
		
		if(type == WeatherApiType.YAHOO)
			return new YahooWeather();

		if(type == WeatherApiType.WEATHERAPIMAP)
			return new OpenWeathermap();
		
		return null;
	}
}
