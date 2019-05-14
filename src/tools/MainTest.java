/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.GeneralDAO;
import daos.RegionDAO;
import java.math.BigDecimal;
import models.Region;
import org.hibernate.SessionFactory;

/**
 *
 * @author FES
 */
public class MainTest {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        GeneralDAO dao = new GeneralDAO(factory);
//        dao.insert(new Region(new BigDecimal("5"), "Australia"));
        System.out.println(dao.getById(5).getRegionName());
//        RegionDAO rdao = new RegionDAO(factory);
//        for (Region region : rdao.search("a")) {
//            System.out.println(region.getRegionId());
//        }
//        System.out.println(rdao.getById(new BigDecimal(1)).getRegionName());
//        System.out.println();
//        int a = 1;
//        int a2 = 1;
//        String b = "sasdasd";
//        Object o = rdao+b;
//        System.out.println(o);
    
    }
}
