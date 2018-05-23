package com.example.ayushgupta.ktmy5

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Home:Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view:View = inflater!!.inflate(R.layout.home,container,false)
        val btn1: Button = view.findViewById(R.id.btn1)
        btn1.setOnClickListener{
            val fragment = fragmentManager.beginTransaction()
            fragment.remove(Fragment())
            fragment.replace(R.id.frag,WebApp())
            
            fragment.commit()
        }
        return view
    }
}