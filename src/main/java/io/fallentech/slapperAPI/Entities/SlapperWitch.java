package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityWitch;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperWitch extends SlapperEntity {

    public SlapperWitch(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityWitch.NETWORK_ID;
    }
}
