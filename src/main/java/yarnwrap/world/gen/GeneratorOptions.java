package yarnwrap.world.gen;
public class GeneratorOptions { public net.minecraft.world.gen.GeneratorOptions wrapperContained; public GeneratorOptions(net.minecraft.world.gen.GeneratorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public void generateStructures(boolean value) { wrapperContained.generateStructures = value; }
// public boolean bonusChest() { return wrapperContained.bonusChest; }
// public void bonusChest(boolean value) { wrapperContained.bonusChest = value; }
// public java.util.Optional legacyCustomOptions() { return wrapperContained.legacyCustomOptions; }
// public void legacyCustomOptions(java.util.Optional value) { wrapperContained.legacyCustomOptions = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.GeneratorOptions DEMO_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.DEMO_OPTIONS); }
// public void DEMO_OPTIONS(yarnwrap.world.gen.GeneratorOptions value) { wrapperContained.DEMO_OPTIONS = value.wrapperContained; }
public GeneratorOptions(long seed,boolean generateStructures,boolean bonusChest) { this.wrapperContained = new net.minecraft.world.gen.GeneratorOptions(seed,generateStructures,bonusChest); }
// public GeneratorOptions(long seed,boolean generateStructures,boolean bonusChest,java.util.Optional legacyCustomOptions) { this.wrapperContained = new net.minecraft.world.gen.GeneratorOptions(seed,generateStructures,bonusChest,legacyCustomOptions); }
public yarnwrap.world.gen.GeneratorOptions withSeed(java.util.OptionalLong seed) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withSeed(seed)); }
public long getSeed() { return wrapperContained.getSeed(); }
public boolean shouldGenerateStructures() { return wrapperContained.shouldGenerateStructures(); }
public boolean hasBonusChest() { return wrapperContained.hasBonusChest(); }
public boolean isLegacyCustomizedType() { return wrapperContained.isLegacyCustomizedType(); }
public yarnwrap.world.gen.GeneratorOptions withBonusChest(boolean bonusChest) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withBonusChest(bonusChest)); }
// public java.util.Optional method_28605(yarnwrap.world.gen.GeneratorOptions generatorOptions) { return wrapperContained.method_28605(generatorOptions.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28606(Object instance) { return wrapperContained.method_28606(instance); }
public yarnwrap.world.gen.GeneratorOptions createRandom() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.createRandom()); }
public yarnwrap.world.gen.GeneratorOptions withStructures(boolean structures) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withStructures(structures)); }
public java.util.OptionalLong parseSeed(java.lang.String seed) { return wrapperContained.parseSeed(seed); }
public long getRandomSeed() { return wrapperContained.getRandomSeed(); }

}