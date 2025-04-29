package yarnwrap.data.server.tag;
public class EnchantmentTagProvider { public net.minecraft.data.server.tag.EnchantmentTagProvider wrapperContained; public EnchantmentTagProvider(net.minecraft.data.server.tag.EnchantmentTagProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public EnchantmentTagProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.server.tag.EnchantmentTagProvider(output.wrapperContained,registryLookupFuture); }
// public boolean method_59779(java.util.Set entry) { return wrapperContained.method_59779(entry); }
// public static boolean method_59779(java.util.Set entry, ) { return net.minecraft.data.server.tag.EnchantmentTagProvider.method_59779(entry); }
// public void createTooltipOrderTag(Object registryLookup,net.minecraft.registry.RegistryKey[] enchantments) { wrapperContained.createTooltipOrderTag(registryLookup,enchantments); }
// public static void createTooltipOrderTag(Object registryLookup,net.minecraft.registry.RegistryKey[] enchantments, ) { net.minecraft.data.server.tag.EnchantmentTagProvider.createTooltipOrderTag(registryLookup,enchantments); }

}