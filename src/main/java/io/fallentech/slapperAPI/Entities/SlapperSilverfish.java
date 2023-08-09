package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntitySilverfish;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSilverfish extends SlapperEntity {

    public SlapperSilverfish(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySilverfish.NETWORK_ID;
    }
}
