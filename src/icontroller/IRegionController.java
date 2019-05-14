/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontroller;

import java.util.List;
import models.Region;

/**
 *
 * @author FES
 */
public interface IRegionController {
    public List<Region> getAll();
    public Region getById(Object id);
    public List<Region> search(Object keyword);
    public String insert (String id, String name);
    public String update (String id, String name);
    public String delete (Object id);
}
