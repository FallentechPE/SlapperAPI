package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.mob.EntityCaveSpider;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperCaveSpider extends SlapperEntity {

    public SlapperCaveSpider(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityCaveSpider.NETWORK_ID;
    }
}
