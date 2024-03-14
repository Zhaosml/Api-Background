package com.yupi.project.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.yupi.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询请求
 *
 * @author yupi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 主键
     * 用户可能根据id查询
     */
    //@TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     * 用户可能根据名称查询
     */
    private String name;

    /**
     * 描述
     * 用户可能根据描叙查询
     */
    private String description;

    /**
     * 用户可能根据接口地址查询
     * 接口地址
     */
    private String url;
//下面的都有可能
    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

    /**
     * 创建时间
     */
    //private Date createTime;

    /**
     * 更新时间
     */
    //private Date updateTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    //@TableLogic
    //private Integer isDelete;
}