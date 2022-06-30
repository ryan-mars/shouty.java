package shouty;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("shouty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "shouty")
public class RunCucumberTest {
        // this is the adapter/bridge code
        // between cucumber jvm and junit
        // you do not need to edit this
}