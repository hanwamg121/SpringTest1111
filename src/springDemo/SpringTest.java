package springDemo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class SpringTest {  
  
    public static void main(String[] args) {  
        //读取配置文件  
        Resource rs=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(rs);  
        HelloBean hello=(HelloBean)factory.getBean("helloBean");  
        System.out.println(hello.getHelloWorld());  
    }  
  
} 