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
package EX4;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class Produto

*/

public class Produto {
    
        public int qde_expresso, qde_capuccino, qde_leite_com_cafe, qde_americano, qde_gelado, qde_achocolatado;
        public boolean conta_aberta;
        public double valor_total_vendas, valor_pago_parcialmente, valor_restante;

        public Produto () {
            this.qde_expresso = 0;
            this.qde_capuccino = 0;
            this.qde_leite_com_cafe = 0;
            this.qde_americano = 0;
            this.qde_gelado = 0;
            qde_achocolatado = 0;
            this.conta_aberta = true;
            this.valor_total_vendas = 0;
            this.valor_pago_parcialmente = 0;
            this.valor_restante = 0;
                }
        
        public void addProdutos (int opcao) {
                
            switch (opcao) {
                
                case 1:
                    qde_expresso++;
                    break;
                case 2:
                    qde_capuccino++;
                    break;
                case 3:
                    qde_leite_com_cafe++;
                    break;
                case 4:
                    qde_americano++;
                    break;
                case 5:
                    qde_gelado++;
                    break;
                case 6: 
                    qde_achocolatado++;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            }
        
        public void excluirProdutos (int produtoExcluir) {
            
            switch (produtoExcluir) {
                
            case 1:
                if (qde_expresso > 0) qde_expresso--;
                else System.out.println("Não há café expresso na lista de compras.");
                break;
            case 2:
                if (qde_capuccino > 0) qde_capuccino--;
                else System.out.println("Não há café capuccino na lista de compras.");
                break;
            case 3:
                if (qde_leite_com_cafe > 0) qde_leite_com_cafe--;
                else System.out.println("Não há leite com café na lista de compras.");
                break;
            case 4:
                if (qde_americano > 0) qde_americano--;
                else System.out.println("Não há café americano na lista de compras.");
                break;
            case 5:
                if (qde_gelado > 0) qde_gelado--;
                else System.out.println("Não há café gelado na lista de compras.");
                break;
            case 6:
                if (qde_achocolatado > 0) qde_achocolatado--;
                else System.out.println("Não há achocolatado na lista de compras.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
        
        public void totalizarVendas() {
            
                double valor_expresso = qde_expresso * 0.75;
                double valor_capuccino = qde_capuccino * 1.00;
                double valor_leite_com_cafe = qde_leite_com_cafe * 1.25;
                double valor_americano = qde_americano * 1.00;
                double valor_gelado = qde_gelado * 1.50;
                double valor_achocolatado = qde_achocolatado * 1.3;
                double qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe + qde_americano + qde_gelado + qde_achocolatado;
                double valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe + valor_americano + valor_gelado + valor_achocolatado;
                
                    System.out.println("Qde café expresso: " + qde_expresso + " - valor: " + valor_expresso);
                    System.out.println("Qde café capuccino: " + qde_capuccino + " - valor: " + valor_capuccino);
                    System.out.println("Qde leite com café: " + qde_leite_com_cafe + " - valor: " + valor_leite_com_cafe);
                    System.out.println("Qde café americano: " + qde_americano + " - valor: " + valor_americano);
                    System.out.println("Qde café gelado: " + qde_gelado + " - valor: " + valor_gelado);
                    System.out.println("Qde achocolatado: " + qde_achocolatado + " - valor: " + valor_achocolatado);
                    System.out.println();
                    System.out.println("Qde cafés vendidos: " + qde_cafes_vendidos +
                            " - valor cafés vendidos: " + valor_cafes_vendidos);
                    
                    valor_restante = valor_cafes_vendidos - valor_pago_parcialmente;
                    System.out.println("Valor restante a ser pago: " + valor_restante);
                
        }
        
        public void pagamentoParcial(double valorParcial) {
    if (valorParcial >= 0 && valorParcial <= valor_restante) {
        valor_pago_parcialmente += valorParcial;
        System.out.println("Pagamento parcial de R$" + valorParcial + " efetuado com sucesso!");
        conta_aberta = true;
        valor_restante = valor_total_vendas - valor_pago_parcialmente; // Atualiza o valor restante
    } else {
        System.out.println("Valor de pagamento parcial inválido.");
    }
}
       
               public void pagamentoTotal () {
                   System.out.println("Pagamento total efetuado com sucesso!");
                            conta_aberta = false;
    }
            }

        
  
                
        

