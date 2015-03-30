/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vladimir.methotels.pages;

import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import vladimir.methotels.entities.Hotelroom;
import org.hibernate.Session;

/**
 *
 * @author Vladimir
 */
public class NewRoom {

    @Property
    private Hotelroom hroom;
    @Inject
    private Session session;
    @Property
    private ArrayList<Hotelroom> hrooms;

    void onActivate() {
        if (hrooms == null) {
            hrooms = new ArrayList<Hotelroom>();
        }
// createCriteria metoda pravi Select * upit nad prosle?enom klasom
        hrooms = (ArrayList<Hotelroom>) session.createCriteria(Hotelroom.class).list();
    }

    @CommitAfter
    Object onSuccess() {
// persist metoda ?uva objekatu bazi podataka
        session.persist(hroom);
        return this;
    }

}
