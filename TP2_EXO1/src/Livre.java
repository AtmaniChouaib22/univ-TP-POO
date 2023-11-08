
public class Livre extends Document {
	private int ISBN, anne ;
	private float prix ;
	
	public Livre(String nom , int ISBN, int anne, float prix) {
		super(nom);
		this.ISBN = ISBN ;
		this.anne = anne ;
		this.prix = prix ;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\nISBN: "+ISBN+" \nanne: "+anne ;
	}
	
	public void PrixVente(Personne p) {
		//checking if the author is the buyer
		for(int i = 0; i < ListAuteur.size(); i++) {
			if(p.getNom()==ListAuteur.get(i).getNom()) {
				System.out.println("matching names!!Author is the buyer");
				prix = 0 ;
			}
		}
		//checking the age for a valid discount
		if(2023-p.getanneNS()<20) {
			prix -=(prix*20)/100;
		}
		System.out.println("price after discount: "+prix+"$");
	}
}
