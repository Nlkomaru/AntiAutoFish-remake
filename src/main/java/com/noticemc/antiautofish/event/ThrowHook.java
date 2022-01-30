package com.noticemc.antiautofish.event;

import com.noticemc.antiautofish.AntiAutoFish;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.scheduler.BukkitRunnable;
public class ThrowHook implements Listener {

    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent e) {
        Player p = e.getPlayer();
        FishHook hook = e.getHook();

        new BukkitRunnable() {
            @Override
            public void run() {
                Location loc = hook.getLocation();
                p.playSound(loc, Sound.ENTITY_FISHING_BOBBER_SPLASH, 0.0f, 1.0f);
            }
        }.runTaskLater(AntiAutoFish.getPlugin(), 20 * 4);
    }
}
