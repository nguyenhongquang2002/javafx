package sample.model;

import java.util.ArrayList;

public interface DataAccessObject<S> {
    ArrayList<S> getList();
    boolean create(S s);
    boolean update(S s);
    boolean delete(S s);
}