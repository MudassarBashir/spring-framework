package com.caveofprogramming.spring.web.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Component("usersDao")
@Transactional
public class UsersDao {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    SessionFactory sessionFactory;

    Session session() {
        return sessionFactory.getCurrentSession();
    }

    public void create(User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        session().save(user);

    }

    public boolean exists(String username) {

        Criteria criteria = session().createCriteria(User.class);
        criteria.add(Restrictions.idEq(username));
        return (User)criteria.uniqueResult() != null;

    }

    @SuppressWarnings("unchecked") // Otherwise we get an unchecked cast warning because we are casting a List<Object> to List<User>
    public List<User> getAllUsers() {
        return session().createQuery("from User").list();
    }



}