package juniorh;

public class Main {

    public static void main(String[] args) {
        Vue vue = new Vue();
        Model model = new Model();
        Controller controller = new Controller(vue, model);
        vue.setVisible(true);
    }
}
