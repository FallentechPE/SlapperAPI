package io.fallentech.slapperAPI.Entities.Misc;

import cn.nukkit.entity.item.EntityPrimedTNT;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperPrimedTNT extends SlapperEntity {

    public SlapperPrimedTNT(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityPrimedTNT.NETWORK_ID;
    }
}
