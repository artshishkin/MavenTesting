package com.artarkatesoft.maventesting

import spock.lang.Specification

class JavaHelloWorldSPecTest extends Specification {
    def "GetMessage"() {
        when:
        def foo="123"

        then:
        true
    }
}
