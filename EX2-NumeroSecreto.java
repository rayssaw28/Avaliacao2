/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves@gmail.com>
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

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com>
*@data 01/04/2024
*@brief class NumeroSecreto
*/

public class NumeroSecreto {
    
    private int numeroAleatorio;
    
    public NumeroSecreto(){
        this.numeroAleatorio = -1;
    }
    
    public void Sorteio () {
        this.numeroAleatorio = (int) Math.round(Math.random() * 100);
    }
    
    public int adivinhar(int num) {
        if (this.numeroAleatorio == -1) {
            return -2;
}
        if (num < this.numeroAleatorio) {
            return -1;
        } else if (num == this.numeroAleatorio) {
            return 0;
        } else {
            return 1;
        }
    }
}
