package com.edtech;
import java.util.Scanner;
public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the address");
		String address = sc.nextLine();
		System.out.println("Enter mobile");
		String mobile = sc.nextLine();
		
		Employee emp = new Employee();
		emp.setEmpname(name);
		emp.setEmpaddress(address);
		emp.setEmpmobile(mobile);
		
		System.out.println("Employee Details ");
		System.out.println("Name: "+emp.getEmpname());
		System.out.println("Address: "+emp.getEmpaddress());
		System.out.println("Mobile: "+emp.getEmpmobile());

	}

}
