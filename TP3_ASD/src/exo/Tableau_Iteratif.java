package exo;

public class Tableau_Iteratif extends Tableau {

    public Tableau_Iteratif(Etudiant[] tab, Etudiant[] tabTrie) {
        super(tab, tabTrie);
    }

    public Etudiant[] triBulle(Etudiant[] tab) {
        int n = tab.length;
        boolean permut = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j + 1].getScore() < tab[j].getScore()) {
                    Etudiant temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                    permut = true;
                }
            }

        }

        return tab;
    }

    @Override
    public Etudiant[] triInsertion(Etudiant[] tab) {
        int n = tab.length;

        for (int i = 1; i < n; i++) {
            Etudiant temp = tab[i];
            int j = i - 1;

            while ((j >= 0) && (tab[j].getScore() > temp.getScore())) {
                tab[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = temp;
        }
        return tab;
    }


    @Override
    public Etudiant[] triSelection(Etudiant[] tab) {
        int n = tab.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[minIndex].getScore() > tab[j].getScore()) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            Etudiant temp = tab[minIndex];
            tab[minIndex] = tab[i];
            tab[i] = temp;
        }
        return tab;
    }
}







    /*public static void triInsertion(Etudiant[] tab) {
        int n = tab.length;

        for (int i = 1; i < n; i++) {
            Etudiant key = tab[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while ((j >= 0) && (tab[j] > key)) {
                arr[j + 1] = tab[j];
                j--;
            }

            tab[j + 1] = key;
        }
    }/*
    public static void triSelection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}*/
