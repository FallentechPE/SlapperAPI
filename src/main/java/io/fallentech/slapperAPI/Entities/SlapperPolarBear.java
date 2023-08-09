package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityPolarBear;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperPolarBear extends SlapperEntity {

    public SlapperPolarBear(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityPolarBear.NETWORK_ID;
    }
}
