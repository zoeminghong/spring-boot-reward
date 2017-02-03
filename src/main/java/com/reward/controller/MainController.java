package com.reward.controller;

import com.reward.dao.RewardShareDao;
import com.reward.model.RewardShareDo;
import com.reward.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gjason on 2017/1/27.
 */
@RestController
public class MainController {

    @Value("${shareId}")
    private String shareId;

    @Autowired
    private GirlProperties girlProperties;

    @Autowired
    private RewardShareDao rewardShareDao;

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index() {
        RewardShareDo rewardShareDo = new RewardShareDo();
        rewardShareDo.setId(shareId);
        rewardShareDo = rewardShareDao.getModel(rewardShareDo);
        return rewardShareDo.getSceneId();
    }

}
