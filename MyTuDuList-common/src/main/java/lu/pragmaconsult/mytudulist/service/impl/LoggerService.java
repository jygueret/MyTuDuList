/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.service.impl;

import lu.pragmaconsult.mytudulist.dao.ILogInfoDao;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jy
 */
@Service("loggerService")
public class LoggerService {

    private Logger logger;
    @Autowired
    private ILogInfoDao logInfoDao;

    public void beforeInvoke(JoinPoint joinPoint) throws Exception {
//        logger = Logger.getLogger(joinPoint.getTarget().getClass());
//        LogInfo logInfo = new LogInfo();
//        logInfo.setClassName(joinPoint.getTarget().getClass().getName());
//        logInfo.setLogDate(new Date());
//        logInfo.setLogLevel(Logger.getRootLogger().getLevel().toString());
//        logInfo.setMethodName(joinPoint.getSignature().getName());
//        logInfo.setArguments(ArrayUtils.toString(joinPoint.getArgs().toString()));
//        logInfo.setPointCut("before");
//        logInfoDao.insert(logInfo);



//        logger.info(joinPoint.getTarget().getClass().getName());
//        logger.info(joinPoint.getSignature().getName());
//        logger.info(joinPoint.getKind());

    }

    public void afterInvoke(JoinPoint joinPoint, Object result) {
          System.out.println(result.toString());
    }

    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println(error.toString());
    }
}
