package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
    setLayout(null);
        
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1600,800);
        add(image);
        
        JLabel heading = new JLabel("CODE INDIA WELCOMES YOU");
        heading.setBounds(500,40,1000,40);
        
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma",Font.PLAIN,36));
        image.add(heading);
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
       menubar.add(details);
        
        JMenuItem flightDetails= new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
       details.add(flightDetails);
        
         JMenuItem customerDetails= new JMenuItem(" Add Customer Details");
        customerDetails.addActionListener(this);
      details.add(customerDetails);

         JMenuItem bookFlight= new JMenuItem("Book Flight");
                 bookFlight.addActionListener(this);
       details.add(bookFlight);
        
        JMenuItem journeyDetails= new JMenuItem(" Add journey Details");
        details.add(journeyDetails);

        
        JMenuItem ticketCancellation= new JMenuItem("Cancel Ticket");
        details.add(ticketCancellation);
        
        JMenuItem ticket = new JMenuItem("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass= new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);
        

    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setVisible(true);
    }
      public void actionPerformed(ActionEvent ae){
       String text=ae.getActionCommand();
       if(text.equals("Add Customer Details")){
           new AddCustomer();
       } else if (text.equals("Flight Details")) {
           new FlightInfo();
       }
    } 
	public static void main (String[] args) {
		new Home();
	}

}


