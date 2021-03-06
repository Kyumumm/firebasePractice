package user;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface UserService {
    List<User> getUsers() throws ExecutionException, InterruptedException;
}
