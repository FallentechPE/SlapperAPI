package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntitySquid;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSquid extends SlapperEntity {

    public SlapperSquid(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySquid.NETWORK_ID;
    }
}
