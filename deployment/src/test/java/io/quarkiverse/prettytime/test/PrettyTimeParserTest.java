package io.quarkiverse.prettytime.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.ocpsoft.prettytime.nlp.PrettyTimeParser;

import io.quarkus.test.QuarkusUnitTest;

public class PrettyTimeParserTest {

    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    PrettyTimeParser prettyTimeParser;

    @Test
    public void canInjectPrettyTimeParser() {
        assertNotNull(prettyTimeParser);
    }

    @Test
    public void canParseNLPDateExpression() {
        List<Date> parse = prettyTimeParser.parse("I did it three days ago");
        assertFalse(parse.isEmpty());
    }
}
