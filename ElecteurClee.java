public class ElecteurClee {
    String nom;
    String telephone;

    public ElecteurClee(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    @Override
    public int hashCode() {
        return nom.hashCode() + telephone.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        ElecteurClee electeurComparee = (ElecteurClee) obj;
        return nom.equals(electeurComparee.nom) && telephone.equals(electeurComparee.telephone);
    }

}
