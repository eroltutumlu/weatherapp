package entity;

import java.util.List;

public class WeathermapResponse {
	
	private String cod;
	private String name;
	private List<Weather> weather;
	private Main main;
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	
	@Override
	public String toString() {
		return "WeathermapResponse [cod=" + cod + ", name=" + name + ", weather=" + weather + ", main=" + main + "]";
	}
	
	
}




