package yarnwrap.client.realms.dto;
public class RealmsWorldOptions { public net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained; public RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean pvp() { return wrapperContained.pvp; }
// public void pvp(boolean value) { wrapperContained.pvp = value; }
// public static boolean pvp() { return net.minecraft.client.realms.dto.RealmsWorldOptions.pvp; }
// public static void pvp(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.pvp = value; }

public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public void spawnMonsters(boolean value) { wrapperContained.spawnMonsters = value; }
// public static boolean spawnMonsters() { return net.minecraft.client.realms.dto.RealmsWorldOptions.spawnMonsters; }
// public static void spawnMonsters(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.spawnMonsters = value; }

public int spawnProtection() { return wrapperContained.spawnProtection; }
// public void spawnProtection(int value) { wrapperContained.spawnProtection = value; }
// public static int spawnProtection() { return net.minecraft.client.realms.dto.RealmsWorldOptions.spawnProtection; }
// public static void spawnProtection(int value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.spawnProtection = value; }

public boolean commandBlocks() { return wrapperContained.commandBlocks; }
// public void commandBlocks(boolean value) { wrapperContained.commandBlocks = value; }
// public static boolean commandBlocks() { return net.minecraft.client.realms.dto.RealmsWorldOptions.commandBlocks; }
// public static void commandBlocks(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.commandBlocks = value; }

public boolean forceGameMode() { return wrapperContained.forceGameMode; }
// public void forceGameMode(boolean value) { wrapperContained.forceGameMode = value; }
// public static boolean forceGameMode() { return net.minecraft.client.realms.dto.RealmsWorldOptions.forceGameMode; }
// public static void forceGameMode(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.forceGameMode = value; }

public int difficulty() { return wrapperContained.difficulty; }
// public void difficulty(int value) { wrapperContained.difficulty = value; }
// public static int difficulty() { return net.minecraft.client.realms.dto.RealmsWorldOptions.difficulty; }
// public static void difficulty(int value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.difficulty = value; }

public int gameMode() { return wrapperContained.gameMode; }
// public void gameMode(int value) { wrapperContained.gameMode = value; }
// public static int gameMode() { return net.minecraft.client.realms.dto.RealmsWorldOptions.gameMode; }
// public static void gameMode(int value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.gameMode = value; }

// public java.lang.String slotName() { return wrapperContained.slotName; }
// public void slotName(java.lang.String value) { wrapperContained.slotName = value; }
// public static java.lang.String slotName() { return net.minecraft.client.realms.dto.RealmsWorldOptions.slotName; }
// public static void slotName(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.slotName = value; }

public long templateId() { return wrapperContained.templateId; }
public void templateId(long value) { wrapperContained.templateId = value; }
// public static long templateId() { return net.minecraft.client.realms.dto.RealmsWorldOptions.templateId; }
// public static void templateId(long value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.templateId = value; }

public java.lang.String templateImage() { return wrapperContained.templateImage; }
public void templateImage(java.lang.String value) { wrapperContained.templateImage = value; }
// public static java.lang.String templateImage() { return net.minecraft.client.realms.dto.RealmsWorldOptions.templateImage; }
// public static void templateImage(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.templateImage = value; }

public boolean empty() { return wrapperContained.empty; }
public void empty(boolean value) { wrapperContained.empty = value; }
// public static boolean empty() { return net.minecraft.client.realms.dto.RealmsWorldOptions.empty; }
// public static void empty(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.empty = value; }

public java.lang.String version() { return wrapperContained.version; }
// public void version(java.lang.String value) { wrapperContained.version = value; }
// public static java.lang.String version() { return net.minecraft.client.realms.dto.RealmsWorldOptions.version; }
// public static void version(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.version = value; }

public Object compatibility() { return wrapperContained.compatibility; }
// // public void compatibility(Object value) { wrapperContained.compatibility = value; }
// // public static Object compatibility() { return net.minecraft.client.realms.dto.RealmsWorldOptions.compatibility; }
// // public static void compatibility(Object value, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.compatibility = value; }

// public RealmsWorldOptions(boolean pvp,boolean spawnAnimals,int spawnProtection,boolean commandBlocks,int difficulty,int gameMode,boolean hardcore,java.lang.String slotName,java.lang.String version,Object compatibility) { this.wrapperContained = new net.minecraft.client.realms.dto.RealmsWorldOptions(pvp,spawnAnimals,spawnProtection,commandBlocks,difficulty,gameMode,hardcore,slotName,version,compatibility); }
// public yarnwrap.client.realms.dto.RealmsWorldOptions getDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getDefaults()); }
public static yarnwrap.client.realms.dto.RealmsWorldOptions getDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions.getDefaults()); }
public java.lang.String getSlotName(int index) { return wrapperContained.getSlotName(index); }
// public static java.lang.String getSlotName(int index, ) { return net.minecraft.client.realms.dto.RealmsWorldOptions.getSlotName(index); }
public void setEmpty(boolean empty) { wrapperContained.setEmpty(empty); }
// public static void setEmpty(boolean empty, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.setEmpty(empty); }
// public yarnwrap.client.realms.dto.RealmsWorldOptions getEmptyDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getEmptyDefaults()); }
public static yarnwrap.client.realms.dto.RealmsWorldOptions getEmptyDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions.getEmptyDefaults()); }
public java.lang.String getDefaultSlotName(int index) { return wrapperContained.getDefaultSlotName(index); }
// public static java.lang.String getDefaultSlotName(int index, ) { return net.minecraft.client.realms.dto.RealmsWorldOptions.getDefaultSlotName(index); }
// public yarnwrap.client.realms.dto.RealmsWorldOptions create(yarnwrap.world.GameMode gameMode,boolean commandBlocks,yarnwrap.world.Difficulty difficulty,boolean hardcore,java.lang.String version,java.lang.String slotName) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.create(gameMode.wrapperContained,commandBlocks,difficulty.wrapperContained,hardcore,version,slotName)); }
// public static yarnwrap.client.realms.dto.RealmsWorldOptions create(yarnwrap.world.GameMode gameMode,boolean commandBlocks,yarnwrap.world.Difficulty difficulty,boolean hardcore,java.lang.String version,java.lang.String slotName, ) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions.create(gameMode.wrapperContained,commandBlocks,difficulty.wrapperContained,hardcore,version,slotName)); }
// public yarnwrap.client.realms.dto.RealmsWorldOptions create(yarnwrap.world.level.LevelInfo levelInfo,boolean commandBlocks,java.lang.String version) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.create(levelInfo.wrapperContained,commandBlocks,version)); }
// public static yarnwrap.client.realms.dto.RealmsWorldOptions create(yarnwrap.world.level.LevelInfo levelInfo,boolean commandBlocks,java.lang.String version, ) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions.create(levelInfo.wrapperContained,commandBlocks,version)); }
// public yarnwrap.client.realms.dto.RealmsWorldOptions fromJson(yarnwrap.client.realms.CheckedGson gson,java.lang.String json) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.fromJson(gson.wrapperContained,json)); }
// public static yarnwrap.client.realms.dto.RealmsWorldOptions fromJson(yarnwrap.client.realms.CheckedGson gson,java.lang.String json, ) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions.fromJson(gson.wrapperContained,json)); }
// public void replaceNullsWithDefaults(yarnwrap.client.realms.dto.RealmsWorldOptions options) { wrapperContained.replaceNullsWithDefaults(options.wrapperContained); }
// public static void replaceNullsWithDefaults(yarnwrap.client.realms.dto.RealmsWorldOptions options, ) { net.minecraft.client.realms.dto.RealmsWorldOptions.replaceNullsWithDefaults(options.wrapperContained); }

}