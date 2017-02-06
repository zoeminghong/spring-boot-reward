package com.reward.controller;

import com.reward.dao.RewardShareDao;
import com.reward.model.RewardShareDo;
import com.reward.properties.GirlProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by gjason on 2017/1/27.
 */
@RestController
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @Value("${shareId}")
    private String shareId;

    @Autowired
    private GirlProperties girlProperties;

    @Autowired
    private RewardShareDao rewardShareDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index() {
        RewardShareDo rewardShareDo = new RewardShareDo();
        rewardShareDo.setId(shareId);
        rewardShareDo = rewardShareDao.getModel(rewardShareDo);
        logger.info("获取成功{}",rewardShareDo.getCount());
        redisTemplate.opsForValue().set("sceneId",rewardShareDo.getSceneId());
        return rewardShareDo.getSceneId();
    }

}
