package uk.sky.ovp.cp.functional.config;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration(
        classes = ComponentConfig.class,
        initializers = ConfigDataApplicationContextInitializer.class
)
@CucumberContextConfiguration
public class CucumberConfig {
}
