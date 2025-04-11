package yarnwrap.util;
public class Unit { public net.minecraft.util.Unit wrapperContained; public Unit(net.minecraft.util.Unit wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}