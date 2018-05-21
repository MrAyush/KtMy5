package com.example.ayushgupta.ktmy5

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThisApp:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var view:View = inflater!!.inflate(R.layout.thisapp,container,false)
        return view;
    }
}