package com.primihub.biz.entity.sys.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class SysUserListVO {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 账号名称
     */
    private String userAccount;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 角色id集合
     */
    private String roleIdList;
    /**
     * 角色id集合描述
     */
    private String roleIdListDesc;
    /**
     * 机构id集合
     */
    private String organIdList;
    /**
     * 机构id集合描述
     */
    private String organIdListDesc;
    /**
     * 根机构id集合
     */
    private String rOrganIdList;
    /**
     * 根机构id集合描述
     */
    private String rOrganIdListDesc;
    /**
     * 是否禁用
     */
    private Integer isForbid;
    /**
     * 是否可编辑
     */
    private Integer isEditable;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date cTime;
    /**
     * 权限id集合
     */
    private String authIdList;
}
