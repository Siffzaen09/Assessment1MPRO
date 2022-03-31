package org.d3if4081.ass1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import org.d3if4081.ass1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonhitungjg.setOnClickListener { hitungJg() }
        binding.buttonreset.setOnClickListener { reset() }

    }

    private fun hitungJg() {

          val alas = binding.alasEditText.text.toString()
          if (TextUtils.isEmpty(alas)) {
              Toast.makeText(this, R.string.alas_invalid, Toast.LENGTH_LONG).show()
              return
          }
          val tinggi = binding.tinggiEditText.text.toString()
          if (TextUtils.isEmpty(tinggi)) {
              Toast.makeText(this, R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
              return
          }
          val Alas = alas.toFloat()
          val Tinggi = tinggi.toFloat()
          val luas = Alas * Tinggi
          binding.luasTextView.text = getString(R.string.luas_x, luas)
      }

    private fun reset(){
        binding.alasEditText.setText("")
        binding.tinggiEditText.setText("")
        binding.luasTextView.setText("")
    }
}