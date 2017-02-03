package com.reward;

import com.reward.dao.RewardShareDao;
import com.reward.model.RewardShareDo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlApplicationTests {
    @Autowired
    private RewardShareDao rewardShareDao;

    @Test
    public void getModel() {
        RewardShareDo rewardShareDo = new RewardShareDo();
        rewardShareDo.setId("0D1906BB641748B782E227FAE077FF60");
        rewardShareDo = rewardShareDao.getModel(rewardShareDo);
        Assert.assertNotNull("为空", rewardShareDo.getSceneId());
    }

}
