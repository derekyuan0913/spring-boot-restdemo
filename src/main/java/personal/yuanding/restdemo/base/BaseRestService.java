package personal.yuanding.restdemo.base;

import java.util.List;

public interface BaseRestService<T> {

    public List<T> list();

    public T get(int id);

    public int add(T entity);

    public int update(T entity);

    public int delete(int id);
}
