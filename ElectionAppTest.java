import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectionAppTest {
    @org.junit.jupiter.api.Test

    @BeforeEach
    void setUp() {
        ElectionApp electionApp = new ElectionApp();
        electionApp.reinitialiserElecteurs();
        electionApp.ajouterElecteur(
                new Electeur("Silverstone, Julien", "445-334-2234", "M", "70, De l'Eglise, St-Marc, QC", "A2S Q1P"));
        electionApp.ajouterElecteur(
                new Electeur("Silverstone, Maeva", "445-334-2234", "F", "70, De l'Eglise, St-Marc, QC", "A2S Q1P"));
        electionApp.ajouterElecteur(
                new Electeur("Pellerin, Daniel", "123-562-1133", "M", "4, Principale, St-Justin, QC", "I9H 4E2"));
        electionApp.ajouterElecteur(
                new Electeur("Silverstone, Julien", "887-267-4432", "M", "12232, Jean-Talon, Montreal, QC", "H7U 3D3"));
        electionApp.ajouterElecteur(
                new Electeur("DesMarrais, Monique", "433-545-2322", "F", "900, Bellerive, Val-Des-Sources, QC", "A9K I3S"));
    }

    @Test
    public void test_recherche_telephone_duplique() {
        final String ELECTEUR_1_NOM = "Silverstone, Julien";
        final String ELECTEUR_1_TELEPHONE = "445-334-2234";
        final String ELECTEUR_2_NOM = "Silverstone, Maeva";
        final String ELECTEUR_2_TELEPHONE = "445-334-2234";

        Electeur electeur = ElectionApp.rechercherElecteur(ELECTEUR_1_NOM, ELECTEUR_1_TELEPHONE);
        if (electeur == null || !electeur.nom.equals(ELECTEUR_1_NOM)
                || !electeur.telephone.equals(ELECTEUR_1_TELEPHONE)) {
            System.out.println("Le test ne passe pas");
            Electeur electeur1 = new Electeur(ELECTEUR_1_NOM, ELECTEUR_1_TELEPHONE, "M", "Adresse", "code postal");
            assertEquals(electeur1, electeur);
            return;
        }

        electeur = ElectionApp.rechercherElecteur(ELECTEUR_2_NOM, ELECTEUR_2_TELEPHONE);
        if (electeur == null || !electeur.nom.equals(ELECTEUR_2_NOM)
                || !electeur.telephone.equals(ELECTEUR_2_TELEPHONE)) {
            System.out.println("test_recherche_telephone_duplique: Le test ne passe pas");
            Electeur electeur2 = new Electeur(ELECTEUR_2_NOM, ELECTEUR_2_TELEPHONE, "M", "Adresse", "code postal");
            assertEquals(electeur2, electeur);
            return;
        }
    }

    @Test
    public void test_recherche_nom_duplique() {
        final String ELECTEUR_1_NOM = "Silverstone, Julien";
        final String ELECTEUR_1_TELEPHONE = "445-334-2234";
        final String ELECTEUR_2_NOM = "Silverstone, Julien";
        final String ELECTEUR_2_TELEPHONE = "887-267-4432";

        Electeur electeur = ElectionApp.rechercherElecteur(ELECTEUR_1_NOM, ELECTEUR_1_TELEPHONE);
        if (electeur == null || !electeur.nom.equals(ELECTEUR_1_NOM)
                || !electeur.telephone.equals(ELECTEUR_1_TELEPHONE)) {
            System.out.println("Le test ne passe pas");
            Electeur electeur1 = new Electeur(ELECTEUR_1_NOM, ELECTEUR_1_TELEPHONE, "M", "Adresse", "code postal");
            assertEquals(electeur1, electeur);
            return;
        }

        electeur = ElectionApp.rechercherElecteur(ELECTEUR_2_NOM, ELECTEUR_2_TELEPHONE);
        if (electeur == null || !electeur.nom.equals(ELECTEUR_2_NOM)
                || !electeur.telephone.equals(ELECTEUR_2_TELEPHONE)) {
            System.out.println("test_recherche_nom_duplique : Le test ne passe pas");
            Electeur electeur2 = new Electeur(ELECTEUR_2_NOM, ELECTEUR_2_TELEPHONE, "M", "Adresse", "code postal");
            assertEquals(electeur2, electeur);
            return;
        }
    }

}