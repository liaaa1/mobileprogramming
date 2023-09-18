package com.example.delia1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //deklarasi variable
    private lateinit var inputTinggi: EditText
    private lateinit var inputLebar: EditText
    private lateinit var inputPanjang: EditText
    private lateinit var btn: Button
    private lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inisialisasi variable
        inputTinggi = findViewById(R.id.edt_height)
        inputLebar = findViewById(R.id.edt_width)
        inputPanjang = findViewById(R.id.edt_length)
        btn = findViewById(R.id.btn_result)
        result = findViewById(R.id.result)

        btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_result) {
            var tinggi = inputTinggi.text.toString().trim()
            var lebar = inputLebar.text.toString().trim()
            var panjang = inputPanjang.text.toString().trim()
            var check = false
            //type data nya double
            if (tinggi.isEmpty()) {
                check = true
                inputTinggi.error = "wajib diisi"
            }
            if (lebar.isEmpty()) {
                check = true
                inputLebar.error = "wajib diisi"
            }
            if (panjang.isEmpty()) {
                check = true
                inputPanjang.error = "wajib diisi"
            }
            if (!check) {
                var volume = tinggi.toDouble() * lebar.toDouble() * panjang.toDouble()
                result.text = volume.toString()
            }
        }

    }
}