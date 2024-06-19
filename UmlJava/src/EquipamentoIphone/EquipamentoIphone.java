package EquipamentoIphone;

import Equipamento.Internet.NavegadorSafari;
import Equipamento.MusicPlayer.Reproduzir;
import Equipamento.Telefone.Iphone;

public class EquipamentoIphone implements NavegadorSafari, Reproduzir, Iphone  {

    public void ligar() {
        System.out.println("ligando via Iphone");
    }

    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Gravando correio de voz via Iphone");
    }

    public void tocar() {
        System.out.println("Tocando musica pelo Ipod");
    }

    public void pausar() {
        System.out.println("Pausando musica pelo Ipod");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo Ipod");
    }

    public void pagina() {
        System.out.println("Visualizando uma pagina pelo safari");
    }

    public void adicionandoNovaPagina() {
        System.out.println("Adicionando uma nova aba pelo safari");
    }

    public void atualizaPagina() {
        System.out.println("Atualizando uma pagina do Safari");
    }

    
}
