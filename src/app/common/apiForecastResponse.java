package app.common;

public class apiForecastResponse {

	private City city;
	private String cod;
	private Double message;
	private Integer cnt;
	private java.util.List<app.common.List> list = null;

	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public Double getMessage() {
		return message;
	}
	
	public void setMessage(Double message) {
		this.message = message;
	}
	
	public Integer getCnt() {
		return cnt;
	}
	
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	public java.util.List<app.common.List> getList() {
		return list;
	}
	
	public void setList(java.util.List<app.common.List> list) {
		this.list = list;
	}

}