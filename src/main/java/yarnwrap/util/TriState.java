package yarnwrap.util;
public class TriState { public net.minecraft.util.TriState wrapperContained; public TriState(net.minecraft.util.TriState wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean asBoolean(boolean fallback) { return wrapperContained.asBoolean(fallback); }
// public static boolean asBoolean(boolean fallback, ) { return net.minecraft.util.TriState.asBoolean(fallback); }

}