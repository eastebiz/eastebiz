import com.eastebiz.Application;
import com.eastebiz.dao.UserDao;
import com.eastebiz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class testDao {

    @Autowired
    private UserDao userDao;


    //ersdf
    @Test
    public void tset1(){

        List<User> users = userDao.selectAllUser();

          System.out.println(users);

    }
}
