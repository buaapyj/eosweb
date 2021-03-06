package buaa.eos;

//特别注意，下面的是 tk.MapperScan

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liuzh
 * @since 2015-12-12 18:22
 */
@SpringBootApplication
@Controller
@EnableScheduling
@MapperScan(basePackages = "buaa.eos.mapper")
public class Application implements WebMvcConfigurer,CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("服务启动完成!");
    }

//    @RequestMapping("/")
//    String home() {
//        return "redirect:countries";
//    }
}
