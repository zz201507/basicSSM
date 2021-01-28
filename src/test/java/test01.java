import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SSM
 * @description
 * @author: z'z
 * @create: 2020-07-04 21:37
 **/

public class test01 {

    @Test
    public void test(){
        String config = "conf/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object object[] = ac.getBeanDefinitionNames();
        for (Object o : object) {
            System.out.println(o.toString());
        }
    }

    @Test
    public void andTest(){
        System.out.println("这是一个junit测试");
    }
}
