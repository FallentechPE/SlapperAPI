package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityIronGolem;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperIronGolem extends SlapperEntity {

    public SlapperIronGolem(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityIronGolem.NETWORK_ID;
    }
}
