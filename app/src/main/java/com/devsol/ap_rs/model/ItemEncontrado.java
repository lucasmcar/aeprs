package com.devsol.ap_rs.model;

import java.io.Serializable;

public class ItemEncontrado implements Serializable {

    private String localIten;
    private String dataItem;
    private String descItem;
    private String tituloItem;
    private int imgItem;

    public ItemEncontrado() {
    }

    public ItemEncontrado(String localIten, String dataItem, String descItem, String tituloItem, int imgItem) {
        this.localIten = localIten;
        this.dataItem = dataItem;
        this.descItem = descItem;
        this.tituloItem = tituloItem;
        this.imgItem = imgItem;
    }

    public String getLocalIten() {
        return localIten;
    }

    public void setLocalIten(String localIten) {
        this.localIten = localIten;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public String getTituloItem() {
        return tituloItem;
    }

    public void setTituloItem(String tituloItem) {
        this.tituloItem = tituloItem;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}
