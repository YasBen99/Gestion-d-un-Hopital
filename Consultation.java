class Consultation {
    private Patient patient;
    private List<Pathologie> pathologies;
    private List<Antecedent> antecedents;
    private String detailsCliniques;
    private String propositionsSoins;
    private String propositionsMedicaments;
    private String propositionsAppareils;
    private String statutAppareil;

    public Consultation(Patient patient, List<Pathologie> pathologies, List<Antecedent> antecedents,
                        String detailsCliniques, String propositionsSoins, String propositionsMedicaments,
                        String propositionsAppareils) {
        this.patient = patient;
        this.pathologies = pathologies;
        this.antecedents = antecedents;
        this.detailsCliniques = detailsCliniques;
        this.propositionsSoins = propositionsSoins;
        this.propositionsMedicaments = propositionsMedicaments;
        this.propositionsAppareils = propositionsAppareils;
        this.statutAppareil = "instance"; // Mettre le statut de l'appareil à "instance"
    }

    // Getters et setters pour les attributs de la consultation
}