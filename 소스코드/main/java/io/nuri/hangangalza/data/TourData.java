package io.nuri.hangangalza.data;

/**
 * Created by chayongbin on 15. 10. 31..
 */
public class TourData {

    private String name;
    private String link;

    public TourData(String name, String link) {
        this.name = name;
        this.link = link;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourData robot = (TourData) o;

        if (name != null ? !name.equals(robot.name) : robot.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
