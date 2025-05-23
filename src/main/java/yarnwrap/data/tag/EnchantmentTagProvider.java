package yarnwrap.data.tag;
public class EnchantmentTagProvider { public net.minecraft.data.tag.EnchantmentTagProvider wrapperContained; public EnchantmentTagProvider(net.minecraft.data.tag.EnchantmentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public EnchantmentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registriesFuture) { this.wrapperContained = new net.minecraft.data.tag.EnchantmentTagProvider(output.wrapperContained,registriesFuture); }
// public boolean method_59779(java.util.Set entry) { return wrapperContained.method_59779(entry); }
// public static boolean method_59779(java.util.Set entry, ) { return net.minecraft.data.tag.EnchantmentTagProvider.method_59779(entry); }
// public void createTooltipOrderTag(Object registries,net.minecraft.registry.RegistryKey[] enchantments) { wrapperContained.createTooltipOrderTag(registries,enchantments); }
// public static void createTooltipOrderTag(Object registries,net.minecraft.registry.RegistryKey[] enchantments, ) { net.minecraft.data.tag.EnchantmentTagProvider.createTooltipOrderTag(registries,enchantments); }

}