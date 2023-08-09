package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityEndermite;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperEndermite extends SlapperEntity {

    public SlapperEndermite(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityEndermite.NETWORK_ID;
    }
}
