package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityWolf;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperWolf extends SlapperEntity {

    public SlapperWolf(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityWolf.NETWORK_ID;
    }
}
