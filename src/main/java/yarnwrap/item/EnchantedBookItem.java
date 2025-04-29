package yarnwrap.item;
public class EnchantedBookItem { public net.minecraft.item.EnchantedBookItem wrapperContained; public EnchantedBookItem(net.minecraft.item.EnchantedBookItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemStack forEnchantment(yarnwrap.enchantment.EnchantmentLevelEntry info) { return new yarnwrap.item.ItemStack(wrapperContained.forEnchantment(info.wrapperContained)); }
// public static yarnwrap.item.ItemStack forEnchantment(yarnwrap.enchantment.EnchantmentLevelEntry info, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.EnchantedBookItem.forEnchantment(info.wrapperContained)); }

}