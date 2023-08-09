package io.fallentech.slapperAPI.Events;

import cn.nukkit.event.Cancellable;
import cn.nukkit.event.entity.EntityEvent;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperDeletionEvent extends EntityEvent implements Cancellable {
    private final SlapperEntity entity;

    public SlapperDeletionEvent(SlapperEntity entity) {
        this.entity = entity;
    }

    public SlapperEntity getEntity() {
        return entity;
    }
}
