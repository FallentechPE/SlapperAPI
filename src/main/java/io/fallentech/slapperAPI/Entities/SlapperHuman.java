package io.fallentech.slapperAPI.Entities;

import cn.nukkit.Player;
import cn.nukkit.entity.EntityHuman;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

public class SlapperHuman extends EntityHuman {

    public SlapperHuman(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    @Override
    public int getNetworkId() {
        return EntityHuman.NETWORK_ID;
    }

    @Override
    public void saveNBT() {
        super.saveNBT();
    }

    public void sendSpawnPacket(Player player) {
        super.spawnTo(player);

        if (!this.namedTag.getString("MenuName").equals("")) {
            player.getServer().updatePlayerListData(this.getUniqueId(), this.getId(), this.namedTag.getString("MenuName"), this.skin, new Player[]{player});
        }
    }
}
