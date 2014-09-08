package MainPackage;

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class lab1 {
	
	private static Scanner in;

	public static void main(String[] args){
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		double r2;
		double n2;
		double y2;
		
		in = new Scanner(System.in);
		//enter annual return percent as a decimal
		System.out.println("Annual return");
		r = in.nextDouble();

		System.out.println("Years retired");
		n = in.nextDouble();
		
		System.out.println("Required Income");
		y = in.nextDouble();
		
		
		double PV;
		r2 = (r/12);
		n2 = n * 12;
		y2 = y - 2642;
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r2,n2,y2,f,t);
		
		System.out.println(PV);
		
		
		in = new Scanner(System.in);
		//enter annual percent as a decimal	
		System.out.println("Annual return");
		r = in.nextDouble();
		
		System.out.println("Years plan to work");
		n = in.nextDouble();
		
		double PMT;
		
		r2 = (r/12);
		n2 = n*12;
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r2,n2,p,f,t);
		System.out.println(PMT);
		
	}
}
