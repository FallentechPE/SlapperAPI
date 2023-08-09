package io.fallentech.slapperAPI.Entities.Misc;

import cn.nukkit.entity.item.EntityFallingBlock;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperBlock extends SlapperEntity {

    public SlapperBlock(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityFallingBlock.NETWORK_ID;
    }
}
