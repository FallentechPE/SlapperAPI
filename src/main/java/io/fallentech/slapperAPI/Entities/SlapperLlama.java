package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityLlama;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperLlama extends SlapperEntity {

    public SlapperLlama(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityLlama.NETWORK_ID;
    }
}
