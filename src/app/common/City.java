package app.common;

public class City {

private Integer id;
private String name;
private Coord coord;
private String country;
private Integer population;
private Integer timezone;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Coord getCoord() {
return coord;
}

public void setCoord(Coord coord) {
this.coord = coord;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public Integer getPopulation() {
return population;
}

public void setPopulation(Integer population) {
this.population = population;
}

public Integer getTimezone() {
return timezone;
}

public void setTimezone(Integer timezone) {
this.timezone = timezone;
}

}