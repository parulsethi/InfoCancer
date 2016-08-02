package com.infocancer;

/**
 * Created by CIC on 8/2/2016.
 */
public class Reminder_info {

    String _med,_dos,_tim;

    public Reminder_info(String med,String dos,String tim){
        this._med = med;
        this._dos = dos;
        this._tim = tim;
    }

    public String getmed(){return this._med; }
    public void setmed(String val0){this._med = val0; }

    public String getdos(){return this._dos; }
    public void setdos(String val1){this._dos = val1; }

    public String gettim(){return this._tim; }
    public void settim(String val2){this._tim = val2; }
}
