package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityCreeper;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperCreeper extends SlapperEntity {

    public SlapperCreeper(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityCreeper.NETWORK_ID;
    }
}
