package parametrized

import groovy.util.logging.Slf4j
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import spock.lang.Unroll
import utils.SettingsReader

@Slf4j
class AllBrowserTest extends GridParametrizedSpecification {

    @Unroll "should run on every browser"(def browser) {
        given:
            capability = browser

        when:
            driver = new RemoteWebDriver(
                    new URL(SettingsReader.get("seleniumgrid.host")),
                    capability)

            def actualBrowser = driver.getCapabilities().browserName
            log.info "--- actual browser is: ${actualBrowser}"

        then:
            actualBrowser == browser.browserName

        where:
            browser << [
                    DesiredCapabilities.firefox(),
                    DesiredCapabilities.chrome()
            ]
    }

}
