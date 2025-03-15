/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz050;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MainPage extends JFrame implements ActionListener{

private String username;
private JLabel label;
private JButton movie1, movie2, movie3, movie4;

public MainPage(String username){
this.username = username;
setTitle("Movie Selection");
setSize(720,480);


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setLocationRelativeTo(null);
setResizable(true);
setLayout(null);

label = new JLabel("Hey!" + username);
label.setBounds(250, 20, 200, 30);

movie1 = new JButton("Spongebob");
movie1.setBounds(100,150,200,30);
movie1.addActionListener(this);
add(movie1);

setVisible(true);
}

@Override

public void actionPerformed(ActionEvent e){
String movie = "";

    if(e.getSource()==movie1){
        movie = "Spongebob";

    }
}
}
