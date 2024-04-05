package juniorh;

public class Controller {
    private Vue vue;
    private Model model;

    public Controller(Vue vue, Model model) {
        this.vue = vue;
        this.model = model;
    }
}
