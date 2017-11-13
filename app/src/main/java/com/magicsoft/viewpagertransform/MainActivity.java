package com.magicsoft.viewpagertransform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.magicsoft.viewpagertransform.activity.GalleryActivity;
import com.magicsoft.viewpagertransform.activity.GalleryActivity2;
import com.magicsoft.viewpagertransform.activity.TestGalleryActivity;
import com.magicsoft.viewpagertransform.activity.VpActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImg = (ImageView) findViewById(R.id.img_main_img);

        mImg.setRotationY(45);


    }
    public void goTo(Class clz){
        startActivity(new Intent(this,clz));
    }

    public void gallery(View view) {
        goTo(GalleryActivity.class);
    }

    public void gallery2(View view) {
        goTo(GalleryActivity2.class);
    }

    public void transform(View view) {
        goTo(VpActivity.class);
    }

    public void transformTest(View view) {
        goTo(TestGalleryActivity.class);
    }
}
