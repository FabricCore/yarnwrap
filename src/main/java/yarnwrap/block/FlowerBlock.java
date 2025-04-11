package yarnwrap.block;
public class FlowerBlock { public net.minecraft.block.FlowerBlock wrapperContained; public FlowerBlock(net.minecraft.block.FlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value) { wrapperContained.stewEffects = value.wrapperContained; }
// public com.mojang.serialization.MapCodec STEW_EFFECT_CODEC() { return wrapperContained.STEW_EFFECT_CODEC; }
// public void STEW_EFFECT_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.STEW_EFFECT_CODEC = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent createStewEffectList(yarnwrap.registry.entry.RegistryEntry effect,float effectLengthInSeconds) { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.createStewEffectList(effect.wrapperContained,effectLengthInSeconds)); }

}