package yarnwrap.util.math.random;
public class RandomSequencesState { public net.minecraft.util.math.random.RandomSequencesState wrapperContained; public RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public long seed() { return wrapperContained.seed; }
// public java.util.Map sequences() { return wrapperContained.sequences; }
// public int salt() { return wrapperContained.salt; }
// public boolean includeWorldSeed() { return wrapperContained.includeWorldSeed; }
// public boolean includeSequenceId() { return wrapperContained.includeSequenceId; }
public yarnwrap.util.math.random.RandomSequencesState fromNbt(long seed,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.fromNbt(seed,nbt.wrapperContained)); }
public yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreate(id.wrapperContained)); }
public int resetAll() { return wrapperContained.resetAll(); }
public void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
public Object getPersistentStateType(long seed) { return wrapperContained.getPersistentStateType(seed); }
public void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
public void forEachSequence(java.util.function.BiConsumer consumer) { wrapperContained.forEachSequence(consumer); }
// public boolean getBooleanFromNbtOrFallback(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,boolean fallback) { return wrapperContained.getBooleanFromNbtOrFallback(nbt.wrapperContained,key,fallback); }
public void reset(yarnwrap.util.Identifier id) { wrapperContained.reset(id.wrapperContained); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained)); }

}