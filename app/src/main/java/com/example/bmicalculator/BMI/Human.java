package com.example.bmicalculator.BMI;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.bmicalculator.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Scanner;

/**
 * Created by user on 23/10/2559.
 */

public class Human extends AppCompatActivity {
    Scanner in = new Scanner(System.in);
    double Height = in.nextDouble();
    double Weight = in.nextDouble();
    double H = Height / 100.0;
    double BMI = Weight / (H * H);
    String N ="";

    public double get(){
        return BMI;
    }
    public String getBmi(){
        if(BMI<18.5){
            N = "น้ำหนักน้อยกว่าเกณฑ์(ผอม)";

        return N;}
        else if(BMI>=18.5 && BMI<25){
            N = "น้ำหนักปกติ";

        return N;}
        else if(BMI>=25&&BMI<30){
            N = "น้ำหนักมากกว่าปกติ(ท้วม)";
            return N;

        }
        else{
            N = "น้ำหนักมากกว่าปกติมาก(อ้วน)";
            return N;
        }

    }

}