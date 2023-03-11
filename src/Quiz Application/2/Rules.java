package Quiz.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        JLabel heading=new JLabel("Welcome  "  +name+ "  To  Simple  Minds ");
        heading.setBounds(50,20,700,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        heading.setForeground(Color.blue);
        add(heading);

         JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
                rules.setText("<html>"+
                        "1. This Applicaton is  developed to increase your knowledge on java" + "<br><br>" +

                        "2. You will get  10 points for each correct answer" + "<br><br>" +

                        "3. There is no negative points on incorrect answer" + "<br><br>" +

                        "4. For each question you will get 15 seconds to answer" + "<br><br>" +

                        "5. If  you  dont answer the question within the given time limit,next question will be shown  " + "<br><br>" +

                        "6. It has a 50-50 Lifeline to help you in confused situation" + "<br><br>" +

                        "7. Once u use 50-50 lifeline, two incorrect options will be deleted " + "<br><br>" +

                        "8. You  can use 50-50 lifeline once during ongoing quiz session " + "<br><br>" +

                        "9. Once  you answered all the questions click on submit button to know your score" + "<br><br>" +





                        "<html>");
        rules.setForeground(Color.BLUE);
        add(rules);


        back=new JButton(" Back");
        back.setBounds(250,500,100,25);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(400,500,100,25);
      start.addActionListener(this);
        add(start);





        setSize(800,650);
        setLocation(300,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
          new Quiz(name);

        }
        else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
