package br.edu.fatecpg.transicaotelas.model

data class Contato(
    val peso:String = "",
    val altura:String = "",
) {
    val calculo: String
        get() {
            val pesoDouble = peso.toDoubleOrNull()
            val alturaDouble = altura.toDoubleOrNull()
            return if (pesoDouble != null && alturaDouble != null && alturaDouble > 0) {
                String.format("%.2f", pesoDouble / (alturaDouble * alturaDouble))
            } else {
                "Dados inválidos"
            }
        }
}