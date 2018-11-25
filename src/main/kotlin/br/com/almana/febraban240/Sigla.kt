package br.com.almana.febraban240

enum class Sigla(val tipo: String, val descricao: String) {
    G("Genérico", "Genérico"),
    A("Específico", "Alegação do Pagador"),
    B("Específico", "Boleto de Pagamento Eletrônico"),
    C("Específico", "Títulos em Cobrança"),
    D("Específico", "Débito em Conta Corrente"),
    E("Específico", "Extrato de Conta Corrente para Conciliação Bancária"),
    F("Específico", "Extrato para Gestão de Caixa"),
    H("Específico", "Empréstimo por Consignação"),
    I("Específico", "Compror"),
    L("Específico", "Pagamento de Títulos de Cobrança"),
    N("Específico", "Pagamento de Tributos, Impostos e Contas sem Código de Barras"),
    P("Específico", "Pagamento de através de Crédito em Conta, Cheque, OP, DOC ou Pagamento com Autenticação"),
    V("Específico", "Vendor"),
    K("Específico", "Custódia de Cheques"),
    Z("Específico", "Autenticação do Pagamento")
}