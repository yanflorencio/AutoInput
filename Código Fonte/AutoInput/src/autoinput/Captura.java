/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoinput;

import java.io.IOException;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

/**
 *
 * @author notrbook
 */
public class Captura implements NativeMouseInputListener,NativeKeyListener,NativeMouseWheelListener{ 
    private String tipo, valor, perfil;
    private TelaInicial tela;
    private Executando ex;
    private int x, y;

    public Executando getEx() {
        return ex;
    }

    public void setEx(Executando ex) {
        this.ex = ex;
    }

    public TelaInicial getTela() {
        return tela;
    }

    public void setTela(TelaInicial tela) {
        this.tela = tela;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) {
           
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) {
        this.setTipo("PRESSED");
        Perfil perf = new Perfil();
        perf.setNome(this.getPerfil());
        this.setValor(Integer.toString(nme.getButton()));
        perf.setComandos(this.getTipo(),Integer.parseInt(this.getValor()), nme.getX(), nme.getY());
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) {
        this.setTipo("RELEASED");
        Perfil perf = new Perfil();
        perf.setNome(this.getPerfil());
        this.setValor(Integer.toString(nme.getButton()));
        perf.setComandos(this.getTipo(),Integer.parseInt(this.getValor()), nme.getX(), nme.getY());  
    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent nme) {
        
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent nme) {
        
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        Perfil perf = new Perfil();
        perf.setNome(this.getPerfil());
        Macro macro = new Macro();
        try {
            macro.visualizarMacro(perf.getNome());
        } catch (IOException ex) {
        }
        perf.setMacroconfig(macro);
        if (NativeKeyEvent.getKeyText(nke.getKeyCode()).equals(perf.getMacroconfig().getPararCaptura())) {
            try {
                GlobalScreen.unregisterNativeHook();
                GlobalScreen.removeNativeMouseListener(this);
                GlobalScreen.removeNativeMouseWheelListener(this);
                GlobalScreen.removeNativeKeyListener(this); 
                tela.setVisible(true);
                ex.setVisible(false);
            } catch (NativeHookException ex) {
            }
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Enter")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Guia")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Backspace")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Control")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Alt")){    
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Shift")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Caps Lock")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Página Acima")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Página Abaixo")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Fim")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Início")){    
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Insert")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Excluir")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Print Screen")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Pausar")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Meta")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Crase")){
            this.setTipo("PRESSED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        } else {
            this.setTipo("PRESSED");
            this.setValor(String.valueOf(nke.getRawCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        Perfil perf = new Perfil();
        perf.setNome(this.getPerfil());
        Macro macro = new Macro();
        try {
            macro.visualizarMacro(perf.getNome());
        } catch (IOException ex) {
        }
        perf.setMacroconfig(macro);
        if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Enter")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Guia")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Backspace")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Control")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Alt")){    
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Shift")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Caps Lock")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Página Acima")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        } else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Página Abaixo")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Fim")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Início")){    
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Insert")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Excluir")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Print Screen")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).equals("Pausar")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());  
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Meta")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor()); 
        }  else if(NativeKeyEvent.getKeyText(nke.getKeyCode()).contains("Crase")){
            this.setTipo("RELEASED");
            this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            perf.setComandos(this.getTipo(), this.getValor());     
        } else {  
            this.setTipo("RELEASED");
            //this.setValor(NativeKeyEvent.getKeyText(nke.getKeyCode()));
            this.setValor(String.valueOf(nke.getRawCode()));
            perf.setComandos(this.getTipo(), this.getValor());    
        }
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
            
    }

    @Override
    public void nativeMouseWheelMoved(NativeMouseWheelEvent nmwe) {
       this.setTipo("WHEEL");
        Perfil perf = new Perfil();
        perf.setNome(this.getPerfil());
        this.setValor(Integer.toString(nmwe.getWheelRotation()));
        this.setX(nmwe.getX());
        this.setY(nmwe.getY());
        System.out.println(valor);
        perf.setComandos(this.getTipo(),this.getValor(),nmwe.getX(),nmwe.getY());
    }

}    
