package io.fallentech.slapperAPI.Events;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.entity.EntityEvent;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

import javax.annotation.Nullable;

public class SlapperCreationEvent extends EntityEvent implements Cancellable {
    private final SlapperEntity entity;
    private final CreationReason cause;
    private final String type;
    private final @Nullable Player creator;


    public SlapperCreationEvent(SlapperEntity entity, CreationReason cause, String type, @Nullable Player creator) {
        this.entity = entity;
        this.cause = cause;
        this.type = type;
        this.creator = creator;
    }

    public SlapperEntity getEntity() {
        return entity;
    }

    public CreationReason getCause() {
        return cause;
    }

    public String getType() {
        return type;
    }

    public @Nullable Player getCreator() {
        return creator;
    }
}
