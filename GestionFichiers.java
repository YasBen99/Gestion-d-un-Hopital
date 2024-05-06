import java.io.*;
import java.util.ArrayList;
import java.util.List;

class GestionFichiers {
    public static void sauvegarderPatients(List<Patient> patients, String cheminFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(cheminFichier))) {
            for (Patient patient : patients) {
                writer.println(patient.getId() + "," + patient.getNom() + "," + patient.getPrenom() + "," +
                        patient.getAdresse() + "," + patient.getDateCreation() + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Patient> chargerPatients(String cheminFichier) {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String nom = parts[1];
                String prenom = parts[2];
                String adresse = parts[3];
                String dateCreation = parts[4];
                // Créer un objet Patient et l'ajouter à la liste
                Patient patient = new Patient(id, nom, prenom, adresse, dateCreation);
                patients.add(patient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patients;
    }

}