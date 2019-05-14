/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.RegionDAO;
import java.math.BigDecimal;
import java.util.List;
import models.Country;
import models.Region;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author FES
 */
public class RegionDAOTest {

    public static void main(String[] args) {
        SessionFactory factory = new HibernateUtil().getSessionFactory();
        RegionDAO rdao = new RegionDAO(factory);

        List<Region> regions = rdao.getAll();
        for (Region data : regions) {
//            System.out.println(data.getRegionId() + " " + data.getRegionName());
            for (Country data2 : data.getCountryList()) {
                System.out.println(data.getRegionName()+" >> "+data2.getCountryId()+" "+data2.getCountryName());
            }
        }

    }
}
