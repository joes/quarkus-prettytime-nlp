package io.quarkiverse.prettytime;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import org.ocpsoft.prettytime.nlp.PrettyTimeParser;

import io.quarkus.arc.DefaultBean;

public class PrettyTimeParserProducer {

    @Named("prettyTimeParser")
    @Produces
    @Singleton
    @DefaultBean
    PrettyTimeParser produce() {
        return new PrettyTimeParser();
    }
}
