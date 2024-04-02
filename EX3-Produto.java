/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package EX3;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class Produto
*/

public class Produto { // ABSTRAÇÃO. encapsula os atributos e comportamentos comuns a todos os tipos de produtos
    
    private String nome;
    private double preco;
    private int numeroCopias; // ENCAPSULAMENTO. Há a necessidade de getters e setters
    
    public Produto (String nome, double preco, int numeroCopias){
        this.nome = nome;
        this.preco = preco;
        this.numeroCopias = numeroCopias; 
    }
    
    public void copiasVendidas (int quant){ // POLIMORFISMO. seu comportamento é implementado de forma diferente nas classes Album e Filme
        if (quant > 0 && quant <= numeroCopias) {
            numeroCopias -= quant;
            System.out.println(quant + " cópias de " + nome + " vendidas.");
        } else {
            System.out.println("Quantidade inválida de cópias.");
        }
    }
    
    public void copiasPedidas (int num) { // POLIMORFISMO. seu comportamento é implementado de forma diferente nas classes Album e Filme
     if (num > 0) {
            numeroCopias += num;
            System.out.println("Pedido de " + num + " cópias de " + nome + " realizado com sucesso.");
        } else {
            System.out.println("Quantidade inválida de cópias.");
        }
    }
        public String getNome() {
            return nome;
    }

        public void setNome(String nome) {
            this.nome = nome;
    }

        public double getPreco() {
            return preco;
    }

        public void setPreco(double preco) {
            this.preco = preco;
    }

        public int getNumeroCopias() {
            return numeroCopias;
    }

        public void setNumeroCopias(int numeroCopias) {
            this.numeroCopias = numeroCopias;
    }
}
