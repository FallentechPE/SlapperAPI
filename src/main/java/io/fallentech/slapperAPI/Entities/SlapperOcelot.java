package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityOcelot;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperOcelot extends SlapperEntity {

    public SlapperOcelot(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityOcelot.NETWORK_ID;
    }
}
