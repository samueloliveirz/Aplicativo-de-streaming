import model.conteudo.*;
import model.interacao.Avaliacao;
import model.interacao.Comentario;
import model.interacao.Historico;
import model.interacao.Playlist;
import model.usuario.*;
import pagamento.Assinatura;
import pagamento.HistoricoTransacoes;
import pagamento.Pagamento;
import pagamento.metodo.Boleto;
import pagamento.metodo.Cartao;
import pagamento.metodo.Pix;
import servico.Recomendacao;

public class Main {

        public static void main(String[] args) {
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
                Album album1 = new Album("CHROMAKOPIA", 2024);
                Album album2 = new Album("Lançamentos", 2025);

                // Composição: as músicas são criadas pelo próprio álbum
                Musica musica = album1.addMusica(1, "Noid", 204, artista);
                album1.addMusica(4, "Lonely day", 168, artista);
                album1.addMusica(5, "It was a good day", 260, artista);
                album2.addMusica(6, "Feeling Good", 172, artista);
                album2.addMusica(7, "River", 240, artista);

                // Outros conteúdos
                Podcast podcast = new Podcast(2, "o poder so habito", 3480, apresentador, 5);
                Audiobook audiobook = new Audiobook(3, "harry potter", 15600, narrador, 8);
                VideoMusical videoMusical = new VideoMusical(8, "Duality", 254, artista, "1080p");

                // Polimorfismo: cada conteúdo reproduz do seu jeito
                System.out.println("\n--- Manipulação de Conteúdos ---");
                Conteudo[] conteudos = { musica, podcast, audiobook, videoMusical };
                for (Conteudo c : conteudos) {
                        c.reproduzir();
                }

                // Agregação: a playlist recebe conteúdos que já existem
                System.out.println("\n--- Playlists e Histórico ---");
                Playlist playlist = new Playlist("Minhas favoritas", usuarioPremium);
                playlist.addConteudo(musica);
                playlist.addConteudo(podcast);
                playlist.addConteudo(audiobook);
                playlist.addConteudo(videoMusical);
                playlist.reproduzir();

                Historico historico = new Historico("Músicas ouvidas recentemente");
                historico.exibir();

                // Exibindo informações dos álbuns
                System.out.println("\n--- Informações dos Álbuns ---");
                album1.exibirInfo();
                album2.exibirInfo();

                // Processando pagamentos e assinaturas
                System.out.println("\n--- Pagamentos e Assinaturas ---");
                HistoricoTransacoes historicoTransacoes = new HistoricoTransacoes();
                historicoTransacoes.registrar(new Pagamento(new Cartao("perola", "1234"), 11.90));
                historicoTransacoes.registrar(new Pagamento(new Pix("perola@email.com"), 11.90));
                historicoTransacoes.registrar(new Pagamento(new Boleto("34191.79001 01043.510047"), 29.90));
                historicoTransacoes.exibir();

                // Avaliações e comentários
                System.out.println("\n--- Avaliações e Comentários ---");
                Avaliacao avaliacao = new Avaliacao("Fantastica!", 5);
                avaliacao.avaliar();

                Comentario comentario = new Comentario("Ótimo episódio, recomendo!", usuarioPremium);
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