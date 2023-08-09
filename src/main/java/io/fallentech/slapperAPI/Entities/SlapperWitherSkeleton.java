package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityWitherSkeleton;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperWitherSkeleton extends SlapperEntity {

    public SlapperWitherSkeleton(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityWitherSkeleton.NETWORK_ID;
    }
}
