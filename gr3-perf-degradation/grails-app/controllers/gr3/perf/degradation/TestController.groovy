package gr3.perf.degradation

class TestController {

    static ids

    def index() {}

    def loadWithGet() {
        render time {
            ids.each {
                Foo.get(it)
            }
        }
    }

    def loadWithRead() {
        render time {
            ids.each {
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
