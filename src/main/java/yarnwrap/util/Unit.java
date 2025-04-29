package yarnwrap.util;
public class Unit { public net.minecraft.util.Unit wrapperContained; public Unit(net.minecraft.util.Unit wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Unit.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Unit.CODEC = value; }


}