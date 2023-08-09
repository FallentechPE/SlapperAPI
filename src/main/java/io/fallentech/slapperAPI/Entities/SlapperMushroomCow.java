package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityMooshroom;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperMushroomCow extends SlapperEntity {

    public SlapperMushroomCow(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityMooshroom.NETWORK_ID;
    }
}
