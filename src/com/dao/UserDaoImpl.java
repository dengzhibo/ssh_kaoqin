package com.dao;

import com.po.User;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by root on 16-9-30.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
    @Override
    public List<com.po.User> getUsers() {
        return (List<User>) getHibernateTemplate().find("from com.po.User");
    }

    @Override
    public User getUserById(int id) {
        return getHibernateTemplate().get(com.po.User.class,id);
    }

    @Override
    public int getUserByUsername(String username){
        List<com.po.User> users= (List<User>) getHibernateTemplate().find("from com.po.User where username=?",new String[]{username});
        return users.size();
    }

    @Override
    public void addUser(User u){
        getHibernateTemplate().save(u);
    }

    @Override
    public void deleteUser(User u) {
        getHibernateTemplate().delete(u);
    }

    @Override
    public void updateUser(User u) {
        getHibernateTemplate().saveOrUpdate(u);
    }
    public User getUserByUnameAndUpass(String username,String password){
        List<com.po.User> users= (List<User>)getHibernateTemplate().find("from com.po.User"+
                " where username=? and password=?",new String[]{username,password});
        if(users.size()>0)
            return users.get(0);
        return null;
    }
}
