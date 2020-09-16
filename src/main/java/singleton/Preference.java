package singleton;

public class Preference {

    private String category;
    private static Preference preference = null;

    private Preference(String category) {
        this.category = category;
    }

    public static Preference getPreference(String category) {
        if (preference == null) {
            preference = new Preference(category);
        }
        return preference;
    }

    public String getCategory() {
        return category;
    }
}
