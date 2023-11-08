package exo;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("hafed","zouyed",15);
        Etudiant e2 = new Etudiant("zaki","zouyed",18);
        Etudiant e3 = new Etudiant("choaib","zouyed",13);
        Etudiant e4 = new Etudiant("e4","zouyed",14);
        Etudiant e5 = new Etudiant("e5","zouyed",16);
        Etudiant e6 = new Etudiant("e6","zouyed",19);
        Etudiant e7 = new Etudiant("e7","zouyed",20);
        Etudiant e8 = new Etudiant("e8","zouyed",12);
        Etudiant e9 = new Etudiant("e9","zouyed",11);
        Etudiant e10 = new Etudiant("e10","zouyed",10);

        Etudiant[] list = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        Etudiant[] lis = {};
        Tableau_Iteratif t = new Tableau_Iteratif(list,lis);

        t.afficherTrie(t.triInsertion(list));
        //t.afficherTrie(t.triBulle(list));
        //t.afficherTrie(t.triSelection(list));



    }
}