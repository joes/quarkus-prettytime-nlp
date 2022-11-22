package io.quarkiverse.prettytime.deployment;

import org.ocpsoft.prettytime.nlp.PrettyTimeParser;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class PrettyTimeParserProcessor {

    private static final String FEATURE = "prettytime-nlp";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem producePrettyTime() {
        return new AdditionalBeanBuildItem(PrettyTimeParser.class);
    }

}
