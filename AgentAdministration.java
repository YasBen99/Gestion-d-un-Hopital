import java.util.ArrayList;
import java.util.List;

class AgentAdministration {
    private List<Patient> listePatients;

    public AgentAdministration() {
        this.listePatients = new ArrayList<>();
    }

    public void ajouterPatient(Patient patient) {
        listePatients.add(patient);
    }

    public void modifierPatient(Patient ancienPatient, Patient nouveauPatient) {
        int index = listePatients.indexOf(ancienPatient);
        if (index != -1) {
            listePatients.set(index, nouveauPatient);
        } else {
            System.out.println("Le patient n'existe pas dans la liste.");
        }
    }

    public void supprimerPatient(Patient patient) {
        listePatients.remove(patient);
    }

    // Autres méthodes pour gérer les patients
}