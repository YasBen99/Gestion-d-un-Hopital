import java.util.ArrayList;
import java.util.List;

class GestionnaireRecherche {
    public Patient rechercherPatientParNumero(List<Patient> patients, int numeroPatient) {
        for (Patient patient : patients) {
            if (patient.getNumeroPatient() == numeroPatient) {
                return patient;
            }
        }
        return null;
    }

    public List<Patient> rechercherPatientsParNom(List<Patient> patients, String nom) {
        List<Patient> patientsTrouves = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getNom().equalsIgnoreCase(nom)) {
                patientsTrouves.add(patient);
            }
        }
        return patientsTrouves;
    }

    public List<Consultation> rechercherConsultationsParPathologie(List<Consultation> consultations, String pathologie) {
        List<Consultation> consultationsTrouvees = new ArrayList<>();
        for (Consultation consultation : consultations) {
            for (Pathologie patho : consultation.getPathologies()) {
                if (patho.getNom().equalsIgnoreCase(pathologie)) {
                    consultationsTrouvees.add(consultation);
                    break;
                }
            }
        }
        return consultationsTrouvees;
    }

}