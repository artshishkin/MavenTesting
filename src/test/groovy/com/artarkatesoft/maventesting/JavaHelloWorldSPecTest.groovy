package com.artarkatesoft.maventesting

import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {
    def "GetMessage"() {
        when:
        def foo="123"

        then:
        true
    }
}
