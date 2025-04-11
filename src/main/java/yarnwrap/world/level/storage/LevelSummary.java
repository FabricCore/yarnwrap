package yarnwrap.world.level.storage;
public class LevelSummary { public net.minecraft.world.level.storage.LevelSummary wrapperContained; public LevelSummary(net.minecraft.world.level.storage.LevelSummary wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public boolean requiresConversion() { return wrapperContained.requiresConversion; }
// public void requiresConversion(boolean value) { wrapperContained.requiresConversion = value; }
// public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public java.nio.file.Path iconPath() { return wrapperContained.iconPath; }
// public void iconPath(java.nio.file.Path value) { wrapperContained.iconPath = value; }
// public yarnwrap.text.Text details() { return new yarnwrap.text.Text(wrapperContained.details); }
// public void details(yarnwrap.text.Text value) { wrapperContained.details = value.wrapperContained; }
// public yarnwrap.world.level.LevelInfo levelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.levelInfo); }
// public void levelInfo(yarnwrap.world.level.LevelInfo value) { wrapperContained.levelInfo = value.wrapperContained; }
// public yarnwrap.world.level.storage.SaveVersionInfo versionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.versionInfo); }
// public void versionInfo(yarnwrap.world.level.storage.SaveVersionInfo value) { wrapperContained.versionInfo = value.wrapperContained; }
// public boolean experimental() { return wrapperContained.experimental; }
// public void experimental(boolean value) { wrapperContained.experimental = value; }
public yarnwrap.text.Text SELECT_WORLD_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECT_WORLD_TEXT); }
// public void SELECT_WORLD_TEXT(yarnwrap.text.Text value) { wrapperContained.SELECT_WORLD_TEXT = value.wrapperContained; }
public LevelSummary(yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.world.level.storage.SaveVersionInfo versionInfo,java.lang.String name,boolean requiresConversion,boolean locked,boolean experimental,java.nio.file.Path iconPath) { this.wrapperContained = new net.minecraft.world.level.storage.LevelSummary(levelInfo.wrapperContained,versionInfo.wrapperContained,name,requiresConversion,locked,experimental,iconPath); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public java.lang.String getName() { return wrapperContained.getName(); }
public long getLastPlayed() { return wrapperContained.getLastPlayed(); }
public java.lang.String getDisplayName() { return wrapperContained.getDisplayName(); }
// public boolean requiresConversion() { return wrapperContained.requiresConversion(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
public yarnwrap.text.MutableText getVersion() { return new yarnwrap.text.MutableText(wrapperContained.getVersion()); }
public boolean hasCheats() { return wrapperContained.hasCheats(); }
public java.nio.file.Path getIconPath() { return wrapperContained.getIconPath(); }
public boolean isLocked() { return wrapperContained.isLocked(); }
public yarnwrap.text.Text getDetails() { return new yarnwrap.text.Text(wrapperContained.getDetails()); }
// public yarnwrap.text.Text createDetails() { return new yarnwrap.text.Text(wrapperContained.createDetails()); }
public yarnwrap.world.level.storage.SaveVersionInfo getVersionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.getVersionInfo()); }
public Object getConversionWarning() { return wrapperContained.getConversionWarning(); }
public boolean isUnavailable() { return wrapperContained.isUnavailable(); }
public yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.getLevelInfo()); }
public boolean isVersionAvailable() { return wrapperContained.isVersionAvailable(); }
public boolean isExperimental() { return wrapperContained.isExperimental(); }
public boolean shouldPromptBackup() { return wrapperContained.shouldPromptBackup(); }
public boolean wouldBeDowngraded() { return wrapperContained.wouldBeDowngraded(); }
public yarnwrap.text.Text getSelectWorldText() { return new yarnwrap.text.Text(wrapperContained.getSelectWorldText()); }
public boolean isSelectable() { return wrapperContained.isSelectable(); }
public boolean isEditable() { return wrapperContained.isEditable(); }
public boolean isRecreatable() { return wrapperContained.isRecreatable(); }
public boolean isDeletable() { return wrapperContained.isDeletable(); }
public boolean isImmediatelyLoadable() { return wrapperContained.isImmediatelyLoadable(); }

}