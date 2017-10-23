# test-automation-westpac

[Eclise Setup](docs/EclipseSetup.md)

# Proxy Support

If running behind a proxy then modify the follow settings in config.properties:

	proxy.required = true
	proxy.host = XXXX
	proxy.port = 8080

# How To Run The Tests 
1. Clone and download this project and store it anywhere your local drive  
2. Follow the eclipse setup instructions or if it is already setup just make sure that you can access the internet thru eclipse (if not update the proxy details in Eclipse and as per above)
3. Once project is imported, do a Gradle refresh so it will download all required dependencies (Gradel->Refresh Gradle Project)
4. Now you are ready to execute the test. Test can be run using :
    - IDE (e.g. Eclipse) as JUnit test. To run the entire test go to "src/test/java/..*/specification/Specification.java" or as individual tests underneath and RunAs "JUnit".
    - Thru IDE or command line using gradle (e.g. gradle test)  

