package br.com.novaroma.helpet.controller;

import br.com.novaroma.helpet.Entitys.Address;
import br.com.novaroma.helpet.dao.IDao;
import br.com.novaroma.helpet.factory.Factory;

/**
 * Created by renato on 18/11/17.
 */

public class Controller {

    private IDao<Address> daoAddress = Factory.getDao(Address.class);


}
