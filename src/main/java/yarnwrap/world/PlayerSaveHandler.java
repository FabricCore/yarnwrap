package yarnwrap.world;
public class PlayerSaveHandler { public net.minecraft.world.PlayerSaveHandler wrapperContained; public PlayerSaveHandler(net.minecraft.world.PlayerSaveHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.File playerDataDir() { return wrapperContained.playerDataDir; }
// public void playerDataDir(java.io.File value) { wrapperContained.playerDataDir = value; }
// public static java.io.File playerDataDir() { return net.minecraft.world.PlayerSaveHandler.playerDataDir; }
// public static void playerDataDir(java.io.File value, ) { net.minecraft.world.PlayerSaveHandler.playerDataDir = value; }

// public com.mojang.datafixers.DataFixer dataFixer() { return wrapperContained.dataFixer; }
// public void dataFixer(com.mojang.datafixers.DataFixer value) { wrapperContained.dataFixer = value; }
// public static com.mojang.datafixers.DataFixer dataFixer() { return net.minecraft.world.PlayerSaveHandler.dataFixer; }
// public static void dataFixer(com.mojang.datafixers.DataFixer value, ) { net.minecraft.world.PlayerSaveHandler.dataFixer = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.PlayerSaveHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.PlayerSaveHandler.LOGGER = value; }

// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
// public void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMATTER = value; }
// public static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return net.minecraft.world.PlayerSaveHandler.DATE_TIME_FORMATTER; }
// public static void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value, ) { net.minecraft.world.PlayerSaveHandler.DATE_TIME_FORMATTER = value; }

// public PlayerSaveHandler(Object session,com.mojang.datafixers.DataFixer dataFixer) { this.wrapperContained = new net.minecraft.world.PlayerSaveHandler(session,dataFixer); }
// public java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension) { return wrapperContained.loadPlayerData(player.wrapperContained,extension); }
// public static java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension, ) { return net.minecraft.world.PlayerSaveHandler.loadPlayerData(player.wrapperContained,extension); }
public void savePlayerData(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.savePlayerData(player.wrapperContained); }
// public static void savePlayerData(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.world.PlayerSaveHandler.savePlayerData(player.wrapperContained); }
// public void backupCorruptedPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension) { wrapperContained.backupCorruptedPlayerData(player.wrapperContained,extension); }
// public static void backupCorruptedPlayerData(yarnwrap.entity.player.PlayerEntity player,java.lang.String extension, ) { net.minecraft.world.PlayerSaveHandler.backupCorruptedPlayerData(player.wrapperContained,extension); }
// public yarnwrap.nbt.NbtCompound method_55788(yarnwrap.entity.player.PlayerEntity nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_55788(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_55788(yarnwrap.entity.player.PlayerEntity nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.PlayerSaveHandler.method_55788(nbt.wrapperContained)); }
public java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.loadPlayerData(player.wrapperContained); }
// public static java.util.Optional loadPlayerData(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.world.PlayerSaveHandler.loadPlayerData(player.wrapperContained); }

}