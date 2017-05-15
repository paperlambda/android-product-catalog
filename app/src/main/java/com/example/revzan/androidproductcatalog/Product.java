package com.example.revzan.androidproductcatalog;

import io.realm.RealmObject;

/**
 * Created by revzan on 5/16/17.
 */

public class Product extends RealmObject{
    private int _id;
    private String _name;
    private String _price;
    private int _rating;
    private int _review;
    private byte[] _image;

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

    public int get_rating() {
        return _rating;
    }

    public void set_rating(int _rating) {
        this._rating = _rating;
    }

    public int get_review() {
        return _review;
    }

    public void set_review(int _review) {
        this._review = _review;
    }

    public byte[] get_image() {
        return _image;
    }

    public void set_image(byte[] _image) {
        this._image = _image;
    }
}
