package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityGuardian;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperGuardian extends SlapperEntity {

    public SlapperGuardian(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityGuardian.NETWORK_ID;
    }
}
