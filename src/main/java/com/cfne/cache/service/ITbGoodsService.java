package com.cfne.cache.service;

import com.cfne.cache.entity.TbGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cw
 * @since 2019-06-08
 */
public interface ITbGoodsService extends IService<TbGoods> {

    @Override
    TbGoods getById(Serializable id);
}
