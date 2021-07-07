package karate.features;

import com.intuit.karate.junit5.Karate;

public class FeatureRunner {

	/*
    @Karate.Test
    Karate testNominalScenario() {
        return Karate.run("features/create-todo")
                .tags("@nominal")
                .relativeTo(getClass());
    }
    */
    
    @Karate.Test
    Karate testPOC() {
        return Karate.run("hello").relativeTo(getClass());
    }
}
