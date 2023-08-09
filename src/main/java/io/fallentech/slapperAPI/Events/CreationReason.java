package io.fallentech.slapperAPI.Events;

public enum CreationReason {
    PLUGIN("Plugin "),
    COMMAND("Command "),
    NATURAL("Natural "),
    SPAWNER("Spawner "),
    EGG("Egg "),
    OTHER("Other ");

    private final String reason;

    CreationReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return this.reason;
    }

    public String toString() {
        return this.reason;
    }
}
