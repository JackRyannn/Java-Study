import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jackryannn on 18/3/22.
 */
public class Main {
    public static void main(String[] args){
//        获取beans.xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.cloth.getName());

    }
}
