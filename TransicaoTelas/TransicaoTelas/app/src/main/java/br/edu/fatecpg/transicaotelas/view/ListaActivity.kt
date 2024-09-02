package br.edu.fatecpg.transicaotelas.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.transicaotelas.R
import br.edu.fatecpg.transicaotelas.dao.ContatoDao
import br.edu.fatecpg.transicaotelas.model.Contato
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    val dao = ContatoDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val txvpeso = findViewById<TextView>(R.id.txv_peso)
        val txvaltura = findViewById<TextView>(R.id.txv_altura)
        val txvimc = findViewById<TextView>(R.id.txv_imc)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)

        val contato: Contato = dao.exibirContato();
        txvpeso.text = contato.peso
        txvaltura.text = contato.altura
        txvimc.text = contato.calculo

        fabVolta.setOnClickListener {
            finish()
        }

    }
}