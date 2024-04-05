package juniorh;

import java.util.Date;
import java.util.UUID;

public class Task {
    private int id;
    private String titre;
    private String description;
    private Date dateEcheance;
    private TaskPriority priorite;

    public Task(String titre, String description, Date dateEcheance, TaskPriority priorite) {
        this.id = UUID.randomUUID().hashCode();
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public TaskPriority getPriorite() {
        return priorite;
    }

    public void setPriorite(TaskPriority priorite) {
        this.priorite = priorite;
    }
}
