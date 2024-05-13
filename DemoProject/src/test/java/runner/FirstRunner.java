package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
  @CucumberOptions(
          features = "src/test/java/feature/FileUploadDemo.feature",
          glue = {"StepDefinitions"}

//        features = "src/test/java/feature/First.feature",
//        glue = {"StepDefinitions","utility"},
//         plugin={"pretty","html:target/cucumber/html/report","json:cucumber.json"}
)
public class FirstRunner {
}
