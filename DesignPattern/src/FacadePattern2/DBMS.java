package FacadePattern2;

import java.util.HashMap;

public class DBMS {
	private HashMap<String, Row> db = new HashMap<String, Row>();
	
	public DBMS() {
		db.put("jane", new Row("Jane", "1990-02-14", "jane09@geosee.co.kr"));
		db.put("robert", new Row("Robert", "1979-11-05", "robert@googl.com"));
		db.put("dorosh", new Row("Dorosh", "1985-08-21", "doroch@nave.net"));
	}
	
	public Row query(String name) {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return db.get(name.toLowerCase());
	}
}
