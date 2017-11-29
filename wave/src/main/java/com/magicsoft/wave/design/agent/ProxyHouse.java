package com.magicsoft.wave.design.agent;

import android.util.Log;

public class ProxyHouse implements IHouse{//房屋代理

    private final String TAG = ProxyHouse.class.getSimpleName();  
    private IHouse house;  
    public ProxyHouse(IHouse house){  
        this.house = house;  
    }  
    @Override  
    public void getHouseInfo() {  
        Log.i(TAG, "searching");
        house.getHouseInfo();  
        Log.i(TAG, "search finished");  
    }  
  
    @Override  
    public void signContract() {  
        Log.i(TAG, "prepare contract");  
        house.signContract();  
    }  
  
    @Override  
    public void payFees() {  
        house.payFees();  
    }  
}  