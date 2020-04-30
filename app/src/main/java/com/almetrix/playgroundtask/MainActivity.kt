package com.almetrix.playgroundtask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.almetrix.playgroundtask.modelView.KickStartViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel:KickStartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel = ViewModelProvider(this).get(KickStartViewModel::class.java)
        mViewModel.getAllInformationList().observe(this, Observer {

        })

    }
}
