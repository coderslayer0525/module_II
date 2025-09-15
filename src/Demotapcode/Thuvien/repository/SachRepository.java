package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;

public class SachRepository implements ISachRepository{
    @Override
    public ArrayList<Sach> findAll() {
        return null;
    }

    @Override
    public boolean add(Sach sach) {
        return true;
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return true;
    }

    @Override
    public boolean update(int MaTaiLieu, Sach newSach) {
        return true;
    }

    @Override
    public Sach findById(int MaTaiLieu) {
        return null;
    }
}
