package com.example.pr5;
import …

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMappingv
    public List<User> findAll() {
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable(name = "id") Integer id) {

        try {
            userService.delete(id);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @PostMapping
    public Integer create(@RequestBody User user) {
        try {
            userService.create(user);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}