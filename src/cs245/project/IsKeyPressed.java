/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.project;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class IsKeyPressed {
    private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (IsKeyPressed.class) {
            return wPressed;
        }
    }
    
    public void isF1Pressed()
    {
        
    }

    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (IsKeyPressed.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = true;
                        }
                        break;

                    case KeyEvent.KEY_RELEASED:
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = false;
                        }
                        break;
                    }
                    return false;
                }
            }
        });
    }
}