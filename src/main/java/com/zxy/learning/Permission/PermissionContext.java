package com.zxy.learning.Permission;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class PermissionContext {

    private static Map<Long, String> map = new ConcurrentHashMap<>(64);

    private long userPermission;

    public long getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(long userPermission) {
        this.userPermission = userPermission;
    }
}
