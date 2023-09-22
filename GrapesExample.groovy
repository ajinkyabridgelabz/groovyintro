@Grab('org.apache.commons:commons-lang3:3.12.0')

class GrapesExample {
    def static main(args) {
        def StringUtils = org.apache.commons.lang3.StringUtils

        println(StringUtils.reverse("Hello, world!"))
    }
}

