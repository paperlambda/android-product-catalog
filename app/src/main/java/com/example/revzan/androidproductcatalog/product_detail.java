package com.example.revzan.androidproductcatalog;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import io.realm.Realm;

public class product_detail extends AppCompatActivity {

    private ProductAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Rincian Produk");

        Intent intent = getIntent();
        int position = intent.getIntExtra("POSITION",0);
        Realm.init(this);
        Realm realm = Realm.getDefaultInstance();
        Product product = realm.where(Product.class).equalTo("_id",position).findFirst();
        TextView title = (TextView) findViewById(R.id.detailTitle);
        TextView price = (TextView) findViewById(R.id.detailPrice);
        TextView desc = (TextView) findViewById(R.id.detailDesc);
        ImageView image = (ImageView) findViewById(R.id.detailImage);
        title.setText(product.get_name());
        price.setText(String.valueOf("IDR ").concat(product.get_price()));
        desc.setText(product.get_description());
        image.setImageResource(getImageRes(product.get_thumbnail()));

    }
    private int getImageRes(String thumb) {
        if (thumb.equals("black")) {
            return R.drawable.fog_design_art;
        } else if (thumb.equals("white")) {
            return R.drawable.rectangle_7;
        }
        return 0;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
