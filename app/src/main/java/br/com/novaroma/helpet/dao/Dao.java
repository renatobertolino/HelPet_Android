package br.com.novaroma.helpet.dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import br.com.novaroma.helpet.Entitys.Entity;

/**
 * Created by renato on 18/11/17.
 */

public class Dao<T extends Entity> implements IDao<T> {

    private Class currentClass;

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("https://helpet-android.firebaseio.com/");


    public Dao(Class<T> currentClass){
        this.currentClass = currentClass;
    }

    @Override
    public void insert(T entity) {
        ref.setValue(entity);
        ref.push();
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<T> list(T entity) {
        return null;
    }
}
