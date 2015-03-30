/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vladimir.methotels.pages;

import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import vladimir.methotels.data.Room;

/**
 *
 * @author Vladimir
 */
public class AddRoom {

    @Persist
    @Property
    private ArrayList<Room> rooms;
    @Property
    private Room room;

    void onActivate() {
        if (rooms == null) {
            rooms = new ArrayList<Room>();
        }
    }

    Object onSuccess() {
        rooms.add(room);
        return this;
    }

}
