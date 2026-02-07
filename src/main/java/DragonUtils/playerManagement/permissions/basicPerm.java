package DragonUtils.playerManagement.permissions;

import DragonUtils.interfaceControl.logging;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import java.util.logging.Level;

import static DragonUtils.utils.plugin;

public class basicPerm
{
    static
    {
        logging.log(Level.INFO,"&6[DragonUtils] &r","&aSuccessfully Loaded &bModule [permissions] &r&ain &r&6&_DragonUtils by DragonMinecraftSoftwares&r&a !&r");
    }

    /*
     * 注册权限节点
     * @param node 权限节点名
     * @param description 描述
     * @param defaultLevel 默认权限等级(OP,NotOP,All,None)
     */
    public  static Permission registerPermission(String node,String description,String defaultLevel)
    {
        PermissionDefault level;
        switch (defaultLevel)
        {
            case "OP":
                level=PermissionDefault.OP;
                break;
            case "NotOP":
                level=PermissionDefault.NOT_OP;
                break;
            case "All":
                level=PermissionDefault.TRUE;
                break;
            case "None":
                level=PermissionDefault.FALSE;
                break;
            default:
                level=PermissionDefault.OP;
                break;
        }
        Permission permission = new Permission(node,description,level);
        plugin.getServer().getPluginManager().addPermission(permission);
        return permission;
    }
}
