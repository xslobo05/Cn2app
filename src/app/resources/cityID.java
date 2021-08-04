package app.resources;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import 	app.common.Coord;

public class cityID {
	public int id;
	public String name;
	public String state;
	public String country;
	public Coord coord;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	
	
	public java.util.List<cityID> createList() throws IOException
	{
		File f = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "citylist.json");
		if(!f.isFile()) {
			JOptionPane.showMessageDialog(null, "File \"citylist.json\" hasn't been found. Cannot search locations.\n(user.home/Cn2Prediction/citylist.json)");
			return null;
		}
		String idList= new String(Files.readAllBytes(Paths.get(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "citylist.json")),StandardCharsets.UTF_8);
		Gson gson = new Gson();  
		java.util.List<cityID> cityIdList;
		cityIdList = gson.fromJson(idList, new TypeToken<List<cityID>>(){}.getType());
			
		return cityIdList;
	}
}
