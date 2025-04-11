package yarnwrap.component;
public class EnchantmentEffectComponentTypes { public net.minecraft.component.EnchantmentEffectComponentTypes wrapperContained; public EnchantmentEffectComponentTypes(net.minecraft.component.EnchantmentEffectComponentTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec COMPONENT_TYPE_CODEC() { return wrapperContained.COMPONENT_TYPE_CODEC; }
// public void COMPONENT_TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.COMPONENT_TYPE_CODEC = value; }
public com.mojang.serialization.Codec COMPONENT_MAP_CODEC() { return wrapperContained.COMPONENT_MAP_CODEC; }
// public void COMPONENT_MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.COMPONENT_MAP_CODEC = value; }
// // public yarnwrap.component.ComponentType register(java.lang.String id,java.util.function.UnaryOperator builderOperator) { return new yarnwrap.component.ComponentType(wrapperContained.register(id,builderOperator)); }
// public yarnwrap.component.ComponentType getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.component.ComponentType(wrapperContained.getDefault(registry.wrapperContained)); }

}