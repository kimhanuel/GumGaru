package HANUEL;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().setResourcePack("https://drive.google.com/file/d/11yTmoNP7M-f3SzpbMXvs3FQ8CsjSzsNo/view?usp=sharing");
    }
}
