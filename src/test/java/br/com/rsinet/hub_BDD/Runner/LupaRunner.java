package br.com.rsinet.hub_BDD.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\gehaime.silva\\Documents\\projeto\\WorkSpace\\AdvantageBDDTest\\WorkSpace\\AdvantageBDD\\Recurso3\\BuscaNaLupa_Test.feature",
		glue = "br.com.rsinet.hub_BDD.AdvantageBDD",
		monochrome = true,
		dryRun = false,
		tags = {"@Busca_Na_Lupa"
		}
		)
public class LupaRunner {
}

	