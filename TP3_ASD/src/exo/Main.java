package exo;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("chouaib","atmani",15);
        Etudiant e2 = new Etudiant("zaki","louhichi",18);
        Etudiant e3 = new Etudiant("hakim","atmani",4);
        Etudiant e4 = new Etudiant("fares","atmani",14);
        Etudiant e5 = new Etudiant("mohammed","atmani",0);
        Etudiant e6 = new Etudiant("amin","atmani",19);
        Etudiant e7 = new Etudiant("amir","atmani",20);
        Etudiant e8 = new Etudiant("hmed","atmani",12);
        Etudiant e9 = new Etudiant("ali","atmani",3);
        Etudiant e10 = new Etudiant("islam","atmani",2);

        Etudiant[] list = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        Tableau_Iteratif t = new Tableau_Iteratif(list);

        t.afficheTabNonTrie(); //affichage de la list avant le Trie
        t.triBulle(); 
        //t.triInsertion();
        //t.triSelection();
        
        t.afficheTabTrie(); //affichage de la nouvelle list apres trie
        t.afficheTabNonTrie(); //affichage de la premiere list 
    }
}