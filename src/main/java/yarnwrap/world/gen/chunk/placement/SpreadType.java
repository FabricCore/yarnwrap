package yarnwrap.world.gen.chunk.placement;
public class SpreadType { public net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained; public SpreadType(net.minecraft.world.gen.chunk.placement.SpreadType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.chunk.placement.SpreadType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.chunk.placement.SpreadType.CODEC = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.gen.chunk.placement.SpreadType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.gen.chunk.placement.SpreadType.name = value; }

// public SpreadType(java.lang.String name) { this.wrapperContained = new net.minecraft.world.gen.chunk.placement.SpreadType(name); }
public int get(yarnwrap.util.math.random.Random random,int bound) { return wrapperContained.get(random.wrapperContained,bound); }
// public static int get(yarnwrap.util.math.random.Random random,int bound, ) { return net.minecraft.world.gen.chunk.placement.SpreadType.get(random.wrapperContained,bound); }

}