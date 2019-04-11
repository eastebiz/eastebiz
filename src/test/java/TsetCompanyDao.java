import com.eastebiz.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class TsetCompanyDao {

    @Autowired
    private EbizCompanyDao ebizCompanyDao;

    @Test
    public void Tset1(){
        EbizCompany ebizCompany = new EbizCompany("殷氏公司","yinxiang","888888","154551","1","1","2","3","4","5","6","7","8","9","11","12","13","45","25",new java.util.Date());
        ebizCompanyDao.insertEbizCompany(ebizCompany);
    }
    @Test
    public void Test2(){
        EbizCompany ebizCompany = ebizCompanyDao.selectCompanyNameAndPassdord(new EbizCompany("殷氏公司", "888888"));
        System.out.println(ebizCompany);
    }


    @Test
    public void Test3(){
        EbizCompany ebizCompany = ebizCompanyDao.selectOneCompanyName("殷氏公司");
        System.out.println(ebizCompany);

    }
    @Test
    public void Tset4(){
        EbizCompany ebizCompany = ebizCompanyDao.selectOneOwerName("yinxiang");
        System.out.println(ebizCompany);

    }

    @Test
    public void Test5(){
        Date  date=new java.util.Date();
        System.out.println(date);
        ebizCompanyDao.updateAndUpdateTime(1,date);
    }

    @Test
    public void Test6(){
        EbizCompany ebizCompany = new EbizCompany(1,"999666","154551","66","11","33","44","55","6","7","8","9","11","12","13","45","25");
        ebizCompanyDao.updateEbizCompany(ebizCompany);
    }
}
