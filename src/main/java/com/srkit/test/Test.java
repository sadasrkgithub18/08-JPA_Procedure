package com.srkit.test;

import java.util.Scanner;

import com.srkit.dao.EmpDAO;
import com.srkit.dao.impl.EmpDAOImpl;

public class Test
{

	public static void main(String[] args)
	{
		
		EmpDAO dao = new EmpDAOImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter employee number :: ");
		int empno = scan.nextInt();
		dao.executeProcedure(empno);
	}
}
