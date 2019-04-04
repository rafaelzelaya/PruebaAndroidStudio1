package univo.ingenieria.densidadesdeimagen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Boton(view: View){
        val cadenaMultiIdioma:String = getString(R.string.prueba)
        Toast.makeText(this,cadenaMultiIdioma,Toast.LENGTH_LONG).show()
        val tv: TextView = findViewById<TextView>(R.id.textoIdioma)
        tv.text = cadenaMultiIdioma
    }
}
