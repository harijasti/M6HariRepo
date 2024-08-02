package sample;

import genericlibrary.JavaLibrary;

public class Cal 
{

	public static void main(String[] args) {
		JavaLibrary jl=new JavaLibrary();
		System.out.println(jl.handleCalendar("dd/MM/YYYY"));
	}
}
