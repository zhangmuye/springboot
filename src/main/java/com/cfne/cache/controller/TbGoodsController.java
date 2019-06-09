package com.cfne.cache.controller;


import com.cfne.cache.entity.TbGoods;
import com.cfne.cache.service.ITbGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cw
 * @since 2019-06-08
 */
@RestController
@RequestMapping("/cache/tb-goods")
public class TbGoodsController {

    @Autowired
    private ITbGoodsService iTbGoodsService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("getTbGoods/{id}")
    public TbGoods getTbGoods(@PathVariable(value = "id") Integer id){
        TbGoods byId = iTbGoodsService.getById(id);
        return byId;
    }

    @GetMapping("updateTbGoods/{id}")
    public String updateTbGoods(@PathVariable(value = "id") Integer id){

        TbGoods tbGoods = new TbGoods();
        tbGoods.setId(id);
        tbGoods.setNo("fsdf");
        tbGoods.setName("vw222");
        tbGoods.setAddress("北京");
        tbGoods.setType("汽车");
        boolean b = iTbGoodsService.updateById(tbGoods);
        return b == true ? "修改成功" : "修改失败";
    }

    @GetMapping(value = "deleteTbGoods/{id}")
    public String deleteTbGoods(@PathVariable(value = "id") Integer id){

        return iTbGoodsService.removeById(id) == true ? "删除成功！" : "清除失败！";
    }
}

