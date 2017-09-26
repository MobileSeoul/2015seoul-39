package io.nuri.hangangalza.data;


import android.content.Context;

public class BridgeData {
    private int br_id;
    private String bridge_kr;
    private String bridge_en;
    private String bridge_image;

    public BridgeData(int br_id, String bridge_kr, String bridge_en, String bridge_image){
        this.br_id = br_id;
        this.bridge_en = bridge_en;
        this.bridge_kr = bridge_kr;
        this.bridge_image = bridge_image;
    }

    public int getBr_id() {
        return br_id;
    }

    public void setBr_id(int br_id) {
        this.br_id = br_id;
    }

    public String getBridge_kr() {
        return bridge_kr;
    }

    public void setBridge_kr(String bridge_kr) {
        this.bridge_kr = bridge_kr;
    }

    public String getBridge_en() {
        return bridge_en;
    }

    public void setBridge_en(String bridge_en) {
        this.bridge_en = bridge_en;
    }

    public String getBridge_image() {
        return bridge_image;
    }

    public void setBridge_image(String bridge_image) {
        this.bridge_image = bridge_image;
    }
}
