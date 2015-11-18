package cz.ryvo.organizer.testutils.conditions;

import org.assertj.core.api.Condition;
import org.hamcrest.Matcher;

public class Conditions {

    public static <T> Condition<T> matcher(final Matcher<T> matcher) {
        return new MatcherCondition<T>(matcher);
    }
}
