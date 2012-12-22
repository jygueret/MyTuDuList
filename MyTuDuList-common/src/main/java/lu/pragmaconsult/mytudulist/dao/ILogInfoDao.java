/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lu.pragmaconsult.mytudulist.dao;

import java.util.List;
import lu.pragmaconsult.mytudulist.model.LogInfo;

/**
 *
 * @author jy
 */
public interface ILogInfoDao {
    public void insert(LogInfo loginfo);
    public LogInfo select(long id);
    public void update(LogInfo logInfo);
    public void delete(LogInfo logInfo);
    public List<LogInfo> findAll();
}
