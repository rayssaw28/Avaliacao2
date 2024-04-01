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

package EX2;
import java.util.*;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class JogoNumeroSecreto
*/

public class JogoNumeroSecreto {
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        NumeroSecreto numerosecreto = new NumeroSecreto();
        int num;
        
        numerosecreto.Sorteio();
        
        do {
            System.out.println();
         System.out.println("Insira um número entre 0 e 100: ");
         num = scanner.nextInt();
         
         int resultado = numerosecreto.adivinhar(num);
            if (resultado == -1) {
                System.out.println("O número secreto é maior.");
            } else if (resultado == 1) {
                System.out.println("O número secreto é menor.");
            } else if (resultado == 0) {
                System.out.println("Parabéns! Você acertou o número secreto.");
            } else {
                System.out.println("Por favor, aguarde o sorteio do número secreto.");
            }
        } while (num != numerosecreto.adivinhar(num));
    }
}
