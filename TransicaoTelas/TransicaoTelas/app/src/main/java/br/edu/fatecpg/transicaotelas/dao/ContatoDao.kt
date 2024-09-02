package br.edu.fatecpg.transicaotelas.dao

import br.edu.fatecpg.transicaotelas.model.Contato

class ContatoDao {
    companion object {
        private var contato: Contato? = null
    }

    fun cadastroContato(contato: Contato){
        Companion.contato = contato
    }

    fun exibirContato():Contato{
        return Companion.contato?:Contato()
    }
}