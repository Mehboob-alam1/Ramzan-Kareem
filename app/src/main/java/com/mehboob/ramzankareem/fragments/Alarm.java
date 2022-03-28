package com.mehboob.ramzankareem.fragments;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TimePicker;

import com.mehboob.ramzankareem.R;

import java.util.Timer;
import java.util.TimerTask;


public class Alarm extends Fragment {
    TimePicker alarmTime;
    TextClock currentTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alarm, container, false);

        alarmTime = view.findViewById(R.id.timePicker);
        currentTime = view.findViewById(R.id.textClock);
        final Ringtone r = RingtoneManager.getRingtone(getContext(), RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (currentTime.getText().toString().equals(AlarmTime())) {
                    r.play();
                } else {
                    r.stop();
                }
            }
        }, 0, 1000);


        return view;

    }

    private String AlarmTime() {
        Integer alarmHours = alarmTime.getCurrentHour();
        Integer alarmMinutes = alarmTime.getCurrentMinute();
        String stringAlarmMinutes;

        if (alarmMinutes < 10) {
            stringAlarmMinutes = "0";
            stringAlarmMinutes = stringAlarmMinutes.concat(alarmMinutes.toString());
        } else {
            stringAlarmMinutes = alarmMinutes.toString();
        }
        String stringAlarmTime;

        if (alarmHours > 12) {
            alarmHours = alarmHours - 12;
            stringAlarmTime = alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat("PM");
        } else {
            stringAlarmTime = alarmHours.toString().concat(":").concat(stringAlarmMinutes).concat("AM");
        }
        return stringAlarmTime;
    }


}

