package qsp;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class A {
	public static void main(String[] args) {
	Workbook w=new WorkbookFactory.create(new FileOutputStream("./data/book1.xlsx"));
	String c = w.getSheet("sheet1").getRow(0).getCell(0).toString();
	System.out.println(c);
	
		
	}

}
