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

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class Aluno
*/

public class Aluno {
    
    private double n1, n2, n3, n4;

    
    public Aluno(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    
    public double calcularMedia() {
        return (n1 + 2 * n2 + 3 * n3 + 4 * n4) / 10;
    }

    public int compararMedia(Aluno outroAluno) {
        double media1 = this.calcularMedia(); 
        double media2 = outroAluno.calcularMedia(); 
        
 
        if (media1 < media2) {
            return -1;
        } else if (media1 == media2) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int numeroDeAlunos;
    private static double somaDeMedias;

    public static double mediaTotal() {
        return somaDeMedias / numeroDeAlunos;
    }

    private void atualizarSomaEMedia() {
        somaDeMedias += this.calcularMedia();
        numeroDeAlunos++;
    }
}

