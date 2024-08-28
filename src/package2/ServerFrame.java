package package2;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class ServerFrame extends javax.swing.JFrame {

    public ServerFrame() {
        initComponents();
        textPaneArea.setEditable(false);
    }


    @SuppressWarnings("unChecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        start = new javax.swing.JButton();
        tcpPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneArea = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList<>();
        status = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        passtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adduserbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TCP Server");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        start.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        start.setForeground(new java.awt.Color(0, 153, 153));
        start.setText("Start Listening");
        start.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        tcpPort.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tcpPort.setText("8888");
        tcpPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpPortActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Port :");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textPaneArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(textPaneArea);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loopback Pseudo-Interface 1: 127.0.0.1", "Wi-Fi :192.168.1.112", "Ethernet: 169.254.49.56" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 51, 51)));

        userList.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(userList);

        status.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        status.setText("the State here");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Status :");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        adduserbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adduserbutton.setText("Add New User");
        adduserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tcpPort, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adduserbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcpPort, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passtext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addComponent(adduserbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tcpPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcpPortActionPerformed

    private ServerSocket socket;
    private HashMap <String, Socket>clientsHash = new HashMap<>();
    boolean t=false;
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        int portNumber = 0000;
        boolean isNumbers = false;
        
        try {
            if (!tcpPort.getText().isEmpty()) {
                portNumber = Integer.parseInt(tcpPort.getText());
                isNumbers = true;
                if (isNumbers) {
                    socket = new ServerSocket(portNumber);
                    StyledDocument doc = textPaneArea.getStyledDocument();
                    Style style = textPaneArea.addStyle("", null);
                    StyleConstants.setForeground(style, Color.BLUE);
                    StyleConstants.setBackground(style, Color.white);
                    String s1 = "Start Listening at port: " + portNumber + "\n";
                    doc.insertString(doc.getLength(), s1, style);
                    new ClientAccept(socket).start();
                    status.setText("Address: "+InetAddress.getByName("localhost").getHostAddress() +", port: "+portNumber);
                }
            } else {
                JOptionPane.showMessageDialog(null, "pleace enter a port number in 'port number' field.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "pleace enter only a numbers in 'port number' field.");
            isNumbers = false;
        } catch (IOException | BadLocationException ex) {
            JOptionPane.showMessageDialog(null, "The port number is used");
            

        }
    }//GEN-LAST:event_startActionPerformed

    
    boolean CheckLogin(String password, String name) throws Exception
    {
        boolean p = false;
        String YourInfo = name + " " + password;
        String fileName = "info.txt";
        Path path = Paths.get(fileName);
        List <String> allInfo = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(int i = 0; i < allInfo.size(); i++)
        {
          if (allInfo.get(i).equalsIgnoreCase(YourInfo)){
            p = true;
                break;
            }
        }
        return p;
    }
    
    
    
    private void adduserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserbuttonActionPerformed
        // TODO add your handling code here:
        
       /* String username=usernametext.getText();
        String pass=passtext.getText();
        try {
            if(CheckLogin(username,pass)==false){
            String s=pass +" "+username;   
                
        String fileName = "info.txt";
        Path path = Paths.get(fileName);
        
       
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(path.toString(),true);
            
            // Write the new data to the file
            writer.write(s +"\n");
            
            // Close the writer to finalize changes and release resources
            writer.close();
   
            JOptionPane.showMessageDialog(null, "Done");        
            }*/
       
       String username = usernametext.getText().trim();
    String pass = passtext.getText().trim();
    
    try {
        // Check if user already exists
        if (!CheckLogin(pass, username)) { // Now correctly checks if user does NOT exist
            String userInfo = username + " " + pass; // Correct order to match CheckLogin

            String fileName = "info.txt";
            Path path = Paths.get(fileName);
       
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(path.toString(), true);
            
            // Write the new data to the file
            writer.write(userInfo + "\n");
            
            // Close the writer
            writer.close();
   
            JOptionPane.showMessageDialog(null, "User added successfully.");        
        } else {
            // User already exists
            JOptionPane.showMessageDialog(null, "The user already exists."); 
        }
            
            
        } catch (Exception ex) {
            Logger.getLogger(ServerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_adduserbuttonActionPerformed

    private class ClientAccept extends Thread {

        private ServerSocket socket;

        public ClientAccept(ServerSocket socket) {
            this.socket = socket;

        }

        public void run() {
            while (true) {
                try {
                    Socket clientSocket = socket.accept();
                    String username = new DataInputStream(clientSocket.getInputStream()).readUTF();
                    DataOutputStream dataOutOfClient = new DataOutputStream(clientSocket.getOutputStream());
                    if (clientsHash.containsKey(username)) {
                        dataOutOfClient.writeUTF("founded");
                    } else {
                        clientsHash.put(username, clientSocket);
                        addTextToArea(username, true);
                        dataOutOfClient.writeUTF("accept");
                        new endToEndList().start();
                        new ReadMessage(clientSocket, username).start();
                    }

                } catch (IOException ex) {
                    Logger.getLogger(ClientAccept.class.getName()).log(Level.SEVERE, null, ex);
                } catch (BadLocationException ex) {
                    Logger.getLogger(ServerFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }
    class ReadMessage extends Thread {

        Socket s;
        String ID;

        ReadMessage(Socket s, String username) {
            this.s = s;
            this.ID = username;

        }

        public void run() {

            while (!clientsHash.isEmpty() && clientsHash.containsKey(ID)) {
                try {
                    String in = new DataInputStream(s.getInputStream()).readUTF();
                    if (in.contains("logout")) {
                       
                        new DataOutputStream(((Socket) clientsHash.get(ID)).getOutputStream()).writeUTF("logout");
                        
                        clientsHash.remove(ID);
                        addTextToArea(ID, false);
                        new endToEndList().start();

                    }
                } catch (IOException | BadLocationException ex) {
                    clientsHash.remove(ID);
                    try {
                        addTextToArea(ID, false);
                    } catch (BadLocationException ex1) {
                        Logger.getLogger(ServerFrame.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                    new endToEndList().start();
                    ex.printStackTrace();

                }
            }
        }
    }

    private class endToEndList extends Thread {

        DefaultListModel <String>dlm;

        public endToEndList() {
            dlm = new DefaultListModel<>();
            userList.setModel(dlm);
        }

        public void run() {
            try {

                String s = new String();

                Set<String> k = clientsHash.keySet();
                Iterator<String> itr = k.iterator();
                dlm.clear();
                while (itr.hasNext()) {
                    String key = (String) itr.next();
                    s += key + "," + String.valueOf(((Socket) clientsHash.get(key)).getPort()) + "," +
                            ((Socket) clientsHash.get(key)).getInetAddress().getHostAddress() + "&?";
                    
                    String ele = key + " : " + ((Socket) clientsHash.get(key)).getInetAddress().getHostAddress() + ", " + 
                            String.valueOf(((Socket) clientsHash.get(key)).getPort());
                    dlm.addElement(ele);
                }
                if (s.length() != 0) {
                    s = s.substring(0, s.length() - 2);
                }
                itr = k.iterator();
                while (itr.hasNext()) {
                    String key = (String) itr.next();
                    try {
                        new DataOutputStream(((Socket) clientsHash.get(key)).getOutputStream()).writeUTF("add to list" + s);

                    } catch (IOException ex) {

                        clientsHash.remove(key);
                        addTextToArea(key, false);

                    }
                }
            } catch (BadLocationException ex) {

            }
        }
    }

    public void addTextToArea(String username, boolean color) throws BadLocationException {
        if (color) {
            //in log in
            StyledDocument doc = textPaneArea.getStyledDocument();
            Style style = textPaneArea.addStyle("", null);
            StyleConstants.setForeground(style, Color.BLUE);
            StyleConstants.setBackground(style, Color.white);
            String s1 = username + " login" + "\n";
            doc.insertString(doc.getLength(), s1, style);
        } else {
            //in log out
            StyledDocument doc = textPaneArea.getStyledDocument();
            Style style = textPaneArea.addStyle("", null);
            StyleConstants.setForeground(style, Color.RED);
            StyleConstants.setBackground(style, Color.white);
            String s1 = username + " logout" + "\n";
            doc.insertString(doc.getLength(), s1, style);

        }

    }


    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adduserbutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField passtext;
    private javax.swing.JButton start;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tcpPort;
    private javax.swing.JTextPane textPaneArea;
    private javax.swing.JList<String> userList;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables

}
