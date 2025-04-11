package yarnwrap.data.server.tag;
public class EnchantmentTagProvider { public net.minecraft.data.server.tag.EnchantmentTagProvider wrapperContained; public EnchantmentTagProvider(net.minecraft.data.server.tag.EnchantmentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public void createTooltipOrderTag(Object registryLookup,net.minecraft.registry.RegistryKey[] enchantments) { wrapperContained.createTooltipOrderTag(registryLookup,enchantments); }

}