package com.example.sasik.edge.database;



public class AppUser {

    private int _id;
    private String _username;
    private String _userprofile;
    private String _userID;
    private String _deviceID;

    public AppUser(){}

    public AppUser(int _id, String _username, String _userprofile, String _userID, String _deviceID) {
        this._id = _id;
        this._username = _username;
        this._userprofile = _userprofile;
        this._userID = _userID;
        this._deviceID = _deviceID;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_userprofile() {
        return _userprofile;
    }

    public void set_userprofile(String _userprofile) {
        this._userprofile = _userprofile;
    }

    public String get_userID() {
        return _userID;
    }

    public void set_userID(String _userID) {
        this._userID = _userID;
    }

    public String get_deviceID() {
        return _deviceID;
    }

    public void set_deviceID(String _deviceID) {
        this._deviceID = _deviceID;
    }
}
