
public class Commerciaux extends Employe {
	public Commerciaux(String nom, String prenom, int anneRec, float nbrHeures,  float nbrHeuresSup) {
		super(nom, prenom, anneRec, nbrHeures, nbrHeuresSup);
		nbrHeures = 40 ; 
	}
	
	public float calculPaie() {
		return nbrHeures*350 ; 
	}
	
	public float calculHeuresSup() {
		return nbrHeuresSup*500 ; 
	}
	
	public float calculPaieFinal() {
		return (calculPaie()+calculHeuresSup()+(2023-anneRec)*2000);
	}
	
	@Override
	public String toString() {
		return "commerciaux nom=" + nom + ", prenom=" + prenom + ", paiefinale:" + calculPaieFinal();
	}
}
