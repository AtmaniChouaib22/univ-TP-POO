import java.util.ArrayList;

public class Document {
	private String nom ;
	ArrayList<Personne> ListAuteur ;
	
	public Document(String nom) {
		this.nom = nom ;
		this.ListAuteur = new ArrayList<>();
	}
	
	public void addAuteur(Personne auteur) {
		ListAuteur.add(auteur);
	}
	
	public int NbrAuteur() {
		return ListAuteur.size();
	}
	
	public String toString() {
		return "nom du document/Livre: "+nom+" \nList d'auteurs: "+ListAuteur;
	}
}
