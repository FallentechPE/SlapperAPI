package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntitySkeletonHorse;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSkeletonHorse extends SlapperEntity {

    public SlapperSkeletonHorse(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySkeletonHorse.NETWORK_ID;
    }
}
