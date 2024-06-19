package Loja;

import EquipamentoIphone.EquipamentoIphone;
import Equipamento.Internet.NavegadorSafari;
import Equipamento.MusicPlayer.Reproduzir;
import Equipamento.Telefone.Iphone;

public class App {
    public static void main(String[] args) {
        EquipamentoIphone iphone = new EquipamentoIphone();
        Reproduzir musica = (Reproduzir) iphone;
        Iphone telefone = (Iphone) iphone;
        NavegadorSafari internet = (NavegadorSafari) iphone;

        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();

        System.out.println("Telefone");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.adicionandoNovaPagina();
        
    }
}
