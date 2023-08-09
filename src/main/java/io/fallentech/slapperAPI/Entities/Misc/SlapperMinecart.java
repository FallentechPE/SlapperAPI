package io.fallentech.slapperAPI.Entities.Misc;

import cn.nukkit.entity.item.EntityMinecartEmpty;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import io.fallentech.slapperAPI.Entities.SlapperEntity;

public class SlapperMinecart extends SlapperEntity {

    public SlapperMinecart(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityMinecartEmpty.NETWORK_ID;
    }
}
