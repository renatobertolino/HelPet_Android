package br.com.novaroma.helpet.controller;

import br.com.novaroma.helpet.Entitys.Address;
import br.com.novaroma.helpet.Entitys.Animal;
import br.com.novaroma.helpet.Entitys.Complaint;
import br.com.novaroma.helpet.dao.IDao;
import br.com.novaroma.helpet.factory.Factory;

/**
 * Created by renato on 18/11/17.
 */

public class ControllerComplaint {

    private IDao<Complaint> daoComplaint = Factory.getDao(Complaint.class);


    public void registerComplaint(Animal animal, String description, Address address){
        daoComplaint.insert(new Complaint(animal, description, address));
        //TODO Consertar essa arquitetura
    }

    public void updateComplaint(Animal animal, String description, Address address){
        daoComplaint.update(new Complaint(animal, description, address));
        //TODO Consertar o método
    }

    /*public ArrayList<Complaint> listComplaint(){
       TODO
    }*/

}
