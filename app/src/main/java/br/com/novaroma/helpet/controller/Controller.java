package br.com.novaroma.helpet.controller;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.novaroma.helpet.Entitys.Address;
import br.com.novaroma.helpet.dao.IDao;
import br.com.novaroma.helpet.factory.Factory;

/**
 * Created by renato on 18/11/17.
 */

public class Controller {

    private IDao<Address> daoAddress = Factory.getDao(Address.class);

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();

}
