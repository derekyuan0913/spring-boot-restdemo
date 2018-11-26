package personal.yuanding.restdemo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> listUser();

    User getUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}