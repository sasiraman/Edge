package com.example.sasik.edge;

import android.app.Application;

import com.kinvey.android.Client;

/**
 * Created by sasik on 10/11/2016.
 */

public class MainApplication extends Application {

    private Client client;

    @Override
    public void onCreate() {
        super.onCreate();
        
        defineClient();
    }

    private void defineClient() {

        client = new Client.Builder("kid_H1IKC4q0","b6d3e8ccb7834d70a5d0afc1400461d8",getApplicationContext()).build();
    }

    public Client getClient(){
        return client;
    }
}
