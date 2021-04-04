package br.com.augustogiacomini.tdd.service;

import br.com.augustogiacomini.tdd.modelo.Desempenho;
import br.com.augustogiacomini.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal vlReajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajustarSalario(vlReajuste);
    }
}
