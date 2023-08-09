package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntitySlime;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSlime extends SlapperEntity {

    public SlapperSlime(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySlime.NETWORK_ID;
    }
}
