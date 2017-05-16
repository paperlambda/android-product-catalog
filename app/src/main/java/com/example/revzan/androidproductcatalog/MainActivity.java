package com.example.revzan.androidproductcatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        Product product = new Product();
        product.name = "Apple iPhone 5 - 32GB";
        product.price = "2.111.800";

        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealm(product);
        realm.commitTransaction();

    }
}
