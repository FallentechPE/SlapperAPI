package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntitySpider;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperSpider extends SlapperEntity {

    public SlapperSpider(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntitySpider.NETWORK_ID;
    }
}
