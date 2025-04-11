package yarnwrap.client.realms.dto;
public class RealmsWorldOptions { public net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained; public RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean pvp() { return wrapperContained.pvp; }
// public void pvp(boolean value) { wrapperContained.pvp = value; }
public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
// public void spawnAnimals(boolean value) { wrapperContained.spawnAnimals = value; }
public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
// public void spawnMonsters(boolean value) { wrapperContained.spawnMonsters = value; }
public boolean spawnNpcs() { return wrapperContained.spawnNpcs; }
// public void spawnNpcs(boolean value) { wrapperContained.spawnNpcs = value; }
public int spawnProtection() { return wrapperContained.spawnProtection; }
// public void spawnProtection(int value) { wrapperContained.spawnProtection = value; }
public boolean commandBlocks() { return wrapperContained.commandBlocks; }
// public void commandBlocks(boolean value) { wrapperContained.commandBlocks = value; }
public boolean forceGameMode() { return wrapperContained.forceGameMode; }
// public void forceGameMode(boolean value) { wrapperContained.forceGameMode = value; }
public int difficulty() { return wrapperContained.difficulty; }
// public void difficulty(int value) { wrapperContained.difficulty = value; }
public int gameMode() { return wrapperContained.gameMode; }
// public void gameMode(int value) { wrapperContained.gameMode = value; }
// public java.lang.String slotName() { return wrapperContained.slotName; }
// public void slotName(java.lang.String value) { wrapperContained.slotName = value; }
public long templateId() { return wrapperContained.templateId; }
public void templateId(long value) { wrapperContained.templateId = value; }
public java.lang.String templateImage() { return wrapperContained.templateImage; }
public void templateImage(java.lang.String value) { wrapperContained.templateImage = value; }
public boolean empty() { return wrapperContained.empty; }
public void empty(boolean value) { wrapperContained.empty = value; }
// public java.lang.String DEFAULT_WORLD_TEMPLATE_IMAGE() { return wrapperContained.DEFAULT_WORLD_TEMPLATE_IMAGE; }
// public void DEFAULT_WORLD_TEMPLATE_IMAGE(java.lang.String value) { wrapperContained.DEFAULT_WORLD_TEMPLATE_IMAGE = value; }
// public int DEFAULT_DIFFICULTY() { return wrapperContained.DEFAULT_DIFFICULTY; }
// public void DEFAULT_DIFFICULTY(int value) { wrapperContained.DEFAULT_DIFFICULTY = value; }
// public java.lang.String DEFAULT_SLOT_NAME() { return wrapperContained.DEFAULT_SLOT_NAME; }
// public void DEFAULT_SLOT_NAME(java.lang.String value) { wrapperContained.DEFAULT_SLOT_NAME = value; }
// public long DEFAULT_WORLD_TEMPLATE_ID() { return wrapperContained.DEFAULT_WORLD_TEMPLATE_ID; }
// public void DEFAULT_WORLD_TEMPLATE_ID(long value) { wrapperContained.DEFAULT_WORLD_TEMPLATE_ID = value; }
// public Object DEFAULT_COMPATIBILITY() { return wrapperContained.DEFAULT_COMPATIBILITY; }
// // public void DEFAULT_COMPATIBILITY(Object value) { wrapperContained.DEFAULT_COMPATIBILITY = value; }
public java.lang.String version() { return wrapperContained.version; }
// public void version(java.lang.String value) { wrapperContained.version = value; }
public Object compatibility() { return wrapperContained.compatibility; }
// // public void compatibility(Object value) { wrapperContained.compatibility = value; }
public yarnwrap.client.realms.dto.RealmsWorldOptions getDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getDefaults()); }
public java.lang.String getSlotName(int index) { return wrapperContained.getSlotName(index); }
public yarnwrap.client.realms.dto.RealmsWorldOptions parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.parse(json)); }
public void setEmpty(boolean empty) { wrapperContained.setEmpty(empty); }
public yarnwrap.client.realms.dto.RealmsWorldOptions getEmptyDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getEmptyDefaults()); }
public java.lang.String getDefaultSlotName(int index) { return wrapperContained.getDefaultSlotName(index); }
public java.lang.String toJson() { return wrapperContained.toJson(); }

}