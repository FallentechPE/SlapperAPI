package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityPig;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperPig extends SlapperEntity {

    public SlapperPig(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityPig.NETWORK_ID;
    }
}
