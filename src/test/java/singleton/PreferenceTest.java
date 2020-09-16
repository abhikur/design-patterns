package singleton;

import org.junit.Test;

import static org.junit.Assert.*;
import static singleton.Preference.getPreference;

public class PreferenceTest {

    @Test
    public void shouldReturnPreferenceWhenPassedWithCategory() {
        Preference preference = getPreference("clothing");
        assertEquals(preference.getCategory(), "clothing");
    }

    @Test
    public void shouldReturnSameCategoryWhenPreferenceIsAlreadyInitiated() {
        Preference preference = getPreference("blah");
        assertEquals(preference.getCategory(), "clothing");
    }
}