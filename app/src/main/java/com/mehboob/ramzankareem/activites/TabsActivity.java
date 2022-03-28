package com.mehboob.ramzankareem.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.interstitial.InterstitialAd;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.hassanjamil.hqibla.CompassActivity;
import com.hassanjamil.hqibla.Constants;
import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.adapters.PageAdapter;
public class TabsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem ramazanTime, prayTime,  tasbih, azkar, asmaUlHassana;
    ViewPager viewPager;
    PageAdapter adapter;
    InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        intiView();

        adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2
                        || tab.getPosition() == 3 || tab.getPosition() == 4 ){
                    adapter.notifyDataSetChanged();
                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.menu_qibla:
               Intent intent = new Intent(TabsActivity.this, CompassActivity.class);
               intent.putExtra(Constants.TOOLBAR_TITLE, "My App");		// Toolbar Title
               intent.putExtra(Constants.TOOLBAR_BG_COLOR, "#FFFFFF");		// Toolbar Background color
               intent.putExtra(Constants.TOOLBAR_TITLE_COLOR, "#000000");	// Toolbar Title color
               intent.putExtra(Constants.COMPASS_BG_COLOR, "#FFFFFF");		// Compass background color
               intent.putExtra(Constants.ANGLE_TEXT_COLOR, "#000000");		// Angle Text color
               intent.putExtra(Constants.DRAWABLE_DIAL, R.drawable.dial);	// Your dial drawable resource
               intent.putExtra(Constants.DRAWABLE_QIBLA, R.drawable.qibla); 	// Your qibla indicator drawable resource
               intent.putExtra(Constants.FOOTER_IMAGE_VISIBLE, View.VISIBLE|View.INVISIBLE|View.GONE);	// Footer World Image visibility
               intent.putExtra(Constants.LOCATION_TEXT_VISIBLE, View.VISIBLE|View.INVISIBLE|View.GONE); // Location Text visibility
               startActivity(intent);
               break;

       }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Confirm Exit..!!!");
        // Icon Of Alert Dialog

        // Setting Alert Dialog Message
        alertDialogBuilder.setMessage("Are you sure,You want to exit");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void intiView() {

        tabLayout = findViewById(R.id.tabLayout);
        ramazanTime = findViewById(R.id.ramdanTime);
        prayTime = findViewById(R.id.prayTime);

        tasbih = findViewById(R.id.tasbih);
        azkar = findViewById(R.id.azkar);
        asmaUlHassana = findViewById(R.id.asma);
        viewPager = findViewById(R.id.viewPager);
    }
}