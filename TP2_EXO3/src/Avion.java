
public class Avion extends Vehicule{
	
	int heuresDeVol; 
	
	public Avion(String marque, int dateAchat, float prix, int heuresDeVol) {
		super(marque, dateAchat, prix);
		this.heuresDeVol = heuresDeVol ;
	}
	
	public int getHeuresDeVol() {
		return heuresDeVol;
	}
	public void setHeuresDeVol(int heuresDeVol) {
		this.heuresDeVol = heuresDeVol;
	}
	
	public float calculprix() {
		float hVol= heuresDeVol ;
		float newPrix =  prix; 
		while(hVol>=5000){
			newPrix = newPrix - prix*8/100; 
			hVol -= 5000 ;
		}
		return newPrix ;
	}
	@Override 
	public void afiicher() {
		super.afiicher();
		System.out.println("heures de vol "+heuresDeVol);
	}
}
