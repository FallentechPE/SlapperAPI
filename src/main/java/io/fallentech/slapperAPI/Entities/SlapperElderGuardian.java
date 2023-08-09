package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityElderGuardian;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperElderGuardian extends SlapperEntity {

    public SlapperElderGuardian(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityElderGuardian.NETWORK_ID;
    }
}
