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
import java.util.*;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class Teste

*/

public class Teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;
        
        do {
            
            System.out.println();
            System.out.println("Forneça uma opção: \n" +
                    "1 - café expresso; \n" +
                    "2 - café capuccino; \n" +
                    "3 - leite com café; \n" +
                    "4 - café americano; \n" +
                    "5 - café gelado; \n" +
                    "6 - achocolatado \n" +
                    "7 - excluir produto da lista; \n" +
                    "8 - totalizar vendas;");

            opcao = sc.nextInt();
    
          switch (opcao) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            produto.addProdutos(opcao);
            break;
            case 7:
                System.out.println();
                System.out.println("Qual produto deseja excluir? \n" +
                 "1 - café expresso; \n" +
                 "2 - café capuccino; \n" +
                 "3 - leite com café; \n" +
                 "4 - café americano; \n" +
                 "5 - café gelado; \n" +
                 "6 - achocolatado. ");
                int produtoExcluir = sc.nextInt();
                produto.excluirProdutos(produtoExcluir);
                break; 
            case 8: 
                produto.totalizarVendas();
            System.out.println("Deseja pagar parcialmente (8) ou totalmente (9)?");
            int opcaoPagamento = sc.nextInt();
            switch (opcaoPagamento) {
            case 8:
                System.out.println("Informe o valor do pagamento parcial: ");
                double valorParcial = sc.nextDouble();
                produto.pagamentoParcial(valorParcial);
                break;
            case 9:
                produto.pagamentoTotal();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        break; 
    default:
        System.out.println("Opção inválida.");
        break; 
}

        } while (opcao != 8 || produto.conta_aberta);
    }
}
