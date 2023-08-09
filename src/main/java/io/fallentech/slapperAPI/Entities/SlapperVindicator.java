package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityVindicator;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperVindicator extends SlapperEntity {

    public SlapperVindicator(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityVindicator.NETWORK_ID;
    }
}
