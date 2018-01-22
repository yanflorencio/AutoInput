/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;



/**
 *
 * @author notrbook
 */
public class Perfil implements NativeKeyListener{
    private String comandos;
    private Macro macroconfig;
    private String nome;

    public String getComandos() {
        return comandos;
    }
    public void setComandos(String tipo, String rotacao, int x, int y){
        try{
        String linha;       
        String path ="";
        BufferedReader in1 = new BufferedReader(new FileReader("config.txt"));
         while ((linha = in1.readLine()) != null) {  
            if (linha.equals(nome)) {   
                path = in1.readLine();
            }  
        }
         in1.close();
            FileWriter config = new FileWriter(path,true);
            PrintWriter gravarArq = new PrintWriter(config);
            gravarArq.printf("MOUSE%n");
            gravarArq.printf(tipo+"%n");
            gravarArq.printf(rotacao+"%n");
            gravarArq.printf("X:%n");
            gravarArq.printf(x+"%n");
            gravarArq.printf("Y:%n");
            gravarArq.printf(y+"%n%n");
            config.close();
        } catch (Exception e) {   
        }
    }
    public void setComandos(String tipo, String tecla) {
        try{
        String linha;       
        String path ="";
        BufferedReader in1 = new BufferedReader(new FileReader("config.txt"));
         while ((linha = in1.readLine()) != null) {  
            if (linha.equals(nome)) {   
                path = in1.readLine();
            }  
        }
         in1.close();
        FileWriter config = new FileWriter(path,true);
        PrintWriter gravarArq = new PrintWriter(config);
        gravarArq.printf("TECLADO%n");
        gravarArq.printf(tipo+"%n");
        gravarArq.printf(tecla+"%n%n");
            config.close();
        } catch (Exception e) {   
        } 
    }
    
    public void setComandos(String tipo, int botao, int x, int y) {
        try{
        String linha;       
        String path ="";
        BufferedReader in1 = new BufferedReader(new FileReader("config.txt"));
         while ((linha = in1.readLine()) != null) {  
            if (linha.equals(nome)) {   
                path = in1.readLine();
            }  
        }
         in1.close();
            FileWriter config = new FileWriter(path,true);
            PrintWriter gravarArq = new PrintWriter(config);
            gravarArq.printf("MOUSE%n");
            gravarArq.printf(tipo+"%n");
            gravarArq.printf(botao+"%n");
            gravarArq.printf("X:%n");
            gravarArq.printf(x+"%n");
            gravarArq.printf("Y:%n");
            gravarArq.printf(y+"%n%n");
            config.close();
        } catch (Exception e) {   
        } 
    }
    public Macro getMacroconfig() {
        return macroconfig;
    }

    public void setMacroconfig(Macro macroconfig) {
        this.macroconfig = macroconfig;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Clear()throws IOException{
    String linha;       
    String diretorio ="";
    BufferedReader in = new BufferedReader(new FileReader("config.txt"));
    while ((linha = in.readLine()) != null) {  
            if (linha.equals("DIRETORIO:")) {   
                diretorio = in.readLine();
            }  
        }
    in.close();
    String nomearq = diretorio+nome+".txt";
    try {
    FileWriter perfil = new FileWriter(nomearq);
    PrintWriter gravarPerfil = new PrintWriter(perfil);
    gravarPerfil.printf("MACRO:%n");
    gravarPerfil.printf(this.macroconfig.getPararCaptura()+"%n");
    gravarPerfil.printf(this.macroconfig.getPararExecução()+"%n");
    gravarPerfil.printf(this.macroconfig.getIntervalo().getHora()+"%n");
    gravarPerfil.printf(this.macroconfig.getIntervalo().getMinuto()+"%n");
    gravarPerfil.printf(this.macroconfig.getIntervalo().getSegundo()+"%n");
    gravarPerfil.printf(this.macroconfig.isPararAutomaticamente()+"%n");
    gravarPerfil.printf(this.macroconfig.getNumeroRepetições()+"%n");
    gravarPerfil.printf(this.macroconfig.isDesligarAuto()+"%n");
    gravarPerfil.printf("%nCOMANDOS:%n");
    gravarPerfil.close();
    } catch (IOException e) {
    }
    }
    
    public void executarComandos (TelaInicial tela) throws IOException{
        String linha;       
        String diretorio ="";
        BufferedReader in = new BufferedReader(new FileReader("config.txt"));
        while ((linha = in.readLine()) != null) {  
            if (linha.equals(this.nome)) {   
                diretorio = in.readLine();
            }  
        }
        in.close();
        try {  
        int contador,i;
        contador = -1;
        i = 0;
        if(this.macroconfig.isPararAutomaticamente()){
             contador = this.macroconfig.getNumeroRepetições();
        }
        while (((contador == -1) || (i<contador)) && (GlobalScreen.isNativeHookRegistered())){
        BufferedReader in2 = new BufferedReader(new FileReader(diretorio));         
        while (((linha = in2.readLine()) != null) && (GlobalScreen.isNativeHookRegistered())) {  
            if (linha.equals("COMANDOS:")) {   
                while (((linha = in2.readLine()) != null) && (GlobalScreen.isNativeHookRegistered())) {
                    if(linha.equals("TECLADO")){
                        Executa bot = new Executa();
                        bot.setTipo(linha);
                        linha = in2.readLine();
                            if (linha.equals("PRESSED")){
                                bot.setValor((linha = in2.readLine()));
                                bot.pressionaTecla();
                            } else if (linha.equals("RELEASED")){
                                bot.setValor((linha = in2.readLine()));
                                bot.soltaTecla();
                            }
                    } else if(linha.equals("MOUSE")){
                        Executa bot = new Executa();
                        bot.setTipo(linha);
                        linha = in2.readLine();
                        if (linha.equals("PRESSED")){
                            bot.setValor((linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setX(Integer.parseInt(linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setY(Integer.parseInt((linha = in2.readLine())));
                            bot.pressionaBotao(this.macroconfig.getIntervalo().getHora(),this.macroconfig.getIntervalo().getMinuto(),this.macroconfig.getIntervalo().getSegundo());
                        } else if (linha.equals("RELEASED")){
                            bot.setValor((linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setX(Integer.parseInt(linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setY(Integer.parseInt((linha = in2.readLine())));
                            bot.soltaBotao();
                        } else if (linha.equals("WHEEL")){
                            bot.setValor((linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setX(Integer.parseInt(linha = in2.readLine()));
                            linha = in2.readLine();
                            bot.setY(Integer.parseInt((linha = in2.readLine())));
                            bot.rodaWheel();
                        }                          
                    }
                }
            }  
        } 
        in2.close();
        i++;
        }
        } catch (IOException e) {
        } 
         try {
                GlobalScreen.unregisterNativeHook();
                GlobalScreen.removeNativeKeyListener(this); 
            } catch (NativeHookException ex) {
            }
         tela.setVisible(true);
    }    
    
    public void deletarPerfil (String nome) throws IOException{
        
    String linha;       
    String path ="";
    BufferedReader in1 = new BufferedReader(new FileReader("config.txt"));
    while ((linha = in1.readLine()) != null) {  
            if (linha.equals(nome)) {   
                path = in1.readLine();
            }  
        }
    
    in1.close();
        String nomearq = path;
        String arqtemp = "temp.txt";
    try {
      BufferedReader in = new BufferedReader(new FileReader("config.txt"));
        FileWriter temp = new FileWriter("temp.txt");
        PrintWriter gravartemp = new PrintWriter(temp);
        while ((linha = in.readLine()) != null) {  
            if (linha.equals(nome)) {   
            }  
            else if (linha.equals(nomearq)){
            }
            else{
                gravartemp.printf(linha+"%n");
            }
        }  
        temp.close();
        in.close();
        BufferedReader out = new BufferedReader(new FileReader(arqtemp));
        FileWriter config = new FileWriter("config.txt");
        PrintWriter gravarconfig = new PrintWriter(config);
        while ((linha = out.readLine()) != null) {
             gravarconfig.printf(linha+"%n");
        }      
        config.close();
        out.close();
        File deletatemp = new File(arqtemp);
        deletatemp.delete();  
      FileReader arq = new FileReader(nomearq);
      arq.close();
      File arquivo = new File(nomearq);
      arquivo.delete();    
        
    } catch (Exception e) {   
    }       
    }
    
    public static void criaPerfil(String nome) throws IOException{
    String linha;       
    String diretorio ="";
    BufferedReader in = new BufferedReader(new FileReader("config.txt"));
    while ((linha = in.readLine()) != null) {  
            if (linha.equals("DIRETORIO:")) {   
                diretorio = in.readLine();
            }  
        }
    in.close();
    String nomearq = diretorio+nome+".txt";
    try {
      FileReader arq = new FileReader(nomearq);
      arq.close();
    } catch (IOException e) {
      FileWriter arq = new FileWriter(nomearq);
      arq.close();
   
    FileWriter config = new FileWriter("config.txt",true);
    PrintWriter gravarArq = new PrintWriter(config);
    gravarArq.printf(nome+"%n");
    gravarArq.printf(nomearq+"%n");
    config.close();
    FileWriter perfil = new FileWriter(nomearq);
    PrintWriter gravarPerfil = new PrintWriter(perfil);
    gravarPerfil.printf("MACRO:%n");
    gravarPerfil.printf("F5%n");
    gravarPerfil.printf("F1%n");
    gravarPerfil.printf("0%n");
    gravarPerfil.printf("0%n");
    gravarPerfil.printf("0%n");
    gravarPerfil.printf("false%n");
    gravarPerfil.printf("0%n");
    gravarPerfil.printf("false%n");
    gravarPerfil.printf("%nCOMANDOS:%n");
    gravarPerfil.close();
    }
    System.out.println();
    }
    
    public void salvarMacro (String arquivo)throws IOException{
        
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
        
        String arqtemp = "temp.txt";
        BufferedReader in2 = new BufferedReader(new FileReader(diretorio));
        FileWriter temp = new FileWriter(arqtemp);
        PrintWriter gravartemp = new PrintWriter(temp);
        while ((linha = in2.readLine()) != null) {  
            if (linha.equals("MACRO:")) {   
                    gravartemp.printf(linha+"%n");
                    gravartemp.printf(this.macroconfig.getPararCaptura()+"%n");
                    gravartemp.printf(this.macroconfig.getPararExecução()+"%n");
                    gravartemp.printf(this.macroconfig.getIntervalo().getHora()+"%n");
                    gravartemp.printf(this.macroconfig.getIntervalo().getMinuto()+"%n");
                    gravartemp.printf(this.macroconfig.getIntervalo().getSegundo()+"%n");
                    gravartemp.printf(this.macroconfig.isPararAutomaticamente()+"%n");
                    gravartemp.printf(this.macroconfig.getNumeroRepetições()+"%n");
                    gravartemp.printf(this.macroconfig.isDesligarAuto()+"%n");
                    for(int i=0;i<8;i++){
                    linha=in2.readLine();}
            }else{
                gravartemp.printf(linha+"%n");
            }
        }  
        temp.close();
        in2.close();
        
        BufferedReader out = new BufferedReader(new FileReader(arqtemp));
        FileWriter config = new FileWriter(diretorio);
        PrintWriter gravarconfig = new PrintWriter(config);
        while ((linha = out.readLine()) != null) {
             gravarconfig.printf(linha+"%n");
        }      
        config.close();
        out.close();
        File deletatemp = new File(arqtemp);
        deletatemp.delete();  
        }
        catch(IOException e){
        }
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
       if (NativeKeyEvent.getKeyText(nke.getKeyCode()).equals(this.getMacroconfig().getPararExecução())) {
            try {
                GlobalScreen.unregisterNativeHook();
                GlobalScreen.removeNativeKeyListener(this); 
            } catch (NativeHookException ex) {
            }
            } 
          
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        
    }
}
