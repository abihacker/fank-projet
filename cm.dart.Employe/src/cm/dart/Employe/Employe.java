/**
 * 
 */
package cm.dart.Employe;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author daniele
 *
 */
public class Employe {
	private  String nom;
	private  String prenom;
	private Float salaire;
	private Object salairepourcentage;
		
	
	public Employe() {
		
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Float getSalaire() {
		return salaire;
	}


	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}
	  public float calculSalaireAnnuel(){
		    return this.salaire*12;
	  }
      public float calculSalaire(float percent){
    	  return this.calculSalaireAnnuel()*percent;
    	  
      }
      public void afficherSalaire(){
    	  NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    	 
		float calculSalaireAnnuel = this.calculSalaireAnnuel();
    	  String formattedValue = numberFormat.format(calculSalaireAnnuel);
    	  System.out.println("le nouveau salaire annuel de "+formattedValue);
    	  
      }
      public void afficherSalaire1( float percent){
    	  NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		float nouveausalaire =  this.calculSalaire(percent);
    	  String formattedValue = numberFormat.format(nouveausalaire );
    	  System.out.println("le nouveau salaire annuel2 de "+formattedValue);
    	      
    	  
    	  
      }
}
