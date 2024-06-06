package project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JColorChooser;

public class FormatMenu {
    
    public static void bold(){
        Font curreFont = Frame.textArea.getFont();
        Font boldfont = curreFont.deriveFont(Font.BOLD);
        Frame.textArea.setFont(boldfont); 
    }
    public static void italic(){
        Font curreFont = Frame.textArea.getFont();
        Font italicfont = curreFont.deriveFont(Font.ITALIC);
        Frame.textArea.setFont(italicfont); 
    }
    public static void fontColor(){
        Color selectedColor = JColorChooser.showDialog(null,"select Font Color", Color.BLACK);


        if (selectedColor != null){
            Frame.textArea.setForeground(selectedColor);
        }
    
    }
}
