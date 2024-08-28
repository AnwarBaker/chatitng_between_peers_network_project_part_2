package package2;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import javax.swing.ListModel;


public class Client extends javax.swing.JFrame {

    DatagramSocket socket;
    String userName;
    String localIp;
    int localPort;
    String remotIp;
    int remotPort;
    InetAddress remot_IPAddress;
    byte[] S_buffer;
    DatagramPacket sendpacket;
    byte[] R_buffer;
    DatagramPacket receive_packet;
    boolean conn = false;
    boolean logedin = false;

    public Client() {
        initComponents();
        textPaneArea.setEditable(false);
        Remot_IP.setEditable(false);
        Remot_Port.setEditable(false);
        inArea.setForeground(Color.GRAY);
        inArea.setText("enter text here");
        userName = "";
        localIp = "";
        localPort = 0;
        remotIp = "";
        remotPort = 0;
        R_buffer = new byte[50];
        receive_packet = new DatagramPacket(R_buffer, R_buffer.length);

    }


    @SuppressWarnings("unChecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        serIp = new javax.swing.JTextField();
        serPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Local_IP = new javax.swing.JTextField();
        Local_Port = new javax.swing.JTextField();
        Remot_IP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Remot_Port = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        online_user = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        Send = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textPaneArea = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        SendToAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username :");

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setToolTipText("");
        username.setPreferredSize(new java.awt.Dimension(7, 28));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 0, 51));
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Logout");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        inArea.setColumns(20);
        inArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inArea.setLineWrap(true);
        inArea.setRows(5);
        inArea.setWrapStyleWord(true);
        inArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inAreaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(inArea);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TCP Server Port :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Avilable Interfaces");

        serIp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        serIp.setToolTipText("");
        serIp.setPreferredSize(new java.awt.Dimension(7, 28));
        serIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serIpActionPerformed(evt);
            }
        });

        serPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        serPort.setToolTipText("");
        serPort.setPreferredSize(new java.awt.Dimension(7, 28));
        serPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serPortActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TCP Server IP :");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loopback Pseudo-Interface 1: 127.0.0.1", "Wi-Fi :192.168.1.112", "Ethernet: 169.254.49.56" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Local Port :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Local IP :");

        Local_IP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Local_IP.setToolTipText("");
        Local_IP.setPreferredSize(new java.awt.Dimension(7, 28));
        Local_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Local_IPActionPerformed(evt);
            }
        });

        Local_Port.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Local_Port.setToolTipText("");
        Local_Port.setPreferredSize(new java.awt.Dimension(7, 28));
        Local_Port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Local_PortActionPerformed(evt);
            }
        });

        Remot_IP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Remot_IP.setToolTipText("");
        Remot_IP.setPreferredSize(new java.awt.Dimension(7, 28));
        Remot_IP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remot_IPActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Remote IP :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Remote Port :");

        Remot_Port.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Remot_Port.setToolTipText("");
        Remot_Port.setPreferredSize(new java.awt.Dimension(7, 28));
        Remot_Port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remot_PortActionPerformed(evt);
            }
        });

        online_user.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                online_userValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(online_user);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Online Users");

        Send.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Send.setForeground(new java.awt.Color(0, 153, 153));
        Send.setText("Send");
        Send.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        Send.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Status :");

        status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        status.setToolTipText("");
        status.setPreferredSize(new java.awt.Dimension(7, 28));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textPaneArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textPaneArea.setFocusCycleRoot(false);
        jScrollPane4.setViewportView(textPaneArea);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password :");

        SendToAll.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        SendToAll.setForeground(new java.awt.Color(0, 153, 153));
        SendToAll.setText("Send all");
        SendToAll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        SendToAll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SendToAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendToAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(password)
                                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serIp, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(serPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(Local_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Local_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Remot_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Remot_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SendToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(76, 76, 76)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Send, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SendToAll, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(serIp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serPort, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Local_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Local_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remot_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remot_Port, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel<String> dlm;
    DataInputStream dataFromServer;
    DataInputStream DataInputStream;
    DataOutputStream dataToServer;
    Socket serverSocket;
    Read r;
    Receive channel;
    boolean t = false;
    boolean j = false;
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if (username.getText().equals("") || password.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "You should enter user name and password");
        }else if (serIp.getText().equals("") || Local_IP.getText().equals("") || Local_Port.getText().equals("")
                || serPort.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You should enter TCP IP, TCP Port, Local IP and Local Port");
        }else if (!logedin) {
            
            String passText = new String(password.getPassword());
            boolean CheckLogin = false;
            try {
                CheckLogin = CheckLogin(passText, username.getText());
            } catch (Exception ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (CheckLogin) {
                ///////////////////////////////////////////////////////////////////////////////
                userName = username.getText().trim();
                String TcpIP = serIp.getText();
                int TcpPort = Integer.parseInt(serPort.getText());
                String localIP = Local_IP.getText();
                localPort = Integer.valueOf(Local_Port.getText().trim());
                conn = true;
                localIp = Local_IP.getText();
                localPort = Integer.parseInt(Local_Port.getText());
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");             
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                
  
                try {
                    socket = new DatagramSocket(localPort);
                } catch (SocketException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    serverSocket = new Socket();
                    System.out.println("mm1");
                    serverSocket.bind(new InetSocketAddress(localIP, localPort));
                    System.out.println("mm2");
                    serverSocket.connect(new InetSocketAddress(TcpIP, TcpPort));
                    System.out.println("mm3");
                    
                    dataFromServer = new DataInputStream(serverSocket.getInputStream());
                    dataToServer = new DataOutputStream(serverSocket.getOutputStream());
                    dataToServer.writeUTF(userName);
                    String s;
                    DataInputStream = new DataInputStream(serverSocket.getInputStream());
                    s = DataInputStream.readUTF();
                    
                    if (s.equals("founded")) {
                    JOptionPane.showMessageDialog(null, "You are already login!\n", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }else if (s.equals("accept")) {
                        dlm = new DefaultListModel<>();
                        online_user.setModel(dlm);
                        r = new Read(userName);
                        r.start();
                    }

                    j = true;
                    channel = new Receive(this);
                    channel.start();
                    t = true;
                    
                    
                     logintime =sdf.format(timestamp).toString().trim();
                     usernamee=userName.trim();
                     
                     
                    JOptionPane.showMessageDialog(null, "You are loged in successfully");
                    logedin = true;
                    
                    //##############################################################
                updateLoginTime( usernamee, logintime);
            
                  JOptionPane.showMessageDialog(null,getLastLoginTime(usernamee) , "last login time", HEIGHT);
                    //##############################################################
                
                
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "The local port is used");
                }
                ///////////////////////////////////////////////////////////////////////////////
              
            }else {
                JOptionPane.showMessageDialog(null, "invalid login information, either user name or password");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "You are already loged in");
        }
    }//GEN-LAST:event_loginActionPerformed

    
    
    //############################################
    
   private void updateLoginTime(String userName, String loginTime) {
    String record = userName + "," + loginTime + "\n";
    String fileName = "login_time.txt";
    Path path = Paths.get(fileName);
    try (FileWriter writer = new FileWriter(path.toString(), true)) {
        writer.write(record);
    } catch (IOException ex) {
        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
    }
}

   
   
   //######################################################################

   
   private String getLastLoginTime(String userName) {
    String fileName = "login_time.txt";
    Path path = Paths.get(fileName);
    String lastLoginTime = "Never logged in";
    String tempLoginTime = ""; // Temporary storage for iterating through login times

    try {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts[0].trim().equals(userName.trim())) {
                // When we find a new entry for the user, move the last found login time to 'lastLoginTime'
                // and store the current find in 'tempLoginTime'.
                // This way, 'lastLoginTime' always holds the second-to-last login time until the loop finishes.
                lastLoginTime = tempLoginTime; // Store the previous iteration's time as the last login time
                tempLoginTime = parts[1]; // Update the temp login time with the current find
            }
        }
    } catch (IOException ex) {
        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
    }

    // If 'lastLoginTime' remains unchanged, it means the user logged in only once.
    return lastLoginTime.isEmpty() ? "This is your first login" : lastLoginTime;
}

//##########################################################

   
   
   
    
    class Read extends Thread {

        String userName;

        public Read(String userName) {
            this.userName = userName;

        }

        
        public void run() {
            while (j) {
                try {
                    String inputData = dataFromServer.readUTF();
                    if (inputData.equals("logout")) {
                        break;
                    }
                    if (inputData.contains("add to list")) {
                        inputData = inputData.substring(11);
                        dlm.clear();
                        StringTokenizer st = new StringTokenizer(inputData, "&?");
                        while (st.hasMoreTokens()) {
                            String line = st.nextToken();
                            String[] tokens = line.split(",");
                            if (!tokens[0].equals(getUserName())) {
                                String element = tokens[0] + "," + tokens[2] + "," + tokens[1];
                                dlm.addElement(element);
                            }
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        private String getUserName() {
            return userName;
        }
        
    }

    private void serIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serIpActionPerformed

    private void serPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serPortActionPerformed

    private void Local_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Local_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Local_IPActionPerformed

    private void Local_PortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Local_PortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Local_PortActionPerformed

    private void Remot_IPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remot_IPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Remot_IPActionPerformed

    private void Remot_PortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remot_PortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Remot_PortActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        try {
            if (!conn) {
                JOptionPane.showMessageDialog(null, "You can't send, pleace Login first");
            } else if (Remot_IP.getText().equals("") || Remot_Port.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You should select a user from the online user list");
            } else if (inArea.getText().equals("") || inArea.getText().equals("enter text here")) {
                JOptionPane.showMessageDialog(null, "You can't send empty message");
            } else {
                userName = username.getText();
                remotIp = Remot_IP.getText();
                remotPort = Integer.parseInt(Remot_Port.getText());
                remot_IPAddress = InetAddress.getByName(remotIp);
                String msg = inArea.getText();
                inArea.setText("");
                StyledDocument doc = textPaneArea.getStyledDocument();
                Style style = textPaneArea.addStyle("", null);
                StyleConstants.setForeground(style, Color.RED);
                StyleConstants.setBackground(style, Color.white);
                //___________________________________________________________________________________________________
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String s1 = "Me: " + msg + " From " + localPort + " At time: " + sdf.format(timestamp) + "\n";
                //___________________________________________________________________________________________________
                doc.insertString(doc.getLength(), s1, style);
                msg = userName + ": " + msg;
                S_buffer = msg.getBytes();
                sendpacket = new DatagramPacket(S_buffer, S_buffer.length, remot_IPAddress, remotPort);
                socket.send(sendpacket);
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | BadLocationException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void inAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inAreaFocusGained
        // TODO add your handling code here:
        if (inArea.getText().equals("enter text here")) {
            inArea.setText("");
            inArea.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_inAreaFocusGained

    private void inAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inAreaFocusLost
        // TODO add your handling code here:
        if (inArea.getText().isEmpty()) {
            inArea.setForeground(Color.GRAY);
            inArea.setText("enter text here");
        }
    }//GEN-LAST:event_inAreaFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (logedin) {
            JOptionPane.showMessageDialog(null, "You are loged out successfully");
            logedin = false;
            t = false;
            j = false;

            try {
                String localIp1 = Local_IP.getText();
                int localPort1 = Integer.parseInt(Local_Port.getText());
                InetAddress remot_IPAddress1 = InetAddress.getByName(localIp1);
                String msg = "logout";
                S_buffer = msg.getBytes();
                sendpacket = new DatagramPacket(S_buffer, S_buffer.length, remot_IPAddress1, localPort1);
                socket.send(sendpacket);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            String s = "logout";
            try {
                dataToServer.writeUTF(s);
                dataToServer.flush();

            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            dlm.clear();

            try {
                socket.close();
                serverSocket.close();
                DataInputStream.close();
                dataFromServer.close();
                dataToServer.close();

            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "You are already loged out");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    // private void online_userValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_online_userValueChanged
    
    // }//GEN-LAST:event_online_userValueChanged

    private void online_userValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
            DefaultListModel<String> model = (DefaultListModel<String>) online_user.getModel();
            int selectedIndex = online_user.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedValue = model.get(selectedIndex);
                String[] tokens = selectedValue.split(",");
                if (tokens.length >= 3) {
                    Remot_IP.setText(tokens[1].trim()); // remove any leading/trailing whitespace
                    Remot_Port.setText(tokens[2].trim()); // remove any leading/trailing whitespace
                }
            }
        }
    }
    
    
    // private void SendToAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendToAllActionPerformed
    
    // }//GEN-LAST:event_SendToAllActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    private void SendToAllActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Check if user is not connected
            if (!conn) {
                JOptionPane.showMessageDialog(null, "You can't send, please Login first");
                return;
            }
            // Check if message is empty
            if (inArea.getText().equals("") || inArea.getText().equals("enter text here")) {
                JOptionPane.showMessageDialog(null, "You can't send empty message");
                return;
            }
            
            // Get list of online users
            ListModel<String> model = online_user.getModel();
            int numUsers = model.getSize();
            
            // Get message to send
            String msg = inArea.getText();
            // Add sender's username to message
            msg = username.getText() + ": " + msg;
           
            // Get current timestamp
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String time = sdf.format(timestamp);
            // Create message to display in chat window
            //String s1 = "Me: " + msg + " From " + localPort + " At time: " + time + "\n";
            
            // Send message to each online user
            for (int i = 0; i < numUsers; i++) {
                String s = model.getElementAt(i);
                String[] tokens = s.split(",");
                String remoteIp = tokens[1];
                int remotePort = Integer.parseInt(tokens[2]);
                
                // Create a datagram packet with the message
                InetAddress remoteIpAddress = InetAddress.getByName(remoteIp);
                byte[] messageBytes = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length, remoteIpAddress, remotePort);
                // Send the datagram packet
                socket.send(packet);
            }
            
         
            inArea.setText(""); 
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    public String senderName;
    void receive() {
        try {
            if (t) {
                socket.receive(receive_packet);
                String msg = new String(R_buffer, 0, receive_packet.getLength());
                if (msg.equals("logout")) {
                    return;
                }
                String msgg = msg.split(" ")[0];
                senderName = msgg;
                System.out.println(senderName);
                InetAddress S_IPAddress = receive_packet.getAddress();
                int Sport = receive_packet.getPort();
    
                // Generate a unique color for this client
                Color clientColor = getClientColor(senderName);
    
                // Create a new style with the client's color
                Style style = textPaneArea.addStyle("", null);
                StyleConstants.setForeground(style, clientColor);
                StyleConstants.setBackground(style, Color.white);
    
                // Create the message string
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");                
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String s1 = msg + " From " + Sport + " At time: " + sdf.format(timestamp) + "\n";
    
                // Insert the message into the document with the client's color
                StyledDocument doc = textPaneArea.getStyledDocument();
                doc.insertString(doc.getLength(), s1, style);
    
                String s = S_IPAddress.getHostAddress();
                status.setText("Received From IP= " + s + ", port: " + Sport);
            }
        } catch (IOException | BadLocationException ex) {
            System.out.println(ex);
        }
    }
    
    // Generates a unique color for a given client IP address
    private Color getClientColor(String name) {
        Color xColor;
        if(name.equals("Ali:")){
            xColor = new Color(0, 255, 0);
        }
        else if(name.equals("Bara:")){
            xColor = new Color(0, 0, 255);
        }
        else if(name.equals("Adam:")){
            xColor = new Color(255, 150, 0);
        }
        else if(name.equals("Ahmad:")) {
            xColor = new Color(0, 150, 150);
        } else {
            xColor = new Color(255, 0, 150);
        }
        return xColor;
    }
    
    
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

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Client().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Local_IP;
    private javax.swing.JTextField Local_Port;
    private javax.swing.JTextField Remot_IP;
    private javax.swing.JTextField Remot_Port;
    private javax.swing.JButton Send;
    private javax.swing.JButton SendToAll;
    private javax.swing.JTextArea inArea;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton login;
    private javax.swing.JList<String> online_user;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField serIp;
    private javax.swing.JTextField serPort;
    private javax.swing.JTextField status;
    private javax.swing.JTextPane textPaneArea;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    public String logintime="";
    public String usernamee="";
}
