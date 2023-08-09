package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityHorse;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperHorse extends SlapperEntity {

    public SlapperHorse(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityHorse.NETWORK_ID;
    }
}
