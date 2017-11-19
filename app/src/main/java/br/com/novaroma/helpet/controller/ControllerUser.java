package br.com.novaroma.helpet.controller;

import br.com.novaroma.helpet.Entitys.User;
import br.com.novaroma.helpet.dao.IDao;
import br.com.novaroma.helpet.factory.Factory;

/**
 * Created by renato on 18/11/17.
 */

public class ControllerUser {

    private IDao<User> daoUser = Factory.getDao(User.class);

    public void insertUser(String name, String email, String password){
        daoUser.insert(new User(name, email, password));
    }

    public void updateUser(String name, String email, String password){
        daoUser.update(new User(name, email, password));
    }

    public void deleteUser(){
        //TODO
    }
}
