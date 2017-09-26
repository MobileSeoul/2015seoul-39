package io.nuri.hangangalza.data;

/**
 * Created by chayongbin on 15. 10. 26..
 */
public class BridgeInfoData {
    private int bridge_id;
    private String bridge_info;
    private String bridge_lat;
    private String bridge_lng;
    private String bridge_bike_name;
    private String bridge_bike_lat;
    private String bridge_bike_lng;
    private String bridge_metro;
    private String bridge_bus;
    private String bridge_tourist;
    private String bridge_history;

    public BridgeInfoData(int bridge_id, String bridge_info, String bridge_lat, String bridge_lng,
                          String bridge_bike_name, String bridge_bike_lat,
                          String bridge_bike_lng, String bridge_metro, String bridge_bus,
                          String bridge_tourist, String bridge_history){

        this.bridge_id = bridge_id;
        this.bridge_info =bridge_info;
        this.bridge_lat = bridge_lat;
        this.bridge_lng = bridge_lng;
        this.bridge_bike_name = bridge_bike_name;
        this.bridge_bike_lat = bridge_bike_lat;
        this.bridge_bike_lng = bridge_bike_lng;
        this.bridge_metro= bridge_metro;
        this.bridge_bus = bridge_bus;
        this.bridge_tourist = bridge_tourist;
        this.bridge_history= bridge_history;

    }

    public int getBridge_id() {
        return bridge_id;
    }

    public void setBridge_id(int bridge_id) {
        this.bridge_id = bridge_id;
    }

    public String getBridge_info() {
        return bridge_info;
    }

    public void setBridge_info(String bridge_info) {
        this.bridge_info = bridge_info;
    }

    public String getBridge_lat() {
        return bridge_lat;
    }

    public void setBridge_lat(String bridge_lat) {
        this.bridge_lat = bridge_lat;
    }

    public String getBridge_lng() {
        return bridge_lng;
    }

    public void setBridge_lng(String bridge_lng) {
        this.bridge_lng = bridge_lng;
    }

    public String getBridge_bike_name() {
        return bridge_bike_name;
    }

    public void setBridge_bike_name(String bridge_bike_name) {
        this.bridge_bike_name = bridge_bike_name;
    }

    public String getBridge_bike_lat() {
        return bridge_bike_lat;
    }

    public void setBridge_bike_lat(String bridge_bike_lat) {
        this.bridge_bike_lat = bridge_bike_lat;
    }

    public String getBridge_bike_lng() {
        return bridge_bike_lng;
    }

    public void setBridge_bike_lng(String bridge_bike_lng) {
        this.bridge_bike_lng = bridge_bike_lng;
    }

    public String getBridge_bus() {
        return bridge_bus;
    }

    public void setBridge_bus(String bridge_bus) {
        this.bridge_bus = bridge_bus;
    }

    public String getBridge_metro() {
        return bridge_metro;
    }

    public void setBridge_metro(String bridge_metro) {
        this.bridge_metro = bridge_metro;
    }

    public String getBridge_tourist() {
        return bridge_tourist;
    }

    public void setBridge_tourist(String bridge_tourist) {
        this.bridge_tourist = bridge_tourist;
    }

    public String getBridge_history() {
        return bridge_history;
    }

    public void setBridge_history(String bridge_history) {
        this.bridge_history = bridge_history;
    }
}
