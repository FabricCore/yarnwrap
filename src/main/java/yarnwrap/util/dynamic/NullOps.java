package yarnwrap.util.dynamic;
public class NullOps { public net.minecraft.util.dynamic.NullOps wrapperContained; public NullOps(net.minecraft.util.dynamic.NullOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.dynamic.NullOps INSTANCE() { return new yarnwrap.util.dynamic.NullOps(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.util.dynamic.NullOps value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.util.dynamic.NullOps INSTANCE() { return new yarnwrap.util.dynamic.NullOps(net.minecraft.util.dynamic.NullOps.INSTANCE); }
// public static void INSTANCE(yarnwrap.util.dynamic.NullOps value, ) { net.minecraft.util.dynamic.NullOps.INSTANCE = value.wrapperContained; }

// public java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object unit) { return wrapperContained.convertTo(ops,unit); }
// public static java.lang.Object convertTo(com.mojang.serialization.DynamicOps ops,java.lang.Object unit, ) { return net.minecraft.util.dynamic.NullOps.convertTo(ops,unit); }

}