package sg.edu.rp.c347.id19030019.demolistview;

public class Food {
    private String name;
    private boolean star;
    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public boolean isStar() {
        return star;
    }
    public String getName() {
        return name;
    }
}
