
public class Main {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("atmani", "chouaib",2000);//creating the buyer
		//creating authors
		Personne a1 = new Personne("robert", "keyosaki");
		//Personne a2 = new Personne("atmani", "chouaib",2004);
		//creating the book
		Livre l1 = new Livre("Rich dad poor dad", 1234, 2000, 40);
		//ADDING AUTHORS 
		l1.addAuteur(a1);
		//l1.addAuteur(a2);
		
		System.out.println(l1.toString());
		System.out.println("number of authors: "+l1.NbrAuteur());
		l1.PrixVente(p1);

	}

}
