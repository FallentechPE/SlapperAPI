package io.fallentech.slapperAPI.Entities;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.nbt.tag.ListTag;
import cn.nukkit.nbt.tag.Tag;
import cn.nukkit.network.protocol.SetEntityDataPacket;

import java.util.ArrayList;
import java.util.List;

public abstract class SlapperEntity extends Entity {
    private final List<String> commands = new ArrayList<>();

    public SlapperEntity(FullChunk chunk, CompoundTag compoundTag) {
        super(chunk, compoundTag);
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    public void removeCommand(String command) {
        this.commands.remove(command);
    }

    public List<String> getCommands() {
        return this.commands;
    }

    public void clearCommands() {
        this.commands.clear();
    }


    public void saveNBT() {
        super.saveNBT();

        int nameTagVisible = this.isNameTagVisible() ? this.isNameTagAlwaysVisible() ? 2 : 1 : 0; // 0 = false, 1 = true, 2 = true and always visible
        // mmmm i shouldn't nest ternary operators like this

        this.namedTag.putByte("NameTagVisible", nameTagVisible);
        this.namedTag.putFloat("Scale", this.getScale());

        ListTag<Tag> commands = new ListTag<>("Commands");

        for (String command : this.commands) {
            commands.add(new CompoundTag()
                    .putString("Command", command)
                    .putString("Name", this.getName()));
        }

        this.namedTag.putList(commands);
    }

    public void sendNameTag(Player player) {
        SetEntityDataPacket packet = new SetEntityDataPacket();
        packet.eid = this.getId();
        packet.metadata = this.dataProperties;

        player.dataPacket(packet);
    }
}
