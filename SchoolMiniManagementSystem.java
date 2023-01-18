
package schoolminimanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import javax.swing.*;
public class SchoolMiniManagementSystem {

    JFrame frame = new JFrame();
    JFrame frames = new JFrame();
    JFrame frame2 = new JFrame();
    JFrame frame3 = new JFrame();
    JFrame frame4 = new JFrame();
    
    JButton login = new JButton ("Log in");
    JButton login2 = new JButton ("Log in");
    JButton signup = new JButton ("Sign up");
    JButton create = new JButton ("Create");
    JButton back = new JButton ("Back");
    JButton read = new JButton ("read");
    JButton delete = new JButton ("Delete");
    JButton update = new JButton ("Update");
    
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JPanel panel13 = new JPanel();
    JPanel panel14 = new JPanel();
    JPanel panel15 = new JPanel();
    JPanel panel21 = new JPanel();
    
    ImageIcon logo = new ImageIcon("logo.png");
    ImageIcon WC = new ImageIcon("WC.jpg");
    
    JLabel label = new JLabel();
    JLabel lblFirstName = new JLabel ("First Name: ");
    JLabel lblLastName = new JLabel ("Last Name: ");
    JLabel lblMiddleName = new JLabel ("Middle Name: ");
    JLabel lblAge = new JLabel ("Age: ");
    JLabel lblDateOfBirth = new JLabel ("Date of Birth: ");
    JLabel lblMobileNumber = new JLabel ("Mobile Number: ");
    JLabel lblEmailAddress = new JLabel ("Email Address: ");
    JLabel lblAddress = new JLabel ("Address: ");
    JLabel lblCitizenship = new JLabel("Citizenship: ");
    JLabel lblCourse = new JLabel("Course: ");
    JLabel lblReligion = new JLabel("Religion: ");
    JLabel lblGender = new JLabel("Gender: ");
    JLabel lbluser = new JLabel("Username: ");
    JLabel lblpass = new JLabel("Password: ");
    JLabel lblusern = new JLabel("Username: ");
    JLabel lblpassw = new JLabel("Password: ");
    
    JTextField fldFirstName = new JTextField(15);
    JTextField fldLastName = new JTextField(15);
    JTextField fldMiddleName = new JTextField(14);
    JTextField fldAge = new JTextField(15);
    JTextField fldDateOfBirth = new JTextField(15);
    JTextField fldMobileNumber = new JTextField(14);
    JTextField fldEmailAddress = new JTextField(15);
    JTextField fldAddress = new JTextField(15);
    JTextField fldCitizenship = new JTextField(14);
    JTextField fldCourse = new JTextField(15);
    JTextField fldReligion = new JTextField(15);
    JTextField fldGender = new JTextField(14);
    JTextField flduser = new JTextField(15);
    JTextField fldpass = new JTextField(15);
    JTextField fldusern = new JTextField(15);
    JTextField fldpassw = new JTextField(15);
    
    JTextArea outputArea = new JTextArea (15,30);
    
    Font setFont = new Font ("", Font.BOLD, 11);
    
    public static void main(String[] args) {
        SchoolMiniManagementSystem smms = new SchoolMiniManagementSystem();
    }
    public SchoolMiniManagementSystem(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("STI");
        frame.setSize(300,300);
        frame.setLocation(750,300);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setResizable(true);
        frame.setIconImage(logo.getImage());
        
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setTitle("STI");
        frame3.setSize(1500,1000);
        frame3.setLocation(300,0);
        frame3.getContentPane().setBackground(Color.yellow);
        frame3.setResizable(true);
        frame3.setIconImage(logo.getImage());
        label.setIcon(WC);
        frame3.add(label);
            
        outputArea.setBackground(Color.YELLOW);
        outputArea.setEditable(false);
        outputArea.setFont(setFont);
        
        fldFirstName.setFont(setFont);
        fldLastName.setFont(setFont);
        fldMiddleName.setFont(setFont);
        fldAge.setFont(setFont);
        fldDateOfBirth.setFont(setFont);
        fldMobileNumber.setFont(setFont);
        fldEmailAddress.setFont(setFont);
        fldAddress.setFont(setFont);
        fldCitizenship.setFont(setFont);
        fldCourse.setFont(setFont);
        fldReligion.setFont(setFont);
        fldGender.setFont(setFont);
        flduser.setFont(setFont);
        fldpass.setFont(setFont);
        fldusern.setFont(setFont);
        fldpassw.setFont(setFont);
       
        panel.add(lblLastName);
        panel.add(fldLastName);
        panel2.add(lblFirstName);
        panel2.add(fldFirstName);
        panel3.add(lblMiddleName);
        panel3.add(fldMiddleName);
        panel4.add(lblAge);
        panel4.add(fldAge);
        panel5.add(lblDateOfBirth);
        panel5.add(fldDateOfBirth);
        panel6.add(lblMobileNumber);
        panel6.add(fldMobileNumber);
        panel7.add(lblEmailAddress);
        panel7.add(fldEmailAddress);
        panel8.add(lblAddress);
        panel8.add(fldAddress);
        panel9.add(lblCitizenship);
        panel9.add(fldCitizenship);
        panel21.add(lblCourse);
        panel21.add(fldCourse);
        panel10.add(lblReligion);
        panel10.add(fldReligion);
        panel11.add(lblGender);
        panel11.add(fldGender);
        panel12.add(lbluser);
        panel12.add(flduser);
        panel13.add(lblpass);
        panel13.add(fldpass);
        panel14.add(lblusern);
        panel14.add(fldusern);
        panel15.add(lblpassw);
        panel15.add(fldpassw);
        
        login.addActionListener(new Button1());
        frame.add(login);
        signup.addActionListener(new Button2());
        frame.add(signup);
        create.addActionListener(new Button3());
        frame2.add(create);
        back.addActionListener(new Button4());
        frame2.add(back);
        read.addActionListener(new Button5());
        frame2.add(read);
        delete.addActionListener(new Button6());
        frame2.add(delete);
        update.addActionListener(new Button7());
        frame2.add(update);
        login2.addActionListener(new Button8());
        frame.add(login2);
        
        login.setBounds(95,75,100,40);
        signup.setBounds(95,125,100,40);
        frame.setLayout(null);
        frame.setVisible(true);
        
        create.setBounds(50,300,75,40);
        back.setBounds(150,300,75,40);
        read.setBounds(250,300,75,40);
        delete.setBounds(350,300,75,40);
        update.setBounds(450,300,75,40);
        
}
    class Button1 implements ActionListener{ //login
        @Override
        public void actionPerformed(ActionEvent a){
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("STI");
                frame.setSize(300,300);
                frame.setLocation(750,300);
                frame.getContentPane().setBackground(Color.yellow);
                frame.setResizable(true);
                frame.setVisible(true);
                frame.setIconImage(logo.getImage());
                login2.setBounds(40, 175, 100, 40);
                back.setBounds(150, 175, 100, 40);
                           
                panel12.setBackground(Color.YELLOW);
                panel12.setBounds(50,50,200,50);
        
                panel13.setBackground(Color.YELLOW);
                panel13.setBounds(50,100,200,50);
        
                frame.add(panel12);
                frame.add(panel13);
                frame.add(back);
        
                back.setVisible(true);
                login2.setVisible(true);
                signup.setVisible(false);
                login.setVisible(false);           
            
            
        }
    }
    class Button2 implements ActionListener{        //signup
        @Override
        public void actionPerformed(ActionEvent e){
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setTitle("Sign Up");
        frame2.setSize(600,400);
        frame2.setLocation(700,250);
        frame2.getContentPane().setBackground(Color.yellow);
        frame2.setResizable(true);
        frame2.setIconImage(logo.getImage());
        frame2.setLayout(null);
        
        back.setBounds(150,300,75,40);        
        
        login.setVisible(false);
        signup.setVisible(false);
        
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0,0,200,50);
        
        panel2.setBackground(Color.YELLOW);
        panel2.setBounds(200,0,200,50);
        
        panel3.setBackground(Color.YELLOW);
        panel3.setBounds(400,0,200,50);
        
        panel4.setBackground(Color.YELLOW);
        panel4.setBounds(0,50,200,50);
        
        panel5.setBackground(Color.YELLOW);
        panel5.setBounds(200,50,200,50);
        
        panel6.setBackground(Color.YELLOW);
        panel6.setBounds(400,50,200,50);
        
        panel7.setBackground(Color.YELLOW);
        panel7.setBounds(0,100,200,50);
        
        panel8.setBackground(Color.YELLOW);
        panel8.setBounds(200,100,200,50);
        
        panel9.setBackground(Color.YELLOW);
        panel9.setBounds(400,100,200,50);
        
        panel21.setBackground(Color.YELLOW);
        panel21.setBounds(0,150,200,50);
        
        panel10.setBackground(Color.YELLOW);
        panel10.setBounds(200,150,200,50);
        
        panel11.setBackground(Color.YELLOW);
        panel11.setBounds(400,150,200,50);
        
        panel12.setBackground(Color.YELLOW);
        panel12.setBounds(110,200,200,50);
        
        panel13.setBackground(Color.YELLOW);
        panel13.setBounds(300,200,200,50);
        
        frame2.add(panel);
        frame2.add(panel2);
        frame2.add(panel3);
        frame2.add(panel4);
        frame2.add(panel5);
        frame2.add(panel6);
        frame2.add(panel7);
        frame2.add(panel8);
        frame2.add(panel9);
        frame2.add(panel21);
        frame2.add(panel10);
        frame2.add(panel11);
        frame2.add(panel12);
        frame2.add(panel13);

        frame2.add(back);
        create.setVisible(true);
        back.setVisible(true);
        read.setVisible(true);
        delete.setVisible(true);
        frame2.setVisible(true);
        frame.setVisible(false);
        }
    }
    class Button3 implements ActionListener{ //create
        @Override
        public void actionPerformed(ActionEvent a){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("STI");
            frame.setSize(300,300);
            frame.setLocation(750,300);
            frame.getContentPane().setBackground(Color.yellow);
            frame.setResizable(true);
            frame.setIconImage(logo.getImage());
            login2.setBounds(40, 175, 100, 40);
            back.setBounds(150, 175, 100, 40); 
            
            String firstName = fldFirstName.getText();
            String lastName = fldLastName.getText();
            String middleName = fldMiddleName.getText();
            String birthDay = fldDateOfBirth.getText();
            String mobileNumber = fldMobileNumber.getText();
            String age = fldAge.getText();
            String emailAddress = fldEmailAddress.getText();
            String address = fldAddress.getText();
            String citizenship = fldCitizenship.getText();
            String course = fldCourse.getText();
            String religion = fldReligion.getText();
            String gender = fldGender.getText();
            String user = flduser.getText();
            String pass = fldpass.getText();
            
            panel14.setBackground(Color.YELLOW);
            panel14.setBounds(50,50,200,50);
        
            panel15.setBackground(Color.YELLOW);
            panel15.setBounds(50,100,200,50);
        
            frame.add(panel14);
            frame.add(panel15);
        
            try{
                FileWriter writer = new FileWriter("SaveInput.txt",true);
                writer.write("\n\nFirst Name: "+firstName+"\nLast Name: " +lastName+"\nMiddle Name: " +middleName+ "\nAge: "+age+"\nDate of Birth: " +birthDay+ "\nMobile Number: " 
                + mobileNumber+ "\nEmail Address: "+emailAddress+ "\nAddress: "+address+ "\nCitizenship: "+citizenship+"\nCourse: "+course+"\nReligion: "+religion+"\nGender: "+gender+ "\nUsername: "
                +user+"\nPassword: "+pass);
                writer.close();
                //JOptionPane.showMessageDialog(null,"Success");
                //JOptionPane.setVisible(false);
            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Wrong Username or Password");
            }
            
            frame.add(back);
            frame.setVisible(true);
            frame2.setVisible(false);
            frames.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            back.setVisible(true);
            signup.setVisible(false);
            login.setVisible(false);
        
        }
    }
    class Button4 implements ActionListener{  //back
        @Override
        public void actionPerformed(ActionEvent a){
            frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frames.setTitle("STI");
            frames.setSize(300,300);
            frames.setLocation(750,300);
            frames.getContentPane().setBackground(Color.yellow);
            frames.setResizable(true);
            frames.setIconImage(logo.getImage());
            frame2.setVisible(false);
            frame3.setVisible(false);
            frame4.setVisible(false);
            frames.setVisible(true);
            frames.setLayout(null);
            frames.add(login);
            frames.add(signup);
            
            login.setBounds(95,75,100,40);
            signup.setBounds(95,125,100,40);
            
            login.setVisible(true);
            signup.setVisible(true);
            frame.setVisible(false);
        }
    }
    class Button5 implements ActionListener{  //read
        @Override
        public void actionPerformed(ActionEvent a){
            frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame4.setTitle("STI");
            frame4.setSize(300,300);
            frame4.setLocation(1350,300);
            frame4.getContentPane().setBackground(Color.yellow);
            frame4.setResizable(true);
            frame4.setVisible(true);
            frame4.setIconImage(logo.getImage());
            
            String firstName = fldFirstName.getText();
            String lastName = fldLastName.getText();
            String middleName = fldMiddleName.getText();
            String birthDay = fldDateOfBirth.getText();
            String mobileNumber = fldMobileNumber.getText();
            String age = fldAge.getText();
            String emailAddress = fldEmailAddress.getText();
            String address = fldAddress.getText();
            String citizenship = fldCitizenship.getText();
            String course =fldCourse.getText();
            String religion = fldReligion.getText();
            String gender = fldGender.getText();
            String user = flduser.getText();
            String pass = fldpass.getText();
            frame4.add(outputArea);

            outputArea.append("\nFirst Name: "+firstName+"\nLast Name: " +lastName+"\nMiddle Name: " +middleName+ "\nAge: "+age+"\nDate of Birth: " +birthDay+ "\nMobile Number: " 
            + mobileNumber+ "\nEmail Address: "+emailAddress+ "\nAddress: "+address+ "\nCitizenship: "+citizenship+"\nCourse: "+course+"\nReligion: "+religion+"\nGender: "+gender+ "\nUsername: "
            +user+"\nPassword: "+pass);
        }
    }
    class Button6 implements ActionListener{ // delete
        @Override
        public void actionPerformed(ActionEvent a){
        fldFirstName.setText("");
        fldLastName.setText("");
        fldMiddleName.setText("");
        fldDateOfBirth.setText("");
        fldMobileNumber.setText("");
        fldAge.setText("");
        fldEmailAddress.setText("");
        fldAddress.setText("");
        fldCitizenship.setText("");
        fldCourse.setText("");
        fldReligion.setText("");
        fldGender.setText("");
        flduser.setText("");
        fldpass.setText("");
        
        frame4.setVisible(false);
        frame3.setVisible(false);
        }
    }
    class Button7 implements ActionListener{ //update
        @Override
        public void actionPerformed(ActionEvent a){
            frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame4.setTitle("STI");
            frame4.setSize(300,300);
            frame4.setLocation(1350,300);
            frame4.getContentPane().setBackground(Color.yellow);
            frame4.setResizable(true);
            frame4.setVisible(true);
            frame4.setIconImage(logo.getImage());
            
            outputArea.setText("");
            String firstName = fldFirstName.getText();
            String lastName = fldLastName.getText();
            String middleName = fldMiddleName.getText();
            String birthDay = fldDateOfBirth.getText();
            String mobileNumber = fldMobileNumber.getText();
            String age = fldAge.getText();
            String emailAddress = fldEmailAddress.getText();
            String address = fldAddress.getText();
            String citizenship = fldCitizenship.getText();
            String course =fldCourse.getText();
            String religion = fldReligion.getText();
            String gender = fldGender.getText();
            String user = flduser.getText();
            String pass = fldpass.getText();
            frame4.add(outputArea);

            outputArea.append("\nFirst Name: "+firstName+"\nLast Name: " +lastName+"\nMiddle Name: " +middleName+ "\nAge: "+age+"\nDate of Birth: " +birthDay+ "\nMobile Number: " 
            + mobileNumber+ "\nEmail Address: "+emailAddress+ "\nAddress: "+address+ "\nCitizenship: "+citizenship+"\nCourse: "+course+"\nReligion: "+religion+"\nGender: "+gender+ "\nUsername: "
            +user+"\nPassword: "+pass);
        }
    }
    class Button8 implements ActionListener{  //login2
        @Override
        public void actionPerformed(ActionEvent a){
            String user = flduser.getText();
            String pass = fldpass.getText();
            String usern = fldusern.getText();
            String passw = fldpassw.getText();
            
            frame.setVisible(true);
            if (user.equals("myk") && pass.equals("birk")){                    
                    frame3.setVisible(true);   
                }  
            else if (user.equals(usern) && pass.equals(passw)){
                frame3.setVisible(true);
            }
            else if (!user.equals(usern) && !pass.equals(passw)){
                frame3.setVisible(false);
            }
            
        }
    }
    
}
