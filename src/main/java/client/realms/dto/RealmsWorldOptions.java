package yarnwrap.client.realms.dto;
public class RealmsWorldOptions { public net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained; public RealmsWorldOptions(net.minecraft.client.realms.dto.RealmsWorldOptions wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean pvp() { return wrapperContained.pvp; }
public boolean spawnAnimals() { return wrapperContained.spawnAnimals; }
public boolean spawnMonsters() { return wrapperContained.spawnMonsters; }
public boolean spawnNpcs() { return wrapperContained.spawnNpcs; }
public int spawnProtection() { return wrapperContained.spawnProtection; }
public boolean commandBlocks() { return wrapperContained.commandBlocks; }
public boolean forceGameMode() { return wrapperContained.forceGameMode; }
public int difficulty() { return wrapperContained.difficulty; }
public int gameMode() { return wrapperContained.gameMode; }
// public java.lang.String slotName() { return wrapperContained.slotName; }
public long templateId() { return wrapperContained.templateId; }
public java.lang.String templateImage() { return wrapperContained.templateImage; }
public boolean empty() { return wrapperContained.empty; }
// public java.lang.String DEFAULT_WORLD_TEMPLATE_IMAGE() { return wrapperContained.DEFAULT_WORLD_TEMPLATE_IMAGE; }
// public int DEFAULT_DIFFICULTY() { return wrapperContained.DEFAULT_DIFFICULTY; }
// public java.lang.String DEFAULT_SLOT_NAME() { return wrapperContained.DEFAULT_SLOT_NAME; }
// public long DEFAULT_WORLD_TEMPLATE_ID() { return wrapperContained.DEFAULT_WORLD_TEMPLATE_ID; }
// public Object DEFAULT_COMPATIBILITY() { return wrapperContained.DEFAULT_COMPATIBILITY; }
public java.lang.String version() { return wrapperContained.version; }
public Object compatibility() { return wrapperContained.compatibility; }
public yarnwrap.client.realms.dto.RealmsWorldOptions getDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getDefaults()); }
public java.lang.String getSlotName(int index) { return wrapperContained.getSlotName(index); }
public yarnwrap.client.realms.dto.RealmsWorldOptions parse(com.google.gson.JsonObject json) { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.parse(json)); }
public void setEmpty(boolean empty) { wrapperContained.setEmpty(empty); }
public yarnwrap.client.realms.dto.RealmsWorldOptions getEmptyDefaults() { return new yarnwrap.client.realms.dto.RealmsWorldOptions(wrapperContained.getEmptyDefaults()); }
public java.lang.String getDefaultSlotName(int index) { return wrapperContained.getDefaultSlotName(index); }
public java.lang.String toJson() { return wrapperContained.toJson(); }

}