class Desenvolvedor(
    nome: String,
    cpf: String,
    salario: Double
):Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao : Double get() = this.salario * 0.05

}