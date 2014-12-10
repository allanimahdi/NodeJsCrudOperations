/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revision;

/**
 *
 * @author allanimahdi
 */
public class Voiture {
 private int immatriculation;
 private String marque;
 private float prixLocation;
public Voiture(int immatriculation, String marque, float prixLocation) {
this.immatriculation = immatriculation;
this.marque = marque;
this.prixLocation=prixLocation;
        
 }
 public int getImmariculation() {
 return immatriculation;
 }
 public void setImmariculation(int immatriculation) {
 this.immatriculation = immatriculation;
 }
public String getMarque() {
 return marque;
 }
 public void setMarque(String marque) {
 this.marque = marque;
 }
 public float getPrixLocation() {
 return prixLocation;
 }
 public void setPrixLocation(float prixLocation) {
 this.prixLocation = prixLocation;
 }
 @Override
 public int hashCode() {
return immatriculation ;
        }
public boolean equals(Object obj) {
return true;
        }
public String toString(){
StringBuilder resultat = new StringBuilder("nom=");
resultat.append(marque);
resultat.append(", immatriculation=");
resultat.append(immatriculation);
resultat.append(", prix Location = ");
resultat.append(prixLocation);
return resultat.toString();


}
}
