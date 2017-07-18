package gr3.perf.degradation

class BootStrap {

    static ids

    def init = { servletContext ->

        (1..1000).each {
            new Foo(foo: it as String, bar: it * 2 as String, baz: it * 3 as String).save()
        }

        ids = Foo.all.collect{it.id}

    }
    def destroy = {
    }
}
