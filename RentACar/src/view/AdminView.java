package view;

import entity.User;

import javax.swing.*;

public class AdminView extends Layout{
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scl_brand;
    private JTable tbl_brand;
    private User user;

    public AdminView(User user){
        this.add(container);
        this.guiInitialize(1000,500);
        this.user = user;

        if (this.user == null){
            dispose();
        }

        this.lbl_welcome.setText("Hoşgeldiniz : "+ this.user.getUsername());
    }
}
