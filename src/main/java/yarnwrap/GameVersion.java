package yarnwrap;
public class GameVersion { public net.minecraft.GameVersion wrapperContained; public GameVersion(net.minecraft.GameVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public int packVersion(yarnwrap.resource.ResourceType type) { return wrapperContained.packVersion(type.wrapperContained); }
// public static int packVersion(yarnwrap.resource.ResourceType type, ) { return net.minecraft.GameVersion.packVersion(type.wrapperContained); }

}