package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {
	public static void main(String[] args) throws JSONException {
		String json = "{\"ordertimings\":[{\"dates\":{\"2015:05:25\":\"Monday (25/05/2015)\",\"2015:05:26\":\"Tuesday (26/05/2015)\",\"2015:05:27\":\"Wednesday (27/05/2015)\",\"2015:05:28\":\"Thursday (28/05/2015)\",\"2015:05:29\":\"Friday (29/05/2015)\",\"2015:05:30\":\"Saturday (30/05/2015)\",\"2015:05:31\":\"Sunday (31/05/2015)\"},\"times\":{\"2015:05:25\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:26\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:27\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:28\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:29\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:30\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"],\"2015:05:31\":[\"11:00\",\"11:10\",\"11:20\",\"11:30\",\"11:40\",\"11:50\",\"12:00\",\"12:10\",\"12:20\",\"12:30\",\"12:40\",\"12:50\",\"13:00\",\"13:10\",\"13:20\",\"13:30\",\"13:40\",\"13:50\",\"14:00\",\"14:10\",\"14:20\",\"14:30\",\"14:40\",\"14:50\",\"15:00\",\"15:10\",\"15:20\",\"15:30\",\"15:40\",\"15:50\",\"16:00\",\"16:10\",\"16:20\",\"16:30\",\"16:40\",\"16:50\",\"17:00\",\"17:10\",\"17:20\",\"17:30\",\"17:40\",\"17:50\",\"18:00\",\"18:10\",\"18:20\",\"18:30\",\"18:40\",\"18:50\",\"19:00\",\"19:10\",\"19:20\",\"19:30\",\"19:40\",\"19:50\",\"20:00\",\"20:10\",\"20:20\",\"20:30\",\"20:40\",\"20:50\",\"21:00\",\"21:10\",\"21:20\",\"21:30\",\"21:40\",\"21:50\",\"22:00\"]}}]}";
		JSONObject obj = new JSONObject(json);
		JSONArray jsonarray = obj.getJSONArray("ordertimings");
		JSONObject dates = ((JSONObject) jsonarray.getJSONObject(0)).getJSONObject("dates");
		
		Iterator dateiter = dates.keys();
		
		TreeMap<String, String> datemap = new TreeMap<String, String>();
		while (dateiter.hasNext()) {
			String key = (String) dateiter.next();
			String value = dates.getString(key);
			datemap.put(key, value);
		}
		
		JSONObject times = ((JSONObject) jsonarray.getJSONObject(0)).getJSONObject("times");
		
		Iterator timeiter = dates.keys();
		
		TreeMap<String, String> timemap = new TreeMap<String, String>();
		while (timeiter.hasNext()) {
			String key = (String) timeiter.next();
			String value = dates.getString(key);
			timemap.put(key, value);
		}


		System.out.println(datemap);
	}
}

class JSONComparator implements Comparator<JSONObject> {

	public int compare(JSONObject a, JSONObject b) {
		// valA and valB could be any simple type, such as number, string,
		// whatever
		try {
			String valA = a.getString("keyOfValueToSortBy");
			String valB = b.getString("keyOfValueToSortBy");

			if (valA.equalsIgnoreCase(valB))
				return 0;
			else
				return -1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
}