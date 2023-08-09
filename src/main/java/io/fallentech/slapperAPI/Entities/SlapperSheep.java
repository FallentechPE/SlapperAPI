package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntitySheep;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSheep extends SlapperEntity {

    public SlapperSheep(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySheep.NETWORK_ID;
    }
}
