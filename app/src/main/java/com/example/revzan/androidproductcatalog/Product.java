package com.example.revzan.androidproductcatalog;

import io.realm.RealmObject;

/**
 * Created by revzan on 5/16/17.
 */

public class Product extends RealmObject{
    private int _id;
    private String _name;
    private String _price;
//    private byte[] _image;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_price() {
        return _price;
    }

    public void set_price(String _price) {
        this._price = _price;
    }

}
