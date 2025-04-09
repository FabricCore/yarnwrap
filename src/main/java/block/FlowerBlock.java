package yarnwrap.block;
public class FlowerBlock { public net.minecraft.block.FlowerBlock wrapperContained; public FlowerBlock(net.minecraft.block.FlowerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public com.mojang.serialization.MapCodec STEW_EFFECT_CODEC() { return wrapperContained.STEW_EFFECT_CODEC; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent createStewEffectList(yarnwrap.registry.entry.RegistryEntry effect,float effectLengthInSeconds) { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.createStewEffectList(effect.wrapperContained,effectLengthInSeconds)); }

}