package com.mehboob.ramzankareem.fragments;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.activites.TabsActivity;
import com.mehboob.ramzankareem.models.AppController;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;


public class PrayTime extends Fragment {
    TextView mFajar, mZuhar, mAsar, mMaghrib, mIsha, mDate, mShurooq, mLocation;
    EditText mSearchEt;
    ImageView mSearchBtn;

    private AdView adView;
    AdRequest adRequest;
    private static final String TAG = "TAG";
    String tag_json_obj = "json_obj_req";
    ProgressDialog pDialog;
    String url;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pray_time, container, false);
        initViews(view);

        adView = (AdView) view. findViewById(R.id.ad_view_pray_time);
        MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        mSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String search = mSearchEt.getText().toString();
                if (search.isEmpty()) {
                    mSearchEt.setError("Enter any location");
                } else {
                    url = "https://muslimsalat.com/" + search + ".json?key=29f42b1a6ace46691fa70fca6ea22d43";
                    searchLocation();
                }

            }
        });

        return view;
    }

    private void searchLocation() {
        pDialog = new ProgressDialog(getContext());
        pDialog.setMessage("Loading...");
        pDialog.show();
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, response.toString());
                        try {
                            // get the qibla
                            String qibla = response.get("qibla_direction").toString();

                            // getLocation
                            String country = response.get("country").toString();
                            String state = response.get("state").toString();
                            String city = response.get("city").toString();
                            String location = country + "," + state + "," + city;

                            // getting namaz time and date
                            String Date = (String) response.getJSONArray("items").getJSONObject(0).get("date_for");
                            String Fajar = response.getJSONArray("items").getJSONObject(0).get("fajr").toString();
                            String Shurooq = response.getJSONArray("items").getJSONObject(0).get("shurooq").toString();
                            String Zuhar = response.getJSONArray("items").getJSONObject(0).get("dhuhr").toString();
                            String Asar = response.getJSONArray("items").getJSONObject(0).get("asr").toString();
                            String Maghrib = response.getJSONArray("items").getJSONObject(0).get("maghrib").toString();
                            String Isha = response.getJSONArray("items").getJSONObject(0).get("isha").toString();
                            setData(Date, Fajar, Shurooq, Zuhar, Asar, Maghrib, Isha, location);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        pDialog.hide();
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                // hide the progress dialog
                Toast.makeText(getContext(), "Check Internet and try again", Toast.LENGTH_SHORT).show();
                pDialog.hide();
            }
        });

// Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

    }

    private void setData(String date, String fajar, String shurooq, String zuhar, String asar, String maghrib, String isha, String location) {

        mDate.setText(date);
        mFajar.setText(fajar);
        mShurooq.setText(shurooq);
        mZuhar.setText(zuhar);
        mAsar.setText(asar);
        mMaghrib.setText(maghrib);
        mIsha.setText(isha);
        mLocation.setText(location);
    }

    private void initViews(View view) {

        mFajar = view.findViewById(R.id.fajarTv);
        mSearchEt = view.findViewById(R.id.searchEt);
        mSearchBtn = view.findViewById(R.id.searchBtn);
        mDate = view.findViewById(R.id.dateTv);
        mLocation = view.findViewById(R.id.locationTv);
        mShurooq = view.findViewById(R.id.shurooqTv);
        mZuhar = view.findViewById(R.id.zuharTv);
        mAsar = view.findViewById(R.id.asarTv);
        mMaghrib = view.findViewById(R.id.MaghribTv);
        mIsha = view.findViewById(R.id.IshaTv);
    }
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}