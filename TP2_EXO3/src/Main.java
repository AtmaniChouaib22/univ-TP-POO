
public class Main {

	public static void main(String[] args) {
		
		//voiture object price 1000 date 2020 kilometrage 300
		Voiture v1 = new Voiture("audi", 2020,1000,4,90,300000);
		v1.afiicher();
		System.out.println("-voiture price after kilometrage discount: "+v1.calculprix());
		
		//vehicule object  
		Vehicule vh1 = new Vehicule("porche", 2020, 1000);
		System.out.println("-vehicule price after anciennete discount: "+vh1.calculprix());
		
		//airplane object 
		Avion a1 = new Avion("bowing",2023,100000,5000);
		a1.afiicher();
		System.out.println("-airplane price after flying hours discount: "+a1.calculprix());
		
		Voiture v2 = new Voiture("audi", 2020,1000,4,90,300);
		System.out.println(vh1.equals(v1, v2));
	}

}
