package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;

    Login() {
 getContentPane().setBackground(Color.orange);
 setLayout(null);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(750,50,300,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel name =new JLabel("Enter Your Name");
       name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
         name.setForeground(Color.BLUE);
        add(name);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,30);
        tfname.setForeground(Color.red);
        tfname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(tfname);

         rules=new JButton("Rules");
        rules.setBounds(735,300,100,25);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(930,300,100,25);
        back.addActionListener(this);
        add(back);

       setSize(1200,500);
       setLocation(200,200);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
          setVisible(false);
          new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Login();

    }
}
