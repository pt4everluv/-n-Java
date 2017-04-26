/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WINDOWS;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.lang.*;
import UI.JTextFieldHintUI;
import javax.swing.event.ChangeEvent;


/**
 *
 * @author DOVNTI
 */
public class WIN_HOME extends javax.swing.JFrame{
    
    /* */
    private javax.swing.JPanel JP_TITLE_BAR,
                               JP_MAIN_BEGIN, 
                               JP_MAIN_SIGN, JP_MAIN_SIGN_NUM1, JP_MAIN_SIGN_NUM2, JP_MAIN_SIGN_NUM3, 
                               JP_MAIN_MANAGER ;
    private javax.swing.JButton JB_TITLE_BAR_CLOSE, JB_TITLE_BAR_MAXIMIZE, JB_TITLE_BAR_MINIMIZE, JB_TITLE_BAR_BACK;
    private javax.swing.JLabel JL_TITLE_NAMEAPP,
                               JL_MAIN_BEGIN_NAMEAPP, JL_MAIN_BEGIN_FP,
                               JL_MAIN_SIGN_NUM1_SIGNIN, JL_MAIN_SIGN_NUM1_AVATAR, JL_MAIN_SIGN_NUM1_NEXT, JL_MAIN_SIGN_NUM1_CREATEACC, JL_MAIN_SIGN_NUM1_FINDACC,
                               JL_MAIN_SIGN_NUM2_AVATAR, JL_MAIN_SIGN_NUM2_USER, JL_MAIN_SIGN_NUM2_SIGNIN, JL_MAIN_SIGN_NUM2_FORGOTPASS, JL_MAIN_SIGN_NUM2_SIGNOTHER,
                               JL_MAIN_SIGN_NUM3_SIGNUP, JL_MAIN_SIGN_NUM3_BIRTHDAY, JL_MAIN_SIGN_NUM3_RULES, JL_MAIN_SIGN_NUM3_CREATEACC,
                               JL_STATUS;
    private javax.swing.JTextField JTF_MAIN_SIGN_NUM1_USER,
                                   JTF_MAIN_SIGN_NUM3_FIRSTNAME, JTF_MAIN_SIGN_NUM3_SURNAME, JTF_MAIN_SIGN_NUM3_USER;
    private javax.swing.JComboBox JCB_MAIN_SIGN_NUM3_DAY, JCB_MAIN_SIGN_NUM3_MONTH, JCB_MAIN_SIGN_NUM3_YEAR;
    private javax.swing.JRadioButton JRB_MAIN_SIGN_NUM3_FEMALE, JRB_MAIN_SIGN_NUM3_MALE;
    private javax.swing.JPasswordField JPF_MAIN_BEGIN_PIN,
                                       JPF_JP_MAIN_SIGN_NUM2_PASS,
                                       JPF_JP_MAIN_SIGN_NUM3_PASS;
    
    static Point MORE_POINTOLD;
    static int CNT = 0;
    
    /*  */
    public WIN_HOME()
    {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
         catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WIN_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WIN_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WIN_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WIN_HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents()
    {
        JP_TITLE_BAR = new javax.swing.JPanel();
        JP_MAIN_BEGIN = new javax.swing.JPanel();
        JP_MAIN_SIGN = new javax.swing.JPanel();
        JP_MAIN_SIGN_NUM1 = new javax.swing.JPanel();
        JP_MAIN_SIGN_NUM2 = new javax.swing.JPanel();
        JP_MAIN_SIGN_NUM3 = new javax.swing.JPanel();
        JP_MAIN_MANAGER = new javax.swing.JPanel();
        
        JB_TITLE_BAR_CLOSE = new javax.swing.JButton();
        JB_TITLE_BAR_MAXIMIZE = new javax.swing.JButton();
        JB_TITLE_BAR_MINIMIZE = new javax.swing.JButton();
        JB_TITLE_BAR_BACK = new javax.swing.JButton();
        
        JL_TITLE_NAMEAPP = new javax.swing.JLabel();
        JL_MAIN_BEGIN_NAMEAPP = new javax.swing.JLabel();
        JL_MAIN_BEGIN_FP = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM1_SIGNIN = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM1_AVATAR = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM1_NEXT = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM1_CREATEACC = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM1_FINDACC = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM2_AVATAR = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM2_USER = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM2_SIGNIN = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM2_FORGOTPASS = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM2_SIGNOTHER = new javax.swing.JLabel();
        JL_MAIN_SIGN_NUM3_SIGNUP = new javax.swing.JLabel(); 
        JL_MAIN_SIGN_NUM3_BIRTHDAY = new javax.swing.JLabel(); 
        JL_MAIN_SIGN_NUM3_RULES = new javax.swing.JLabel(); 
        JL_MAIN_SIGN_NUM3_CREATEACC = new javax.swing.JLabel();
        JL_STATUS = new javax.swing.JLabel();
        
        JTF_MAIN_SIGN_NUM1_USER = new javax.swing.JTextField();
        JTF_MAIN_SIGN_NUM3_FIRSTNAME = new javax.swing.JTextField();
        JTF_MAIN_SIGN_NUM3_SURNAME = new javax.swing.JTextField();
        JTF_MAIN_SIGN_NUM3_USER = new javax.swing.JTextField();
        
        JCB_MAIN_SIGN_NUM3_DAY = new javax.swing.JComboBox<>();
        JCB_MAIN_SIGN_NUM3_MONTH = new javax.swing.JComboBox<>();
        JCB_MAIN_SIGN_NUM3_YEAR = new javax.swing.JComboBox<>();
        
        JRB_MAIN_SIGN_NUM3_FEMALE = new javax.swing.JRadioButton();
        JRB_MAIN_SIGN_NUM3_MALE = new javax.swing.JRadioButton();
                
        JPF_MAIN_BEGIN_PIN = new javax.swing.JPasswordField();
        JPF_JP_MAIN_SIGN_NUM2_PASS = new javax.swing.JPasswordField();
        JPF_JP_MAIN_SIGN_NUM3_PASS = new javax.swing.JPasswordField();
                
        /*JFrame----------------------------------------------------------------*/
        setUndecorated(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        setLocation(300, 50);
        setMinimumSize(new java.awt.Dimension(350, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                JF_windowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                JF_windowDeactivated(evt);
            }
        });
        
        /*JP_TITLE_BAR----------------------------------------------------------*/
        JP_TITLE_BAR.setBackground(new java.awt.Color(255, 255, 255));
        JP_TITLE_BAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(evt.getClickCount()==2)
                {
                    JP_TITLE_BAR_mouseClicked(evt);
                }
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JP_TITLE_BAR_mousePressed(evt);
            } 
        });
        JP_TITLE_BAR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JP_TITLE_BAR_mouseDragged(evt);
            }
        });
        
        /*JP_MAIN_BEGIN---------------------------------------------------------*/
        JP_MAIN_BEGIN.setVisible(false);
        JP_MAIN_BEGIN.setBackground(new java.awt.Color(102, 204, 255));
        
        
        /*JP_MAIN_SIGN----------------------------------------------------------*/
        JP_MAIN_SIGN.setVisible(false);
        JP_MAIN_SIGN.setBackground(new java.awt.Color(255, 255, 255));
        
        /*JP_MAIN_SIGN_NUM1-----------------------------------------------------*/
        JP_MAIN_SIGN_NUM1.setVisible(false);
        JP_MAIN_SIGN_NUM1.setBackground(new java.awt.Color(217, 217, 255));
        
        
        /*JP_MAIN_SIGN_NUM2-----------------------------------------------------*/
        JP_MAIN_SIGN_NUM2.setVisible(false);
        JP_MAIN_SIGN_NUM2.setBackground(new java.awt.Color(217, 217, 255));
        
        
        /*JP_MAIN_SIGN_NUM3-----------------------------------------------------*/
        JP_MAIN_SIGN_NUM3.setVisible(false);
        JP_MAIN_SIGN_NUM3.setBackground(new java.awt.Color(217, 255, 217));
        
        /*JP_MAIN_MANAGER*/
        JP_MAIN_MANAGER.setVisible(false);
        JP_MAIN_MANAGER.setBackground(new java.awt.Color(0, 204, 255));
        
        /*JB_TITLE_BAR_CLOSE----------------------------------------------------*/
        JB_TITLE_BAR_CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/CLOSE2.png")));
        JB_TITLE_BAR_CLOSE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/CLOSE1.png")));
        JB_TITLE_BAR_CLOSE.setContentAreaFilled(false);
        JB_TITLE_BAR_CLOSE.setBorder(null);
        JB_TITLE_BAR_CLOSE.setFocusable(false);
        JB_TITLE_BAR_CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_TITLE_BAR_CLOSE_mouseClicked(evt);
            }
        });

        /*JB_TITLE_BAR_MAXIMIZE-------------------------------------------------*/
        JB_TITLE_BAR_MAXIMIZE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/MAXIMIZE2.png")));
        JB_TITLE_BAR_MAXIMIZE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/MAXIMIZE1.png")));
        JB_TITLE_BAR_MAXIMIZE.setContentAreaFilled(false);
        JB_TITLE_BAR_MAXIMIZE.setBorder(null);
        JB_TITLE_BAR_MAXIMIZE.setFocusable(false);
        JB_TITLE_BAR_MAXIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_TITLE_BAR_MAXIMIZE_mouseClicked(evt);
            }
        });
        
        /*JB_TITLE_BAR_MINIMIZE-------------------------------------------------*/
        JB_TITLE_BAR_MINIMIZE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/MINIMIZE2.png")));
        JB_TITLE_BAR_MINIMIZE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/MINIMIZE1.png")));
        JB_TITLE_BAR_MINIMIZE.setContentAreaFilled(false);
        JB_TITLE_BAR_MINIMIZE.setBorder(null);
        JB_TITLE_BAR_MINIMIZE.setFocusable(false);
        JB_TITLE_BAR_MINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_TITLE_BAR_MINIMIZE_mouseClicked(evt);
            }
        });
        
        /*JB_TITLE_BAR_BACK-----------------------------------------------------*/
        JB_TITLE_BAR_BACK.setVisible(true);
        JB_TITLE_BAR_BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/BACK1.png")));
        JB_TITLE_BAR_BACK.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/BACK2.png")));
        JB_TITLE_BAR_BACK.setContentAreaFilled(false);
        JB_TITLE_BAR_BACK.setBorder(null);
        JB_TITLE_BAR_BACK.setFocusable(false);
        JB_TITLE_BAR_BACK.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_TITLE_BAR_BACK_mouseClicked(evt);
            }
        });
        
        /*JL_TITLE_NAMEAPP------------------------------------------------------*/
        JL_TITLE_NAMEAPP.setText("Universe");
        JL_TITLE_NAMEAPP.setFont(new java.awt.Font("Segoe UI Light", 0, 16));
        JL_TITLE_NAMEAPP.setHorizontalAlignment(SwingConstants.CENTER);
        JL_TITLE_NAMEAPP.setVerticalAlignment(SwingConstants.CENTER);
        
        /*JL_MAIN_BEGIN_NAMEAPP-------------------------------------------------*/
        JL_MAIN_BEGIN_NAMEAPP.setVisible(true);
        JL_MAIN_BEGIN_NAMEAPP.setText("NIVERSE");
        JL_MAIN_BEGIN_NAMEAPP.setFont(new java.awt.Font("Segoe UI Light", 0, 25));
        JL_MAIN_BEGIN_NAMEAPP.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_BEGIN_NAMEAPP.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_BEGIN_NAMEAPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/LOGO_203x203.png")));

        
        /*JL_MAIN_BEGIN_FP------------------------------------------------------*/
        JL_MAIN_BEGIN_FP.setVisible(true);
        JL_MAIN_BEGIN_FP.setText("Forgot PIN?");
        JL_MAIN_BEGIN_FP.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JL_MAIN_BEGIN_FP.setForeground(new java.awt.Color(217, 217, 217));
        JL_MAIN_BEGIN_FP.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_BEGIN_FP.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_BEGIN_FP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JL_MAIN_BEGIN_FP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_BEGIN_FP.setForeground(new java.awt.Color(0, 0, 0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_BEGIN_FP.setForeground(new java.awt.Color(217, 217, 217));
            }
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                System.out.print("ok");
            }
        });
        
        /*JL_MAIN_SIGN_NUM1_SIGN------------------------------------------------*/
        JL_MAIN_SIGN_NUM1_SIGNIN.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_SIGNIN.setText("<html>SIGN IN<br>Using your email or mobile phone</html>");
        JL_MAIN_SIGN_NUM1_SIGNIN.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JL_MAIN_SIGN_NUM1_SIGNIN.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_SIGNIN.setVerticalAlignment(SwingConstants.CENTER);
        /*JL_MAIN_SIGN_NUM1_AVATAR----------------------------------------------*/
        JL_MAIN_SIGN_NUM1_AVATAR.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_AVATAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/USER_100x100.png"))); 
        /*JL_MAIN_SIGN_NUM1_NEXT------------------------------------------------*/
        JL_MAIN_SIGN_NUM1_NEXT.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_NEXT.setText("NEXT");
        JL_MAIN_SIGN_NUM1_NEXT.setFont(new java.awt.Font("Segoe UI", 0, 20));
        JL_MAIN_SIGN_NUM1_NEXT.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_NEXT.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_NEXT.setPreferredSize(new Dimension(294, 30));
        JL_MAIN_SIGN_NUM1_NEXT.setBackground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM1_NEXT.setForeground(new java.awt.Color(255,255,255));
        JL_MAIN_SIGN_NUM1_NEXT.setOpaque(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_NEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_NEXT.setBackground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_NEXT.setBackground(new java.awt.Color(0, 128, 221));
            }
        });
        /*JL_MAIN_SIGN_NUM1_FINDACC---------------------------------------------*/
        JL_MAIN_SIGN_NUM1_FINDACC.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_FINDACC.setText("Find my account");
        JL_MAIN_SIGN_NUM1_FINDACC.setFont(new java.awt.Font("Segoe UI", 0, 15));
        JL_MAIN_SIGN_NUM1_FINDACC.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_FINDACC.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_FINDACC.setForeground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM1_FINDACC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JL_MAIN_SIGN_NUM1_FINDACC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_FINDACC.setForeground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_FINDACC.setForeground(new java.awt.Color(0, 128, 221));
            }
        });
        /*JL_MAIN_SIGN_NUM1_CREATEACC-------------------------------------------*/
        JL_MAIN_SIGN_NUM1_CREATEACC.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM1_CREATEACC.setText("Create account");
        JL_MAIN_SIGN_NUM1_CREATEACC.setFont(new java.awt.Font("Segoe UI", 0, 15));
        JL_MAIN_SIGN_NUM1_CREATEACC.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_CREATEACC.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM1_CREATEACC.setForeground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM1_CREATEACC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JL_MAIN_SIGN_NUM1_CREATEACC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_CREATEACC.setForeground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM1_CREATEACC.setForeground(new java.awt.Color(0, 128, 221));
            }
        });
        
        /*JL_MAIN_SIGN_NUM2_AVATAR----------------------------------------------*/
        JL_MAIN_SIGN_NUM2_AVATAR.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_AVATAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/USER_100x100.png"))); 
        /*JL_MAIN_SIGN_NUM2_USER------------------------------------------------*/
        JL_MAIN_SIGN_NUM2_USER.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_USER.setText("xxxxxxx@gmail.com");
        JL_MAIN_SIGN_NUM2_USER.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JL_MAIN_SIGN_NUM2_USER.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_USER.setVerticalAlignment(SwingConstants.CENTER);
        /*JL_MAIN_SIGN_NUM2_SIGNIN----------------------------------------------*/
        JL_MAIN_SIGN_NUM2_SIGNIN.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_SIGNIN.setText("Sign in");
        JL_MAIN_SIGN_NUM2_SIGNIN.setFont(new java.awt.Font("Segoe UI", 0, 20));
        JL_MAIN_SIGN_NUM2_SIGNIN.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_SIGNIN.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_SIGNIN.setPreferredSize(new Dimension(294, 30));
        JL_MAIN_SIGN_NUM2_SIGNIN.setBackground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM2_SIGNIN.setForeground(new java.awt.Color(255,255,255));
        JL_MAIN_SIGN_NUM2_SIGNIN.setOpaque(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_SIGNIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_SIGNIN.setBackground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_SIGNIN.setBackground(new java.awt.Color(0, 128, 221));
            }
        });
        /*JL_MAIN_SIGN_NUM2_FORGOTPASS------------------------------------------*/
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setText("Forgot password");
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setFont(new java.awt.Font("Segoe UI", 0, 15));
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setForeground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM2_FORGOTPASS.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JL_MAIN_SIGN_NUM2_FORGOTPASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_FORGOTPASS.setForeground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_FORGOTPASS.setForeground(new java.awt.Color(0, 128, 221));
            }
        });
        /*JL_MAIN_SIGN_NUM2_SIGNOTHER-------------------------------------------*/
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setText("Sign in with differen account");
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setFont(new java.awt.Font("Segoe UI", 0, 15));
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setForeground(new java.awt.Color(0, 128, 221));
        JL_MAIN_SIGN_NUM2_SIGNOTHER.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JL_MAIN_SIGN_NUM2_SIGNOTHER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_SIGNOTHER.setForeground(new java.awt.Color(0, 77, 153));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM2_SIGNOTHER.setForeground(new java.awt.Color(0, 128, 221));
            }
        });
        
        /*JL_MAIN_SIGN_NUM3_SIGNUP----------------------------------------------*/
        JL_MAIN_SIGN_NUM3_SIGNUP.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM3_SIGNUP.setText("<html>Create your Universe Account</html>");
        JL_MAIN_SIGN_NUM3_SIGNUP.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JL_MAIN_SIGN_NUM3_SIGNUP.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM3_SIGNUP.setVerticalAlignment(SwingConstants.CENTER);
        /*JL_MAIN_SIGN_NUM3_BIRTHDAY--------------------------------------------*/
        JL_MAIN_SIGN_NUM3_BIRTHDAY.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM3_BIRTHDAY.setText("Birthday");
        JL_MAIN_SIGN_NUM3_BIRTHDAY.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        JL_MAIN_SIGN_NUM3_BIRTHDAY.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM3_BIRTHDAY.setVerticalAlignment(SwingConstants.CENTER);
        /*JL_MAIN_SIGN_NUM3_RULES-----------------------------------------------*/
        JL_MAIN_SIGN_NUM3_RULES.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM3_RULES.setText("<html>By clicking Create an account, you agree to our Terms and<br> confirm that you have read our Data Policy,<br> including our Cookie Use Policy<html>");
        JL_MAIN_SIGN_NUM3_RULES.setFont(new java.awt.Font("Segoe UI Light", 0, 12));
        JL_MAIN_SIGN_NUM3_RULES.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM3_RULES.setVerticalAlignment(SwingConstants.CENTER);
        /*JL_MAIN_SIGN_NUM3_CREATEACC-------------------------------------------*/
        JL_MAIN_SIGN_NUM3_CREATEACC.setVisible(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM3_CREATEACC.setText("Create an account");
        JL_MAIN_SIGN_NUM3_CREATEACC.setFont(new java.awt.Font("Segoe UI", 0, 20));
        JL_MAIN_SIGN_NUM3_CREATEACC.setHorizontalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM3_CREATEACC.setVerticalAlignment(SwingConstants.CENTER);
        JL_MAIN_SIGN_NUM3_CREATEACC.setPreferredSize(new Dimension(294, 30));
        JL_MAIN_SIGN_NUM3_CREATEACC.setBackground(new java.awt.Color(96, 157, 77));
        JL_MAIN_SIGN_NUM3_CREATEACC.setForeground(new java.awt.Color(255,255,255));
        JL_MAIN_SIGN_NUM3_CREATEACC.setOpaque(rootPaneCheckingEnabled);
        JL_MAIN_SIGN_NUM3_CREATEACC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM3_CREATEACC.setBackground(new java.awt.Color(96, 180, 77));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JL_MAIN_SIGN_NUM3_CREATEACC.setBackground(new java.awt.Color(96, 157, 77));
            }
        });
        
        JL_STATUS.setText("No Internet Connection");
        JL_STATUS.setBackground(new java.awt.Color(255, 0, 0));
        JL_STATUS.setForeground(new java.awt.Color(255, 255, 255));
        /*JL_STATUS-----------------------------------------------------*/
        JL_STATUS.setVisible(true);
        JL_STATUS.setHorizontalAlignment(SwingConstants.CENTER);
        JL_STATUS.setVerticalAlignment(SwingConstants.CENTER);
        JL_STATUS.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
        JL_STATUS.setOpaque(rootPaneCheckingEnabled);
        
        /*JTF_MAIN_SIGN_NUM1_USER-----------------------------------------------*/
        JTF_MAIN_SIGN_NUM1_USER.setVisible(rootPaneCheckingEnabled);
        JTF_MAIN_SIGN_NUM1_USER.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JTF_MAIN_SIGN_NUM1_USER.setColumns(18);
        JTF_MAIN_SIGN_NUM1_USER.setUI(new JTextFieldHintUI("Email or phone", new java.awt.Color(140, 140, 140)));
        
        /*JTF_MAIN_SIGN_NUM3_FIRSTNAME------------------------------------------*/
        JTF_MAIN_SIGN_NUM3_FIRSTNAME.setVisible(rootPaneCheckingEnabled);
        JTF_MAIN_SIGN_NUM3_FIRSTNAME.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JTF_MAIN_SIGN_NUM3_FIRSTNAME.setColumns(8);
        JTF_MAIN_SIGN_NUM3_FIRSTNAME.setUI(new JTextFieldHintUI("First name", new java.awt.Color(140, 140, 140)));
        /*JTF_MAIN_SIGN_NUM3_SURNAME--------------------------------------------*/
        JTF_MAIN_SIGN_NUM3_SURNAME.setVisible(rootPaneCheckingEnabled);
        JTF_MAIN_SIGN_NUM3_SURNAME.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JTF_MAIN_SIGN_NUM3_SURNAME.setColumns(9);
        JTF_MAIN_SIGN_NUM3_SURNAME.setUI(new JTextFieldHintUI("Surname", new java.awt.Color(140, 140, 140)));
        /*JTF_MAIN_SIGN_NUM3_USER-----------------------------------------------*/
        JTF_MAIN_SIGN_NUM3_USER.setVisible(rootPaneCheckingEnabled);
        JTF_MAIN_SIGN_NUM3_USER.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JTF_MAIN_SIGN_NUM3_USER.setColumns(18);
        JTF_MAIN_SIGN_NUM3_USER.setUI(new JTextFieldHintUI("Email address or mobile number", new java.awt.Color(140, 140, 140)));
        
        /*JCB_MAIN_SIGN_NUM3_DAY------------------------------------------------*/
        JCB_MAIN_SIGN_NUM3_DAY.setVisible(rootPaneCheckingEnabled);
        JCB_MAIN_SIGN_NUM3_DAY.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        JCB_MAIN_SIGN_NUM3_DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Item 2", "Item 3", "Item 4" }));
        JCB_MAIN_SIGN_NUM3_DAY.setMaximumRowCount(10);
        /*JCB_MAIN_SIGN_NUM3_MONTH----------------------------------------------*/
        JCB_MAIN_SIGN_NUM3_MONTH.setVisible(rootPaneCheckingEnabled);
        JCB_MAIN_SIGN_NUM3_MONTH.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        JCB_MAIN_SIGN_NUM3_MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Item 2", "Item 3", "Item 4" }));
        JCB_MAIN_SIGN_NUM3_MONTH.setMaximumRowCount(12);
        /*JCB_MAIN_SIGN_NUM3_YEAR-----------------------------------------------*/
        JCB_MAIN_SIGN_NUM3_YEAR.setVisible(rootPaneCheckingEnabled);
        JCB_MAIN_SIGN_NUM3_YEAR.setFont(new java.awt.Font("Segoe UI Light", 0, 15));
        JCB_MAIN_SIGN_NUM3_YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "Item 2", "Item 3", "Item 4" }));
        JCB_MAIN_SIGN_NUM3_YEAR.setMaximumRowCount(10);
        
        /*JRB_MAIN_SIGN_NUM3_FEMALE*/
        JRB_MAIN_SIGN_NUM3_FEMALE.setVisible(rootPaneCheckingEnabled);
        JRB_MAIN_SIGN_NUM3_FEMALE.setText("Female");
        JRB_MAIN_SIGN_NUM3_FEMALE.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JRB_MAIN_SIGN_NUM3_FEMALE.setOpaque(false);
        JRB_MAIN_SIGN_NUM3_FEMALE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JRB_MAIN_SIGN_NUM3_FEMALE.setSelected(true);
                JRB_MAIN_SIGN_NUM3_MALE.setSelected(false);
            }
        });
        /*JRB_MAIN_SIGN_NUM3_MALE*/
        JRB_MAIN_SIGN_NUM3_MALE.setVisible(rootPaneCheckingEnabled);
        JRB_MAIN_SIGN_NUM3_MALE.setText("Male");
        JRB_MAIN_SIGN_NUM3_MALE.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JRB_MAIN_SIGN_NUM3_MALE.setOpaque(false);
        JRB_MAIN_SIGN_NUM3_MALE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                JRB_MAIN_SIGN_NUM3_MALE.setSelected(true);
                JRB_MAIN_SIGN_NUM3_FEMALE.setSelected(false);
            }
        });
        
        /*JPF_MAIN_BEGIN_PIN----------------------------------------------------*/
        JPF_MAIN_BEGIN_PIN.setVisible(true);
        JPF_MAIN_BEGIN_PIN.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JPF_MAIN_BEGIN_PIN.setEchoChar((char)0);
        JPF_MAIN_BEGIN_PIN.setText("PIN"); 
        JPF_MAIN_BEGIN_PIN.setEditable(false);
        JPF_MAIN_BEGIN_PIN.setColumns(18);
        JPF_MAIN_BEGIN_PIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(JPF_MAIN_BEGIN_PIN.getEchoChar()==(char)0)
                {
                    JPF_MAIN_BEGIN_PIN.setEchoChar('\u25CF');
                    JPF_MAIN_BEGIN_PIN.setText("");
                    JPF_MAIN_BEGIN_PIN.setEditable(true);
                }
                if(((':' <= evt.getKeyChar()) && (evt.getKeyChar() <= '~')) 
                || ((' ' <= evt.getKeyChar()) && (evt.getKeyChar() <= '/')))
                {
                    try
                    {
                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_BACKSPACE);
                        
                    }catch (AWTException e ) 
                    {
                        e.printStackTrace();
                    }
                }
            }
            public void keyReleased (java.awt.event.KeyEvent evt) {    
                if(JPF_MAIN_BEGIN_PIN.getPassword().length == 0)
                {
                    JPF_MAIN_BEGIN_PIN.setEchoChar((char)0);
                    JPF_MAIN_BEGIN_PIN.setText("PIN");
                    JPF_MAIN_BEGIN_PIN.setEditable(false);
                }
                if(JPF_MAIN_BEGIN_PIN.getPassword().length >= 4)
                {
                    JPF_MAIN_BEGIN_PIN.setEchoChar((char)0);
                    JPF_MAIN_BEGIN_PIN.setText("**WAIT**");
                    JPF_MAIN_BEGIN_PIN.setEditable(false);
                }
            }
        });
        
        /*JPF_JP_MAIN_SIGN_NUM2_PASS--------------------------------------------*/
        JPF_JP_MAIN_SIGN_NUM2_PASS.setVisible(true);
        JPF_JP_MAIN_SIGN_NUM2_PASS.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JPF_JP_MAIN_SIGN_NUM2_PASS.setEchoChar((char)0);
        JPF_JP_MAIN_SIGN_NUM2_PASS.setText("Password"); 
        JPF_JP_MAIN_SIGN_NUM2_PASS.setColumns(18);
        JPF_JP_MAIN_SIGN_NUM2_PASS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(JPF_JP_MAIN_SIGN_NUM2_PASS.getEchoChar()==(char)0)
                {
                    JPF_JP_MAIN_SIGN_NUM2_PASS.setEchoChar('\u25CF');
                    JPF_JP_MAIN_SIGN_NUM2_PASS.setText("");
                }
            }
            public void keyReleased (java.awt.event.KeyEvent evt) {    
                if(JPF_JP_MAIN_SIGN_NUM2_PASS.getPassword().length == 0)
                {
                    JPF_JP_MAIN_SIGN_NUM2_PASS.setEchoChar((char)0);
                    JPF_JP_MAIN_SIGN_NUM2_PASS.setText("Password");
                }
            }
        });
        
        /*JPF_JP_MAIN_SIGN_NUM3_PASS--------------------------------------------*/
        JPF_JP_MAIN_SIGN_NUM3_PASS.setVisible(true);
        JPF_JP_MAIN_SIGN_NUM3_PASS.setFont(new java.awt.Font("Segoe UI Light", 0, 20));
        JPF_JP_MAIN_SIGN_NUM3_PASS.setEchoChar((char)0);
        JPF_JP_MAIN_SIGN_NUM3_PASS.setText("New password"); 
        JPF_JP_MAIN_SIGN_NUM3_PASS.setColumns(18);
        JPF_JP_MAIN_SIGN_NUM3_PASS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(JPF_JP_MAIN_SIGN_NUM3_PASS.getEchoChar()==(char)0)
                {
                    JPF_JP_MAIN_SIGN_NUM3_PASS.setEchoChar('\u25CF');
                    JPF_JP_MAIN_SIGN_NUM3_PASS.setText("");
                }
            }
            public void keyReleased (java.awt.event.KeyEvent evt) {    
                if(JPF_JP_MAIN_SIGN_NUM3_PASS.getPassword().length == 0)
                {
                    JPF_JP_MAIN_SIGN_NUM3_PASS.setEchoChar((char)0);
                    JPF_JP_MAIN_SIGN_NUM3_PASS.setText("New password");
                }
            }
        });
        
/*LAYOUT*/
        /*JF_WIN_HOME_LAYOUT----------------------------------------------------*/
        javax.swing.GroupLayout JF_WIN_HOME_LAYOUT = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(JF_WIN_HOME_LAYOUT);
        JF_WIN_HOME_LAYOUT.setHorizontalGroup(
            JF_WIN_HOME_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_TITLE_BAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_MAIN_BEGIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JL_STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_MAIN_SIGN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP_MAIN_MANAGER, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JF_WIN_HOME_LAYOUT.setVerticalGroup(
            JF_WIN_HOME_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_WIN_HOME_LAYOUT.createSequentialGroup()
                .addComponent(JP_TITLE_BAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JF_WIN_HOME_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_MAIN_BEGIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)                 
                    .addGroup(JF_WIN_HOME_LAYOUT.createSequentialGroup()    
                        .addComponent(JL_STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)                    
                        .addGroup(JF_WIN_HOME_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JP_MAIN_SIGN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JP_MAIN_MANAGER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
                    )
                )
            )
        );
        
        /*JP_TITLE_BAR_LAYOUT---------------------------------------------------*/
        javax.swing.GroupLayout JP_TITLE_BAR_LAYOUT = new javax.swing.GroupLayout(JP_TITLE_BAR);
        JP_TITLE_BAR.setLayout(JP_TITLE_BAR_LAYOUT);
        JP_TITLE_BAR_LAYOUT.setHorizontalGroup(
            JP_TITLE_BAR_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_TITLE_BAR_LAYOUT.createSequentialGroup()
                .addComponent(JB_TITLE_BAR_BACK)
                .addGap(10)
                .addComponent(JL_TITLE_NAMEAPP)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_TITLE_BAR_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JB_TITLE_BAR_MINIMIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_TITLE_BAR_MAXIMIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_TITLE_BAR_CLOSE)
                .addGap(5)
            )
        );
        JP_TITLE_BAR_LAYOUT.setVerticalGroup(
            JP_TITLE_BAR_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_TITLE_BAR_LAYOUT.createSequentialGroup()
                .addGroup(JP_TITLE_BAR_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_TITLE_BAR_BACK)
                    .addComponent(JL_TITLE_NAMEAPP)
                )
            )
            .addGroup(JP_TITLE_BAR_LAYOUT.createSequentialGroup()
                .addGap(4)
                .addGroup(JP_TITLE_BAR_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_TITLE_BAR_MINIMIZE)
                    .addComponent(JB_TITLE_BAR_MAXIMIZE)
                    .addComponent(JB_TITLE_BAR_CLOSE) 
                )
                .addGap(6)
            )
        );
        
        /*JP_MAIN_BEGIN_LAYOUT--------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_BEGIN_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_BEGIN);
        JP_MAIN_BEGIN.setLayout(JP_MAIN_BEGIN_LAYOUT);
        JP_MAIN_BEGIN_LAYOUT.setHorizontalGroup(
            JP_MAIN_BEGIN_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_BEGIN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_BEGIN_NAMEAPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_BEGIN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JPF_MAIN_BEGIN_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_BEGIN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_BEGIN_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )    
        );
        JP_MAIN_BEGIN_LAYOUT.setVerticalGroup(
            JP_MAIN_BEGIN_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_BEGIN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_BEGIN_NAMEAPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPF_MAIN_BEGIN_PIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_BEGIN_FP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );
        
        /*JP_MAIN_SIGN_LAYOUT---------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_SIGN_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_SIGN);
        JP_MAIN_SIGN.setLayout(JP_MAIN_SIGN_LAYOUT);
        JP_MAIN_SIGN_LAYOUT.setHorizontalGroup(
            JP_MAIN_SIGN_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )   
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )                    
        );
        JP_MAIN_SIGN_LAYOUT.setVerticalGroup(
            JP_MAIN_SIGN_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )       
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            ) 
            .addGroup(JP_MAIN_SIGN_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JP_MAIN_SIGN_NUM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )                
        );
        
        /*JP_MAIN_SIGN_NUM1_LAYOUT---------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_SIGN_NUM1_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_SIGN_NUM1);
        JP_MAIN_SIGN_NUM1.setLayout(JP_MAIN_SIGN_NUM1_LAYOUT);
        JP_MAIN_SIGN_NUM1_LAYOUT.setHorizontalGroup(
            JP_MAIN_SIGN_NUM1_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_SIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_AVATAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JTF_MAIN_SIGN_NUM1_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )        
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_NEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_FINDACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_CREATEACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );
        JP_MAIN_SIGN_NUM1_LAYOUT.setVerticalGroup(
            JP_MAIN_SIGN_NUM1_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(JP_MAIN_SIGN_NUM1_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM1_SIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM1_AVATAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(JTF_MAIN_SIGN_NUM1_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM1_NEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM1_FINDACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(JL_MAIN_SIGN_NUM1_CREATEACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
           )
        );
        /*JP_MAIN_SIGN_NUM2_LAYOUT---------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_SIGN_NUM2_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_SIGN_NUM2);
        JP_MAIN_SIGN_NUM2.setLayout(JP_MAIN_SIGN_NUM2_LAYOUT);
        JP_MAIN_SIGN_NUM2_LAYOUT.setHorizontalGroup(
            JP_MAIN_SIGN_NUM2_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_AVATAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JPF_JP_MAIN_SIGN_NUM2_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )                    
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_SIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_FORGOTPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_SIGNOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );
        JP_MAIN_SIGN_NUM2_LAYOUT.setVerticalGroup(
            JP_MAIN_SIGN_NUM2_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_NUM2_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM2_AVATAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM2_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40)
                .addComponent(JPF_JP_MAIN_SIGN_NUM2_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM2_SIGNIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_MAIN_SIGN_NUM2_FORGOTPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addComponent(JL_MAIN_SIGN_NUM2_SIGNOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );
        
        /*JP_MAIN_SIGN_NUM3_LAYOUT---------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_SIGN_NUM3_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_SIGN_NUM3);
        JP_MAIN_SIGN_NUM3.setLayout(JP_MAIN_SIGN_NUM3_LAYOUT);
        JP_MAIN_SIGN_NUM3_LAYOUT.setHorizontalGroup(
            JP_MAIN_SIGN_NUM3_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM3_SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JTF_MAIN_SIGN_NUM3_FIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9)
                .addComponent(JTF_MAIN_SIGN_NUM3_SURNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JTF_MAIN_SIGN_NUM3_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JPF_JP_MAIN_SIGN_NUM3_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM3_BIRTHDAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JCB_MAIN_SIGN_NUM3_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCB_MAIN_SIGN_NUM3_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCB_MAIN_SIGN_NUM3_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE) 
                .addComponent(JRB_MAIN_SIGN_NUM3_FEMALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB_MAIN_SIGN_NUM3_MALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM3_RULES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM3_CREATEACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );
        JP_MAIN_SIGN_NUM3_LAYOUT.setVerticalGroup(
            JP_MAIN_SIGN_NUM3_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(JL_MAIN_SIGN_NUM3_SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)
                .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_MAIN_SIGN_NUM3_FIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_MAIN_SIGN_NUM3_SURNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)     
                .addComponent(JTF_MAIN_SIGN_NUM3_USER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
                .addComponent(JPF_JP_MAIN_SIGN_NUM3_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20)                     
                .addComponent(JL_MAIN_SIGN_NUM3_BIRTHDAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
                .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCB_MAIN_SIGN_NUM3_DAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_MAIN_SIGN_NUM3_MONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_MAIN_SIGN_NUM3_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                ) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)    
                .addGroup(JP_MAIN_SIGN_NUM3_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRB_MAIN_SIGN_NUM3_FEMALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRB_MAIN_SIGN_NUM3_MALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(20)
                .addComponent(JL_MAIN_SIGN_NUM3_RULES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
                .addComponent(JL_MAIN_SIGN_NUM3_CREATEACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)    
                .addContainerGap(0, Short.MAX_VALUE)
            )
        );

          /*JP_MAIN_MANAGER-----------------------------------------------------*/
        javax.swing.GroupLayout JP_MAIN_MANAGER_LAYOUT = new javax.swing.GroupLayout(JP_MAIN_MANAGER);
        JP_MAIN_MANAGER.setLayout(JP_MAIN_MANAGER_LAYOUT);
        JP_MAIN_MANAGER_LAYOUT.setHorizontalGroup(
            JP_MAIN_MANAGER_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
        );
        JP_MAIN_MANAGER_LAYOUT.setVerticalGroup(
            JP_MAIN_MANAGER_LAYOUT.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
        );
        //pack();
    }
    
/*Event*/
    /*JF*/
    private void  JF_windowActivated(java.awt.event.WindowEvent evt){
        JP_TITLE_BAR.setBackground(new java.awt.Color(255, 255, 255));
        getRootPane().setBorder(BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255), 1));
    }
    private void  JF_windowDeactivated(java.awt.event.WindowEvent evt){
        JP_TITLE_BAR.setBackground(new java.awt.Color(250, 250, 250));
        getRootPane().setBorder(BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250), 1));
    }
    
    /*JP_TITLE_BAR*/
    private void JP_TITLE_BAR_mouseClicked(java.awt.event.MouseEvent evt)
    {
        // TODO add your handling code here:
        if(getExtendedState() == JFrame.NORMAL)
        {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        else
        {
            setExtendedState(JFrame.NORMAL);
        }
    }
    private void JP_TITLE_BAR_mousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here
        MORE_POINTOLD = evt.getPoint();
    }
    private void JP_TITLE_BAR_mouseDragged(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here
        Point MORE_POINTNEW = evt.getLocationOnScreen();
        setLocation(MORE_POINTNEW.x - MORE_POINTOLD.x, MORE_POINTNEW.y - MORE_POINTOLD.y);
    }
    
    /*JB_TITLE_BAR_CLOSE*/
    private void JB_TITLE_BAR_CLOSE_mouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    } 
    
    /*JB_TITLE_BAR_MAXIMIZE*/
    private void JB_TITLE_BAR_MAXIMIZE_mouseClicked(java.awt.event.MouseEvent evt) {  
        if(getExtendedState() == JFrame.NORMAL)
        {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        else
        {
            setExtendedState(JFrame.NORMAL);
        }
    } 
    
    /*JB_TITLE_BAR_MINIMIZE*/
    private void JB_TITLE_BAR_MINIMIZE_mouseClicked(java.awt.event.MouseEvent evt) {  
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    } 
    
    /*JB_TITLE_BAR_BACK*/
    private void JB_TITLE_BAR_BACK_mouseClicked(java.awt.event.MouseEvent evt) {  
        // TODO add your handling code here:
        //JB_TITLE_BAR_BACK.setVisible(false);
        JP_MAIN_BEGIN.setVisible(false);
        JP_MAIN_SIGN.setVisible(false);
        JP_MAIN_SIGN_NUM1.setVisible(false); 
        JP_MAIN_SIGN_NUM2.setVisible(false);
        JP_MAIN_SIGN_NUM3.setVisible(false);
        JP_MAIN_MANAGER.setVisible(false);
        
        switch(CNT)
        {
            case 0:
               JP_MAIN_BEGIN.setVisible(true); 
               break;
            case 1:
                JP_MAIN_SIGN.setVisible(true);
                JP_MAIN_SIGN_NUM1.setVisible(true);
                break;
            case 2:
                JP_MAIN_SIGN.setVisible(true);
                JP_MAIN_SIGN_NUM2.setVisible(true);
                break;
            case 3:
                JP_MAIN_SIGN.setVisible(true);
                JP_MAIN_SIGN_NUM3.setVisible(true);
                break;
            case 4:
                JP_MAIN_MANAGER.setVisible(true);
                break;
            default:
                break;
        }

        CNT++;
        if(CNT>=5)
        {
         CNT = 0;
        }     
    } 
}

