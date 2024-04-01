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
package EX1;
import java.util.*;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class TesteAlunos
*/
public class TesteAlunos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas do primeiro aluno:");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        Aluno aluno1 = new Aluno(n1, n2, n3, n4);

        System.out.println("Digite as notas do segundo aluno:");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        n4 = scanner.nextDouble();
        Aluno aluno2 = new Aluno(n1, n2, n3, n4);

        System.out.println("Digite as notas do terceiro aluno:");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        n3 = scanner.nextDouble();
        n4 = scanner.nextDouble();
        Aluno aluno3 = new Aluno(n1, n2, n3, n4);

        double mediaGeral = (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia()) / 3;
        System.out.println("Média geral dos alunos: " + mediaGeral);

    }
}
