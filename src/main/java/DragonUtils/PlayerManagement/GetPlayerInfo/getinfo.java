package DragonUtils.PlayerManagement.GetPlayerInfo;

import static DragonUtils.utils.plugin;
import static org.bukkit.Bukkit.getOfflinePlayers;
import static org.bukkit.Bukkit.getOnlinePlayers;
import DragonUtils.logging;
import DragonUtils.utils;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class getinfo
{
    static
    {
        logging.log(Level.INFO,"&6[DragonUtils] &r","&aSuccessfully Loaded &bModule [GetPlayerInfo] &r&ain &r&6&_DragonUtils by DragonMinecraftSoftwares&r&a !&r");
    }

    /*
     * 获取玩家对象
     * @param name 玩家名称
     */
    public static Player getPlayerObject(String name)
    {
        return Bukkit.getPlayerExact(name);
    }
    /*
     * 获取离线玩家对象
     * @param name 玩家名称
     */
    public static OfflinePlayer getOfflinePlayerObject(String name)
    {
        return Bukkit.getOfflinePlayer(name);
    }

    /*
     * 获取玩家名称
     * @param player 玩家对象
     */
    public static String getPlayerName(Player player)
    {
        return player.getName();
    }
    /*
     * 获取离线玩家名称
     * @param player 离线玩家对象
     */
    public static String getPlayerName(OfflinePlayer player)
    {
        return player.getName();
    }

    /*
     * 获取玩家UUID
     * @param player 玩家对象
     */
    public static String getPlayerUUID(Player player)
    {
        return player.getUniqueId().toString();
    }
    /*
     * 获取离线玩家UUID
     * @param player 离线玩家对象
     */
    public static String getPlayerUUID(OfflinePlayer player)
    {
        return player.getUniqueId().toString();
    }

    /*
     * 获取玩家IP
     * @param player 玩家对象
     */
    public static String getPlayerIp(Player player)
    {
        if(player.getAddress()!=null) return player.getAddress().getAddress().getHostAddress();
        return "null";
    }
    /*
     * 获取离线玩家IP
     * @param player 离线玩家对象
     */
    public static String getPlayerIp(OfflinePlayer player)
    {
        return "Player Offline";
    }

    /*
     * 获取玩家在线状态
     * @param player 玩家对象
     */
    public static boolean getPlayerOnline(Player player)
    {
        return player.isOnline();
    }
    /*
     * 获取离线玩家在线状态
     * @param player 离线玩家对象
     */
    public static boolean getPlayerOnline(OfflinePlayer player)
    {
        return player.isOnline();
    }

    /*
     * 获取玩家列表
     * @param Type 玩家列表类型(Online,Offline,All)
     */
    public static Player[] getPlayers(String Type)
    {
        if(Type.equalsIgnoreCase("Online"))
        {
            return getOnlinePlayers().toArray(new Player[0]);
        }
        else if(Type.equalsIgnoreCase("Offline"))
        {
            return (Player[])getOfflinePlayers();
        }
        else
        {
            return utils.mergeArrays(getOnlinePlayers().toArray(new Player[0]),(Player[])getOfflinePlayers());
        }
    }
    /*
     * 获取玩家名称列表
     * @param Type 玩家列表类型(Online,Offline,All)
     */
    public static List<String> getPlayersName(String Type)
    {
         if(Type.equalsIgnoreCase("Online"))
         {
             return getOnlinePlayers().stream().map(Player::getName).toList();
         }
         else if(Type.equalsIgnoreCase("Offline"))
         {
             return (List<String>) Arrays.stream(getOfflinePlayers()).map(OfflinePlayer::getName);
         }
         else
         {
             return utils.mergeArrays(getOnlinePlayers().stream().map(Player::getName).toArray(String[]::new),(List<String>) Arrays.stream(getOfflinePlayers()).map(OfflinePlayer::getName));
         }
    }
}
