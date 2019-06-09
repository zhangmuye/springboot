package com.cfne.cache.mapper;

import com.cfne.cache.entity.TbGoods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cw
 * @since 2019-06-08
 */
public interface TbGoodsMapper extends BaseMapper<TbGoods> {

    @Override
    TbGoods selectById(Serializable id);

    @Override
    int updateById(TbGoods entity);
}
