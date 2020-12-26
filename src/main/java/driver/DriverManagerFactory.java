package driver;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverManager.DriverType type) {
        DriverManager driverManager;

        if (type == DriverManager.DriverType.FIREFOX) {
            driverManager = new FirefoxDriverManager();
        } else {
            driverManager = new ChromeDriverManager();
        }

        return driverManager;
    }

}
