package app.common;

public class List {

	private Integer dt;
	private Integer sunrise;
	private Integer sunset;
	private Temp temp;
	private FeelsLike feelsLike;
	private Integer pressure;
	private Integer humidity;
	private java.util.List<Weather> weather = null;
	private Double speed;
	private Integer deg;
	private Double gust;
	private Integer clouds;
	private Integer pop;
	private Double rain;
	
	public Integer getDt() {
		return dt;
	}
	
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	
	public Integer getSunrise() {
		return sunrise;
	}
	
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	
	public Integer getSunset() {
		return sunset;
	}
	
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	
	public Temp getTemp() {
		return temp;
	}
	
	public void setTemp(Temp temp) {
		this.temp = temp;
	}
	
	public FeelsLike getFeelsLike() {
		return feelsLike;
	}
	
	public void setFeelsLike(FeelsLike feelsLike) {
		this.feelsLike = feelsLike;
	}
	
	public Integer getPressure() {
		return pressure;
	}
	
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	
	public Integer getHumidity() {
		return humidity;
	}
	
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	
	public java.util.List<Weather> getWeather() {
		return weather;
	}
	
	public void setWeather(java.util.List<Weather> weather) {
		this.weather = weather;
	}
	
	public Double getSpeed() {
		return speed;
	}
	
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	
	public Integer getDeg() {
		return deg;
	}
	
	public void setDeg(Integer deg) {
		this.deg = deg;
	}
	
	public Double getGust() {
		return gust;
	}
	
	public void setGust(Double gust) {
		this.gust = gust;
	}
	
	public Integer getClouds() {
		return clouds;
	}
	
	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}
	
	public Integer getPop() {
		return pop;
	}
	
	public void setPop(Integer pop) {
		this.pop = pop;
	}
	
	public Double getRain() {
		return rain;
	}
	
	public void setRain(Double rain) {
		this.rain = rain;
	}
	
	public Double calculateCn2() {
		//Double Cn2 = null;
		Double a1 = 3.8E-14;
		Double b1 = 2.0E-15;
		Double c1 = -2.8E-15;
		Double c2 = 2.9E-17;
		Double c3 = -1.1E-19;
		Double d1 = -2.5E-15;
		Double d2 = 1.2E-15;
		Double d3 = -8.5E-17;
		Double e = -5.3E-13;
		
		Double tp = (double) ((this.sunset - this.sunrise)/12);
		Double th = (this.dt - this.sunrise)/tp;
		//System.out.println(th);
		Double w = this.th_To_w(th);
		Double Cn2 = a1*w + b1*this.temp.getDay() + c1*(this.humidity/100) + c2*(this.humidity/100)*(this.humidity/100) + 
					c3*(this.humidity/100)*(this.humidity/100)*(this.humidity/100) + d1*this.speed + d2*this.speed*this.speed +
					d3*this.speed*this.speed*this.speed + e;
		
		return Cn2;
	
	}
	
	private Double th_To_w(Double th) {
		Double w = null;
		
		if(th<-3) 				w = 0.11;
		if(th>=-3 && th<-2) 	w = 0.07;
		if(th>=-2 && th<-1) 	w = 0.08;
		if(th>=-1 && th<0) 		w = 0.06;
		if(th>=0 && th<1)	 	w = 0.05;
		if(th>=1 && th<2)		w = 0.10;
		if(th>=2 && th<3) 		w = 0.51;
		if(th>=3 && th<4) 		w = 0.75;
		if(th>=4 && th<5) 		w = 0.95;
		if(th>=5 && th<6) 		w = 1.00;
		if(th>=6 && th<7) 		w = 0.90;
		if(th>=7 && th<8) 		w = 0.80;
		if(th>=8 && th<9) 		w = 0.59;
		if(th>=9 && th<10) 		w = 0.32;
		if(th>=10 && th<11) 	w = 0.22;
		if(th>=11 && th<12) 	w = 0.10;
		if(th>=12 && th<13) 	w = 0.08;
		if(th>=13)				w = 0.13;
		
		return w;
	}

}