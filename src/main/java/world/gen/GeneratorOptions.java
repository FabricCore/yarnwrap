package yarnwrap.world.gen;
public class GeneratorOptions { public net.minecraft.world.gen.GeneratorOptions wrapperContained; public GeneratorOptions(net.minecraft.world.gen.GeneratorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public boolean bonusChest() { return wrapperContained.bonusChest; }
// public java.util.Optional legacyCustomOptions() { return wrapperContained.legacyCustomOptions; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.GeneratorOptions DEMO_OPTIONS() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.DEMO_OPTIONS); }
public yarnwrap.world.gen.GeneratorOptions withSeed(java.util.OptionalLong seed) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withSeed(seed)); }
public long getSeed() { return wrapperContained.getSeed(); }
public boolean shouldGenerateStructures() { return wrapperContained.shouldGenerateStructures(); }
public boolean hasBonusChest() { return wrapperContained.hasBonusChest(); }
public boolean isLegacyCustomizedType() { return wrapperContained.isLegacyCustomizedType(); }
public yarnwrap.world.gen.GeneratorOptions withBonusChest(boolean bonusChest) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withBonusChest(bonusChest)); }
public yarnwrap.world.gen.GeneratorOptions createRandom() { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.createRandom()); }
public yarnwrap.world.gen.GeneratorOptions withStructures(boolean structures) { return new yarnwrap.world.gen.GeneratorOptions(wrapperContained.withStructures(structures)); }
public java.util.OptionalLong parseSeed(java.lang.String seed) { return wrapperContained.parseSeed(seed); }
public long getRandomSeed() { return wrapperContained.getRandomSeed(); }

}