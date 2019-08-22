import com.lqx.javabean.Client;
import com.lqx.service.ClientService;
import com.lqx.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: ssm
 * @description:
 * @author: Li Qixuan
 * @create: 2019-08-22 10:35
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestSsm {

    @Autowired
    private ClientService clientService;
    @Test
    public void getGoods() {
      // Goods gds = goodsService.getGoodsById(8);
       Client client = clientService.getClient(2);
       System.out.println(client);
       clientService.addClient(client);
       Client client2 = clientService.getClient(15);
        System.out.println(client2);
    }
}
