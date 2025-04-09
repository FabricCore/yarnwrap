package yarnwrap.util;
public class WorldSavePath { public net.minecraft.util.WorldSavePath wrapperContained; public WorldSavePath(net.minecraft.util.WorldSavePath wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.WorldSavePath ROOT() { return new yarnwrap.util.WorldSavePath(wrapperContained.ROOT); }
// public java.lang.String relativePath() { return wrapperContained.relativePath; }
public java.lang.String getRelativePath() { return wrapperContained.getRelativePath(); }

}