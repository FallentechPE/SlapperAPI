package io.fallentech.slapperAPI.Entities.Misc;

import cn.nukkit.entity.item.EntityBoat;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperBoat extends SlapperEntity {

    public SlapperBoat(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityBoat.NETWORK_ID;
    }
}
