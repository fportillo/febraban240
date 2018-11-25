package br.com.almana.febraban240

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class SiglaTest {

    @Test
    fun testTipo() {

        fun msgErro(who: Sigla, what: String): String {
            return "O tipo da Sigla ${who} deveria ser ${what}"
        }

        Sigla.values().forEach {
            val tipoEsperado: String = if (it == Sigla.G) {
                "Genérico"
            } else {
                "Específico"
            }
            assertThat(msgErro(it, tipoEsperado), it.tipo, `is`(tipoEsperado))
        }
    }

    @Test
    fun testDescricao() {

        assertThat(Sigla.G.descricao, `is`("Genérico"))
        assertThat(Sigla.A.descricao, `is`("Alegação do Pagador"))
        assertThat(Sigla.B.descricao, `is`("Boleto de Pagamento Eletrônico"))
        assertThat(Sigla.C.descricao, `is`("Títulos em Cobrança"))
        assertThat(Sigla.D.descricao, `is`("Débito em Conta Corrente"))
        assertThat(Sigla.E.descricao, `is`("Extrato de Conta Corrente para Conciliação Bancária"))
        assertThat(Sigla.F.descricao, `is`("Extrato para Gestão de Caixa"))
        assertThat(Sigla.H.descricao, `is`("Empréstimo por Consignação"))
        assertThat(Sigla.I.descricao, `is`("Compror"))
        assertThat(Sigla.L.descricao, `is`("Pagamento de Títulos de Cobrança"))
        assertThat(Sigla.N.descricao, `is`("Pagamento de Tributos, Impostos e Contas sem Código de Barras"))
        assertThat(Sigla.P.descricao, `is`("Pagamento de através de Crédito em Conta, Cheque, OP, DOC ou Pagamento com Autenticação"))
        assertThat(Sigla.V.descricao, `is`("Vendor"))
        assertThat(Sigla.K.descricao, `is`("Custódia de Cheques"))
        assertThat(Sigla.Z.descricao, `is`("Autenticação do Pagamento"))
    }

}

