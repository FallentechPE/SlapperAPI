package io.fallentech.slapperAPI.Events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.entity.EntityMotionEvent;
import cn.nukkit.event.player.PlayerInteractEntityEvent;
import io.fallentech.slapperAPI.Entities.SlapperEntity;
import io.fallentech.slapperAPI.Entities.SlapperHuman;
import io.fallentech.slapperAPI.SlapperAPI;

import java.util.HashMap;
import java.util.UUID;

public class PluginEventHandler implements Listener {
    private final SlapperAPI plugin;
    private final HashMap<UUID, HashMap<UUID, Integer>> currentIndex = new HashMap<>();

    public PluginEventHandler(SlapperAPI plugin) {
        this.plugin = plugin;

        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerAttack(EntityDamageByEntityEvent event) {
        if (event.isCancelled()) return;
        if (!(event.getDamager() instanceof Player)) return;
        if (event.getEntity() instanceof SlapperEntity slapperEntity) {
            SlapperInteractEvent slapperAttackEvent = new SlapperInteractEvent((Player) event.getDamager(), slapperEntity);
            this.plugin.getServer().getPluginManager().callEvent(slapperAttackEvent);

        } else if (event.getEntity() instanceof SlapperHuman slapperHuman) {
            SlapperInteractEvent slapperAttackEvent = new SlapperInteractEvent((Player) event.getDamager(), slapperHuman);
            this.plugin.getServer().getPluginManager().callEvent(slapperAttackEvent);
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerInteractAtEntity(PlayerInteractEntityEvent event) {
        if (event.isCancelled()) return;
        if (event.getEntity() instanceof SlapperEntity slapperEntity) {
            SlapperInteractEvent slapperInteractEvent = new SlapperInteractEvent(event.getPlayer(), slapperEntity);
            this.plugin.getServer().getPluginManager().callEvent(slapperInteractEvent);

        } else if (event.getEntity() instanceof SlapperHuman slapperHuman) {
            SlapperInteractEvent slapperInteractEvent = new SlapperInteractEvent(event.getPlayer(), slapperHuman);
            this.plugin.getServer().getPluginManager().callEvent(slapperInteractEvent);
        }
    }

    @EventHandler
    public void onEntityMove(EntityMotionEvent event) {
        if (event.getEntity() instanceof SlapperEntity || event.getEntity() instanceof SlapperHuman) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onSlapperDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof SlapperEntity || event.getEntity() instanceof SlapperHuman) {
            event.setCancelled(true);
        }
    }

//    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
//    public void onSlapperInteract(SlapperInteractEvent event) {
//        if (event.isCancelled()) return;
//        event.getEntity().namedTag.getList("SlapperAPI").forEach(tag -> {
//            if (tag instanceof SlapperEventHandler handler) {
//                handler.onInteract(event);
//            }
//        });
//    }
}


