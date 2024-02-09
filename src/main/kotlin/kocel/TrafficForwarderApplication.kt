package kocel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

@SpringBootApplication
class TrafficForwarderApplication

fun main(args: Array<String>) {
    runApplication<TrafficForwarderApplication>(init = { addInitializers(BeansInitializer()) }, args = args)
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {
    override fun initialize(context: GenericApplicationContext) {
        beans {}.initialize(context)
    }
}
