package dao;

import java.io.IOException;

import com.google.gson.Gson;

import core.IForecast;
import core.Util;
import entity.WeathermapResponse;

public class OpenWeathermap implements IForecast<WeathermapResponse> {

	@Override
	public WeathermapResponse getForecastModel() {
		String url = "http://api.openweathermap.org/data/2.5/weather?id=745044&APPID=1b48b7fba7765c6124a6164178e0772a";
		try {
			String json = Util.get(url);
			WeathermapResponse data = new Gson().fromJson(json, WeathermapResponse.class);
			return data;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}