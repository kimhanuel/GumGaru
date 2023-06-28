package HANUEL;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemManager {
    public static final ItemStack dia = buildItem(Material.PAPER, 1, ChatColor.AQUA +"금가루","금블럭을 캐서 나온 금가루다.");

    private static ItemStack buildItem(Material type, int amount, String displayName, String... lore) {
        ItemStack stack = new ItemStack(type, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        meta.setCustomModelData(1);
        stack.setItemMeta(meta);
        return stack;
    }
}