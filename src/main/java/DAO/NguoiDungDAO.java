/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Utils.XJdbc;
import entity.NguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi
 */
public class NguoiDungDAO  extends QLTVDAO<NguoiDung, String>{

    @Override
    public void insert(NguoiDung entity) {
        String sql ="INSERT INTO NguoiDung(MaND,MatKhau ,HoTen , VaiTro)VALUES (?, ?, ?,?)";
         XJdbc.update(sql,entity.getMaND(),entity.getVaiTro(),entity.getHoTen(),entity.getVaiTro()
                 );
    }

    @Override
    public void update(NguoiDung entity) {
        String sql ="UPDATE NguoiDung SET MatKhau=?, HoTen=? , VaiTro=? WHERE MaND=?";
         XJdbc.update(sql,entity.getMatKhau(),entity.getHoTen(),entity.getVaiTro(),entity.getMaND()
                 );
    }

    @Override
    public void delete(String MaND) {
        String sql="DELETE FROM NguoiDung WHERE MaND=?";
        XJdbc.update(sql, MaND);
    }

    @Override
    public NguoiDung selectById(String MaND) {
        String sql="SELECT * FROM NguoiDung WHERE MaND=?";
        List<NguoiDung> list = this.selectBySql(sql, MaND);
        return list.size()>0 ? list.get(0):null;
    }

    @Override
    public List<NguoiDung> selectAll() {
        String sql="SELECT * FROM NguoiDung";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NguoiDung> selectBySql(String sql, Object... args) {
        List<NguoiDung> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                   NguoiDung entity=new NguoiDung();
                    entity.setMaND(rs.getString("MaND"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
        }
    }
    
