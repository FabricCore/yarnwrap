package yarnwrap.screen;
public class EnchantmentScreenHandler { public net.minecraft.screen.EnchantmentScreenHandler wrapperContained; public EnchantmentScreenHandler(net.minecraft.screen.EnchantmentScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_LAPIS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LAPIS_SLOT_TEXTURE); }
public int[] enchantmentPower() { return wrapperContained.enchantmentPower; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
public int[] enchantmentLevel() { return wrapperContained.enchantmentLevel; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
public int[] enchantmentId() { return wrapperContained.enchantmentId; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.screen.Property seed() { return new yarnwrap.screen.Property(wrapperContained.seed); }
public int getSeed() { return wrapperContained.getSeed(); }
// public java.util.List generateEnchantments(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.item.ItemStack stack,int slot,int level) { return wrapperContained.generateEnchantments(registryManager.wrapperContained,stack.wrapperContained,slot,level); }
public int getLapisCount() { return wrapperContained.getLapisCount(); }

}