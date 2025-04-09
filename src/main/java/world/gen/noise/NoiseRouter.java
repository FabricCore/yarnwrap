package yarnwrap.world.gen.noise;
public class NoiseRouter { public net.minecraft.world.gen.noise.NoiseRouter wrapperContained; public NoiseRouter(net.minecraft.world.gen.noise.NoiseRouter wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.world.gen.noise.NoiseRouter apply(Object visitor) { return new yarnwrap.world.gen.noise.NoiseRouter(wrapperContained.apply(visitor)); }
// public com.mojang.serialization.codecs.RecordCodecBuilder field(java.lang.String name,java.util.function.Function getter) { return wrapperContained.field(name,getter); }

}