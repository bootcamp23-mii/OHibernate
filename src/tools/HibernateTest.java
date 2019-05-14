/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author FES
 */
public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory factory = new HibernateUtil().getSessionFactory();
        System.out.println(factory);
    }
}
