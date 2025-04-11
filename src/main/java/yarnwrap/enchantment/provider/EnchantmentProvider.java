package yarnwrap.enchantment.provider;
public class EnchantmentProvider { public net.minecraft.enchantment.provider.EnchantmentProvider wrapperContained; public EnchantmentProvider(net.minecraft.enchantment.provider.EnchantmentProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public void provideEnchantments(yarnwrap.item.ItemStack stack,Object componentBuilder,yarnwrap.util.math.random.Random random,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.provideEnchantments(stack.wrapperContained,componentBuilder,random.wrapperContained,localDifficulty.wrapperContained); }

}