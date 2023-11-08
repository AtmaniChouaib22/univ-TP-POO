
public class Vehicule {
	String marque ; 
	float prix ; 
	int dateAchat;
	
	
	public Vehicule(String marque, int dateAchat, float prix) {
		this.marque = marque ;
		this.dateAchat = dateAchat ;
		this.prix = prix ;
	}
	//setters and getters
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}


	public void afiicher() {
		System.out.println("|| Vehicule marque=" + marque + ", dateAchat=" + dateAchat + ", prix=" + prix);
	}
	//calcule prix de la voiture en occasion
	public float calculprix() {
		float newPrix = prix;
		if(dateAchat!= 2023) {
			newPrix = newPrix - (newPrix*5/100) * (2023-dateAchat);
		}
		return newPrix ; 
	}
	
	public boolean equals(Voiture v1, Voiture v2) {
		if(v1.getMarque()==v2.getMarque()&&v1.getDateAchat()==v2.getDateAchat()) {
			return true ;
		}else {
			return false ;
		}
	}
	
}
