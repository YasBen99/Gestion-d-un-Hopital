import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        AgentAdministration agent = new AgentAdministration();
        Medecin medecin = new Medecin();
        Technicien technicien = new Technicien();
        GestionnaireRecherche gestionnaireRecherche = new GestionnaireRecherche();

        // Scénario d'utilisation de l'application
        Patient patient1 = new Patient("Nom1", "Prénom1");
        Patient patient2 = new Patient("Nom2", "Prénom2");
        agent.ajouterPatient(patient1);
        agent.ajouterPatient(patient2);

        // Rechercher un patient par son numéro
        Patient patientTrouve = gestionnaireRecherche.rechercherPatientParNumero(agent.getListePatients(), 1);

        // Rechercher des patients par leur nom
        List<Patient> patientsTrouves = gestionnaireRecherche.rechercherPatientsParNom(agent.getListePatients(), "Nom1");

        // Création de la consultation
        List<Pathologie> pathologies = new ArrayList<>();
        pathologies.add(new Pathologie("Pathologie 1"));
        List<Antecedent> antecedents = new ArrayList<>();
        antecedents.add(new Antecedent("Antécédent 1"));
        Consultation consultation = new Consultation(patient1, pathologies, antecedents,
                "Détails cliniques", "Propositions de soins", "Propositions de médicaments",
                "Propositions d'appareils");
        medecin.ajouterConsultation(consultation);

        // Rechercher des consultations par pathologie
        List<Consultation> consultationsTrouvees = gestionnaireRecherche.rechercherConsultationsParPathologie(
                medecin.getConsultations(), "Pathologie 1");

        AgentAdministration agent = new AgentAdministration();
        Medecin medecin = new Medecin();
        Technicien technicien = new Technicien();
        GestionnaireRecherche gestionnaireRecherche = new GestionnaireRecherche();
        GestionnaireStatistiques gestionnaireStatistiques = new GestionnaireStatistiques();
        
        // Exemple d'utilisation des statistiques
        List<Consultation> consultations = medecin.getConsultations();

        int nombreAppareilsOctroyesTrimestre = gestionnaireStatistiques.nombreAppareilsOctroyesTrimestre(consultations);

        Map<Patient, Integer> appareilsParPatient = gestionnaireStatistiques.nombreAppareilsOctroyesParPatient(consultations);

        String periodesConsultationsPlusNombreuses = gestionnaireStatistiques.periodesConsultationsPlusNombreuses(consultations);

        Map<Pathologie, Integer> patientsParPathologie = gestionnaireStatistiques.nombrePatientsParPathologie(consultations);

    }
}