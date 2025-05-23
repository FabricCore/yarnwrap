package yarnwrap.util.math.random;
public class RandomSequencesState { public net.minecraft.util.math.random.RandomSequencesState wrapperContained; public RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.util.math.random.RandomSequencesState.seed; }
// public static void seed(long value, ) { net.minecraft.util.math.random.RandomSequencesState.seed = value; }

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

// public yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.STATE_TYPE); }
// public void STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.util.math.random.RandomSequencesState.STATE_TYPE); }
// public static void STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.util.math.random.RandomSequencesState.STATE_TYPE = value.wrapperContained; }

// public java.util.Map sequences() { return wrapperContained.sequences; }
// public void sequences(java.util.Map value) { wrapperContained.sequences = value; }
// public static java.util.Map sequences() { return net.minecraft.util.math.random.RandomSequencesState.sequences; }
// public static void sequences(java.util.Map value, ) { net.minecraft.util.math.random.RandomSequencesState.sequences = value; }

public RandomSequencesState(long seed) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequencesState(seed); }
// public RandomSequencesState(long seed,int salt,boolean includeWorldSeed,boolean includeSequenceId,java.util.Map sequences) { this.wrapperContained = new net.minecraft.util.math.random.RandomSequencesState(seed,salt,includeWorldSeed,includeSequenceId,sequences); }
public yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.Random(wrapperContained.getOrCreate(id.wrapperContained)); }
// public static yarnwrap.util.math.random.Random getOrCreate(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.Random(net.minecraft.util.math.random.RandomSequencesState.getOrCreate(id.wrapperContained)); }
public int resetAll() { return wrapperContained.resetAll(); }
// public static int resetAll() { return net.minecraft.util.math.random.RandomSequencesState.resetAll(); }
public void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
// public static void setDefaultParameters(int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { net.minecraft.util.math.random.RandomSequencesState.setDefaultParameters(salt,includeWorldSeed,includeSequenceId); }
public void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { wrapperContained.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
// public static void reset(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { net.minecraft.util.math.random.RandomSequencesState.reset(id.wrapperContained,salt,includeWorldSeed,includeSequenceId); }
public void forEachSequence(java.util.function.BiConsumer consumer) { wrapperContained.forEachSequence(consumer); }
// public static void forEachSequence(java.util.function.BiConsumer consumer, ) { net.minecraft.util.math.random.RandomSequencesState.forEachSequence(consumer); }
public void reset(yarnwrap.util.Identifier id) { wrapperContained.reset(id.wrapperContained); }
// public static void reset(yarnwrap.util.Identifier id, ) { net.minecraft.util.math.random.RandomSequencesState.reset(id.wrapperContained); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public static yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id,int salt,boolean includeWorldSeed,boolean includeSequenceId, ) { return new yarnwrap.util.math.random.RandomSequence(net.minecraft.util.math.random.RandomSequencesState.createSequence(id.wrapperContained,salt,includeWorldSeed,includeSequenceId)); }
// public yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id) { return new yarnwrap.util.math.random.RandomSequence(wrapperContained.createSequence(id.wrapperContained)); }
// public static yarnwrap.util.math.random.RandomSequence createSequence(yarnwrap.util.Identifier id, ) { return new yarnwrap.util.math.random.RandomSequence(net.minecraft.util.math.random.RandomSequencesState.createSequence(id.wrapperContained)); }
// public com.mojang.serialization.Codec createCodec(long seed) { return wrapperContained.createCodec(seed); }
// public static com.mojang.serialization.Codec createCodec(long seed, ) { return net.minecraft.util.math.random.RandomSequencesState.createCodec(seed); }
// public com.mojang.datafixers.kinds.App method_67338(long instance) { return wrapperContained.method_67338(instance); }
// public static com.mojang.datafixers.kinds.App method_67338(long instance, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67338(instance); }
// public java.util.Map method_67339(yarnwrap.util.math.random.RandomSequencesState state) { return wrapperContained.method_67339(state.wrapperContained); }
// public static java.util.Map method_67339(yarnwrap.util.math.random.RandomSequencesState state, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67339(state.wrapperContained); }
// public com.mojang.serialization.Codec method_67340(Object state) { return wrapperContained.method_67340(state); }
// public static com.mojang.serialization.Codec method_67340(Object state, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67340(state); }
// public java.lang.Boolean method_67341(yarnwrap.util.math.random.RandomSequencesState state) { return wrapperContained.method_67341(state.wrapperContained); }
// public static java.lang.Boolean method_67341(yarnwrap.util.math.random.RandomSequencesState state, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67341(state.wrapperContained); }
// public yarnwrap.util.math.random.RandomSequencesState method_67342(Object state) { return new yarnwrap.util.math.random.RandomSequencesState(wrapperContained.method_67342(state)); }
// public static yarnwrap.util.math.random.RandomSequencesState method_67342(Object state, ) { return new yarnwrap.util.math.random.RandomSequencesState(net.minecraft.util.math.random.RandomSequencesState.method_67342(state)); }
// public java.lang.Boolean method_67343(yarnwrap.util.math.random.RandomSequencesState state) { return wrapperContained.method_67343(state.wrapperContained); }
// public static java.lang.Boolean method_67343(yarnwrap.util.math.random.RandomSequencesState state, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67343(state.wrapperContained); }
// public java.lang.Integer method_67344(yarnwrap.util.math.random.RandomSequencesState state) { return wrapperContained.method_67344(state.wrapperContained); }
// public static java.lang.Integer method_67344(yarnwrap.util.math.random.RandomSequencesState state, ) { return net.minecraft.util.math.random.RandomSequencesState.method_67344(state.wrapperContained); }

}