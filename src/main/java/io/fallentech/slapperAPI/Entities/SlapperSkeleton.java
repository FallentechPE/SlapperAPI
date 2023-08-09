package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntitySkeleton;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSkeleton extends SlapperEntity {

    public SlapperSkeleton(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySkeleton.NETWORK_ID;
    }
}
