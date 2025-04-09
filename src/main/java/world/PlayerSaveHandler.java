package yarnwrap.world;
public class PlayerSaveHandler { public net.minecraft.world.PlayerSaveHandler wrapperContained; public PlayerSaveHandler(net.minecraft.world.PlayerSaveHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File playerDataDir() { return wrapperContained.playerDataDir; }
// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
// public java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension) { return wrapperContained.loadPlayerData(player.wrapperContained,extension); }
public void savePlayerData(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.savePlayerData(player.wrapperContained); }
// public void backupCorruptedPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension) { wrapperContained.backupCorruptedPlayerData(player.wrapperContained,extension); }
public java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.loadPlayerData(player.wrapperContained); }

}