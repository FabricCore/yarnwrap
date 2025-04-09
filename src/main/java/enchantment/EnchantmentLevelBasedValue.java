package yarnwrap.enchantment;
public class EnchantmentLevelBasedValue { public net.minecraft.enchantment.EnchantmentLevelBasedValue wrapperContained; public EnchantmentLevelBasedValue(net.minecraft.enchantment.EnchantmentLevelBasedValue wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public Object constant(float value) { return wrapperContained.constant(value); }
// public Object linear(float base,float perLevelAboveFirst) { return wrapperContained.linear(base,perLevelAboveFirst); }
public float getValue(int level) { return wrapperContained.getValue(level); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public Object linear(float base) { return wrapperContained.linear(base); }
// public Object lookup(java.util.List values,yarnwrap.enchantment.EnchantmentLevelBasedValue fallback) { return wrapperContained.lookup(values,fallback.wrapperContained); }

}