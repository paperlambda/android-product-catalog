package com.example.revzan.androidproductcatalog;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Custom App Bar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_customheader);

//      Initiate Database Example
        Realm.init(this);
        Product product = new Product();
        product.set_name("Apple iPhone 5 - 32GB");
        product.set_price("2.111.800");

        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.copyToRealm(product);
        realm.commitTransaction();


    }
}
