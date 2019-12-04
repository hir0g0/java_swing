import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.border.*;

class MachineX extends JFrame {
  Container container = null;
  JPanel mainPanel, cardPanel, machineXPanel;
  Date date = new Date();
  String strDate;
  Font f12 = new Font("Arial", Font.PLAIN, 12);
  Font f15 = new Font("Arial", Font.PLAIN, 15);
  Font f18 = new Font("Arial", Font.PLAIN, 18);
  Font f20 = new Font("Arial", Font.PLAIN, 20);
  Font f24 = new Font("Arial", Font.PLAIN, 24);
  //Border Setting
  EtchedBorder eborder = new EtchedBorder(EtchedBorder.RAISED, Color.white, Color.black);
  JLabel labelX4813, labelX4814, labelX4815, labelX4816, labelX4817, labelX4818, labelX4819;
  JLabel labelX4820, labelX4821, labelX4822, labelX4823, labelX4825, labelX4826, labelX4827, labelX4828;

  public MachineX (String title) {
    super(title);
    container = this.getContentPane();

    //Setting:Panel,label,button,etc...
    //mainPanel
    JButton button00,button01;
    //No-Working CheckPanel
    JPanel panelX41,panelX42;
    JPanel panelX420;
    JLabel labelXC[],labelXS[], labelX40,labelX41;
    JButton buttonX40;
    int i;
    String state1 = "Close";
    String state2 = "Open";
    String state3 = "NOT working";
    String state4 = "Working";
    String[] mXChar = new String[]{"XP1", "XP2", "XV1", "XV2", "XV3"};
    String[] mXState = new String[]{state3, state3, state1, state1, state1};
    String[] mXState2 = new String[]{state4, state4, state2, state2, state2};
    String check1 = "Confermed";
    String check2 = "Not Confermed";

    //Start-up XP1
    JPanel panelX43, panelX430, panelX431;
    JLabel labelX420, labelX421, labelX422, labelX423;
    JButton buttonX410, buttonX411;
    //Start-up XP2
    JPanel panelX44, panelX440, panelX441;
    JLabel labelX430, labelX431, labelX432, labelX433;
    JButton buttonX420, buttonX421;
    //Start-up XV1
    JPanel panelX45, panelX450, panelX451, panelX452;
    JLabel labelX440, labelX441, labelX442, labelX443, labelX444, labelX445;
    JButton buttonX430, buttonX431, buttonX432;
    double f1 = 5.0;
    //Start-up XV2
    JPanel panelX46, panelX460, panelX461, panelX462;
    JLabel labelX450, labelX451, labelX452, labelX453, labelX454, labelX455;
    JButton buttonX440, buttonX441, buttonX442;
    double f2 = 5.0;
    //XV3 panel
    JPanel panelX47, panelX470, panelX471;
    JLabel labelX460, labelX461, labelX462, labelX463;
    JButton buttonX450, buttonX451;
    //Measure Panel
    JPanel panelX48, panelX480, panelX481, panelX482;
    JLabel labelX470, labelX471, labelX472, labelX473;
    JButton buttonX460, buttonX461;
    double temp = 320;
    //Complete panel
    JPanel panelX49;
    JPanel panelX490, panelX491, panelX492, panelX493, panelX494, panelX495;
    JLabel labelX4801, labelX4802, labelX4803, labelX4804, labelX4805, labelX4806;
    JLabel labelX4811, labelX4812, labelX4824;

    //MainPanel
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(1, 2, 5, 10));
    button00 = new JButton("Main");
    mainPanel.add(button00);
    button00.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ( (CardLayout) cardPanel.getLayout()).first(cardPanel);
      }
    });
    button01 = new JButton("Next");
    mainPanel.add(button01);
    button01.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ( (CardLayout) cardPanel.getLayout()).next(cardPanel);
      }
    });
    container.add(mainPanel);

    //No-working checkPanel
    machineXPanel = new JPanel();
    machineXPanel.setLayout(new GridLayout(2, 1, 5, 1));
    panelX41 = new JPanel();
    panelX41.setLayout(new GridLayout(2, 5, 2, 2)); //state panel
    machineXPanel.add(panelX41);
    panelX42 = new JPanel();
    panelX42.setLayout(new GridLayout(2, 1, 5, 5)); //check panel
    panelX42.setBorder(eborder);
    machineXPanel.add(panelX42);
    panelX420 = new JPanel();
    panelX420.setLayout(new GridLayout(1, 2, 5, 5));
    panelX420.setBorder(eborder);
    panelX42.add(panelX420);
    labelXC = new JLabel[5];//state of machine X
    for(i = 0; i < 5; i++) {
      labelXC[i] = new JLabel(mXChar[i], JLabel.CENTER);
      labelXC[i].setFont(f15);
      labelXC[i].setBorder(eborder);
      panelX41.add(labelXC[i]);
    }
    labelXS = new JLabel[5];
    for(i = 0; i < 5; i++) {
      labelXS[i] = new JLabel(mXState[i], JLabel.CENTER);
      labelXS[i].setFont(f15);
      labelXS[i].setBorder(eborder);
      labelXS[i].setForeground(Color.blue);
      panelX41.add(labelXS[i]);
    }
    labelX40 = new JLabel("No working?", JLabel.CENTER);
    labelX40.setFont(f15);
    panelX420.add(labelX40);
    buttonX40 = new JButton("Confermed");
    buttonX40.setFont(f20);
    panelX420.add(buttonX40);
    buttonX40.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX40.setEnabled(false);
        labelX4813.setText("first-check, ");
      }
    });
    labelX41 = new JLabel("If you start Machine X, please push [NEXT] button", JLabel.CENTER);
    labelX41.setFont(f15);
    panelX42.add(labelX41);


    //XP1's Start-up Panel
    panelX43= new JPanel();
    panelX43.setLayout(new GridLayout(3, 1, 2, 5));
    panelX430 = new JPanel();
    panelX430.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX43.add(panelX430);
    panelX431 = new JPanel();
    panelX431.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX43.add(panelX431);
    labelX420 = new JLabel("XP1", JLabel.CENTER);
    labelX420.setBorder(eborder);
    labelX420.setFont(f24);
    panelX430.add(labelX420);
    labelX421 = new JLabel(state3, JLabel.CENTER);
    labelX421.setBorder(eborder);
    labelX421.setFont(f24);
    labelX421.setForeground(Color.blue);
    panelX430.add(labelX421);
    labelX422 =new JLabel(check2, JLabel.CENTER);
    labelX422.setBorder(eborder);
    labelX422.setFont(f24);
    labelX422.setForeground(Color.blue);
    panelX430.add(labelX422);
    buttonX410 = new JButton("Start");
    buttonX410.setFont(f20);
    panelX431.add(buttonX410);
    buttonX410.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX410.setEnabled(false);
        labelX421.setText(state4); //chenge to Working
        labelX421.setForeground(Color.red);
        labelX4814.setText("XP1");
      }
    });
    buttonX411 = new JButton("Check");
    buttonX411.setFont(f20);
    panelX431.add(buttonX411);
    buttonX411.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX411.setEnabled(false);
        labelX422.setText(check1);  //confermed working
        labelX422.setForeground(Color.green);
        labelX4815.setText("(OK),");
      }
    });
    labelX423 = new JLabel("If XP1 started, you click [NEXT] button", JLabel.CENTER);
    labelX423.setFont(f20);
    panelX43.add(labelX423);

    
    //XP2's Start-up Panel
    panelX44= new JPanel();
    panelX44.setLayout(new GridLayout(3, 1, 2, 5));
    panelX440 = new JPanel();
    panelX440.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX44.add(panelX440);
    panelX441 = new JPanel();
    panelX441.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX44.add(panelX441);
    labelX430 = new JLabel("XP2", JLabel.CENTER);
    labelX430.setBorder(eborder);
    labelX430.setFont(f24);
    panelX440.add(labelX430);
    labelX431 = new JLabel(state3, JLabel.CENTER);
    labelX431.setBorder(eborder);
    labelX431.setFont(f24);
    labelX431.setForeground(Color.blue);
    panelX440.add(labelX431);
    labelX432 =new JLabel(check2, JLabel.CENTER);
    labelX432.setBorder(eborder);
    labelX432.setFont(f24);
    labelX432.setForeground(Color.blue);
    panelX440.add(labelX432);
    buttonX420 = new JButton("Start");
    buttonX420.setFont(f20);
    panelX441.add(buttonX420);
    buttonX420.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX420.setEnabled(false);
        labelX431.setText(state4); //chenge to open
        labelX431.setForeground(Color.red);
        labelX4816.setText("XP2");
      }
    });
    buttonX421 = new JButton("Check");
    buttonX421.setFont(f20);
    panelX441.add(buttonX421);
    buttonX421.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX421.setEnabled(false);
        labelX432.setText(check1); //confermed working
        labelX432.setForeground(Color.green);
        labelX4817.setText("(OK),");
      }
    });
    labelX433 = new JLabel("If XP2 started, you click [NEXT] button", JLabel.CENTER);
    labelX433.setFont(f20);
    panelX44.add(labelX433);


    //XV1's Start-up Panel
    panelX45= new JPanel();
    panelX45.setLayout(new GridLayout(4, 1, 2, 5));
    panelX450 = new JPanel();
    panelX450.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX45.add(panelX450);
    panelX451 = new JPanel();
    panelX451.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX45.add(panelX451);
    panelX452 = new JPanel();
    panelX452.setLayout(new GridLayout(1, 3, 2, 5)); //record
    panelX45.add(panelX452);
    labelX440 = new JLabel("XV1", JLabel.CENTER);
    labelX440.setBorder(eborder);
    labelX440.setFont(f24);
    panelX450.add(labelX440);
    labelX441 = new JLabel(state1, JLabel.CENTER);
    labelX441.setBorder(eborder);
    labelX441.setFont(f24);
    labelX441.setForeground(Color.blue);
    panelX450.add(labelX441);
    labelX442 = new JLabel(check2, JLabel.CENTER);
    labelX442.setBorder(eborder);
    labelX442.setFont(f24);
    labelX442.setForeground(Color.blue);
    panelX450.add(labelX442);
    labelX443 = new JLabel("Mass of Flow of XV1: ", JLabel.RIGHT);
    labelX443.setFont(f20);
    panelX452.add(labelX443);
    labelX444 = new JLabel("", JLabel.LEFT);
    labelX444.setForeground(Color.blue);
    labelX444.setFont(f20);
    panelX452.add(labelX444);
    buttonX432 = new JButton("Record");
    buttonX432.setFont(f20);
    buttonX432.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX432.setEnabled(false);
        labelX4825.setText("F1: " + f1 + " (kg/s)");
      }
    });
    panelX452.add(buttonX432);
    buttonX430 = new JButton("Start");
    buttonX430.setFont(f20);
    panelX451.add(buttonX430);
    buttonX430.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX430.setEnabled(false);
        labelX441.setText(state2); //chenge to open
        labelX441.setForeground(Color.red);
        labelX444.setText( f1 + " (kg/s)");
        labelX4818.setText("XV1");
      }
    });
    buttonX431 = new JButton("Check");
    buttonX431.setFont(f20);
    panelX451.add(buttonX431);
    buttonX431.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX431.setEnabled(false);
        labelX442.setText(check1); //confermed open
        labelX442.setForeground(Color.green);
        labelX4819.setText("(OK),");
      }
    });
    labelX445 = new JLabel("If XV1 started, you click [NEXT] button", JLabel.CENTER);
    labelX445.setFont(f20);
    panelX45.add(labelX445);


    //XV2's Start-up Panel
    panelX46= new JPanel();
    panelX46.setLayout(new GridLayout(4, 1, 2, 5));
    panelX460 = new JPanel();
    panelX460.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX46.add(panelX460);
    panelX461 = new JPanel();
    panelX461.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX46.add(panelX461);
    panelX462 = new JPanel();
    panelX462.setLayout(new GridLayout(1, 3, 2, 5)); //record
    panelX46.add(panelX462);
    
    labelX450 = new JLabel("XV2", JLabel.CENTER);
    labelX450.setBorder(eborder);
    labelX450.setFont(f24);
    panelX460.add(labelX450);
    labelX451 = new JLabel(state3, JLabel.CENTER);
    labelX451.setBorder(eborder);
    labelX451.setFont(f24);
    labelX451.setForeground(Color.blue);
    panelX460.add(labelX451);
    labelX452 = new JLabel(check2, JLabel.CENTER);
    labelX452.setBorder(eborder);
    labelX452.setFont(f24);
    labelX452.setForeground(Color.blue);
    panelX460.add(labelX452);
    labelX453 = new JLabel("Mass of Flow of XV2: ", JLabel.RIGHT);
    labelX453.setFont(f20);
    panelX462.add(labelX453);
    labelX454 = new JLabel("", JLabel.LEFT);
    labelX454.setForeground(Color.blue);
    labelX454.setFont(f20);
    panelX462.add(labelX454);
    buttonX442 = new JButton("Record");
    buttonX442.setFont(f20);
    buttonX442.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX442.setEnabled(false);
        labelX4826.setText("F2: " + f2 + " (kg/s)");
      }
    });
    panelX462.add(buttonX442);
    buttonX440 = new JButton("Start");
    buttonX440.setFont(f20);
    panelX461.add(buttonX440);
    buttonX440.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX440.setEnabled(false);
        labelX451.setText(state4); //chenge to open
        labelX451.setForeground(Color.red);
        labelX454.setText( f2 + " (kg/s)");
        labelX4820.setText("XV2");
      }
    });
    buttonX441 = new JButton("Check");
    buttonX441.setFont(f20);
    panelX461.add(buttonX441);
    buttonX441.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX441.setEnabled(false);
        labelX452.setText(check1); //confermed open
        labelX452.setForeground(Color.green);
        labelX4821.setText("(OK),");
      }
    });
    labelX455 = new JLabel("If XV2 started, you click [NEXT] button", JLabel.CENTER);
    labelX455.setFont(f20);
    panelX46.add(labelX455);

    
    //Start-up XV3
    panelX47 = new JPanel();
    panelX47.setLayout(new GridLayout(3, 1, 2, 5));
    panelX470 = new JPanel();
    panelX470.setLayout(new GridLayout(1, 3, 2, 5)); //state
    panelX47.add(panelX470);
    panelX471 = new JPanel();
    panelX471.setLayout(new GridLayout(1, 2, 10, 20)); //start and check
    panelX47.add(panelX471);
    labelX460 = new JLabel("XV3", JLabel.CENTER);
    labelX460.setBorder(eborder);
    labelX460.setFont(f24);
    panelX470.add(labelX460);
    labelX461 = new JLabel(state1, JLabel.CENTER);
    labelX461.setBorder(eborder);
    labelX461.setFont(f24);
    labelX461.setForeground(Color.blue);
    panelX470.add(labelX461);
    labelX462 = new JLabel(check2, JLabel.CENTER);
    labelX462.setBorder(eborder);
    labelX462.setFont(f24);
    labelX462.setForeground(Color.blue);
    panelX470.add(labelX462);
    buttonX450 = new JButton("Start");
    buttonX450.setFont(f20);
    panelX471.add(buttonX450);
    buttonX450.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX450.setEnabled(false);
        labelX461.setText(state2); //chenge to open
        labelX461.setForeground(Color.red);
        labelX4822.setText("XV3");
      }
    });
    buttonX451 = new JButton("Check");
    buttonX451.setFont(f20);
    panelX471.add(buttonX451);
    buttonX451.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX451.setEnabled(false);
        labelX462.setText(check1); //confermed open
        labelX462.setForeground(Color.green);
        labelX4823.setText("(OK)");
      }
    });
    labelX463 = new JLabel("If XV3 started, you click [NEXT] button", JLabel.CENTER);
    labelX463.setFont(f20);
    panelX47.add(labelX463);

    //measure Product and Temperature Panel
    panelX48 = new JPanel();
    panelX48.setLayout(new GridLayout(3, 1, 5, 5));
    panelX480 = new JPanel();
    panelX480.setLayout(new GridLayout(2, 4, 2, 2)); //new state
    panelX48.add(panelX480);
    panelX481 = new JPanel();
    panelX481.setLayout(new GridLayout(1, 3, 2, 5)); //measure product
    panelX481.setBorder(eborder);
    panelX48.add(panelX481);
    panelX482 = new JPanel();
    panelX482.setLayout(new GridLayout(1, 3, 2, 5)); //measure temperature
    panelX482.setBorder(eborder);
    panelX48.add(panelX482);
    for(i = 0; i < 5; i++) {
      labelXC[i] = new JLabel(mXChar[i], JLabel.CENTER);
      labelXC[i].setFont(f15);
      labelXC[i].setBorder(eborder);
      panelX480.add(labelXC[i]);
    }
    for(i = 0; i < 5; i++) {
      labelXS[i] = new JLabel(mXState2[i], JLabel.CENTER);
      labelXS[i].setFont(f15);
      labelXS[i].setBorder(eborder);
      labelXS[i].setForeground(Color.red);
      panelX480.add(labelXS[i]);
    }
    labelX470 = new JLabel("Mass flow rate: ", JLabel.RIGHT);
    labelX470.setFont(f20);
    panelX481.add(labelX470);
    labelX471 = new JLabel((f1 + f2) + " (kg/s)", JLabel.LEFT);
    labelX471.setFont(f20);
    labelX471.setForeground(Color.blue);
    panelX481.add(labelX471);
    buttonX460 = new JButton("Record");
    buttonX460.setFont(f20);
    panelX481.add(buttonX460);
    buttonX460.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX460.setEnabled(false);
        labelX4827.setText("Product: " + (f1 + f2) + " (kg/s)");
      }
    });
    labelX472 = new JLabel("Check under 350(K): ", JLabel.RIGHT);
    labelX472.setFont(f20);
    panelX482.add(labelX472);
    labelX473 = new JLabel(temp + " (K)", JLabel.LEFT);
    labelX473.setFont(f20);
    labelX473.setForeground(Color.blue);
    panelX482.add(labelX473);
    buttonX461 = new JButton("Record");
    buttonX461.setFont(f20);
    panelX482.add(buttonX461);
    buttonX461.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        buttonX461.setEnabled(false);
        labelX4828.setText("Temp: " + temp + " (K)");
      }
    });

    //Complete Panel
    panelX49 = new JPanel();
    panelX49.setLayout(new GridLayout(1, 2, 2, 5));
    panelX490 = new JPanel();
    panelX490.setLayout(new GridLayout(3, 2, 2, 5)); //left-side
    panelX490.setBorder(eborder);
    panelX49.add(panelX490);
    panelX491 = new JPanel();
    panelX491.setLayout(new GridLayout(3, 1, 2, 5)); //right-side
    panelX491.setBorder(eborder);
    panelX49.add(panelX491);
    labelX4811 = new JLabel("Execused Operation", JLabel.CENTER);
    labelX4811.setFont(f24);
    panelX491.add(labelX4811);
    panelX492 = new JPanel();
    panelX492.setLayout(new GridLayout(2, 1, 5, 5)); //start and  check
    panelX492.setBorder(eborder);
    panelX491.add(panelX492);
    panelX493 = new JPanel();
    panelX493.setLayout(new GridLayout(2, 1, 5, 10)); //record
    panelX493.setBorder(eborder);
    panelX491.add(panelX493);
    labelX4801 = new JLabel("Machine: ", JLabel.RIGHT);
    labelX4801.setFont(f24);
    panelX490.add(labelX4801);
    labelX4802 = new JLabel("", JLabel.LEFT);
    labelX4802.setFont(f24);
    panelX490.add(labelX4802);
    labelX4803 = new JLabel("Date: ", JLabel.RIGHT);
    labelX4803.setFont(f18);
    panelX490.add(labelX4803);
    String strDate = new SimpleDateFormat("yyMMdd").format(date);
    labelX4804 = new JLabel(strDate, JLabel.LEFT);
    labelX4804.setFont(f18);
    panelX490.add(labelX4804);
    labelX4805 = new JLabel("ID: ", JLabel.RIGHT);
    labelX4805.setFont(f18);
    panelX490.add(labelX4805);
    labelX4806 = new JLabel("", JLabel.LEFT);
    labelX4806.setFont(f18);
    panelX490.add(labelX4806);
    labelX4812 = new JLabel("Start-up(confermed): ", JLabel.LEFT);
    labelX4812.setFont(f18);
    panelX492.add(labelX4812);
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 10);
    panelX494 = new JPanel();
    panelX494.setLayout(fl);
    panelX492.add(panelX494);
    labelX4813 = new JLabel("", JLabel.CENTER); //first-check
    labelX4813.setFont(f15);
    labelX4814 = new JLabel("", JLabel.CENTER); //XP1's working
    labelX4814.setFont(f15);
    labelX4815 = new JLabel("", JLabel.CENTER); //XP1's confermed
    labelX4815.setFont(f15);
    labelX4816 = new JLabel("", JLabel.CENTER); //XP2's working
    labelX4816.setFont(f15);
    labelX4817 = new JLabel("", JLabel.CENTER); //XP2's confermed
    labelX4817.setFont(f15);
    labelX4818 = new JLabel("", JLabel.CENTER); //XV1's open
    labelX4818.setFont(f15);
    labelX4819 = new JLabel("", JLabel.CENTER); //XV1's confermed
    labelX4819.setFont(f15);
    labelX4820 = new JLabel("", JLabel.CENTER); //XV2's open
    labelX4820.setFont(f15);
    labelX4821 = new JLabel("", JLabel.CENTER); //XV2's confermed
    labelX4821.setFont(f15);
    labelX4822 = new JLabel("", JLabel.CENTER); //XV3's open
    labelX4822.setFont(f15);
    labelX4823 = new JLabel("", JLabel.CENTER); //XV3's confermed
    labelX4823.setFont(f15);
    panelX494.add(labelX4813);
    panelX494.add(labelX4814);
    panelX494.add(labelX4815);
    panelX494.add(labelX4816);
    panelX494.add(labelX4817);
    panelX494.add(labelX4818);
    panelX494.add(labelX4819);
    panelX494.add(labelX4820);
    panelX494.add(labelX4821);
    panelX494.add(labelX4822);
    panelX494.add(labelX4823);
    labelX4824 = new JLabel("Record: ", JLabel.LEFT);
    labelX4824.setFont(f18);
    panelX493.add(labelX4824);
    panelX495 = new JPanel();
    panelX495.setLayout(fl);
    panelX493.add(panelX495);
    labelX4825 = new JLabel("", JLabel.CENTER);
    labelX4825.setFont(f15);
    labelX4826 = new JLabel("", JLabel.CENTER);
    labelX4826.setFont(f15);
    labelX4827 = new JLabel("", JLabel.CENTER);
    labelX4827.setFont(f15);
    labelX4828 = new JLabel("", JLabel.CENTER);
    labelX4828.setFont(f15);
    panelX495.add(labelX4825);
    panelX495.add(labelX4826);
    panelX495.add(labelX4827);
    panelX495.add(labelX4828);

    //CardPanel setting
    cardPanel = new JPanel();
    cardPanel.setLayout(new CardLayout());
    cardPanel.add("first", machineXPanel);
    cardPanel.add("XP1", panelX43);
    cardPanel.add("XP2", panelX44);
    cardPanel.add("XV1", panelX45);
    cardPanel.add("XV2", panelX46);
    cardPanel.add("XV3", panelX47);
    cardPanel.add("Check", panelX48);
    cardPanel.add("Complete", panelX49);

    container.add("South", mainPanel);
    container.add("Center", cardPanel);


    this.setLocation(200,100);
    this.setSize(640, 480);
    this.setVisible(true);

  }

  public static void main(String[] args){
    MachineX frame = new MachineX("Manual for machine X in 2019");
  }
}