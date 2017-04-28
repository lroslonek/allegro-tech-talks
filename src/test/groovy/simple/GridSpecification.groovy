package simple

import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import spock.lang.Specification
import utils.SettingsReader

class GridSpecification extends Specification {

    WebDriver driver
    DesiredCapabilities capability = DesiredCapabilities.chrome()

    def setup() {

//        capability.setPlatform(Platform.WINDOWS)

        driver = new RemoteWebDriver(
                new URL(SettingsReader.get("seleniumgrid.host")),
                capability
        )
    }

    def cleanup() {
        driver.quit()
    }
}
