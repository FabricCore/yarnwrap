package yarnwrap.world.level.storage;
public class LevelSummary { public net.minecraft.world.level.storage.LevelSummary wrapperContained; public LevelSummary(net.minecraft.world.level.storage.LevelSummary wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.level.storage.LevelSummary.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.level.storage.LevelSummary.name = value; }

// public boolean requiresConversion() { return wrapperContained.requiresConversion; }
// public void requiresConversion(boolean value) { wrapperContained.requiresConversion = value; }
// public static boolean requiresConversion() { return net.minecraft.world.level.storage.LevelSummary.requiresConversion; }
// public static void requiresConversion(boolean value, ) { net.minecraft.world.level.storage.LevelSummary.requiresConversion = value; }

// public boolean locked() { return wrapperContained.locked; }
// public void locked(boolean value) { wrapperContained.locked = value; }
// public static boolean locked() { return net.minecraft.world.level.storage.LevelSummary.locked; }
// public static void locked(boolean value, ) { net.minecraft.world.level.storage.LevelSummary.locked = value; }

// public java.nio.file.Path iconPath() { return wrapperContained.iconPath; }
// public void iconPath(java.nio.file.Path value) { wrapperContained.iconPath = value; }
// public static java.nio.file.Path iconPath() { return net.minecraft.world.level.storage.LevelSummary.iconPath; }
// public static void iconPath(java.nio.file.Path value, ) { net.minecraft.world.level.storage.LevelSummary.iconPath = value; }

// public yarnwrap.text.Text details() { return new yarnwrap.text.Text(wrapperContained.details); }
// public void details(yarnwrap.text.Text value) { wrapperContained.details = value.wrapperContained; }
// public static yarnwrap.text.Text details() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelSummary.details); }
// public static void details(yarnwrap.text.Text value, ) { net.minecraft.world.level.storage.LevelSummary.details = value.wrapperContained; }

// public yarnwrap.world.level.LevelInfo levelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.levelInfo); }
// public void levelInfo(yarnwrap.world.level.LevelInfo value) { wrapperContained.levelInfo = value.wrapperContained; }
// public static yarnwrap.world.level.LevelInfo levelInfo() { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.storage.LevelSummary.levelInfo); }
// public static void levelInfo(yarnwrap.world.level.LevelInfo value, ) { net.minecraft.world.level.storage.LevelSummary.levelInfo = value.wrapperContained; }

// public yarnwrap.world.level.storage.SaveVersionInfo versionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.versionInfo); }
// public void versionInfo(yarnwrap.world.level.storage.SaveVersionInfo value) { wrapperContained.versionInfo = value.wrapperContained; }
// public static yarnwrap.world.level.storage.SaveVersionInfo versionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(net.minecraft.world.level.storage.LevelSummary.versionInfo); }
// public static void versionInfo(yarnwrap.world.level.storage.SaveVersionInfo value, ) { net.minecraft.world.level.storage.LevelSummary.versionInfo = value.wrapperContained; }

// public boolean experimental() { return wrapperContained.experimental; }
// public void experimental(boolean value) { wrapperContained.experimental = value; }
// public static boolean experimental() { return net.minecraft.world.level.storage.LevelSummary.experimental; }
// public static void experimental(boolean value, ) { net.minecraft.world.level.storage.LevelSummary.experimental = value; }

// public yarnwrap.text.Text SELECT_WORLD_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECT_WORLD_TEXT); }
// public void SELECT_WORLD_TEXT(yarnwrap.text.Text value) { wrapperContained.SELECT_WORLD_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text SELECT_WORLD_TEXT() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelSummary.SELECT_WORLD_TEXT); }
// public static void SELECT_WORLD_TEXT(yarnwrap.text.Text value, ) { net.minecraft.world.level.storage.LevelSummary.SELECT_WORLD_TEXT = value.wrapperContained; }

public LevelSummary(yarnwrap.world.level.LevelInfo levelInfo,yarnwrap.world.level.storage.SaveVersionInfo versionInfo,java.lang.String name,boolean requiresConversion,boolean locked,boolean experimental,java.nio.file.Path iconPath) { this.wrapperContained = new net.minecraft.world.level.storage.LevelSummary(levelInfo.wrapperContained,versionInfo.wrapperContained,name,requiresConversion,locked,experimental,iconPath); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public static int compareTo(java.lang.Object other, ) { return net.minecraft.world.level.storage.LevelSummary.compareTo(other); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.world.level.storage.LevelSummary.getGameMode()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.world.level.storage.LevelSummary.getName(); }
public long getLastPlayed() { return wrapperContained.getLastPlayed(); }
// public static long getLastPlayed() { return net.minecraft.world.level.storage.LevelSummary.getLastPlayed(); }
public java.lang.String getDisplayName() { return wrapperContained.getDisplayName(); }
// public static java.lang.String getDisplayName() { return net.minecraft.world.level.storage.LevelSummary.getDisplayName(); }
// public boolean requiresConversion() { return wrapperContained.requiresConversion(); }
// // public static boolean requiresConversion() { return net.minecraft.world.level.storage.LevelSummary.requiresConversion(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
// public static boolean isHardcore() { return net.minecraft.world.level.storage.LevelSummary.isHardcore(); }
public yarnwrap.text.MutableText getVersion() { return new yarnwrap.text.MutableText(wrapperContained.getVersion()); }
// public static yarnwrap.text.MutableText getVersion() { return new yarnwrap.text.MutableText(net.minecraft.world.level.storage.LevelSummary.getVersion()); }
public boolean hasCheats() { return wrapperContained.hasCheats(); }
// public static boolean hasCheats() { return net.minecraft.world.level.storage.LevelSummary.hasCheats(); }
public java.nio.file.Path getIconPath() { return wrapperContained.getIconPath(); }
// public static java.nio.file.Path getIconPath() { return net.minecraft.world.level.storage.LevelSummary.getIconPath(); }
public boolean isLocked() { return wrapperContained.isLocked(); }
// public static boolean isLocked() { return net.minecraft.world.level.storage.LevelSummary.isLocked(); }
public yarnwrap.text.Text getDetails() { return new yarnwrap.text.Text(wrapperContained.getDetails()); }
// public static yarnwrap.text.Text getDetails() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelSummary.getDetails()); }
// public yarnwrap.text.Text createDetails() { return new yarnwrap.text.Text(wrapperContained.createDetails()); }
// public static yarnwrap.text.Text createDetails() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelSummary.createDetails()); }
public yarnwrap.world.level.storage.SaveVersionInfo getVersionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(wrapperContained.getVersionInfo()); }
// public static yarnwrap.world.level.storage.SaveVersionInfo getVersionInfo() { return new yarnwrap.world.level.storage.SaveVersionInfo(net.minecraft.world.level.storage.LevelSummary.getVersionInfo()); }
public Object getConversionWarning() { return wrapperContained.getConversionWarning(); }
// public static Object getConversionWarning() { return net.minecraft.world.level.storage.LevelSummary.getConversionWarning(); }
public boolean isUnavailable() { return wrapperContained.isUnavailable(); }
// public static boolean isUnavailable() { return net.minecraft.world.level.storage.LevelSummary.isUnavailable(); }
public yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(wrapperContained.getLevelInfo()); }
// public static yarnwrap.world.level.LevelInfo getLevelInfo() { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.storage.LevelSummary.getLevelInfo()); }
public boolean isVersionAvailable() { return wrapperContained.isVersionAvailable(); }
// public static boolean isVersionAvailable() { return net.minecraft.world.level.storage.LevelSummary.isVersionAvailable(); }
public boolean isExperimental() { return wrapperContained.isExperimental(); }
// public static boolean isExperimental() { return net.minecraft.world.level.storage.LevelSummary.isExperimental(); }
public boolean shouldPromptBackup() { return wrapperContained.shouldPromptBackup(); }
// public static boolean shouldPromptBackup() { return net.minecraft.world.level.storage.LevelSummary.shouldPromptBackup(); }
public boolean wouldBeDowngraded() { return wrapperContained.wouldBeDowngraded(); }
// public static boolean wouldBeDowngraded() { return net.minecraft.world.level.storage.LevelSummary.wouldBeDowngraded(); }
public yarnwrap.text.Text getSelectWorldText() { return new yarnwrap.text.Text(wrapperContained.getSelectWorldText()); }
// public static yarnwrap.text.Text getSelectWorldText() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelSummary.getSelectWorldText()); }
public boolean isSelectable() { return wrapperContained.isSelectable(); }
// public static boolean isSelectable() { return net.minecraft.world.level.storage.LevelSummary.isSelectable(); }
public boolean isEditable() { return wrapperContained.isEditable(); }
// public static boolean isEditable() { return net.minecraft.world.level.storage.LevelSummary.isEditable(); }
public boolean isRecreatable() { return wrapperContained.isRecreatable(); }
// public static boolean isRecreatable() { return net.minecraft.world.level.storage.LevelSummary.isRecreatable(); }
public boolean isDeletable() { return wrapperContained.isDeletable(); }
// public static boolean isDeletable() { return net.minecraft.world.level.storage.LevelSummary.isDeletable(); }
public boolean isImmediatelyLoadable() { return wrapperContained.isImmediatelyLoadable(); }
// public static boolean isImmediatelyLoadable() { return net.minecraft.world.level.storage.LevelSummary.isImmediatelyLoadable(); }

}