package yarnwrap.util;
public class Clearable { public net.minecraft.util.Clearable wrapperContained; public Clearable(net.minecraft.util.Clearable wrapperContained) { this.wrapperContained = wrapperContained; }

public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.util.Clearable.clear(); }

}