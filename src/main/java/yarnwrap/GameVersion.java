package yarnwrap;
public class GameVersion { public net.minecraft.GameVersion wrapperContained; public GameVersion(net.minecraft.GameVersion wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.SaveVersion getSaveVersion() { return new yarnwrap.SaveVersion(wrapperContained.getSaveVersion()); }
public int getResourceVersion(yarnwrap.resource.ResourceType type) { return wrapperContained.getResourceVersion(type.wrapperContained); }
public java.lang.String getId() { return wrapperContained.getId(); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getProtocolVersion() { return wrapperContained.getProtocolVersion(); }
public java.util.Date getBuildTime() { return wrapperContained.getBuildTime(); }
public boolean isStable() { return wrapperContained.isStable(); }

}