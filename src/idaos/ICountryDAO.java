/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Country;

/**
 *
 * @author FES
 */
public interface ICountryDAO {
    public List<Country> getAll();
    public Country getById(Object id);
    public List<Country> search(Object keyword);
    public boolean insert(Country country);
    public boolean update(Country country);
    public boolean deleteById(Object id);
}
