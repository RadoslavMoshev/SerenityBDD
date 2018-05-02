1. Import project as "Maven project" in your IDE (e.g. Eclipse) 

2. Add in <MAVEN_INSTALLATION_FOLDER>\conf\settings.xml under <pluginGroups>: 
<pluginGroup>
	net.serenity-bdd.maven.plugins
</pluginGroup>

3.Add in serenity.properties file:
webdriver.driver=chrome
webdriver.chrome.driver = <PATH_TO_CHROMEDRIVER>

4. Build project with Arguments - "clean verify -X -Dwebdriver.chrome.driver=<PATH_TO_CHROMEDRIVER>"

5. Run AcceptanceTestSuite.java with JUnit Test

