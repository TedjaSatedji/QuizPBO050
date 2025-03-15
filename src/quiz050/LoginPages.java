/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz050;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPages extends JFrame implements ActionListener{
    
    private JLabel titleLabel, usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton loginButton, resetButton;
    
    
public LoginPages(){
setTitle("Login Page");
setSize(720, 480);


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setLocationRelativeTo(null);
setResizable(true);
setLayout(null);

titleLabel = new JLabel("Login");
titleLabel.setBounds(300, 10, 200, 30);
add(titleLabel);

usernameLabel = new JLabel("username:");
usernameLabel.setBounds(50, 60, 440, 32);
add(usernameLabel);

usernameTextField = new JTextField(15);
usernameTextField.setBounds(150, 60, 440, 32);
add(usernameTextField);

passwordLabel = new JLabel("password");
passwordLabel.setBounds(50, 100, 440, 32);
add(passwordLabel);

passwordTextField = new JPasswordField(15);
passwordTextField.setBounds(150, 100, 440, 32);
add(passwordTextField);
passwordTextField.addActionListener(e -> loginButton.doClick());

loginButton = new JButton("Login");
loginButton.setBackground(new Color(135, 206, 235));
loginButton.setForeground(Color.WHITE);
loginButton.setFocusPainted(false);
loginButton.setBounds(100, 150, 200, 30);
loginButton.addActionListener(this);
add(loginButton);

resetButton = new JButton("Reset");
resetButton.setBackground(new Color(220, 53, 69));
resetButton.setForeground(Color.WHITE);
resetButton.setFocusPainted(false);
resetButton.setBounds(350, 150, 200, 30);
resetButton.addActionListener(this);
add(resetButton);

setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e){
    if(e.getSource() == loginButton){
        String username = usernameTextField.getText();
        String password = new String(passwordTextField.getPassword());
        
        if(username.equals("user") && password.equals("user")){
            JOptionPane.showMessageDialog(this, "Login Successful");
            
            new MainPage(username);
            
            this.dispose();
        }
        
        else{
        JOptionPane.showMessageDialog(this, "Wrong Credentials!","error",JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    else if(e.getSource() == resetButton){
        usernameTextField.setText("");
        passwordTextField.setText("");
    }
    
}

    
}
