package com.example.qrscanner

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatCallback
import androidx.core.content.ContextCompat
import io.realm.OrderedRealmCollectionChangeListener
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import io.realm.kotlin.where
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.FutureTask


class Verification : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        val code = findViewById<TextView>(R.id.textView)
        code.setText(codee)
        val verify = findViewById<TextView>(R.id.textView2)
        val verified ="true"

        if(verified == "true"){
            verify.setTextColor(Color.parseColor("#50C878"));
            verify.setText("VERIFIED")
        }else{
            verify.setTextColor(Color.parseColor("#B22222"));
            verify.setText("NOT VERIFIED")
        }
    }
}