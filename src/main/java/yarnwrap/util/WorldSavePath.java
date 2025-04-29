package yarnwrap.util;
public class WorldSavePath { public net.minecraft.util.WorldSavePath wrapperContained; public WorldSavePath(net.minecraft.util.WorldSavePath wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.WorldSavePath ROOT() { return new yarnwrap.util.WorldSavePath(wrapperContained.ROOT); }
// public void ROOT(yarnwrap.util.WorldSavePath value) { wrapperContained.ROOT = value.wrapperContained; }
public static yarnwrap.util.WorldSavePath ROOT() { return new yarnwrap.util.WorldSavePath(net.minecraft.util.WorldSavePath.ROOT); }
// public static void ROOT(yarnwrap.util.WorldSavePath value, ) { net.minecraft.util.WorldSavePath.ROOT = value.wrapperContained; }

// public java.lang.String relativePath() { return wrapperContained.relativePath; }
// public void relativePath(java.lang.String value) { wrapperContained.relativePath = value; }
// public static java.lang.String relativePath() { return net.minecraft.util.WorldSavePath.relativePath; }
// public static void relativePath(java.lang.String value, ) { net.minecraft.util.WorldSavePath.relativePath = value; }

// public WorldSavePath(java.lang.String relativePath) { this.wrapperContained = new net.minecraft.util.WorldSavePath(relativePath); }
public java.lang.String getRelativePath() { return wrapperContained.getRelativePath(); }
// public static java.lang.String getRelativePath() { return net.minecraft.util.WorldSavePath.getRelativePath(); }

}