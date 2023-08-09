package io.fallentech.slapperAPI.Entities.Misc;

import cn.nukkit.entity.item.EntityChestBoat;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperChestBoat extends SlapperEntity {

    public SlapperChestBoat(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityChestBoat.NETWORK_ID;
    }
}
