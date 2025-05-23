package yarnwrap.world.gen.treedecorator;
public class PaleMossTreeDecorator { public net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator wrapperContained; public PaleMossTreeDecorator(net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.CODEC = value; }

// public float leavesProbability() { return wrapperContained.leavesProbability; }
// public void leavesProbability(float value) { wrapperContained.leavesProbability = value; }
// public static float leavesProbability() { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.leavesProbability; }
// public static void leavesProbability(float value, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.leavesProbability = value; }

// public float trunkProbability() { return wrapperContained.trunkProbability; }
// public void trunkProbability(float value) { wrapperContained.trunkProbability = value; }
// public static float trunkProbability() { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.trunkProbability; }
// public static void trunkProbability(float value, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.trunkProbability = value; }

// public float groundProbability() { return wrapperContained.groundProbability; }
// public void groundProbability(float value) { wrapperContained.groundProbability = value; }
// public static float groundProbability() { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.groundProbability; }
// public static void groundProbability(float value, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.groundProbability = value; }

public PaleMossTreeDecorator(float leavesProbability,float trunkProbability,float groundProbability) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator(leavesProbability,trunkProbability,groundProbability); }
// public void method_64810(yarnwrap.util.math.random.Random pos) { wrapperContained.method_64810(pos.wrapperContained); }
// public static void method_64810(yarnwrap.util.math.random.Random pos, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64810(pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_64811(Object instance) { return wrapperContained.method_64811(instance); }
// public static com.mojang.datafixers.kinds.App method_64811(Object instance, ) { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64811(instance); }
// public void method_64812(yarnwrap.world.StructureWorldAccess entry) { wrapperContained.method_64812(entry.wrapperContained); }
// public static void method_64812(yarnwrap.world.StructureWorldAccess entry, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64812(entry.wrapperContained); }
// public java.lang.Float method_64813(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator) { return wrapperContained.method_64813(treeDecorator.wrapperContained); }
// public static java.lang.Float method_64813(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64813(treeDecorator.wrapperContained); }
// public void decorate(yarnwrap.util.math.BlockPos pos,Object generator) { wrapperContained.decorate(pos.wrapperContained,generator); }
// public static void decorate(yarnwrap.util.math.BlockPos pos,Object generator, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.decorate(pos.wrapperContained,generator); }
// public java.util.Optional method_64815(yarnwrap.registry.Registry registry) { return wrapperContained.method_64815(registry.wrapperContained); }
// public static java.util.Optional method_64815(yarnwrap.registry.Registry registry, ) { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64815(registry.wrapperContained); }
// public void method_64816(org.apache.commons.lang3.mutable.Mutable pos) { wrapperContained.method_64816(pos); }
// public static void method_64816(org.apache.commons.lang3.mutable.Mutable pos, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64816(pos); }
// public void method_64817(yarnwrap.util.math.random.Random pos) { wrapperContained.method_64817(pos.wrapperContained); }
// public static void method_64817(yarnwrap.util.math.random.Random pos, ) { net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64817(pos.wrapperContained); }
// public java.lang.Float method_64818(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator) { return wrapperContained.method_64818(treeDecorator.wrapperContained); }
// public static java.lang.Float method_64818(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64818(treeDecorator.wrapperContained); }
// public java.lang.Float method_64819(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator) { return wrapperContained.method_64819(treeDecorator.wrapperContained); }
// public static java.lang.Float method_64819(yarnwrap.world.gen.treedecorator.PaleMossTreeDecorator treeDecorator, ) { return net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator.method_64819(treeDecorator.wrapperContained); }

}