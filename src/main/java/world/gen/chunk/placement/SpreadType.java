package yarnwrap.world.gen.chunk.placement;
public class SpreadType { public net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained; public SpreadType(net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String name() { return wrapperContained.name; }
public int get(yarnwrap.util.math.random.Random random,int bound) { return wrapperContained.get(random.wrapperContained,bound); }

}