package gr3.perf.degradation

class TestController {

    def index() {}

    def loadWithGet() {
        render time {
            BootStrap.ids.each {
                Foo.get(it)
            }
        }
    }

    def loadWithRead() {
        render time {
            BootStrap.ids.each {
                Foo.read(it)
            }
        }
    }


    private def time(Closure cl) {
        long start = System.currentTimeMillis()
        cl()
        System.currentTimeMillis() - start
    }
}
