package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityRabbit;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperRabbit extends SlapperEntity {

    public SlapperRabbit(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityRabbit.NETWORK_ID;
    }
}
