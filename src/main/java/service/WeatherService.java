package service;

import constant.WeatherApiType;
import core.ForecastFactory;
import core.Logger;
import entity.WeathermapResponse;

public class WeatherService {
	
	public static WeathermapResponse getWeatherResponse(String city, WeatherApiType type) {
		
		WeathermapResponse response = (WeathermapResponse) new ForecastFactory().getForecast(type).getForecastModel();
		Logger.getInstance().logToTxtFile(city, response.toString());
		return response;
	}
	
}
