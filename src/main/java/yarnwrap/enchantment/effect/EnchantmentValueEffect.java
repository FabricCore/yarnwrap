package yarnwrap.enchantment.effect;
public class EnchantmentValueEffect { public net.minecraft.enchantment.effect.EnchantmentValueEffect wrapperContained; public EnchantmentValueEffect(net.minecraft.enchantment.effect.EnchantmentValueEffect wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public float apply(int level,yarnwrap.util.math.random.Random random,float inputValue) { return wrapperContained.apply(level,random.wrapperContained,inputValue); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }

}