import java.util.HashMap;
import java.util.Map;

public class ElectionApp {
    private static Map<ElecteurClee, Electeur> electeurHashMap = new HashMap<>();

    public ElectionApp() {

    }

    public void ajouterElecteur(Electeur electeur) {
        electeurHashMap.put(new ElecteurClee(electeur.nom, electeur.telephone), electeur);
    }

    public void reinitialiserElecteurs() {
        electeurHashMap.clear();
    }

    public static Electeur rechercherElecteur(String nom, String telephone) {
        Electeur resultat = null;
        ElecteurClee electeurRecherchee = new ElecteurClee(nom, telephone);
        for (ElecteurClee electeurComparee : electeurHashMap.keySet()) {
            if (electeurRecherchee.equals(electeurComparee)) {
                resultat = electeurHashMap.get(electeurRecherchee);
            }
        }
        return resultat;
    }

}
