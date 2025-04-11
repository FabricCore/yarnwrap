package yarnwrap.world.gen.feature;
public class GeodeCrackConfig { public net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained; public GeodeCrackConfig(net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public double generateCrackChance() { return wrapperContained.generateCrackChance; }
// public void generateCrackChance(double value) { wrapperContained.generateCrackChance = value; }
public double baseCrackSize() { return wrapperContained.baseCrackSize; }
// public void baseCrackSize(double value) { wrapperContained.baseCrackSize = value; }
public int crackPointOffset() { return wrapperContained.crackPointOffset; }
// public void crackPointOffset(int value) { wrapperContained.crackPointOffset = value; }
public GeodeCrackConfig(double generateCrackChance,double baseCrackSize,int crackPointOffset) { this.wrapperContained = new net.minecraft.world.gen.feature.GeodeCrackConfig(generateCrackChance,baseCrackSize,crackPointOffset); }
// public java.lang.Integer method_31893(yarnwrap.world.gen.feature.GeodeCrackConfig config) { return wrapperContained.method_31893(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_31894(Object instance) { return wrapperContained.method_31894(instance); }
// public java.lang.Double method_31895(yarnwrap.world.gen.feature.GeodeCrackConfig config) { return wrapperContained.method_31895(config.wrapperContained); }
// public java.lang.Double method_31896(yarnwrap.world.gen.feature.GeodeCrackConfig config) { return wrapperContained.method_31896(config.wrapperContained); }

}