class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean{
        return this.senha == senha
    }

}