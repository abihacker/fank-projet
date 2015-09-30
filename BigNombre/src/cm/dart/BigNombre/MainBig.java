package cm.dart.BigNombre;

import java.math.BigDecimal;


import java.math.MathContext;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class MainBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Scanner read =new Scanner(System.in);

		BigDecimal big1,big2;
		BigDecimal big3=BigDecimal.ZERO;
		big1 = new BigDecimal("1234.34");
		big2 = new BigDecimal("4567.23");

		System.out.println("choisissez votre operation");
		System.out.println("1 ADDITION\n 2 SOUSTRACTION\n 3 MULTIPLICATION\n 4 DIVISION"); 
		int hs = read.nextInt();
		MathContext th = new MathContext(10);
		switch(hs)
		{
		case 1 :{ 

			System.out.println(big1.add(big2, th));
			break;
		}

		case 2 :{ 

			System.out.println(big1.subtract(big2, th));
			break;
		}
		case 3 :{ 

			System.out.println(big1.multiply(big2, th));
			break;
		}
		default :{ 

			System.out.println(big1.divide(big2, th));
			break;
		}
		}


	}
}
