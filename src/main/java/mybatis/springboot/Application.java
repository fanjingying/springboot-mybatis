package mybatis.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 项目:Mybatis
 * 包名:mybatis.springboot
 * 功能:
 * 时间:16:34 2017/4/24
 * 作者:fan
 */

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "mybatis.springboot.mapper")
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "redirect:countries";
    }
}