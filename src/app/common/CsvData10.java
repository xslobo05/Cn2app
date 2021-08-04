package app.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CsvData10 {
	//
	// This class corresponds to items, which are saved in one line of .csv file.
	// This class includes methods for saving and reading data from said .csv files.
	//
	
	Integer dt;
	Double day1;
	Double day2;
	Double day3;
	Double day4;
	Double day5;
	Double day6;
	Double day7;
	Double day8;
	Double day9;
	Double day10;
	
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	public void setDay1(Double day1) {
		this.day1 = day1;
	}
	public void setDay2(Double day2) {
		this.day2 = day2;
	}
	public void setDay3(Double day3) {
		this.day3 = day3;
	}
	public void setDay4(Double day4) {
		this.day4 = day4;
	}
	public void setDay5(Double day5) {
		this.day5 = day5;
	}
	public void setDay6(Double day6) {
		this.day6 = day6;
	}
	public void setDay7(Double day7) {
		this.day7 = day7;
	}
	public void setDay8(Double day8) {
		this.day8 = day8;
	}
	public void setDay9(Double day9) {
		this.day9 = day9;
	}
	public void setDay10(Double day10) {
		this.day10 = day10;
	}
	public Integer getDt() {
		return this.dt;
	}
	public Double getDay1() {
		return this.day1;
	}
	public Double getDay2() {
		return this.day2;
	}
	public Double getDay3() {
		return this.day3;
	}
	public Double getDay4() {
		return this.day4;
	}
	public Double getDay5() {
		return this.day5;
	}
	public Double getDay6() {
		return this.day6;
	}
	public Double getDay7() {
		return this.day7;
	}
	public Double getDay8() {
		return this.day8;
	}
	public Double getDay9() {
		return this.day9;
	}
	public Double getDay10() {
		return this.day10;
	}
	
	public Boolean save(String city) throws IOException {
		//
		// Saves Cn2 predictions into a .csv file.
		// If no .csv file is found, it is created.
		// File name is based on location and amount of predictions' days.
		// Returns true if data is saved.
		// Returns false if this particular data is already present in last line of .csv file.
		//
		if(lastDtMatch(city)) return false;
		FileWriter fw = new FileWriter(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city + "10.csv",true);
		fw.append(this.dt.toString());
		fw.append(",");
		fw.append(this.day1.toString());
		fw.append(",");
		fw.append(this.day2.toString());
		fw.append(",");
		fw.append(this.day3.toString());
		fw.append(",");
		fw.append(this.day4.toString());
		fw.append(",");
		fw.append(this.day5.toString());
		fw.append(",");
		fw.append(this.day6.toString());
		fw.append(",");
		fw.append(this.day7.toString());
		fw.append(",");
		fw.append(this.day8.toString());
		fw.append(",");
		fw.append(this.day9.toString());
		fw.append(",");
		fw.append(this.day10.toString());
		fw.append("\n");
		
		fw.flush();
		fw.close();
		
		return true;
	}
	public Boolean lastDtMatch(String city) throws IOException {
		//
		// This function exists for checking purposes.
		// Returns true, if dt in last record (line) of .csv file matches dt of the data user wants to save.
		// Prevents saving multiple identical records into .csv file.
		//
		
		File f = new File(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city +"10.csv");
		if(f.isFile()) {
			BufferedReader csvReader = new BufferedReader(new FileReader(System.getProperty("user.home") + File.separator + "Cn2Prediction" + File.separator + "pred_id" + city + "10.csv"));
			String row;
			String[] data = null;
			
			while ((row = csvReader.readLine()) != null) {
			    data = row.split(",");
			}
			csvReader.close();
			
			if(Integer.parseInt(data[0]) == this.dt)
				return true;
			else return false;
		}
		
		else return false;
		
	} 
}
	


