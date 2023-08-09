package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityGhast;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperGhast extends SlapperEntity {

    public SlapperGhast(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityGhast.NETWORK_ID;
    }
}
