class Medecin {
    private List<Consultation> consultations;

    public Medecin() {
        this.consultations = new ArrayList<>();
    }

    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    public void modifierConsultation(Consultation ancienneConsultation, Consultation nouvelleConsultation) {
        int index = consultations.indexOf(ancienneConsultation);
        if (index != -1) {
            consultations.set(index, nouvelleConsultation);
        } else {
            System.out.println("La consultation n'existe pas.");
        }
    }

    public void supprimerConsultation(Consultation consultation) {
        consultations.remove(consultation);
    }

    public void exporterOrdonnance(Ordonnance ordonnance) {
        // Code pour exporter l'ordonnance dans un fichier
    }

    public void exporterConsultations(List<Consultation> consultations) {
        // Code pour exporter les consultations dans un fichier texte
    }
}