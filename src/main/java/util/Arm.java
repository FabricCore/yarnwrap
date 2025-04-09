package yarnwrap.util;
public class Arm { public net.minecraft.util.Arm wrapperContained; public Arm(net.minecraft.util.Arm wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.util.Arm getOpposite() { return new yarnwrap.util.Arm(wrapperContained.getOpposite()); }

}