/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoinput;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Léo
 */
public class Executa {
    private String tipo, valor;
    private TelaInicial tela;
    private int x, y;

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

    public TelaInicial getTela() {
        return tela;
    }

    public void setTela(TelaInicial tela) {
        this.tela = tela;
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
    
    public void pressionaTecla(){
        Robot robot = null;
        try {
            robot = new Robot();
            robot.delay(125);
            switch (this.valor) {
                case "Enter":
                    robot.keyPress(KeyEvent.VK_ENTER);
                    break;
                case "Backspace":
                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
                    break;
                case "Guia":
                    robot.keyPress(KeyEvent.VK_TAB);
                    break;
                case "Left Control":
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    break;
                case "Right Control":
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    break;    
                case "Left Alt":
                    robot.keyPress(KeyEvent.VK_ALT);
                    break;
                case "Right Alt":
                    robot.keyPress(KeyEvent.VK_ALT);
                    break;    
                case "Left Shift":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    break;
                case "Right Shift":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    break;    
                case "Caps Lock":
                    robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    break;
                case "Página Acima":
                    robot.keyPress(KeyEvent.VK_PAGE_UP);
                    break;
                case "Página Abaixo":
                    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                    break;
                case "Fim":
                    robot.keyPress(KeyEvent.VK_END);
                    break;
                case "Início":
                    robot.keyPress(KeyEvent.VK_HOME);
                    break;
                case "Insert":
                    robot.keyPress(KeyEvent.VK_INSERT);
                    break;
                case "Excluir":
                    robot.keyPress(KeyEvent.VK_DELETE);
                    break;
                case "Print Screen":
                    robot.keyPress(KeyEvent.VK_PRINTSCREEN);
                    break;
                case "Pausar":
                    robot.keyPress(KeyEvent.VK_PAUSE);
                    break;
                case "Left Meta":
                    robot.keyPress(KeyEvent.VK_WINDOWS);
                    break;
                case "Right Meta":
                    robot.keyPress(KeyEvent.VK_WINDOWS);
                    break;    
                case "Crase":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    break;
                case "":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "27":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "32":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "37":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "39":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "38":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "40":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "48":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "49":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "50":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "51":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "52":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "53":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "54":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "55":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "56":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "57":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "65":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "66":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "67":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "69":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "68":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "70":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "71":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "72":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "73":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "74":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "75":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "76":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "77":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "78":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "79":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "80":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "81":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "82":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "83":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "84":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "85":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "86":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "87":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "88":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "89":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "90":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "93":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "96":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "97":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "98":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "99":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "100":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "101":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "102":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "103":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "104":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "105":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "106":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "107":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "109":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "110":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "111":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "120":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "121":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "122":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "123":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "144":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "145":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;
                case "186":   //era pra ser ç em vez de c
                    robot.keyPress(KeyEvent.VK_C);    
                    break;    
                case "187":
                    robot.keyPress(KeyEvent.VK_EQUALS);    
                    break;
                case "188":
                    robot.keyPress(KeyEvent.VK_COMMA);     
                    break;
                case "189":
                    robot.keyPress(KeyEvent.VK_MINUS);    
                    break;
                case "190":
                    robot.keyPress(KeyEvent.VK_PERIOD);  
                    break;
                case "191":
                    robot.keyPress(KeyEvent.VK_SEMICOLON); 
                    break;
                case "193": //era pra ser barra em vez de divide
                    robot.keyPress(KeyEvent.VK_DIVIDE); 
                    break;
                case "220":
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case "221":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);   
                    break;
                case "222":
                    robot.keyPress(KeyEvent.VK_DEAD_TILDE);    
                    break;
                case "226":
                    robot.keyPress(KeyEvent.VK_BACK_SLASH);    
                    break;
                case "293":
                    robot.keyPress(Integer.parseInt(this.valor));    
                    break;    
                default:
                    break;
            }
        } catch (AWTException ex) {
        }
    }
    
 
    public void soltaTecla(){
        Robot robot = null;
        try {
            robot = new Robot();
            switch (this.valor) {
                case "Enter":
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    break;
                case "Backspace":
                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                    break;
                case "Guia":
                    robot.keyRelease(KeyEvent.VK_TAB);
                    break;
                case "Left Control":
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    break;
                case "Right Control":
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    break;    
                case "Left Alt":
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "Right Alt":
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;    
                case "Left Shift":
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "Right Shift":
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;    
                case "Caps Lock":
                    robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    break;
                case "Página Acima":
                    robot.keyRelease(KeyEvent.VK_PAGE_UP);
                    break;
                case "Página Abaixo":
                    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                    break;
                case "Fim":
                    robot.keyRelease(KeyEvent.VK_END);
                    break;
                case "Início":
                    robot.keyRelease(KeyEvent.VK_HOME);
                    break;
                case "Insert":
                    robot.keyRelease(KeyEvent.VK_INSERT);
                    break;
                case "Excluir":
                    robot.keyRelease(KeyEvent.VK_DELETE);
                    break;
                case "Print Screen":
                    robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
                    break;
                case "Pausar":
                    robot.keyRelease(KeyEvent.VK_PAUSE);
                    break;
                case "Left Meta":
                    robot.keyRelease(KeyEvent.VK_WINDOWS);
                    break;
                case "Right Meta":
                    robot.keyRelease(KeyEvent.VK_WINDOWS);
                    break;    
                case "Crase":
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "27":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "32":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "37":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "39":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "38":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "40":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "48":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "49":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "50":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "51":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "52":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "53":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "54":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "55":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "56":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "57":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "65":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "66":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "67":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "69":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "68":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "70":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "71":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "72":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "73":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "74":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "75":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "76":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "77":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "78":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "79":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "80":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "81":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "82":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "83":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "84":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "85":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "86":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "87":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "88":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "89":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "90":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "93":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "96":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "97":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "98":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "99":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "100":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "101":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "102":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "103":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "104":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "105":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "106":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "107":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "109":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "110":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "111":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "120":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "121":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "122":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "123":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "144":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "145":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;
                case "186":       //era pra ser ç em vez de c
                    robot.keyRelease(KeyEvent.VK_C);    
                    break;    
                case "187":
                    robot.keyRelease(KeyEvent.VK_EQUALS);    
                    break;
                case "188":
                    robot.keyRelease(KeyEvent.VK_COMMA);    
                    break;
                case "189":
                    robot.keyRelease(KeyEvent.VK_MINUS);    
                    break;
                case "190":
                    robot.keyRelease(KeyEvent.VK_PERIOD);    
                    break;
                case "191":
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);    
                    break;
                case "193":         //era pra ser barra em vez de divide
                    robot.keyRelease(KeyEvent.VK_DIVIDE);    
                    break;
                case "220":
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);    
                    break;
                case "221":
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);    
                    break;
                case "222":
                    robot.keyRelease(KeyEvent.VK_DEAD_TILDE);    
                    break;
                case "226":
                    robot.keyRelease(KeyEvent.VK_BACK_SLASH);    
                    break;
                case "293":
                    robot.keyRelease(Integer.parseInt(this.valor));    
                    break;    
                default:
                    break;
            }
        } catch (AWTException ex) {
        }
    }
    
    public void pressionaBotao(int hora,int min, int seg){
        Robot robot = null;
        try {
            robot = new Robot();
            robot.delay(((hora*3600000)+(min*60000)+(seg*1000)));
            robot.mouseMove((this.x), (this.y));            
             switch (this.valor) {
                case "1":
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    break;
                case "2":
                    robot.mousePress(InputEvent.BUTTON3_MASK);
                    break;
                case "3":
                    robot.mousePress(InputEvent.BUTTON2_MASK);
                    break;
                default:
                    break;
            } 
        } catch (AWTException ex) {
        }
        
    }
    
    public void soltaBotao(){
        Robot robot = null;
        try {
            robot = new Robot();
            robot.mouseMove((this.x), (this.y));
            switch (this.valor) {
                case "1":
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    break;
                case "2":
                    robot.mouseRelease(InputEvent.BUTTON3_MASK);
                    break;
                case "3":
                    robot.mouseRelease(InputEvent.BUTTON2_MASK);
                    break;
                default:
                    break;
            }
        } catch (AWTException ex) {
        }
       
    }   
    
    public void rodaWheel(){
        Robot robot = null;
        try {
            robot = new Robot();
            robot.mouseMove((this.x), (this.y));
            switch (this.valor) {
                case "1":
                    robot.mouseWheel(1);
                    break;
                case "-1":
                    robot.mouseWheel(-1);
                    break;
                default:
                    break;
            }
        } catch (AWTException ex) {
        }
    }
}