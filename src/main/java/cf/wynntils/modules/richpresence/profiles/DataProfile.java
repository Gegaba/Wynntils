package cf.wynntils.modules.richpresence.profiles;

/**
 * Created by HeyZeer0 on 14/12/2017.
 * Copyright © HeyZeer0 - 2016
 */
public class DataProfile {

    String location = "Waiting";
    boolean unknownLocation = false;

    public DataProfile(){
    }

    public String getLocation() {
        return location;
    }

    public boolean getUnknownLocation() {
        return unknownLocation;
    }

    public void setLocation(String value) {
        location = value;
    }

    public void setUnknownLocation(boolean value) {
        unknownLocation = value;
    }

}
