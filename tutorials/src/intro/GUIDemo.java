package intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by juno on 15-5-14.
 */
public class GUIDemo {

    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = frame.getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new ButtonPanel());

        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args){

        Runnable tr = new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        };
        javax.swing.SwingUtilities.invokeLater(tr);

    }

}

class ButtonPanel extends JPanel
{
    public ButtonPanel()
    {
        JButton yellowButton = new JButton("Yellow");
        JButton redButton = new JButton("Red");

        this.add(yellowButton);
        this.add(redButton);

        /**
         * register ActionListeners
         */
        ColorAction yellowAction = new ColorAction(Color.yellow);
        ColorAction redAction    = new ColorAction(Color.red);

        yellowButton.addActionListener(yellowAction);
        redButton.addActionListener(redAction);
    }

    /**
     * ActionListener as an inner class
     */
    private class ColorAction implements ActionListener
    {
        public ColorAction(Color c)
        {
            backgroundColor = c;
        }


        /**
         * Actions
         */
        public void actionPerformed(ActionEvent event)
        {
            setBackground(backgroundColor); // outer object, JPanel method
            repaint();
        }

        private Color backgroundColor;
    }
}
