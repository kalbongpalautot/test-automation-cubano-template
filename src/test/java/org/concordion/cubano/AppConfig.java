package org.concordion.cubano;

import org.concordion.cubano.config.*;

import org.concordion.cubano.driver.web.config.WebDriverConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);
    private final PropertyLoader propertyLoader;

    private String baseUrl;
    private String searchUrl;
    private String dbSchema;
    private String dbUrl;
	private String westpacUrl;
	private WebDriverConfig webDriverConfig;

    private static class Holder {
        static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }

    private AppConfig() {
        propertyLoader = Config.getInstance().getPropertyLoader();
        loadProperties();
        webDriverConfig = WebDriverConfig.getInstance();

        // TODO - reinstate?
//        releaseProperties();
    }

    public void logSettings() {
        LOGGER.info("Environment:        " + Config.getInstance().getEnvironment());
        LOGGER.info("url:                " + baseUrl);
        LOGGER.info("Browser:            " + webDriverConfig.getBrowserProvider());

        if (!webDriverConfig.getBrowserDimension().isEmpty()) {
            LOGGER.info("browserSize:        " + webDriverConfig.getBrowserDimension());
        }
    }

    private void loadProperties() {
        baseUrl = propertyLoader.getProperty("baseUrl");
        searchUrl = propertyLoader.getProperty("searchUrl");
        westpacUrl = propertyLoader.getProperty("westpacUrl");

        // dbUrl = getProperty("database.url");
        // dbSchema = getProperty("database.schema");

    }

    // Application properties
    public String getBaseUrl() {
        return baseUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }
    
    public String getWestpacUrl() {
        return westpacUrl;
    }

    public String getDatabaseUrl() {
        return dbUrl;
    }

    public String getDatabaseSchema() {
        return dbSchema;
    }
}

