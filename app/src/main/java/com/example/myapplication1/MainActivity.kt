package com.example.myapplication1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var btnWelcome: Button
    lateinit var btnGoodBye: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.edtName)
        btnWelcome = findViewById(R.id.btnWelcome)
        btnGoodBye = findViewById(R.id.btnGoodBye)

        btnWelcome.setOnClickListener {
            sayHello()
        }

        btnGoodBye.setOnClickListener {
            sayGoodBye()
        }
    }

    fun sayHello(){
        Toast.makeText(this, "welcome,${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }

    fun sayGoodBye(){
        Toast.makeText(this,"good bye,${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }
}