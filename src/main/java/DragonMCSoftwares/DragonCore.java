package DragonMCSoftwares;

import DragonUtils.utils;
import org.bukkit.plugin.java.JavaPlugin;
import DragonUtils.logging;

import java.util.logging.Level;

public final class DragonCore extends JavaPlugin
{
    public static String chatPrefix="&k&6|&r&a[&r&l&6龙珠&r&b&n&o插件前置&r&a]&r&k&6| &r&6&l";

    // 插件指示标志
    // 封禁模块
    public static boolean banEnable=true;  // 启用封禁模块

    // 插件公共
    public static boolean debug=false;  // 启动调试输出

    @Override
    public void onEnable()
    {
        logging.log(Level.INFO,chatPrefix,"正在加载龙珠前置......");
        logging.log(Level.INFO,chatPrefix,"正在初始化龙珠前置......");
        utils.plugin=this;
        logging.log(Level.INFO,chatPrefix,"龙珠前置加载完成!");
        logging.log(Level.INFO,chatPrefix,"DragonMinecraftSoftwares 龙珠前置,最好的Minecraft插件前置!");
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
        logging.log(Level.INFO,chatPrefix,"正在关闭龙珠前置......");
        logging.log(Level.INFO,chatPrefix,"龙珠前置已关闭!");
    }
}
