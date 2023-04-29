import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;


public class form extends JFrame {
    final private Font mainFont= new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName;
    JTextField tfLastName;

    JLabel lbWelcome;
    public void initialize(){


        JLabel lbFirstName=new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5,5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btOk = new JButton("Ok");
        btOk.setFont(mainFont);
        btOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String FirstName = tfFirstName.getText();
                String LastName = tfLastName.getText();
                lbWelcome.setText("Hello " + FirstName + " " + LastName);

            }
            
        });

        JButton btDelete = new JButton("Delete");
        btDelete.setFont(mainFont);
        btDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btOk);
        buttonsPanel.add(btDelete);


        JPanel mainPanel=new JPanel();
        mainPanel.setLayout( new BorderLayout()); 
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

         setTitle("Welcome to my form");
         setSize(500, 600);
         setMinimumSize(new Dimension(200, 300));
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setVisible(true);
    }
    public static void main(String[] args) {
        form myForm = new form();
        myForm.initialize();
    }

}