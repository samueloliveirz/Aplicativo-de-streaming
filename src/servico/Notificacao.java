package servico;

import model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Notificacao {
    private List<String> enviadas = new ArrayList<>();

    public void enviar(Usuario usuario, String mensagem) {
        String texto = "[Notificação para " + usuario.getNome() + "] " + mensagem;
        System.out.println(texto);
        enviadas.add(texto);
    }

    public List<String> getEnviadas() {
        return List.copyOf(enviadas);
    }
}