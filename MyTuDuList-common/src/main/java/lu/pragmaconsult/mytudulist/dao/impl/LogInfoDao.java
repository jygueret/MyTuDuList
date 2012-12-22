/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import lu.pragmaconsult.mytudulist.dao.ILogInfoDao;
import lu.pragmaconsult.mytudulist.model.LogInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jy
 */
@Repository
public class LogInfoDao implements ILogInfoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void insert(LogInfo loginfo) {
        entityManager.persist(loginfo);
    }

    @Transactional(readOnly = true)
    @Override
    public LogInfo select(long id) {
        return entityManager.find(LogInfo.class, id);
    }

    @Transactional
    @Override
    public void update(LogInfo logInfo) {
        entityManager.merge(logInfo);
    }

    @Transactional
    @Override
    public void delete(LogInfo logInfo) {
        entityManager.remove(logInfo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<LogInfo> findAll() {
        Query query = entityManager.createQuery("select logInfo from LogInfo logInfo");
        return query.getResultList();
    }
}
