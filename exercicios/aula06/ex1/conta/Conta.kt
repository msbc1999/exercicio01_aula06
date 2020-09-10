package exercicios.aula06.ex1.conta

import exercicios.aula06.ex1.cliente.Cliente

abstract class Conta(val cliente: Cliente) {

    var saldo: Double = 0.0
        protected set

    init {
        print("Conta criada do tipo ")
    }


    fun depositar(valor: Double) {
        saldo += valor
        print("Depósito de $valor efetuado! ")
        consultar()
    }

    abstract fun sacar(valor: Double)

    open fun consultar() {
        println("Saldo atual: $saldo")
    }
}