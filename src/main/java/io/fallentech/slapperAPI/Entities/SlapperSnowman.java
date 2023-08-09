package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntitySnowGolem;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSnowman extends SlapperEntity {

    public SlapperSnowman(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySnowGolem.NETWORK_ID;
    }
}
