package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityCow;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperCow extends SlapperEntity {

    public SlapperCow(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityCow.NETWORK_ID;
    }
}
