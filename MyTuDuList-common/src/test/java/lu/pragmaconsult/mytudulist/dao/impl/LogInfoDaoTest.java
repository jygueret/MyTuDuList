/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.dao.impl;

import lu.pragmaconsult.mytudulist.model.LogInfo;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jy
 */
public class LogInfoDaoTest {
    
    public LogInfoDaoTest() {
    }

    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class LogInfoDao.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        LogInfo loginfo = null;
        LogInfoDao instance = new LogInfoDao();
        instance.insert(loginfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class LogInfoDao.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        long id = 0L;
        LogInfoDao instance = new LogInfoDao();
        LogInfo expResult = null;
        LogInfo result = instance.select(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LogInfoDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        LogInfo logInfo = null;
        LogInfoDao instance = new LogInfoDao();
        instance.update(logInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LogInfoDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        LogInfo logInfo = null;
        LogInfoDao instance = new LogInfoDao();
        instance.delete(logInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
