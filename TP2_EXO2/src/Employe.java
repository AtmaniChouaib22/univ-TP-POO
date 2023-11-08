
public class Employe {
	String nom, prenom; 
	int anneRec;
	float nbrHeures, nbrHeuresSup; 
	
	public Employe(String nom, String prenom, int anneRec, float nbrHeures, float nbrHeuresSup ) {
		this.nom = nom ; 
		this.prenom = prenom; 
		this.anneRec = anneRec ;
		this.nbrHeures = nbrHeures; 
		this.nbrHeuresSup = nbrHeuresSup ;
	}

	@Override
	public String toString() {
		return " nom=" + nom + ", prenom=" + prenom + ", anneRec=" + anneRec + ", nbrHeures=" + nbrHeures
				+ ", nbrHeuresSup=" + nbrHeuresSup ;
	}
	
	
}
