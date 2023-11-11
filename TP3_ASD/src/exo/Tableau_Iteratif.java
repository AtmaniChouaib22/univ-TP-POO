package exo;

import java.util.Arrays;

public class Tableau_Iteratif extends Tableau {

    public Tableau_Iteratif(Etudiant[] tab) {
        super(tab);
    }
    
	@Override 
	public void afficheTabNonTrie() {
		System.out.println("tableau non trie:");
		for(int i=0; i<tabNonTrie.length; i++) {
			System.out.println(tabNonTrie[i]);
		}
	}
	
	@Override 
	public void afficheTabTrie() {
		System.out.println("tableau Trie:");
		for(int i=0; i<tabTrie.length; i++) {
			System.out.println(tabTrie[i]);
		}
	}
	
	// Bubble sort algorithm
	  public Etudiant[] triBulle() {
	        int n = tabNonTrie.length;
	        tabTrie = Arrays.copyOf(tabNonTrie, n);
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (tabTrie[j].getScore() > tabTrie[j + 1].getScore()) {
	                    // swap temp and arr[i]
	                    Etudiant temp = tabTrie[j];
	                    tabTrie[j] = tabTrie[j + 1];
	                    tabTrie[j + 1] = temp;
	                }
	            }
	        }
	        return tabTrie ;
	    }
	  
	  //insertion sort 
	  
	  public Etudiant[] triInsertion() {
	        // Insertion sort algorithm
	        int n = tabNonTrie.length;
	        tabTrie = Arrays.copyOf(tabNonTrie, n);
	        for (int i = 1; i < n; ++i) {
	            Etudiant key = tabTrie[i];
	            int j = i - 1;

	            while (j >= 0 && tabTrie[j].getScore() > key.getScore()) {
	                tabTrie[j + 1] = tabTrie[j];
	                j = j - 1;
	            }
	            tabTrie[j + 1] = key;
	        }
	        return tabTrie ;
	    }
	  
	  //trie par selection 
	  
	  public Etudiant[] triSelection() {
	        // Selection sort algorithm
	        int n = tabNonTrie.length;
	        tabTrie = Arrays.copyOf(tabNonTrie, n);
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (tabTrie[j].getScore() < tabTrie[minIndex].getScore()) {
	                    minIndex = j;
	                }
	            }
	            // swap temp and arr[i]
	            Etudiant temp = tabTrie[minIndex];
	            tabTrie[minIndex] = tabTrie[i];
	            tabTrie[i] = temp;
	        }
	        return tabTrie ;
	    }
}

