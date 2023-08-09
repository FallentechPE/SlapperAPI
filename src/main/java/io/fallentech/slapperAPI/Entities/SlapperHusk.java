package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityHusk;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperHusk extends SlapperEntity {

    public SlapperHusk(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityHusk.NETWORK_ID;
    }
}
