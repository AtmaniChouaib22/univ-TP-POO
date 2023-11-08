package exo;

public class Etudiant {
    private String nom;
    private String prenom;
    private int score;

    public Etudiant(String nom, String prenom, int score) {
        this.nom = nom;
        this.prenom = prenom;
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getScore() {
        return score;
    }
    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom : " + prenom + ", Score d'examen : " + score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
