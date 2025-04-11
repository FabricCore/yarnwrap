package yarnwrap.util.math.random;
public class RandomSequencesState { public net.minecraft.util.math.random.RandomSequencesState wrapperContained; public RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public java.util.Map sequences() { return wrapperContained.sequences; }
// public void sequences(java.util.Map value) { wrapperContained.sequences = value; }
// public int salt() { return wrapperContained.salt; }
// public void salt(int value) { wrapperContained.salt = value; }
// public boolean includeWorldSeed() { return wrapperContained.includeWorldSeed; }
// public void includeWorldSeed(boolean value) { wrapperContained.includeWorldSeed = value; }
// public boolean includeSequenceId() { return wrapperContained.includeSequenceId; }
// public void includeSequenceId(boolean value) { wrapperContained.includeSequenceId = value; }
public RandomSequencesState(long seed) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequencesState(seed); }
public yarnwrap.util.math.random.RandomSequencesState fromNbt(long seed,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.fromNbt(seed,nbt.wrapperContained)); }
public yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreate(id.wrapperContained)); }
// public void method_51844(yarnwrap.nbt.NbtCompound id,yarnwrap.util.Identifier sequence) { wrapperContained.method_51844(id.wrapperContained,sequence.wrapperContained); }
public int resetAll() { return wrapperContained.resetAll(); }
public void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
public Object getPersistentStateType(long seed) { return wrapperContained.getPersistentStateType(seed); }
public void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
public void forEachSequence(java.util.function.BiConsumer consumer) { wrapperContained.forEachSequence(consumer); }
// public boolean getBooleanFromNbtOrFallback(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,boolean fallback) { return wrapperContained.getBooleanFromNbtOrFallback(nbt.wrapperContained,key,fallback); }
// public yarnwrap.util.math.random.RandomSequencesState method_52516(long nbt,yarnwrap.nbt.NbtCompound registryLookup) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.method_52516(nbt,registryLookup.wrapperContained)); }
public void reset(yarnwrap.util.Identifier id) { wrapperContained.reset(id.wrapperContained); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained)); }

}