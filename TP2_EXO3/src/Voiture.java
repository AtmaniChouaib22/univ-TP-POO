
public class Voiture extends Vehicule {
	
	private int nbrPorts, puissance, kilometrage; 
	
	public Voiture(String marque, int dateAchat, float prix, int nbrPorts, int puissance, int kilometrage) {
		super(marque, dateAchat, prix);
		this.nbrPorts = nbrPorts ;
		this.puissance = puissance ;
		this.kilometrage = kilometrage ;
	}

	public int getNbrPorts() {
		return nbrPorts;
	}

	public void setNbrPorts(int nbrPorts) {
		this.nbrPorts = nbrPorts;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	@Override
	public float calculprix() {
		float kilo = kilometrage;
		float newPrix = prix ; 
		while(kilo>=100000){
			newPrix = newPrix - prix*10/100; 
			kilo -=100000 ;
		}
		return newPrix ;
	}
	
	@Override 
	public void afiicher() {
		super.afiicher();
		System.out.println("nombre de ports: "+nbrPorts+
		" puissance "+puissance+ " kilometrage: "+ kilometrage);
	}
	
}
