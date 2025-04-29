package yarnwrap.util.math.random;
public class RandomSequencesState { public net.minecraft.util.math.random.RandomSequencesState wrapperContained; public RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.math.random.RandomSequencesState.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.math.random.RandomSequencesState.LOGGER = value; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.util.math.random.RandomSequencesState.seed; }
// public static void seed(long value, ) { net.minecraft.util.math.random.RandomSequencesState.seed = value; }

// public java.util.Map sequences() { return wrapperContained.sequences; }
// public void sequences(java.util.Map value) { wrapperContained.sequences = value; }
// public static java.util.Map sequences() { return net.minecraft.util.math.random.RandomSequencesState.sequences; }
// public static void sequences(java.util.Map value, ) { net.minecraft.util.math.random.RandomSequencesState.sequences = value; }

// public int salt() { return wrapperContained.salt; }
// public void salt(int value) { wrapperContained.salt = value; }
// public static int salt() { return net.minecraft.util.math.random.RandomSequencesState.salt; }
// public static void salt(int value, ) { net.minecraft.util.math.random.RandomSequencesState.salt = value; }

// public boolean includeWorldSeed() { return wrapperContained.includeWorldSeed; }
// public void includeWorldSeed(boolean value) { wrapperContained.includeWorldSeed = value; }
// public static boolean includeWorldSeed() { return net.minecraft.util.math.random.RandomSequencesState.includeWorldSeed; }
// public static void includeWorldSeed(boolean value, ) { net.minecraft.util.math.random.RandomSequencesState.includeWorldSeed = value; }

// public boolean includeSequenceId() { return wrapperContained.includeSequenceId; }
// public void includeSequenceId(boolean value) { wrapperContained.includeSequenceId = value; }
// public static boolean includeSequenceId() { return net.minecraft.util.math.random.RandomSequencesState.includeSequenceId; }
// public static void includeSequenceId(boolean value, ) { net.minecraft.util.math.random.RandomSequencesState.includeSequenceId = value; }

public RandomSequencesState(long seed) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequencesState(seed); }
// public yarnwrap.util.math.random.RandomSequencesState fromNbt(long seed,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.fromNbt(seed,nbt.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSequencesState fromNbt(long seed,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.util.math.random.RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState.fromNbt(seed,nbt.wrapperContained)); }
public yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreate(id.wrapperContained)); }
// public static yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.RandomSequencesState.getOrCreate(id.wrapperContained)); }
// public void method_51844(yarnwrap.nbt.NbtCompound id,yarnwrap.util.Identifier sequence) { wrapperContained.method_51844(id.wrapperContained,sequence.wrapperContained); }
// public static void method_51844(yarnwrap.nbt.NbtCompound id,yarnwrap.util.Identifier sequence, ) { net.minecraft.util.math.random.RandomSequencesState.method_51844(id.wrapperContained,sequence.wrapperContained); }
public int resetAll() { return wrapperContained.resetAll(); }
// public static int resetAll() { return net.minecraft.util.math.random.RandomSequencesState.resetAll(); }
public void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
// public static void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { net.minecraft.util.math.random.RandomSequencesState.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
// public Object getPersistentStateType(long seed) { return wrapperContained.getPersistentStateType(seed); }
// public static Object getPersistentStateType(long seed, ) { return net.minecraft.util.math.random.RandomSequencesState.getPersistentStateType(seed); }
public void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public static void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { net.minecraft.util.math.random.RandomSequencesState.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
public void forEachSequence(java.util.function.BiConsumer consumer) { wrapperContained.forEachSequence(consumer); }
// public static void forEachSequence(java.util.function.BiConsumer consumer, ) { net.minecraft.util.math.random.RandomSequencesState.forEachSequence(consumer); }
// public boolean getBooleanFromNbtOrFallback(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,boolean fallback) { return wrapperContained.getBooleanFromNbtOrFallback(nbt.wrapperContained,key,fallback); }
// public static boolean getBooleanFromNbtOrFallback(yarnwrap.nbt.NbtCompound nbt,java.lang.String key,boolean fallback, ) { return net.minecraft.util.math.random.RandomSequencesState.getBooleanFromNbtOrFallback(nbt.wrapperContained,key,fallback); }
// public yarnwrap.util.math.random.RandomSequencesState method_52516(long nbt,yarnwrap.nbt.NbtCompound registryLookup) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.method_52516(nbt,registryLookup.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSequencesState method_52516(long nbt,yarnwrap.nbt.NbtCompound registryLookup, ) { return new yarnwrap.util.math.random.RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState.method_52516(nbt,registryLookup.wrapperContained)); }
public void reset(yarnwrap.util.Identifier id) { wrapperContained.reset(id.wrapperContained); }
// public static void reset(yarnwrap.util.Identifier id, ) { net.minecraft.util.math.random.RandomSequencesState.reset(id.wrapperContained); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public static yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { return new yarnwrap.util.math.random.RandomSequence(net.minecraft.util.math.random.RandomSequencesState.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.RandomSequence(net.minecraft.util.math.random.RandomSequencesState.createSequence(id.wrapperContained)); }

}