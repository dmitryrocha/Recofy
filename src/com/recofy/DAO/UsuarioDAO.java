package com.recofy.DAO;

import com.recofy.model.Musica;
import com.recofy.model.Playlist;
import com.recofy.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements GenericDAO {
    public void create(Object o ){

    }

    public List<Object> read (Object o) {
        Usuario user = new Usuario();
        user.setId(1);
        user.setNome("Dmitry Rocha");
        user.setEmail("dmitry@email.com");
        user.setSenha("1234");

        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
        Playlist lista1 = new Playlist();
        lista1.setId(1);
        lista1.setTitulo("Clássicos do rock");
        ArrayList<Musica> musicaPl = new ArrayList<Musica>();
        Musica m1 = new Musica();
        m1.setId(1);
        m1.setTitulo("Wasted Years");
        m1.setAlbum("Somewhere in Time");
        m1.setArtista("Iron Maiden");
        m1.setLinkMP3("musicas/IronMaiden");
        m1.setEstilo(1);
        musicaPl.add(m1);
        Musica m2 = new Musica();
        m2.setId(2);
        m2.setTitulo("Rock You Like a Hirricane");
        m2.setAlbum("Scorpions");
        m2.setArtista("Scorpions");
        m2.setLinkMP3("musicas/Scorpions");
        m2.setEstilo(2);
        musicaPl.add(m2);
        lista1.setMusicas(musicaPl);
        playlists.add(lista1);
        user.setPlaylists(playlists);

        ArrayList<Object> resultado = new ArrayList<>();
        resultado.add(user);
        return resultado;

    }

    public void update(Object o ){

    }

    public void delete(Object o ){

    }
}
