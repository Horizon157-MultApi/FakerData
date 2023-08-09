package hoirozn.fakerdata

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
class FakerDataApplication

fun main(args: Array<String>) {
    runApplication<FakerDataApplication>(*args)
}
