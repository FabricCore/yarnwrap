package yarnwrap.enchantment;
public class EnchantmentLevelBasedValue { public net.minecraft.enchantment.EnchantmentLevelBasedValue wrapperContained; public EnchantmentLevelBasedValue(net.minecraft.enchantment.EnchantmentLevelBasedValue wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.enchantment.EnchantmentLevelBasedValue.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.EnchantmentLevelBasedValue.BASE_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.EnchantmentLevelBasedValue.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.EnchantmentLevelBasedValue.CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.enchantment.EnchantmentLevelBasedValue.getCodec(); }
// public Object constant(float value) { return wrapperContained.constant(value); }
// public static Object constant(float value, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.constant(value); }
// public Object linear(float base,float perLevelAboveFirst) { return wrapperContained.linear(base,perLevelAboveFirst); }
// public static Object linear(float base,float perLevelAboveFirst, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.linear(base,perLevelAboveFirst); }
public float getValue(int level) { return wrapperContained.getValue(level); }
// public static float getValue(int level, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.getValue(level); }
// public yarnwrap.enchantment.EnchantmentLevelBasedValue method_60189(com.mojang.datafixers.util.Either either) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(wrapperContained.method_60189(either)); }
// public static yarnwrap.enchantment.EnchantmentLevelBasedValue method_60189(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(net.minecraft.enchantment.EnchantmentLevelBasedValue.method_60189(either)); }
// public com.mojang.serialization.MapCodec method_60190(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_60190(codec); }
// public static com.mojang.serialization.MapCodec method_60190(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.method_60190(codec); }
// public yarnwrap.enchantment.EnchantmentLevelBasedValue method_60191(Object type) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(wrapperContained.method_60191(type)); }
// public static yarnwrap.enchantment.EnchantmentLevelBasedValue method_60191(Object type, ) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(net.minecraft.enchantment.EnchantmentLevelBasedValue.method_60191(type)); }
// public com.mojang.datafixers.util.Either method_60192(yarnwrap.enchantment.EnchantmentLevelBasedValue type) { return wrapperContained.method_60192(type.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_60192(yarnwrap.enchantment.EnchantmentLevelBasedValue type, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.method_60192(type.wrapperContained); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.registerAndGetDefault(registry.wrapperContained); }
// public Object linear(float base) { return wrapperContained.linear(base); }
// public static Object linear(float base, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.linear(base); }
// public yarnwrap.enchantment.EnchantmentLevelBasedValue method_60195(yarnwrap.enchantment.EnchantmentLevelBasedValue type) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(wrapperContained.method_60195(type.wrapperContained)); }
// public static yarnwrap.enchantment.EnchantmentLevelBasedValue method_60195(yarnwrap.enchantment.EnchantmentLevelBasedValue type, ) { return new yarnwrap.enchantment.EnchantmentLevelBasedValue(net.minecraft.enchantment.EnchantmentLevelBasedValue.method_60195(type.wrapperContained)); }
// public Object lookup(java.util.List values,yarnwrap.enchantment.EnchantmentLevelBasedValue fallback) { return wrapperContained.lookup(values,fallback.wrapperContained); }
// public static Object lookup(java.util.List values,yarnwrap.enchantment.EnchantmentLevelBasedValue fallback, ) { return net.minecraft.enchantment.EnchantmentLevelBasedValue.lookup(values,fallback.wrapperContained); }

}