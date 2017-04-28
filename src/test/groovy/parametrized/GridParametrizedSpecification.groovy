package parametrized

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import spock.lang.Specification

class GridParametrizedSpecification extends Specification {

    WebDriver driver
    DesiredCapabilities capability

    def cleanup() {
        driver.quit()
    }

}
