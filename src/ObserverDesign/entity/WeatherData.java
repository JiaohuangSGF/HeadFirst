package ObserverDesign.entity;

import java.util.ArrayList;

import ObserverDesign.Observer;
import ObserverDesign.Subject;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;	//观察者
	private float temperature;	//温度
	private float humidity;		//湿度
	private float pressure;		//气压
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(o);
		}
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanges() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanges();
	}
	
}
