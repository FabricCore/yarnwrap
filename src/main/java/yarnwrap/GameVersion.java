package yarnwrap;
public class GameVersion { public net.minecraft.GameVersion wrapperContained; public GameVersion(net.minecraft.GameVersion wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.SaveVersion getSaveVersion() { return new yarnwrap.SaveVersion(wrapperContained.getSaveVersion()); }
// public static yarnwrap.SaveVersion getSaveVersion() { return new yarnwrap.SaveVersion(net.minecraft.GameVersion.getSaveVersion()); }
public int getResourceVersion(yarnwrap.resource.ResourceType type) { return wrapperContained.getResourceVersion(type.wrapperContained); }
// public static int getResourceVersion(yarnwrap.resource.ResourceType type, ) { return net.minecraft.GameVersion.getResourceVersion(type.wrapperContained); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.GameVersion.getId(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.GameVersion.getName(); }
public int getProtocolVersion() { return wrapperContained.getProtocolVersion(); }
// public static int getProtocolVersion() { return net.minecraft.GameVersion.getProtocolVersion(); }
public java.util.Date getBuildTime() { return wrapperContained.getBuildTime(); }
// public static java.util.Date getBuildTime() { return net.minecraft.GameVersion.getBuildTime(); }
public boolean isStable() { return wrapperContained.isStable(); }
// public static boolean isStable() { return net.minecraft.GameVersion.isStable(); }

}