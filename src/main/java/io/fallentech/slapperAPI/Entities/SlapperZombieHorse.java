package io.fallentech.slapperAPI.Entities;

import cn.nukkit.entity.passive.EntityZombieHorse;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperZombieHorse extends SlapperEntity {

    public SlapperZombieHorse(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityZombieHorse.NETWORK_ID;
    }

    public void spawnToAll() {
        super.spawnToAll();
    }
}
