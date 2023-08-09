package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityBat;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperBat extends SlapperEntity {

    public SlapperBat(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityBat.NETWORK_ID;
    }
}
