package HANUEL;

import HANUEL.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakEvent implements Listener {

    @EventHandler
    public void breakDirt(BlockBreakEvent e) {
        Material brBlock = e.getBlock().getBlockData().getMaterial();
        if(brBlock == Material.GOLD_BLOCK) {
            if(Math.floor(Math.random() * 10)< 1){
                Player p = e.getPlayer();
                p.getInventory().addItem(ItemManager.dia);
                p.sendMessage("금 블럭에서 금 가루가 떨어져 나왔습니다!");
            }
        }
    }

}