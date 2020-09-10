package exercicios.aula06.ex1.conta

import exercicios.aula06.ex1.cliente.Cliente

class ContaPoupanca(cliente: Cliente) : Conta(cliente) {

    init {
        println("Conta Poupança")
    }

    override fun sacar(valor: Double) {
        if (saldo < valor) {
            print("Saldo insuficiente! ")
            consultar()
            return
        }
        saldo -= valor
        print("Saque de $valor efetuado! ")
        consultar()
    }

    fun recolherJuros() {
        println("Juros recolhidos!") // TODO implementar
    }

}