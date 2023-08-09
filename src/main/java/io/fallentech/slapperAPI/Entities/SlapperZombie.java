package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityZombie;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperZombie extends SlapperEntity {

    public SlapperZombie(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityZombie.NETWORK_ID;
    }
}
