import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GestionnaireStatistiques {
    public int nombreAppareilsOctroyesTrimestre(List<Consultation> consultations) {
        // Implémenter le calcul du nombre d'appareils octroyés sur un trimestre
        return 0;
    }

    public Map<Patient, Integer> nombreAppareilsOctroyesParPatient(List<Consultation> consultations) {
        Map<Patient, Integer> appareilsParPatient = new HashMap<>();
        // Implémenter le calcul du nombre d'appareils octroyés par patient
        return appareilsParPatient;
    }

    public String periodesConsultationsPlusNombreuses(List<Consultation> consultations) {
        // Implémenter le calcul des périodes de l'année avec le plus de consultations
        return "";
    }

    public Map<Pathologie, Integer> nombrePatientsParPathologie(List<Consultation> consultations) {
        Map<Pathologie, Integer> patientsParPathologie = new HashMap<>();
        // Implémenter le calcul du nombre de patients par pathologie
        return patientsParPathologie;
    }

}