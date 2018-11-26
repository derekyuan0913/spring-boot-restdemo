package personal.yuanding.restdemo.user;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> listUser();

    Page<User> listByPage();

    User getUser(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}