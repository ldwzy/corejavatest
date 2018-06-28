import java.awt.*;
import javax.swing.*;

import button.ButtonFrame;
import plaf.PlafFrame;
import action.ActionFrame;
import mouse.MouseFrame;

public class test{
    public static void main(String[] args){
        EventQueue.invokeLater(() ->
        {
            //ButtonFrame tf = new ButtonFrame();
            //PlafFrame tf = new PlafFrame();
            //ActionFrame tf = new ActionFrame();
            MouseFrame tf = new MouseFrame();
            tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tf.setVisible(true);
        });
    }
}  