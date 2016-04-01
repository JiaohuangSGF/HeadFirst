package ObserverDesign.entity;

import ObserverDesign.DisplayElement;
import ObserverDesign.Observer;

public class CurrentCondistionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentCondistionsDisplay(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions:"+temperature+"温度"+humidity+"湿度");
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}


}
