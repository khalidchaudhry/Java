package co.edureka.khalid;

import co.edureka.khalid.webservices.Nums;
import co.edureka.khalid.webservices.NumsServiceLocator;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator=new NumsServiceLocator();
		Nums obj=locator.getNums();

		int s=obj.add(12, 34);
		System.out.println("Sum="+s);
		
		Float d=obj.sub(34, 45);
		System.out.println("Subtract="+d);
			
	}

}
