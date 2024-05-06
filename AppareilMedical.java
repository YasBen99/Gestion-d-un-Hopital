import java.util.ArrayList;
import java.util.List;

class AppareilMedical {
    private String nom;
    private boolean octroye;

    public AppareilMedical(String nom) {
        this.nom = nom;
        this.octroye = false;
    }

    public void octroyer() {
        this.octroye = true;
    }

}