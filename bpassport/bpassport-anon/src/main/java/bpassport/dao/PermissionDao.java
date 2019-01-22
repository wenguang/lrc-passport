package bpassport.dao;


import bpassport.entity.Permission;

public interface PermissionDao {

    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);

}
