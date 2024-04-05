package juniorh;

import java.util.ArrayList;

public interface TaskManagerInterface {
    void ajouterTache(Task tache);
    void lodifierTache(Task tache);
    void supprimerTache(Task tache);
    ArrayList<Task> getTaches();
}
