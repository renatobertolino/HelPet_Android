package br.com.novaroma.helpet.factory;

import br.com.novaroma.helpet.Entitys.Entity;
import br.com.novaroma.helpet.dao.Dao;
import br.com.novaroma.helpet.dao.IDao;

/**
 * Created by renato on 18/11/17.
 */

public class Factory {

    public static <T extends Entity> IDao<T> getDao(Class<T> currentClass) {
        return new Dao<T>(currentClass);
    }

}
