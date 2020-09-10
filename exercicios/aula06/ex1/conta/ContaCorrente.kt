package exercicios.aula06.ex1.conta

import exercicios.aula06.ex1.documento.Cheque
import exercicios.aula06.ex1.cliente.Cliente

class ContaCorrente(cliente: Cliente, var chequeEspecial: Double) : Conta(cliente) {

    init {
        println("Conta Corrente com Cheque Especial de ${chequeEspecial}")
    }

    fun depositar(cheque: Cheque) {
        print("Depositando cheque do banco ${cheque.bancoEmissor}. ")
        depositar(cheque.valor)
    }

    override fun sacar(valor: Double) {
        if (saldo + chequeEspecial < valor) {
            print("Saldo insuficiente! ")
            consultar()
            return
        }
        saldo -= valor
        print("Saque de $valor efetuado! ")
        if (saldo < 0) print("Cheque especial utilizado! ")
        consultar()
    }

    override fun consultar() {
        println("Saldo atual: $saldo / Disponível pra saque: ${saldo + chequeEspecial}")
    }

}