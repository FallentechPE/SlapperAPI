package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityMagmaCube;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperLavaSlime extends SlapperEntity {

    public SlapperLavaSlime(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityMagmaCube.NETWORK_ID;
    }
}
