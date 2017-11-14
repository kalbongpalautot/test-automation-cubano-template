package org.concordion.cubano.driver.database;

public class ExampleDataSourceFactory {
	// private static DataSource datasource = null;
	// private static FluentJdbc fluentJDBC = null;
	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(ExampleDataSourceFactory.class);
	//
	// private ExampleDataSourceFactory() {
	// }
	//
	// public static synchronized DataSource getOracleDataSource() throws
	// SQLException {
	// if (datasource == null) {
	// OracleDataSource oracleDS = new OracleDataSource();
	// oracleDS.setURL(AppConfig.getInstance().getDatabaseUrl());
	//
	// datasource = oracleDS;
	// }
	//
	// return datasource;
	// }
	//
	// public static synchronized FluentJdbc fluentJDBC() throws SQLException {
	// if (fluentJDBC == null) {
	// AfterQueryListener listener = execution -> {
	// // TODO Also log parameters
	// LOGGER.trace("Executed SQL: " + execution.sql());
	// };
	//
	// fluentJDBC = new FluentJdbcBuilder()
	// .connectionProvider(getOracleDataSource())
	// .afterQueryListener(listener)
	// .build();
	// }
	//
	// return fluentJDBC;
	// }
}
