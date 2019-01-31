package com.example.kaursarabjot.designpattern.d_interface_use;

import android.util.Log;

/**
 * Created by KaurSarabjot on 1/8/2019.
 */

public class Shavi extends Human implements NCCBehaviour{

    @Override
    public void NCC() {
        Log.d("HumanNCC","NCC");
    }

}
