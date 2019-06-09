package com.cfne.cache.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.cfne.cache.entity.TbGoods;
import com.cfne.cache.mapper.TbGoodsMapper;
import com.cfne.cache.service.ITbGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cw
 * @since 2019-06-08
 */
@Service
public class TbGoodsServiceImpl extends ServiceImpl<TbGoodsMapper, TbGoods> implements ITbGoodsService {

    @Autowired
    private TbGoodsMapper tbGoodsMapper;

    @Cacheable(value = "tbGoods")
    @Override
    public TbGoods getById(Serializable id) {
        return tbGoodsMapper.selectById(id);
    }


    @CachePut(value = "tbGoods")
    @Override
    public boolean updateById(@Param(Constants.ENTITY) TbGoods tbGoods) {
        System.out.println(tbGoods);
        int i = tbGoodsMapper.updateById(tbGoods);
        return i>0 ? true : false;
    }

    @CacheEvict(value = "tbGoods", beforeInvocation = true)
    @Override
    public boolean removeById(Serializable id) {

        return id !=  null ? true : false;
    }
}
