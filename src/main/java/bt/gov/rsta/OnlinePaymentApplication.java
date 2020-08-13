package bt.gov.rsta;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={bt.gov.rsta.configuration.EralisConfig.class})

public class OnlinePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentApplication.class, args);
	}

}
