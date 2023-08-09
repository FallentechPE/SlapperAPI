package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityZombieVillager;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperZombieVillager extends SlapperEntity {

    public SlapperZombieVillager(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityZombieVillager.NETWORK_ID;
    }
}
