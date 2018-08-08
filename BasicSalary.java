package program;

import java.util.Scanner;

public class BasicSalary 
{

	public static void main(String[] args)
	{
		int bs;
		double hra = 0,da,ca = 0,ea=0,pf,lip = 0,gross_salary,t_reduction,net_salary,hrr;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the salary");
		bs=s.nextInt();
		if (bs<=2500)
			hra=bs*5/100;
		else if(bs>2500 && bs<=5000)
			hra=bs*7/100;
		else if(bs>5000)
			hra=bs*9/100;
		da=bs*57/100;
		if (bs<=3000)
			ca=100;
		else if(bs>3000 && bs<=6000)
			ca=200;
		else if (bs>6000)
			ca=300;
		if (bs<=5000)
			ea=0;
		else if (bs>5000)
			ea=500;
		pf=bs*12.5/100;
		if(bs<=6000)
			lip=250;
		else if(bs>6000 && bs<=12000)
			lip=500;
		else if(bs>12000)
			lip=750;
		gross_salary=hra+da+ca+ea+bs;
		t_reduction=pf+lip;
		net_salary=gross_salary-t_reduction;
		System.out.println("basic salary is "+bs);
		System.out.println("gross salary is "+gross_salary);
		System.out.println("the total reduction is "+t_reduction);
		System.out.println("the net salary is "+net_salary);
	}
}
