package cm.dart.Employe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("*******Test employe*********");
		   
		Employe employe1 =new Employe();
		   System.out.println("entrer le nomde l'employe1");
		   String nom1 = sc.nextLine();
		   System.out.println("entrer le prenom l'employe1");
		   String prenom1 = sc.nextLine();
		   System.out.println("entrer le salaire l'employe1");
		   Double salaire1 = sc.nextDouble();
		   
			Employe employe2 =new Employe();
			 sc.nextLine();
			
			  System.out.println("entrer le nom de l'employe2");
			  String nom2 = sc.nextLine();
			  System.out.println("entrer le prenom de l'employe2");
			   String prenom2 = sc.nextLine();
			  System.out.println("entrer le salaire de l'employe2");
			  Double salaire2 = sc.nextDouble();
			 
			 
			   System.out.print("le salaire de l'employe1");
			   employe1.afficherSalaire();
			   System.out.print("le salaire de lemploye2");
			   employe2.afficherSalaire();
			   System.out.print("le salaire en pourcentage de l'employe1");
			   employe1.afficherSalaire1(0);
			   System.out.print("le saliare en pourcentage de l'employe2");
			   employe2.afficherSalaire1(0);	     

	}

}
