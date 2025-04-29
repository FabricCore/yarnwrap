package yarnwrap.block;
public class FlowerBlock { public net.minecraft.block.FlowerBlock wrapperContained; public FlowerBlock(net.minecraft.block.FlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FlowerBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.FlowerBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value) { wrapperContained.stewEffects = value.wrapperContained; }
// public static yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(net.minecraft.block.FlowerBlock.stewEffects); }
// public static void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value, ) { net.minecraft.block.FlowerBlock.stewEffects = value.wrapperContained; }

// public com.mojang.serialization.MapCodec STEW_EFFECT_CODEC() { return wrapperContained.STEW_EFFECT_CODEC; }
// public void STEW_EFFECT_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.STEW_EFFECT_CODEC = value; }
// public static com.mojang.serialization.MapCodec STEW_EFFECT_CODEC() { return net.minecraft.block.FlowerBlock.STEW_EFFECT_CODEC; }
// public static void STEW_EFFECT_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FlowerBlock.STEW_EFFECT_CODEC = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FlowerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FlowerBlock.CODEC = value; }

// public FlowerBlock(yarnwrap.registry.entry.RegistryEntry stewEffect,float effectLengthInSeconds,Object settings) { this.wrapperContained = new net.minecraft.block.FlowerBlock(stewEffect.wrapperContained,effectLengthInSeconds,settings); }
// public FlowerBlock(yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects,Object settings) { this.wrapperContained = new net.minecraft.block.FlowerBlock(stewEffects.wrapperContained,settings); }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent createStewEffectList(yarnwrap.registry.entry.RegistryEntry effect,float effectLengthInSeconds) { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.createStewEffectList(effect.wrapperContained,effectLengthInSeconds)); }
// public static yarnwrap.component.type.SuspiciousStewEffectsComponent createStewEffectList(yarnwrap.registry.entry.RegistryEntry effect,float effectLengthInSeconds, ) { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(net.minecraft.block.FlowerBlock.createStewEffectList(effect.wrapperContained,effectLengthInSeconds)); }
// public com.mojang.datafixers.kinds.App method_54016(Object instance) { return wrapperContained.method_54016(instance); }
// public static com.mojang.datafixers.kinds.App method_54016(Object instance, ) { return net.minecraft.block.FlowerBlock.method_54016(instance); }

}