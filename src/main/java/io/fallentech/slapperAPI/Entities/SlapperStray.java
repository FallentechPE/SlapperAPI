package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityStray;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperStray extends SlapperEntity {

    public SlapperStray(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityStray.NETWORK_ID;
    }
}
