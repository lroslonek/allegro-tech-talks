package simple

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import spock.lang.Specification

class DefaultSpecification extends Specification {

    WebDriver driver

    def setup() {
        driver = new FirefoxDriver()
    }

    def cleanup() {
        driver.quit()
    }

}
