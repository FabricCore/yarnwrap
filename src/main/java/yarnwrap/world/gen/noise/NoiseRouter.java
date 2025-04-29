package yarnwrap.world.gen.noise;
public class NoiseRouter { public net.minecraft.world.gen.noise.NoiseRouter wrapperContained; public NoiseRouter(net.minecraft.world.gen.noise.NoiseRouter wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.noise.NoiseRouter.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.noise.NoiseRouter.CODEC = value; }

// public yarnwrap.world.gen.noise.NoiseRouter apply(Object visitor) { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.apply(visitor)); }
// public static yarnwrap.world.gen.noise.NoiseRouter apply(Object visitor, ) { return new yarnwrap.world.gen.noise.NoiseRouter(net.minecraft.world.gen.noise.NoiseRouter.apply(visitor)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder field(java.lang.String name,java.util.function.Function getter) { return wrapperContained.field(name,getter); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder field(java.lang.String name,java.util.function.Function getter, ) { return net.minecraft.world.gen.noise.NoiseRouter.field(name,getter); }

}