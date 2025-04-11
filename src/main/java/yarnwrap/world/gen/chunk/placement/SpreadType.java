package yarnwrap.world.gen.chunk.placement;
public class SpreadType { public net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained; public SpreadType(net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public int get(yarnwrap.util.math.random.Random random,int bound) { return wrapperContained.get(random.wrapperContained,bound); }

}