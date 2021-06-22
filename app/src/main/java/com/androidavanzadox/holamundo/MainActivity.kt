package com.androidavanzadox.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LOGCICLO", "metodo onCreate")

        //asignar evento de manera dinamica
        val btn1: Button = findViewById(R.id.button_numero_uno)
        btn1.setOnClickListener{view -> Toast.makeText(this,"se ha dado click en el boton 1",Toast.LENGTH_SHORT).show()}

        val tv2: TextView = findViewById(R.id.textoview_dos)
        tv2.setOnClickListener(this)

    }

    override fun onStart() {
        super.onStart()
        Log.i("LOGCICLO", "metodo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LOGCICLO", "metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LOGCICLO", "metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LOGCICLO", "metodo onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LOGCICLO", "metodo onDestroy")
    }

    fun clickOnHobby(view: View) {

        val checkBox: CheckBox =view as CheckBox
        val checked: Boolean = checkBox.isChecked

        when(view.id){
            R.id.checkBoxDeportes ->{
                if(checked){
                    Log.i("CHECKBOX", "CHECKED deporte")
                    Toast.makeText(this,"se ha hecho click en deporte",Toast.LENGTH_LONG).show()
                }else{
                    Log.i("CHECKBOX", "UNCHECKED deporte")
                    Toast.makeText(this,"se ha hecho DESMARCADO en deporte",Toast.LENGTH_LONG).show()
                }

            }
            R.id.checkboxVideoJuegos ->{
                if(checked){
                    Log.i("CHECKBOX", "CHECKED video juegos")
                    Toast.makeText(this,"se ha hecho click en video juegos",Toast.LENGTH_LONG).show()
                }else{
                    Log.i("CHECKBOX", "UNCHECKED video juegos")
                    Toast.makeText(this,"se ha DESMARCADO click en video juegos",Toast.LENGTH_LONG).show()
                }

            }

        }

    }

    fun sexoSeleccionado(view: View) {
        val radioseleccionado = view as RadioButton
        when(view.id){
            R.id.radioButtonMujer ->{
                Toast.makeText(this,"Mujer",Toast.LENGTH_SHORT).show()
            }
            R.id.radioButtonHombre ->{
                Toast.makeText(this,"Hombre",Toast.LENGTH_SHORT).show()

            }
            R.id.radioButtonIndefinido->{
                Toast.makeText(this,"Indefinido",Toast.LENGTH_SHORT).show()

            }
        }

    }

    override fun onClick(v: View?) {
        Toast.makeText(this,"se ha dado click en el texto 2",Toast.LENGTH_SHORT).show()
    }
}