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
import java.util.ArrayList;
import java.util.List;

/**
*@author Rayssa Alves <rayssaalves.go@gmail.com> & Cristian Vilela <cvilela306@gmail.com>
*@data 01/04/2024
*@brief class Estoque
*/

public class Estoque {
    
private String nome;
    private List<Album> albuns;
    private List<Filme> filmes;

    public Estoque(String nome) {
        this.nome = nome;
        this.albuns = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public void gerenciarFilme(Filme filme, String nome, String diretor, double preco, int numeroCopias) {
        filme = new Filme(nome, preco, numeroCopias, diretor);
        filmes.add(filme);
    }

    public void gerenciarAlbum(Album album, String nome, String artista, double preco, int numeroCopias) {
        album = new Album(nome, preco, numeroCopias, artista);
        albuns.add(album);
    }

    public void venderFilme(String nome, int quantidade) {
    for (Filme filme : filmes) {
        if (filme.getNome().equals(nome)) {
            filme.copiasVendidas(quantidade);
            return;
        }
    }
    System.out.println("Filme não encontrado no estoque.");
}

    public void venderAlbum(String nome, int quantidade) {
        for (Album album : albuns) {
            if (album.getNome().equals(nome)) {
            album.copiasVendidas(quantidade);
                return;
            }
        }
        System.out.println("Álbum não encontrado no estoque.");
    }
}


