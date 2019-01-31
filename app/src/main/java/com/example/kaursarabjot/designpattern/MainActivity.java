package com.example.kaursarabjot.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kaursarabjot.designpattern.e_final_approach.Dance;
import com.example.kaursarabjot.designpattern.e_final_approach.FolkDance;
import com.example.kaursarabjot.designpattern.e_final_approach.Human;
import com.example.kaursarabjot.designpattern.e_final_approach.Jyoti;
import com.example.kaursarabjot.designpattern.e_final_approach.NCC;
import com.example.kaursarabjot.designpattern.e_final_approach.NCCsec;
import com.example.kaursarabjot.designpattern.e_final_approach.NoNcc;
import com.example.kaursarabjot.designpattern.e_final_approach.Sarab;
import com.example.kaursarabjot.designpattern.e_final_approach.Shavi;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human sarab = new Sarab();
        sarab.setNccBehaviour(new NCC());
        sarab.callNccMethod();

        Human jyoti = new Jyoti();
        jyoti.setNccBehaviour(new NoNcc());
        jyoti.callNccMethod();
        jyoti.setDanceBehaviour(new Dance());
        jyoti.callDanceMethod();

        Human shavi = new Shavi();
        shavi.setDanceBehaviour(new FolkDance());
        shavi.callDanceMethod();

        ArrayList<Human> list = new ArrayList<>();
        list.add(jyoti);
        list.add(sarab);
    }
}
