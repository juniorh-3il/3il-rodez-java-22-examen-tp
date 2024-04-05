package juniorh;

import juniorh.gui.InputForm;
import juniorh.gui.TasksDisplay;

import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame {

    private InputForm inputForm = new InputForm();
    private TasksDisplay tasksDisplay = new TasksDisplay();

    public Vue() {
        super("Gestionnaire de tâches");
        this.setPreferredSize(new Dimension(400, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(this.inputForm);
        this.add(this.tasksDisplay);
        this.pack();
    }
}
