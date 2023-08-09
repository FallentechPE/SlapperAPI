package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityWither;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperWither extends SlapperEntity {

    public SlapperWither(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityWither.NETWORK_ID;
    }
}
