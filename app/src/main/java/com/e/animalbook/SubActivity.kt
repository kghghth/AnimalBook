package com.e.animalbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        lionbutton.setOnClickListener {
            val fragment = LionFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                               .addToBackStack(null)
                               .commit()

        }

        hippobutton.setOnClickListener {
            val fragment = HippoFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                               .addToBackStack(null)
                               .commit()
        }

        giraffeButton.setOnClickListener {
            val fragment = GiraffeFragment()
            val fragmentManager = this.getSupportFragmentManager()
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                               .addToBackStack(null)
                               .commit()
        }

        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")

    }
}