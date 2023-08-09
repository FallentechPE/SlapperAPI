package io.fallentech.slapperAPI.Events;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.player.PlayerEvent;
import io.fallentech.slapperAPI.Entities.SlapperEntity;
import io.fallentech.slapperAPI.Entities.SlapperHuman;

/**
 * Fired when a {@link Player} interacts with a {@link SlapperEntity} (left or right click)
 */
public final class SlapperInteractEvent extends PlayerEvent implements Cancellable {
    private final Player player;
    private final Entity entity;

    public SlapperInteractEvent(Player player, Entity entity) {
        this.player = player;
        this.entity = entity;
    }

    /**
     * Gets the {@link Player} interacting with the {@link SlapperEntity}
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the {@link SlapperEntity} being interacted with.<br>
     * <font color="yellow">Warning: This may either return a {@link SlapperHuman} or a {@link SlapperEntity}. Be sure to check the type before casting.</font><br>
     * Use {@link #getSlapperHuman getSlapperHuman} or {@link #getSlapperEntity getSlapperEntity} to get the correct type.
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * Gets the {@link SlapperHuman} being interacted with.
     */
    public SlapperHuman getSlapperHuman() {
        if (entity instanceof SlapperHuman human) return human;
        return null;
    }

    /**
     * Gets the {@link SlapperEntity} being interacted with.
     */
    public SlapperEntity getSlapperEntity() {
        if (entity instanceof SlapperEntity slapper) return slapper;
        return null;
    }
}
