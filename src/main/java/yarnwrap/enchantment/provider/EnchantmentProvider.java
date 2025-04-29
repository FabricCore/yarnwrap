package yarnwrap.enchantment.provider;
public class EnchantmentProvider { public net.minecraft.enchantment.provider.EnchantmentProvider wrapperContained; public EnchantmentProvider(net.minecraft.enchantment.provider.EnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.enchantment.provider.EnchantmentProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.enchantment.provider.EnchantmentProvider.CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.enchantment.provider.EnchantmentProvider.getCodec(); }
// public void provideEnchantments(yarnwrap.item.ItemStack stack,Object componentBuilder,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.provideEnchantments(stack.wrapperContained,componentBuilder,random.wrapperContained,localDifficulty.wrapperContained); }
// public static void provideEnchantments(yarnwrap.item.ItemStack stack,Object componentBuilder,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.enchantment.provider.EnchantmentProvider.provideEnchantments(stack.wrapperContained,componentBuilder,random.wrapperContained,localDifficulty.wrapperContained); }

}