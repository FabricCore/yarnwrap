package yarnwrap.enchantment.effect;
public class EnchantmentValueEffect { public net.minecraft.enchantment.effect.EnchantmentValueEffect wrapperContained; public EnchantmentValueEffect(net.minecraft.enchantment.effect.EnchantmentValueEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.effect.EnchantmentValueEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.effect.EnchantmentValueEffect.CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.enchantment.effect.EnchantmentValueEffect.getCodec(); }
public float apply(int level,yarnwrap.util.math.random.Random random,float inputValue) { return wrapperContained.apply(level,random.wrapperContained,inputValue); }
// public static float apply(int level,yarnwrap.util.math.random.Random random,float inputValue, ) { return net.minecraft.enchantment.effect.EnchantmentValueEffect.apply(level,random.wrapperContained,inputValue); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.enchantment.effect.EnchantmentValueEffect.registerAndGetDefault(registry.wrapperContained); }

}