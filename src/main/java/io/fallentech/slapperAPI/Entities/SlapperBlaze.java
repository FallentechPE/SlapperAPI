package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityBlaze;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperBlaze extends SlapperEntity {

    public SlapperBlaze(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityBlaze.NETWORK_ID;
    }
}
