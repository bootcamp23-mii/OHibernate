/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.CountryDAO;
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
public class CountryDAOTest {

    public static void main(String[] args) {
        SessionFactory factory = new HibernateUtil().getSessionFactory();
        CountryDAO cdao = new CountryDAO(factory);

        cdao.deleteById("ID");

        List<Country> countries = cdao.getAll();
        for (Country data : countries) {
            System.out.println(data.getCountryId() + " " + data.getCountryName() + " " + data.getRegionId().getRegionId());
        }
    }
}
