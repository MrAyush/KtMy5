package com.example.ayushgupta.ktmy5

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ClickEvent (v: View){
        val fragmentManager:FragmentManager = fragmentManager
        val fragment:FragmentTransaction = fragmentManager.beginTransaction()

        when(v.id){
            R.id.btn1->{
                fragment.replace(R.id.frag,Home())
                fragment.commit()
            }
            R.id.btn2->{
                fragment.add(R.id.frag,WebApp())
                fragment.commit()
            }
            R.id.btn3->{
                fragment.replace(R.id.frag,FileApp())
                fragment.commit()
            }
            R.id.btn4->{
                fragment.add(R.id.frag,WhatsApp())
                fragment.commit()
            }
            R.id.btn5->{
                fragment.replace(R.id.frag,Skype())
                fragment.commit()
            }
            R.id.btn6->{
                fragment.add(R.id.frag,ThisApp())
                fragment.commit()
            }
        }
    }
}
