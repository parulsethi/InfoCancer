package com.infocancer;


public class Patient_info {

    String _name,_date,_diagnose,_title,_id;
    byte[] _report_image, _prscrbtn_image;

    public Patient_info(){
    }
    // constructor
    public Patient_info(String name, String id,byte[] report_image,String date,String title, String diagnose,byte[] prscrbtn_image){
        this._name = name;
        this._id = id;
        this._report_image = report_image;
        this._date = date;
        this._diagnose = diagnose;
        this._prscrbtn_image = prscrbtn_image;
        this._title = title;
    }

    // getting name
    public String getname(){return this._name; }
    public void setname(String name){this._name = name; }

    // getting pid
    public String getid(){ return this._id; }
    public void setid(String id){this._id = id;}

    public String getdate(){return this._date;}
    public void setdate(String value){this._date = value;}


    public String getdiagnose(){return this._diagnose;}
    public void setdiagnose(String value){this._diagnose = value;}

    public byte[] getRimg(){return this._report_image;}
    public void setRimg(byte[] rep_img){this._report_image = rep_img;}

    public byte[] getPimg(){return this._prscrbtn_image;}
    public void setPimg(byte[] pres_img){this._prscrbtn_image = pres_img;}

    public String gettitle(){ return this._title; }
    public void settitle(String val){this._title = val;}

}

