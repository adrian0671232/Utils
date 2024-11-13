package ac.stevano.utils.player;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class PlayerUtil {

    public static void clearInventory(Player player) {
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);
    }

    public static void healPlayer(Player player) {
        player.setHealth(player.getMaxHealth());
    }

    public static void feedPlayer(Player player) {
        player.setFoodLevel(20);
        player.setExhaustion(0);
    }

    public static void clearLevels(Player player) {
        player.setLevel(0);
        player.setExp(0);
    }

    public static void clearEffects(Player player) {
        for (PotionEffect effect : player.getActivePotionEffects()) {
            player.removePotionEffect(effect.getType());
        }
    }

    public static void resetPlayer(Player player) {
        clearEffects(player);
        clearInventory(player);
        clearEffects(player);
        clearLevels(player);
        feedPlayer(player);
        healPlayer(player);
    }
}
