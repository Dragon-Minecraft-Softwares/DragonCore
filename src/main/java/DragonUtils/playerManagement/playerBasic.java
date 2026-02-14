package DragonUtils.playerManagement;

import static org.bukkit.Bukkit.getOfflinePlayers;
import static org.bukkit.Bukkit.getOnlinePlayers;
import DragonUtils.interfaceControl.logging;
import DragonUtils.utils;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

// 本模块规范: 输入没有特殊需求时一律使用玩家类型

public class playerBasic
{
    /**
     * 玩家信息类型
     * @name [String]玩家名称
     * @ip [String]玩家IP
     * @uuid [String]玩家UUID
     * @pos [int[]]玩家坐标
     * @dimension [String]玩家维度
     * @onlineStatus [boolean]玩家在线状态
     * @bukkitPlayer [Player]bukkit玩家对象
     * @bukkitOfflinePlayer [OfflinePlayer]bukkit离线玩家对象
     */
    public class playerType
    {
        static String name;
        String ip;
        String uuid;
        int[] pos=new int[3];
        String dimension;
        boolean onlineStatus=true;
        Player bukkitPlayer=null;
        OfflinePlayer bukkitOfflinePlayer=null;

        /**
         * 从名字创建玩家信息
         * @param name 玩家名称
         */
        public playerType(String name)
        {
            playerType player=null;
            player.name=name;
            player.onlineStatus=
            return player;
        }
    }
    public static List<OfflinePlayer> offlinePlayerList;
    static
    {
        logging.log(Level.INFO,"&6[DragonUtils] &r","&aSuccessfully Loaded &bModule [getPlayerInfo] &r&ain &r&6&_DragonUtils by DragonMinecraftSoftwares&r&a !&r");
    }
    /*
     * 初始化
     */
    public static void init()
    {
        logging.log(Level.INFO,"&6[DragonUtils] &r","&a正在初始化离线玩家列表......");
        offlinePlayerList=Arrays.asList(getOfflinePlayers());
    }

    /*
     * 获取玩家IP
     * @param player 玩家对象
     */
    public static String getPlayerIp(String player)
    {
        if()
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
             return getPlayersName("Online");
         }
    }
}
