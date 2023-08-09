package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityDonkey;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperDonkey extends SlapperEntity {

    public SlapperDonkey(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityDonkey.NETWORK_ID;
    }
}
