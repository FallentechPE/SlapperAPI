package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityEnderman;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperEnderman extends SlapperEntity {

    public SlapperEnderman(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityEnderman.NETWORK_ID;
    }
}
