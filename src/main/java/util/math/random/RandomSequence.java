package yarnwrap.util.math.random;
public class RandomSequence { public net.minecraft.util.math.random.RandomSequence wrapperContained; public RandomSequence(net.minecraft.util.math.random.RandomSequence wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom source() { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom(wrapperContained.source); }
public yarnwrap.util.math.random.Random getSource() { return new yarnwrap.util.math.random.Random(wrapperContained.getSource()); }
public Object createSeed(yarnwrap.util.Identifier id) { return wrapperContained.createSeed(id.wrapperContained); }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom createSource(long seed,java.util.Optional id) { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom(wrapperContained.createSource(seed,id)); }

}