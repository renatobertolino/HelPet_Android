package br.com.novaroma.helpet.dao;

import java.util.ArrayList;

import br.com.novaroma.helpet.Entitys.Entity;

/**
 * Created by renato on 18/11/17.
 */

public interface IDao<T extends Entity> {

    void insert(T t);
    void update(T t);
    void delete(String id);
    ArrayList<T> list(T t);
}
