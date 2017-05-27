package base;

import java.util.ArrayList;

public interface ApiController<T> {
  public ArrayList<T> listAll();
  public T find(Long id);
  public T create(T object);
  public T delete(Long id);
  public T update(Long id, T object);
}