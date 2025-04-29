package yarnwrap.util;
public class Clearable { public net.minecraft.util.Clearable wrapperContained; public Clearable(net.minecraft.util.Clearable wrapperContained) { this.wrapperContained = wrapperContained; }

// public void clear(java.lang.Object o) { wrapperContained.clear(o); }
// public static void clear(java.lang.Object o, ) { net.minecraft.util.Clearable.clear(o); }
public void clear() { wrapperContained.clear(); }
// // public static void clear() { net.minecraft.util.Clearable.clear(); }

}