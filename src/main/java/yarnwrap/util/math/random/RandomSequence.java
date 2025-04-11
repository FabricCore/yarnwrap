package yarnwrap.util.math.random;
public class RandomSequence { public net.minecraft.util.math.random.RandomSequence wrapperContained; public RandomSequence(net.minecraft.util.math.random.RandomSequence wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom source() { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom(wrapperContained.source); }
// public void source(yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom value) { wrapperContained.source = value.wrapperContained; }
public RandomSequence(long seed,java.util.Optional id) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequence(seed,id); }
public RandomSequence(long seed,yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequence(seed,id.wrapperContained); }
public RandomSequence(yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom source) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequence(source.wrapperContained); }
public yarnwrap.util.math.random.Random getSource() { return new yarnwrap.util.math.random.Random(wrapperContained.getSource()); }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom method_51840(yarnwrap.util.math.random.RandomSequence sequence) { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom(wrapperContained.method_51840(sequence.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_51841(Object instance) { return wrapperContained.method_51841(instance); }
public Object createSeed(yarnwrap.util.Identifier id) { return wrapperContained.createSeed(id.wrapperContained); }
// public yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom createSource(long seed,java.util.Optional id) { return new yarnwrap.util.math.random.Xoroshiro128PlusPlusRandom(wrapperContained.createSource(seed,id)); }

}