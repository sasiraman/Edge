package com.example.sasik.edge;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.kinvey.android.Client;

/**
 * Created by sasik on 10/11/2016.
 */

public class KinveyActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    public Client getClient(){
        return ((MainApplication)getApplication()).getClient();
    }
}
