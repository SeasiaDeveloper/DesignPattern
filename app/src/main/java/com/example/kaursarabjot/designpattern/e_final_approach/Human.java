package com.example.kaursarabjot.designpattern.e_final_approach;

import android.util.Log;

/**
 * Created by KaurSarabjot on 1/8/2019.
 */

public class Human {

    private NCCBehaviour nccBehaviour;
    private DanceBehaviour danceBehaviour;

    public void walk() {
        Log.d("HumanWalk","Walk");
    }
    public void talk() {
        Log.d("HumanTalk","Talk");
    }
    public void run() {
        Log.d("HumanRun","Run");
    }

    public void setNccBehaviour(NCCBehaviour nccBehaviour)
    {
        this.nccBehaviour=nccBehaviour;
    }

    public void callNccMethod()
    {
        nccBehaviour.NCCBeh();
    }

    public void setDanceBehaviour(DanceBehaviour danceBehaviour)
    {
        this.danceBehaviour=danceBehaviour;
    }

    public void callDanceMethod()
    {
        danceBehaviour.dance();
    }

}
