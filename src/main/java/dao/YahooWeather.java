package dao;

import java.util.ArrayList;
import java.util.List;

import core.IForecast;
import entity.Weather;
import entity.WeathermapResponse;

public class YahooWeather implements IForecast<WeathermapResponse> {

	@Override
	public WeathermapResponse getForecastModel() {
		// https://developer.yahoo.com/api/
		// Get response
		// map to WeathermapResponse
		
		// MOCK
		WeathermapResponse response = new WeathermapResponse();
		Weather weather = new Weather();
		weather.setDescription("Bulutlu");
		weather.setMain("Az bulutlu");
		List<Weather> weatherList = new ArrayList<>();
		weatherList.add(weather);
		response.setWeather(weatherList);
		response.setCod("200");
		return response;
	}

}
