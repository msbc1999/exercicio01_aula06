package exercicios.aula06.ex1

import exercicios.aula06.ex1.cliente.Cliente
import exercicios.aula06.ex1.conta.ContaCorrente
import exercicios.aula06.ex1.conta.ContaPoupanca


fun main() {
    println("    # Testando contas")
    testarDepositarSacarCorrente()
    testarDepositarSacarPoupanca()
    testarSacarChequeEspecialCorrente()
    testarInsuficienteCorrente()
    testarInsuficientePoupanca()
    testarRecolherJurosPoupanca()
}

fun criarClienteDeTeste(): Cliente {
    return Cliente(1, "Cliente", "", "")
}

fun testarDepositarSacarCorrente() {
    println()
    println(" # Testando Depósito e Saque - Conta Corrente")
    val cli = criarClienteDeTeste()
    val acc = ContaCorrente(cli, 50.0)
    acc.consultar()
    acc.depositar(25.0)
    acc.sacar(10.0)
}

fun testarDepositarSacarPoupanca() {
    println()
    println(" # Testando Depósito e Saque - Conta Poupança")
    val cli = criarClienteDeTeste()
    val acc = ContaPoupanca(cli)
    acc.consultar()
    acc.depositar(100.0)
    acc.sacar(80.0)
}

fun testarSacarChequeEspecialCorrente() {
    println()
    println(" # Testando Saque com Cheque Especial - Conta Corrente")
    val cli = criarClienteDeTeste()
    val acc = ContaCorrente(cli, 150.0)
    acc.consultar()
    acc.depositar(20.0)
    acc.sacar(50.0)
}

fun testarInsuficienteCorrente() {
    println()
    println(" # Testando Saldo Insuficiente - Conta Corrente")
    val cli = criarClienteDeTeste()
    val acc = ContaCorrente(cli, 80.0)
    acc.consultar()
    acc.depositar(20.0)
    acc.sacar(200.0)
}

fun testarInsuficientePoupanca() {
    println()
    println(" # Testando Saldo Insuficiente - Conta Poupanca")
    val cli = criarClienteDeTeste()
    val acc = ContaPoupanca(cli)
    acc.consultar()
    acc.depositar(60.0)
    acc.sacar(100.0)
}

fun testarRecolherJurosPoupanca() {
    println()
    println(" # Testando Recolhimento de Juros - Conta Poupanca")
    val cli = criarClienteDeTeste()
    val acc = ContaPoupanca(cli)
    acc.consultar()
    acc.depositar(60.0)
    acc.recolherJuros()
}