package personal.yuanding.restdemo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRestServiceImpl userService;

    @GetMapping
    public List<User> userList() {
        return userService.list();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.get(id);
    }

    @PostMapping
    public int addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @PatchMapping("/{id}")
    public int updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable int id) {
        return userService.delete(id);
    }
}
