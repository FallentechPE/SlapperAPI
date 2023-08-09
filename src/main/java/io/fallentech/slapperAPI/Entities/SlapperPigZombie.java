package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityZombiePigman;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperPigZombie extends SlapperEntity {

    public SlapperPigZombie(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityZombiePigman.NETWORK_ID;
    }
}
