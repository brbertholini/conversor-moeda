package com.example.convertor_moeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ConverseActivity : AppCompatActivity() {
    override fun onCreate(bundle : Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.conversor_activity);

        val btnConvert = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnConverter);
        val inputValue = findViewById<EditText>(R.id.inputValue);
        val inputPrice = findViewById<EditText>(R.id.inputPrice);
        val txtResult = findViewById<TextView>(R.id.txtResult);

        btnConvert.setOnClickListener {
            val value = inputValue.text.toString().toFloat();
            val price = inputPrice.text.toString().toFloat();

            val result = value * price;

            txtResult.text = "Resultado: ${result}";
        }

    }
}