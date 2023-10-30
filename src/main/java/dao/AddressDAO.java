package dao;

import db.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
