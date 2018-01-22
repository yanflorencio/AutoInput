/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author notrbook
 */
public class Macro {
    private Timer intervalo;
    private String pararExecução, pararCaptura;
    private boolean pararAutomaticamente, desligarAuto;
    private int numeroRepetições;

    public boolean isDesligarAuto() {
        return desligarAuto;
    }

    public void setDesligarAuto(boolean desligarAuto) {
        this.desligarAuto = desligarAuto;
    }
    
    public Timer getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Timer intervalo) {
        this.intervalo = intervalo;
    }

    public String getPararExecução() {
        return pararExecução;
    }

    public void setPararExecução(String pararExecução) {
        this.pararExecução = pararExecução;
    }

    public String getPararCaptura() {
        return pararCaptura;
    }

    public void setPararCaptura(String pararCaptura) {
        this.pararCaptura = pararCaptura;
    }

    public boolean isPararAutomaticamente() {
        return pararAutomaticamente;
    }

    public void setPararAutomaticamente(boolean pararAutomaticamente) {
        this.pararAutomaticamente = pararAutomaticamente;
    }

    public int getNumeroRepetições() {
        return numeroRepetições;
    }

    public void setNumeroRepetições(int numeroRepetições) {
        this.numeroRepetições = numeroRepetições;
    }
    
    public void visualizarMacro (String arquivo)throws IOException{
        try{
        String linha;       
        String diretorio ="";
        BufferedReader in = new BufferedReader(new FileReader("config.txt"));
        while ((linha = in.readLine()) != null) {  
            if (linha.equals(arquivo)) {   
                diretorio = in.readLine();
            }  
        }
        in.close();
        BufferedReader in2 = new BufferedReader(new FileReader(diretorio));
        while ((linha = in2.readLine()) != null) {  
            if (linha.equals("MACRO:")) {   
                    this.setPararCaptura(linha=in2.readLine());
                    this.setPararExecução(in2.readLine());
                    Timer tempo = new Timer();
                    tempo.setHora(Integer.parseInt(linha=in2.readLine()));
                    tempo.setMinuto(Integer.parseInt(linha=in2.readLine()));
                    tempo.setSegundo(Integer.parseInt(linha=in2.readLine()));
                    this.setIntervalo(tempo);
                    this.setPararAutomaticamente(Boolean.parseBoolean(linha=in2.readLine()));
                    this.setNumeroRepetições(Integer.parseInt(linha=in2.readLine()));
                    this.setDesligarAuto(Boolean.parseBoolean(linha=in2.readLine()));
            }
        }  
        in2.close();
    }catch(IOException e){
        }
    }
}