package com.zxy.learning.Permission;

public class PermissionOperate {

    private PermissionContext permissionContext;

    public PermissionOperate(PermissionContext permissionContext) {
        this.permissionContext = permissionContext;
    }

    private boolean add(long permission){
        return false;//permission | permissionContext.getUserPermission() == 0;
    }
}
