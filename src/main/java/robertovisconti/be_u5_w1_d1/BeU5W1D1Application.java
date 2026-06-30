package robertovisconti.be_u5_w1_d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeU5W1D1Application {

    public static void main(String[] args) {
        ApplicationContext txc = SpringApplication.run(BeU5W1D1Application.class, args);

//        Menu menu = txc.getBean(Menu.class);
//
//        menu.printMenu();
    }

}
