package bookshelf.servlet.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Davenkin on 10/24/14.
 */
public class SpringContextInitiator implements ServletContextListener {

    public static final String SPRING_CONTEXT = "SPRING_CONTEXT";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bookRepository.xml");
        sce.getServletContext().setAttribute(SPRING_CONTEXT, context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
