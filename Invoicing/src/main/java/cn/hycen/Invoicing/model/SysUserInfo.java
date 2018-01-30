package cn.hycen.Invoicing.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class SysUserInfo {
    private Long userId;

    private Integer empId;

    private String userName;

    private String userPassword;

    private String userSalt;

    private Integer userAction;

    private String headPortrait;

    private String recordId;

    private Date recordDate;

    private String lastmodiId;

    private Date lastmodiDate;

    private Integer userType;

    private String depId;

    private List<String> userPermissions;

    private List<SysLoginAccount> accountList;

    private String  userRoles;

    //临时流程用户组名称
    private String  processGroup;

}