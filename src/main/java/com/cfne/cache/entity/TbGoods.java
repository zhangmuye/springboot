package com.cfne.cache.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cw
 * @since 2019-06-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "tb_goods")
public class TbGoods implements Serializable {

private static final long serialVersionUID=1L;


    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @TableField(value = "no")
    private String no;

    @TableField(value = "name")
    private String name;

    @TableField(value = "address")
    private String address;

    @TableField(value = "type")
    private String type;

}
