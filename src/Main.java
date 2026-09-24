import model.conteudo.*;
import model.interacao.Avaliacao;
import model.interacao.Comentario;
import model.interacao.Historico;
import model.interacao.Playlist;
import model.usuario.*;
import pagamento.Assinatura;
import pagamento.Pagamento;
import servico.Recomendacao;

public class Main {

public static void main(String[] args) throws Exception {
        System.out.println("Iniciando aplicativo de streaming de áudio");

        // Criando usuários
        UsuarioGratuito usuarioGratuito = new UsuarioGratuito(1, "Samuel", "Samuel@email.com", true);
        UsuarioPremium usuarioPremium = new UsuarioPremium(2, "perola", "perola@email.com", 11.90);
        UsuarioFamilia usuarioFamilia = new UsuarioFamilia(3, "Família brito", "brito@email.com", 4);

        // Criando artistas, narradores e apresentadores
        Artista artista = new Artista(4, "Slipknot", "Slipknot@email.com", "Rock");
        Narrador narrador = new Narrador(5, "bruno formiga", "formiga@email.com", "Empolgante");
        Apresentador apresentador = new Apresentador(6, "clay", "clay@email.com", "De Frente com Gadu");

        // Exibindo informações dos usuários
        System.out.println("\n--- Informações dos Usuários ---");
        usuarioGratuito.exibirInfo();
        usuarioPremium.exibirInfo();
        usuarioFamilia.exibirInfo();
        artista.exibirInfo();
        narrador.exibirInfo();
        apresentador.exibirInfo();

        // Criando álbuns
        Album album1 = new Album("CHROMAKOPIA",2024);
        Album album2 = new Album("Lançamentos", 2025);

        // Criando conteúdos
        Musica musica = new Musica(1, "Noid", 3, artista, album1);
        Podcast podcast = new Podcast(2, "o poder so habito", 58, apresentador, 5);
        Audiobook audiobook = new Audiobook(3, "harry potter", 260, narrador, 8);

        // Adicionando músicas ao álbum2
        System.out.println("\n--- Adicionando Músicas ---");
        album2.addMusica("Feeling Good");
        album2.addMusica("River");

        // Manipulando conteúdos
        System.out.println("\n--- Manipulação de Conteúdos ---");
        musica.tocar();
        podcast.ouvir();
        audiobook.ouvir();

        // Criando e manipulando playlists
        System.out.println("\n--- Playlists e Histórico ---");
        Playlist playlist = new Playlist(apresentador, 8);
        playlist.reproduzir();

        Historico historico = new Historico("Músicas ouvidas recentemente");
        historico.exibir();

        // Adicionando músicas ao álbum
        album1.addMusica("Lonely day");
        album1.addMusica("It was a good day");

        // Exibindo informações dos álbuns
        System.out.println("\n--- Informações dos Álbuns ---");
        album1.exibirInfo();
        album2.exibirInfo();

        // Processando pagamentos e assinaturas
        System.out.println("\n--- Pagamentos e Assinaturas ---");
        Pagamento pagamento = new Pagamento("Cartão de Crédito", 11.90);
        pagamento.processar();

        Assinatura assinatura = new Assinatura();
        assinatura.setTipo("Premium");
        assinatura.setPreco(11.90);
        assinatura.exibir();

        // Avaliações e comentários
        System.out.println("\n--- Avaliações e Comentários ---");
        Avaliacao avaliacao = new Avaliacao("Fantastica!", 5);
        avaliacao.avaliar();

        Comentario comentario = new Comentario("uma bosta, o host do pod e muito ruim!", usuarioPremium);
        System.out.println("Comentário de " + comentario.getUsuario().getNome() + ": " + comentario.getTexto());

        // Gêneros e recomendações
        Genero genero = new Genero("Forró");
        System.out.println("Gênero criado: " + genero.getNome());
        Recomendacao recomendacao = new Recomendacao("Baseado nos seus gostos musicais");
        recomendacao.sugerir();

        // Demonstração de funcionalidades específicas
        System.out.println("\n--- Funcionalidades Específicas ---");
        usuarioPremium.baixar("Música: River");
        usuarioGratuito.ouvirAnuncio();
        usuarioFamilia.adicionarMembro();
        artista.publicarConteudo();
        narrador.narrar();
        apresentador.apresentar();

        System.out.println("\nAplicativo encerrado com sucesso!");
    }
    }