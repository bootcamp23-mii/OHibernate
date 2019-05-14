/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.Country;

/**
 *
 * @author FES
 */
public interface ICountryController {
    public Country getById(Object id);
    public List<Country> getAll();
    public List<Country> search(Object keyword);
    public String insert (String id, String name, String region);
    public String update (String id, String name, String region);
    public String delete (Object id);
}
