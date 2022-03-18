/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Project URI:        https://github.com/zadajtjeu/QuanLyTienDien
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Version:           1.0
 * Author:            Nhom 18: Nam, Hao, Trung
 * Author URI:        https://nam.name.vn
 * 
 * Copyright (C) 2021-2022 Pham Thanh Nam - HAUI.
 * 
 */
package services;

import java.util.List;
import models.ChiSoDien;
import models.Thang;

/**
 *
 * @author duato
 */
public interface ChiSoDienService {
    public List<ChiSoDien> getList();
    // Lấy danh sách chỉ số điện chưa lập hoá đơn
    public List<ChiSoDien> getListExcludedInHoaDon();
    public ChiSoDien getChiSoDien(int maKH, int thangID);
    public ChiSoDien getLastChiSoDien(int maKH);
    public ChiSoDien getFirstChiSoDien(int maKH);
    public int createORUpdate(ChiSoDien chiSoDien);
    public List<ChiSoDien> getListOfThang(Thang thang);
}
