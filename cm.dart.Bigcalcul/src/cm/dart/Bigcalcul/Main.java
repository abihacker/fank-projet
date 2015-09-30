package cm.dart.Bigcalcul;

import java.lang.invoke.ConstantCallSite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bcalcul calcul = new  Bcalcul();
		sc.nextLine();
		System.out.println("entrer le premier bigdecimal" );
		long a =sc.nextLong();
		System.out.println("entrer e deuxieme bigdecimal");
		long b = sc.nextLong();
		System.out.println("CHOISIR VOTRE OPERATION");
		
		int i=1;
		for( List<Bcalcul> i = 1; i=<cal;i++){
			System.out.println( 1"addition" );
			System.out.println(2"soustraction   ");
			System.out.println( 3"multiplation    ");
			System.out.println(4"division    ");
		}
		switch () {
		case 1:
			calcul.Add(a, b);

			break;
		case 2:
			calcul.Sous(a, b);
			break;
		case 3:
			calcul.Mull(a, b);
			break;
		case 4:
			calcul.Div(a, b);
			break;
		case 5:
			calcul.Arr();
			break;
		}
	}


