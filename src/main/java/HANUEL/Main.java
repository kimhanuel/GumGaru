package HANUEL;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        System.out.println("플러그인이 활성화되었습니다.");
        getServer().getPluginManager().registerEvents(new BreakEvent(), this);
    }

    public void onDisable() {
        System.out.println("플러그인이 비활성화되었습니다.");
    }

}