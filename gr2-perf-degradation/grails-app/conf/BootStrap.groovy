import gr2.perf.degradation.Foo
import gr2.perf.degradation.TestController

class BootStrap {

    def init = { servletContext ->

        (1..1000).each {
            new Foo(foo: it as String, bar: it * 2 as String, baz: it * 3 as String).save()
        }

        TestController.ids = Foo.all.collect{it.id}

    }
    def destroy = {
    }
}
