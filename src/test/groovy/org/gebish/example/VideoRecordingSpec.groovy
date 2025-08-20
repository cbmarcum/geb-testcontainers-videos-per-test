package org.gebish.example

import geb.spock.GebSpec
import org.openqa.selenium.firefox.FirefoxDriver

class VideoRecordingSpec extends GebSpec {



    def cleanup() {
        def testcontainersWebDriver = driver as TestcontainersWebDriver
        testcontainersWebDriver.afterTest(
                specificationContext.currentIteration.name, specificationContext.currentSpec.name
        )
    }

    def 'go to geb home page'() {

        when: 'visiting the geb home page'
        go("https://groovy.apache.org/geb/")

        then: 'the page title is correct'
        title == "Geb"
    }

    def 'go to spockframework.org'() {
        when: 'visiting the spock home page'
        go('https://spockframework.org/')

        then: 'the page title is correct'
        title == "Geb"
    }
}
