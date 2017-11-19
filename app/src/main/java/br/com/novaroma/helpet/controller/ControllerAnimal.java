package br.com.novaroma.helpet.controller;

import br.com.novaroma.helpet.Entitys.Animal;
import br.com.novaroma.helpet.dao.IDao;
import br.com.novaroma.helpet.factory.Factory;

/**
 * Created by renato on 18/11/17.
 */

public class ControllerAnimal {

    private IDao<Animal> daoAnimal = Factory.getDao(Animal.class);



}
