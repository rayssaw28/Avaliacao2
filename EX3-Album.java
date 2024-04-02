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
*@brief class Album 
*/

public class Album extends Produto { // HERANÇA. herda as caracteristicas da classe Poduto
    
    private String artista; // ENCAPSULAMENTO. Há a necessidade de getters e setters.
    
    public Album(String nome, double preco, int numeroCopias, String artista) {
        super(nome, preco, numeroCopias);
        this.artista = artista;
    }
    
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
