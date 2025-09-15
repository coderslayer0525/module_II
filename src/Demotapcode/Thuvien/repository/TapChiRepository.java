package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.TapChi;

import java.util.ArrayList;

public class TapChiRepository  implements  ITapChiRepository{

    @Override
    public ArrayList<TapChi> findAll() {
        return null;
    }

    @Override
    public boolean add(TapChi tapChi) {
        return true;
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return true;
    }

    @Override
    public boolean update(int MaTaiLieu, TapChi newTapChi) {
        return true;
    }

    @Override
    public TapChi findById(int MaTaiLieu) {
        return null;
    }
}
