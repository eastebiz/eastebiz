import com.eastebiz.Application;
import com.eastebiz.dao.PackageListDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class PackageDaoTest {

    @Autowired
    private PackageListDao packageListDao;

    @Test
    public  void  Test3(){
        List<PackageList> lists = packageListDao.selectAllPackageById(22);
        for (PackageList list : lists) {
            System.out.println(list);
        }
    }
}
