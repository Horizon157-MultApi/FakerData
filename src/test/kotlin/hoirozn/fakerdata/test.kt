package hoirozn.fakerdata

import hoirozn.fakerdata.utlis.FakerDataUtils
import java.util.*

class test {
    fun main(){
        val fakedata = FakerDataUtils()
        val result = fakedata.fakerDate(Locale.CHINA)
        println(result)
    }
}