package com.example.weather.api;

import java.util.Scanner;

import constant.WeatherApiType;
import core.ForecastFactory;
import core.IForecast;
import core.Logger;
import dao.OpenWeathermap;
import core.ILog;
import entity.WeathermapResponse;
import service.WeatherService;

public class App {
	
    public static void main( String[] args ){
    	
        Scanner input = new Scanner(System.in);
        System.out.println("YAHOO 1, WEATHERMAP 2");    	
        String option = input.nextLine();
        WeathermapResponse response = null;
        if(option.equals("1")) {
        	response = WeatherService.getWeatherResponse("İstanbul", WeatherApiType.YAHOO);
        }
        
        if(option.equals("2")) {
        	response = WeatherService.getWeatherResponse("İstanbul", WeatherApiType.WEATHERAPIMAP);
        }        
    	
    	System.out.println(response);
    	

    }
}
