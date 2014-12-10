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
public class Client {
private int code;
private String nom;
private String prenom;
public Client(int code, String nom, String
prenom) {
    
    this.code = code;
    this.nom = nom;
    this.prenom = prenom;
//à complèter
 }
 /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
public int hashCode() {
return  getCode();
        }
public boolean equals(Object obj) {

    Client c1 = new Client(2, "allani", "Mahdi");
    Client c2 = new Client(3, "zied", "benMahmoud");
   
return c1.equals(c2);
}

public String toString(){
StringBuilder resultat = new StringBuilder("nom=");
resultat.append(nom);
resultat.append(", prenom=");
resultat.append(prenom);
resultat.append(", code");
resultat.append(getCode());
return resultat.toString();
}

   
}