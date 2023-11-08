
public class Personne {
	private String nom, prenom ;
	private int anneNS ;
	
	public Personne(String nom, String prenom, int anneNS) {
		this.nom = nom ;
		this.prenom = prenom;
		this.anneNS = anneNS ;
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom ;
		this.prenom = prenom;
	}
	
	
	public int getanneNS() {
		return anneNS;
	}
	public String getNom() {
		return nom ;
	}
}
