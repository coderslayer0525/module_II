package Demotapcode.Thuvien.repository;

import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;

public class LuanVanRepository  implements ILuanVanRepository{

    @Override
    public ArrayList<LuanVan> findAll() {
        return null;
    }

    @Override
    public boolean add(LuanVan luanVan) {
        return true;
    }

    @Override
    public boolean delete(int MaTaiLieu) {
        return true;
    }

    @Override
    public boolean update(int MaLuanVan, LuanVan newLuanVan) {
        return true;
    }

    @Override
    public LuanVan findById(int MaTaiLieu) {
        return null;
    }
}
