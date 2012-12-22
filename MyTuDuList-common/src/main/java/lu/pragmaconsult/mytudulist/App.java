package lu.pragmaconsult.mytudulist;



import java.util.List;
import lu.pragmaconsult.mytudulist.dao.ILogInfoDao;
import lu.pragmaconsult.mytudulist.model.LogInfo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();

        ILogInfoDao logInfoDao = (ILogInfoDao) context.getBean("logInfoDao");
        LogInfo info = new LogInfo();
        info.setClassName("toto");
        logInfoDao.insert(info);
        System.out.println(info.getId());
        
        List<LogInfo> results = logInfoDao.findAll();
        for (LogInfo logInfo : results) {
            System.out.println(logInfo.getId());
        }

    }
}
