package com.example.ayushgupta.ktmy5

import android.app.Fragment
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
                fragment.remove(Fragment())
                fragment.replace(R.id.frag,Home())
            }
            R.id.btn2->{
                fragment.remove(Fragment())
                fragment.add(R.id.frag,WebApp())
            }
            R.id.btn3->{
                fragment.remove(Fragment())
                fragment.replace(R.id.frag,FileApp())
            }
            R.id.btn4->{
                fragment.remove(Fragment())
                fragment.add(R.id.frag,WhatsApp())
            }
            R.id.btn5->{
                fragment.remove(Fragment())
                fragment.replace(R.id.frag,Skype())
            }
            R.id.btn6->{
                fragment.remove(Fragment())
                fragment.add(R.id.frag,ThisApp())
            }
        }
        fragment.commit()
    }
}
