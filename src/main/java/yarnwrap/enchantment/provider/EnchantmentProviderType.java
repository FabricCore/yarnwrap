package yarnwrap.enchantment.provider;
public class EnchantmentProviderType { public net.minecraft.enchantment.provider.EnchantmentProviderType wrapperContained; public EnchantmentProviderType(net.minecraft.enchantment.provider.EnchantmentProviderType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.enchantment.provider.EnchantmentProviderType.registerAndGetDefault(registry.wrapperContained); }

}