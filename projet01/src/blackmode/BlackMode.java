package blackmode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BlackMode extends JFrame implements ActionListener {

    JPanel panel1;
    JButton blackmodebutton,lightmodebutton;

    public BlackMode() {
        panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        blackmodebutton = new JButton("black-mode");
        lightmodebutton= new JButton("light-mode");
        add(panel1, BorderLayout.CENTER);
        panel1.add(blackmodebutton);
        blackmodebutton.addActionListener(this);
        panel1.add(lightmodebutton);
        lightmodebutton.setVisible(false);
        lightmodebutton.addActionListener(this);
        setBounds(30,20,400,300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==blackmodebutton){
            panel1.setBackground(Color.black);
            blackmodebutton.setVisible(false);
            lightmodebutton.setVisible(true);
        }
        if (e.getSource()==lightmodebutton){
            panel1.setBackground(Color.white);
            blackmodebutton.setVisible(true);
            lightmodebutton.setVisible(false);
        }
    }
}
