/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Hi
 */
public class MsgBox {
    /**
     * Hiển thị thông báo cho người dùng
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo
     */
    public static void alert(Component parent,String message){
        JOptionPane.showMessageDialog(parent, message,"Thông Báo ",JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(Component parent,String message){
        int result = JOptionPane.showConfirmDialog(parent,message,"Thông Báo ",JOptionPane.YES_NO_OPTION);
        return result == JOptionPane.YES_OPTION;
    }
    /**
     * Hiển thị thông báo yêu cầu nhập dữ liệu
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo nhắc nhở nhập
     * @return là kết quả nhận được từ người sử dụng nhập vào
     */    
    public static String prompt(Component parent,String message){
        return JOptionPane.showInputDialog(parent,message,"Thông Báo ",JOptionPane.INFORMATION_MESSAGE);
    }
}
