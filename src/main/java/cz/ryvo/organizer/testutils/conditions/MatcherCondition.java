package cz.ryvo.organizer.testutils.conditions;

import org.assertj.core.api.Condition;
import org.hamcrest.Matcher;

public class MatcherCondition<T> extends Condition<T> {

    private final Matcher matcher;

    public MatcherCondition(final Matcher<T> matcher) {
        super(String.format("Matcher '%s'", matcher));
        this.matcher = matcher;
    }

    @Override
    public boolean matches(final T value) {
        return matcher.matches(value);
    }
}
