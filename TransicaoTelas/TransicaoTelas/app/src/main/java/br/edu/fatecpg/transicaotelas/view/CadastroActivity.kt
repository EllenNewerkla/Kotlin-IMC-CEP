package br.edu.fatecpg.transicaotelas.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.transicaotelas.R
import br.edu.fatecpg.transicaotelas.model.Contato
import br.edu.fatecpg.transicaotelas.dao.ContatoDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CadastroActivity : AppCompatActivity() {
    val dao = ContatoDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val edtpeso = findViewById<EditText>(R.id.edt_peso)
        val edtaltura = findViewById<EditText>(R.id.edt_altura)
        val btnSalvar = findViewById<Button>(R.id.btn_salvar)
        val fabLista = findViewById<FloatingActionButton>(R.id.fab_lista)

        btnSalvar.setOnClickListener{
            val peso = edtpeso.text.toString()
            val altura = edtaltura.text.toString()
            val contato = Contato(peso, altura)
            dao.cadastroContato(contato)
            Toast.makeText(this,"Cadastro realizado com susseco", Toast.LENGTH_LONG).show()
            edtpeso.text.clear()
            edtaltura.text.clear()
        }

        fabLista.setOnClickListener{
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }
    }
}