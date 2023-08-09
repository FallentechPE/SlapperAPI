package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityChicken;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperChicken extends SlapperEntity {

    public SlapperChicken(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityChicken.NETWORK_ID;
    }
}
