package yarnwrap.screen;
public class EnchantmentScreenHandler { public net.minecraft.screen.EnchantmentScreenHandler wrapperContained; public EnchantmentScreenHandler(net.minecraft.screen.EnchantmentScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_LAPIS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LAPIS_SLOT_TEXTURE); }
// public void EMPTY_LAPIS_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_LAPIS_SLOT_TEXTURE = value.wrapperContained; }
public int[] enchantmentPower() { return wrapperContained.enchantmentPower; }
// public void enchantmentPower(int[] value) { wrapperContained.enchantmentPower = value; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
public int[] enchantmentLevel() { return wrapperContained.enchantmentLevel; }
// public void enchantmentLevel(int[] value) { wrapperContained.enchantmentLevel = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
public int[] enchantmentId() { return wrapperContained.enchantmentId; }
// public void enchantmentId(int[] value) { wrapperContained.enchantmentId = value; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.screen.Property seed() { return new yarnwrap.screen.Property(wrapperContained.seed); }
// public void seed(yarnwrap.screen.Property value) { wrapperContained.seed = value.wrapperContained; }
public int getSeed() { return wrapperContained.getSeed(); }
// public java.util.List generateEnchantments(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.item.ItemStack stack,int slot,int level) { return wrapperContained.generateEnchantments(registryManager.wrapperContained,stack.wrapperContained,slot,level); }
public int getLapisCount() { return wrapperContained.getLapisCount(); }

}