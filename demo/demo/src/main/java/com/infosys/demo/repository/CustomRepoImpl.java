// package com.infosys.demo.repository;

// import javax.persistence.EntityManager;
// import javax.persistence.PersistenceContext;
// import javax.transaction.Transactional;

// import com.infosys.demo.model.Role;

// import org.hibernate.Query;
// import org.hibernate.Session;
// import org.hibernate.Transaction;

// public class CustomRepoImpl implements CustomRepo {

//     @PersistenceContext
//     private EntityManager em;

//     @Override
//     @Transactional
//     public Role findRole(String user_role) {
        
//       em.createQuery("FROM role WHERE user_role = :user_role")
//       .setParameter("role", user_role);
//         return Role;

//     }
    
// }