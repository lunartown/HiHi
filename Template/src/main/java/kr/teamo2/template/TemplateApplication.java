package {{package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{project_name_camel_upper_case}}Application {

    public static void main(String[] args) {
        SpringApplication.run({{project_name_camel_upper_case}}Application.class, args);
    }

}
