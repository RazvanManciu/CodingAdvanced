package Service.Dao;

import java.util.List;

public interface Dao<T> {
    public void save(T object);
    public T get (int index);
    public List<T> getAll();
    public void update(T t, String[] parameters);
    public void delete(T t);
}
