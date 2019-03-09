import com.eastebiz.Application;
import com.eastebiz.dao.PackageListDao;
import com.eastebiz.entity.PackageList;
import com.eastebiz.entity.ProductList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class PackageDaoTest {

    @Autowired(required = true)
    private PackageListDao packageListDao;

    @Test//查看所有包裹
    public  void  Test3(){
        //List<PackageList> lists = packageListDao.selectAllPackageById(22);
        List<PackageList> lists = packageListDao.selectAllPackageByCompanyId(1);
        for (PackageList list : lists) {
            System.out.println(list);
        }
    }

    @Test
    public  void test4(){
        List<PackageList> unSendPackage = packageListDao.selectUnSendPackage("sended");
        System.out.println("查询未发货包裹");
        for (PackageList packageList : unSendPackage) {
            System.out.println(packageList);
        }

    }

    //途中包裹
    @Test
    public  void test5(){
        List<PackageList> lists = packageListDao.selectTrackingPackage("unchecked");
        for (PackageList list : lists) {
            System.out.println(list);
        }

    }
}
