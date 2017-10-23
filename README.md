# test-automation-westpac

[Eclise Setup](docs/EclipseSetup.md)

# Proxy Support

If running behind a proxy then modify the follow settings in config.properties:

	proxy.required = true
	proxy.host = XXXX
	proxy.port = 8080

# Hot To Run The Tests 

Test can be run using :
1. IDE (e.g. Eclipse) as JUnit test. To run the entire test go to " src/test/java/..*/specification/Specification.java or as individual tests underneath and RunAs "JUnit".
2. Thru IDE or command line using gradle (e.g. gradle test)  

