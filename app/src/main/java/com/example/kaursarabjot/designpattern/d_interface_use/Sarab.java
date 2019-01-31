package com.example.kaursarabjot.designpattern.d_interface_use;

import android.util.Log;

/**
 * Created by KaurSarabjot on 1/8/2019.
 */

public class Sarab extends Human implements NCCBehaviour {

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void NCC() {
        Log.d("HumanNCC","NCC");
    }

}
