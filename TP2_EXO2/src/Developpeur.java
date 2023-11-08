
public class Developpeur extends Employe {
	
	public Developpeur(String nom, String prenom, int anneRec, float nbrHeures,  float nbrHeuresSup) {
		super(nom, prenom, anneRec, nbrHeures, nbrHeuresSup);
		nbrHeures = 40 ; 
	}
	
	public float calculPaie() {
		return 40*500 ; 
	}
	
	public float calculHeuresSup() {
		return nbrHeuresSup*700 ; 
	}
	
	public float calculPaieFinal() {
		return (calculPaie()+calculHeuresSup()+(2023-anneRec)*2000);
	}

	@Override
	public String toString() {
		return "Devloppeur"+ super.toString() +""+ calculPaieFinal();
	}
	
}
