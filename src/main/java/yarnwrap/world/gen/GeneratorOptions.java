package yarnwrap.world.gen;
public class GeneratorOptions { public net.minecraft.world.gen.GeneratorOptions wrapperContained; public GeneratorOptions(net.minecraft.world.gen.GeneratorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.world.gen.GeneratorOptions.seed; }
// public static void seed(long value, ) { net.minecraft.world.gen.GeneratorOptions.seed = value; }

// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public void generateStructures(boolean value) { wrapperContained.generateStructures = value; }
// public static boolean generateStructures() { return net.minecraft.world.gen.GeneratorOptions.generateStructures; }
// public static void generateStructures(boolean value, ) { net.minecraft.world.gen.GeneratorOptions.generateStructures = value; }

// public boolean bonusChest() { return wrapperContained.bonusChest; }
// public void bonusChest(boolean value) { wrapperContained.bonusChest = value; }
// public static boolean bonusChest() { return net.minecraft.world.gen.GeneratorOptions.bonusChest; }
// public static void bonusChest(boolean value, ) { net.minecraft.world.gen.GeneratorOptions.bonusChest = value; }

// public java.util.Optional legacyCustomOptions() { return wrapperContained.legacyCustomOptions; }
// public void legacyCustomOptions(java.util.Optional value) { wrapperContained.legacyCustomOptions = value; }
// public static java.util.Optional legacyCustomOptions() { return net.minecraft.world.gen.GeneratorOptions.legacyCustomOptions; }
// public static void legacyCustomOptions(java.util.Optional value, ) { net.minecraft.world.gen.GeneratorOptions.legacyCustomOptions = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.GeneratorOptions.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.GeneratorOptions.CODEC = value; }

// public yarnwrap.world.gen.GeneratorOptions DEMO_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.DEMO_OPTIONS); }
// public void DEMO_OPTIONS(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.DEMO_OPTIONS = value.wrapperContained; }
public static yarnwrap.world.gen.GeneratorOptions DEMO_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.DEMO_OPTIONS); }
// public static void DEMO_OPTIONS(yarnwrap.world.gen.GeneratorOptions value, ) { net.minecraft.world.gen.GeneratorOptions.DEMO_OPTIONS = value.wrapperContained; }

public GeneratorOptions(long seed,boolean generateStructures,boolean bonusChest) { this.wrapperContained = new net.minecraft.world.gen.GeneratorOptions(seed,generateStructures,bonusChest); }
// public GeneratorOptions(long seed,boolean generateStructures,boolean bonusChest,java.util.Optional legacyCustomOptions) { this.wrapperContained = new net.minecraft.world.gen.GeneratorOptions(seed,generateStructures,bonusChest,legacyCustomOptions); }
public yarnwrap.world.gen.GeneratorOptions withSeed(java.util.OptionalLong seed) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withSeed(seed)); }
// public static yarnwrap.world.gen.GeneratorOptions withSeed(java.util.OptionalLong seed, ) { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.withSeed(seed)); }
public long getSeed() { return wrapperContained.getSeed(); }
// public static long getSeed() { return net.minecraft.world.gen.GeneratorOptions.getSeed(); }
public boolean shouldGenerateStructures() { return wrapperContained.shouldGenerateStructures(); }
// public static boolean shouldGenerateStructures() { return net.minecraft.world.gen.GeneratorOptions.shouldGenerateStructures(); }
public boolean hasBonusChest() { return wrapperContained.hasBonusChest(); }
// public static boolean hasBonusChest() { return net.minecraft.world.gen.GeneratorOptions.hasBonusChest(); }
public boolean isLegacyCustomizedType() { return wrapperContained.isLegacyCustomizedType(); }
// public static boolean isLegacyCustomizedType() { return net.minecraft.world.gen.GeneratorOptions.isLegacyCustomizedType(); }
public yarnwrap.world.gen.GeneratorOptions withBonusChest(boolean bonusChest) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withBonusChest(bonusChest)); }
// public static yarnwrap.world.gen.GeneratorOptions withBonusChest(boolean bonusChest, ) { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.withBonusChest(bonusChest)); }
// public java.util.Optional method_28605(yarnwrap.world.gen.GeneratorOptions generatorOptions) { return wrapperContained.method_28605(generatorOptions.wrapperContained); }
// public static java.util.Optional method_28605(yarnwrap.world.gen.GeneratorOptions generatorOptions, ) { return net.minecraft.world.gen.GeneratorOptions.method_28605(generatorOptions.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28606(Object instance) { return wrapperContained.method_28606(instance); }
// public static com.mojang.datafixers.kinds.App method_28606(Object instance, ) { return net.minecraft.world.gen.GeneratorOptions.method_28606(instance); }
// public yarnwrap.world.gen.GeneratorOptions createRandom() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.createRandom()); }
public static yarnwrap.world.gen.GeneratorOptions createRandom() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.createRandom()); }
public yarnwrap.world.gen.GeneratorOptions withStructures(boolean structures) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withStructures(structures)); }
// public static yarnwrap.world.gen.GeneratorOptions withStructures(boolean structures, ) { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.withStructures(structures)); }
// public java.util.OptionalLong parseSeed(java.lang.String seed) { return wrapperContained.parseSeed(seed); }
// public static java.util.OptionalLong parseSeed(java.lang.String seed, ) { return net.minecraft.world.gen.GeneratorOptions.parseSeed(seed); }
// public long getRandomSeed() { return wrapperContained.getRandomSeed(); }
public static long getRandomSeed() { return net.minecraft.world.gen.GeneratorOptions.getRandomSeed(); }
// public yarnwrap.world.gen.GeneratorOptions createTestWorld() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.createTestWorld()); }
public static yarnwrap.world.gen.GeneratorOptions createTestWorld() { return new yarnwrap.world.gen.GeneratorOptions(net.minecraft.world.gen.GeneratorOptions.createTestWorld()); }

}