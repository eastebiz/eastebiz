import com.eastebiz.Application;

import com.eastebiz.dao.EbizUserDao;
import com.eastebiz.dao.PackageListDao;
import com.eastebiz.entity.EbizUser;
import com.eastebiz.entity.PackageList;
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
    private  EbizUserDao ebizUserDao;


    @Test
    public void Test1(){
        EbizUser ebizUser = new EbizUser("yinxiang","yin","xiang","123456","21681615","15462841118","nj",new java.util.Date(),new java.util.Date(),"155","1","1","1","1","11","22");
       ebizUserDao.insertEbizUser(ebizUser);


    }

    @Test
    public void Tset2(){
       EbizUser ebizUser = new EbizUser("yinxiang","123456");

        EbizUser user = ebizUserDao.selectOneEbizUser(ebizUser);
        System.out.println(user);

    }


}
