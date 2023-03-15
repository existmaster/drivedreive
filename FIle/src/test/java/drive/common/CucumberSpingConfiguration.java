package drive.common;

import drive.FIleApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FIleApplication.class })
public class CucumberSpingConfiguration {}
