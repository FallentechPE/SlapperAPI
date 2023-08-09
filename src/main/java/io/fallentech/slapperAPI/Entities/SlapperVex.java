package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityVex;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperVex extends SlapperEntity {

    public SlapperVex(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityVex.NETWORK_ID;
    }
}
