package gateway_zuul_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuul1Application {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuul1Application.class, args);
	}
}
