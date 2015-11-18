package cz.ryvo.organizer.testutils.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class RegexpMatcher extends BaseMatcher<String> {

    private final String regexp;

    public RegexpMatcher(final String regexp) {
        this.regexp = regexp;
    }

    public boolean matches(final Object item) {
        return ((String)item).matches(regexp);
    }

    public void describeTo(final Description description) {
        description.appendText("matches regexp = '" + regexp + "'");
    }

    public static RegexpMatcher matchesRegexp(final String regexp) {
        return new RegexpMatcher(regexp);
    }
}
