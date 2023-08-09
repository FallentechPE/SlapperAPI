package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityMule;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperMule extends SlapperEntity {

    public SlapperMule(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityMule.NETWORK_ID;
    }
}
