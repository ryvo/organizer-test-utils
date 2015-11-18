package cz.ryvo.organizer.testutils.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.regex.Pattern;

public class UUIDMatcher extends BaseMatcher<String> {

    private final static Pattern UUID_PATTERN = Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");

    public boolean matches(Object item) {
        return UUID_PATTERN.matcher((String) item).matches();
    }

    public void describeTo(Description description) {
        description.appendText("is UUID");
    }

    public static UUIDMatcher matchesUUID() {
        return new UUIDMatcher();
    }
}
