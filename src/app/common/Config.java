package app.common;

import java.util.*;
import javax.swing.DefaultListModel;

public class Config {
	
	
	String apiKey = new String();
	Boolean mode;	
	java.util.List<String> list = new ArrayList<String>();
	java.util.List<String> listId = new ArrayList<String>();
	
	public void setApiKey(String key) {
		apiKey = key; 
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setMode(Boolean m) {
		mode = m;
	}
	public Boolean getMode() {
		return mode;
	}
	public void setList(DefaultListModel lst) {
		for(int i=0;i<lst.getSize();i++) {
			list.add((String) lst.getElementAt(i));
		}
	}
	public java.util.List<String> getList() {
		
		return list;
	}
	public void setListId(DefaultListModel lst) {
		for(int i=0;i<lst.getSize();i++) {
			listId.add((String) lst.getElementAt(i));
		}
	}
	public java.util.List<String> getListId() {
		
		return listId;
	}
	
	
}
