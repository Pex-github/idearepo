package com.dao;
import com.dao.Emp;
/**
 * @Auther:PEX
 * @Date:2020/7/16-18:03
 * @Description: com.dao
 * @version:1.8
 */
public interface Empintfce {

    public void insert(Emp emp);

    public void delete(Emp emp);

    public void update(Emp emp);

    public Emp getEmpByEmpno(Integer empno);

    public Emp getEmpByEname(String name);
}
