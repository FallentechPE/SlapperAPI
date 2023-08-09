package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityEvoker;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperEvoker extends SlapperEntity {

    public SlapperEvoker(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityEvoker.NETWORK_ID;
    }
}
