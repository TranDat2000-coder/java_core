package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainTest {

	public static void main(String[] args) {
		//Tạo Calendar object để mô tả present time
		Calendar calendar = Calendar.getInstance();
		
		Date date = calendar.getTime();
		System.out.println("Thời gian hiện tại: " + date);
		
		//Sử dụng SimpleDateFormat để định dạng date
		//Khai báo một đối tượng SimpleDateFormat
		SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("Thời gian hiện tại sau khi định dạng là: " + sDF.format(date));
		
		System.out.println("-------------------------");
		
		int dd = 0;
		int mm = 0;
		int yyyy = 0;
		
		dd = calendar.get(Calendar.DAY_OF_MONTH);
		mm= calendar.get(Calendar.MONTH) + 1;
		yyyy = calendar.get(Calendar.YEAR);
		
		MyDate myDate = new MyDate(dd, mm, yyyy);
		
		myDate.printDay();
		myDate.printMonth();
		myDate.printYears();
		myDate.printDayMonthYears();
	}
}
