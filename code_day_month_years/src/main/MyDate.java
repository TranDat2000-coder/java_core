package main;

public class MyDate {

	private int day;
	private int month;
	private int years;
	
	public MyDate(int dd, int mm, int yyyy) {
		this.day = dd;
		this.month = mm;
		this.years = yyyy;
	}
	
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	
	public void printMonth() {
		System.out.println("Month: " + this.month);
	}
	
	public void printYears() {
		System.out.println("Years: " + this.years);
	}
	
	public void printDayMonthYears() {
		System.out.println("Hà Nội, ngày " + this.day + "/" + this.month + "/" + this.years);
	}
}
