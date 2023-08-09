package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityVillager;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperVillager extends SlapperEntity {

    public SlapperVillager(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityVillager.NETWORK_ID;
    }
}
