package simple

import groovy.util.logging.Slf4j

@Slf4j
class SimpleTest extends DefaultSpecification {

    def "should open google"() {
        when:
            driver.get("http://www.google.pl")
            def title = driver.getTitle()

        then:
            log.info title
            assert title.contains("Google")
    }

}
