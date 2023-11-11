package exo;

import java.util.Arrays;

public abstract class Tableau {
    protected Etudiant[] tabNonTrie;
    protected Etudiant[] tabTrie;

    public Tableau(Etudiant[] tab) {
        this.tabNonTrie = Arrays.copyOf(tab, tab.length);
        this.tabTrie = new Etudiant[tab.length];
    }

    public abstract void afficheTabNonTrie();

    public abstract void afficheTabTrie();

    public abstract Etudiant[] triBulle() ;
    public abstract Etudiant[] triInsertion() ;
    public abstract Etudiant[] triSelection() ;

}
