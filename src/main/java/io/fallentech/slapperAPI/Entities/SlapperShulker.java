package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityShulker;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperShulker extends SlapperEntity {

    public SlapperShulker(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityShulker.NETWORK_ID;
    }
}
