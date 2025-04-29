package yarnwrap.screen;
public class EnchantmentScreenHandler { public net.minecraft.screen.EnchantmentScreenHandler wrapperContained; public EnchantmentScreenHandler(net.minecraft.screen.EnchantmentScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier EMPTY_LAPIS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_LAPIS_SLOT_TEXTURE); }
// public void EMPTY_LAPIS_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_LAPIS_SLOT_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier EMPTY_LAPIS_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.screen.EnchantmentScreenHandler.EMPTY_LAPIS_SLOT_TEXTURE); }
// public static void EMPTY_LAPIS_SLOT_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.screen.EnchantmentScreenHandler.EMPTY_LAPIS_SLOT_TEXTURE = value.wrapperContained; }

public int[] enchantmentPower() { return wrapperContained.enchantmentPower; }
// public void enchantmentPower(int[] value) { wrapperContained.enchantmentPower = value; }
// public static int[] enchantmentPower() { return net.minecraft.screen.EnchantmentScreenHandler.enchantmentPower; }
// public static void enchantmentPower(int[] value, ) { net.minecraft.screen.EnchantmentScreenHandler.enchantmentPower = value; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.EnchantmentScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.EnchantmentScreenHandler.inventory = value.wrapperContained; }

public int[] enchantmentLevel() { return wrapperContained.enchantmentLevel; }
// public void enchantmentLevel(int[] value) { wrapperContained.enchantmentLevel = value; }
// public static int[] enchantmentLevel() { return net.minecraft.screen.EnchantmentScreenHandler.enchantmentLevel; }
// public static void enchantmentLevel(int[] value, ) { net.minecraft.screen.EnchantmentScreenHandler.enchantmentLevel = value; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.screen.EnchantmentScreenHandler.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.screen.EnchantmentScreenHandler.random = value.wrapperContained; }

public int[] enchantmentId() { return wrapperContained.enchantmentId; }
// public void enchantmentId(int[] value) { wrapperContained.enchantmentId = value; }
// public static int[] enchantmentId() { return net.minecraft.screen.EnchantmentScreenHandler.enchantmentId; }
// public static void enchantmentId(int[] value, ) { net.minecraft.screen.EnchantmentScreenHandler.enchantmentId = value; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.EnchantmentScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.EnchantmentScreenHandler.context = value.wrapperContained; }

// public yarnwrap.screen.Property seed() { return new yarnwrap.screen.Property(wrapperContained.seed); }
// public void seed(yarnwrap.screen.Property value) { wrapperContained.seed = value.wrapperContained; }
// public static yarnwrap.screen.Property seed() { return new yarnwrap.screen.Property(net.minecraft.screen.EnchantmentScreenHandler.seed); }
// public static void seed(yarnwrap.screen.Property value, ) { net.minecraft.screen.EnchantmentScreenHandler.seed = value.wrapperContained; }

public EnchantmentScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.EnchantmentScreenHandler(syncId,playerInventory.wrapperContained); }
public EnchantmentScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.EnchantmentScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void method_17410(yarnwrap.item.ItemStack world,int pos) { wrapperContained.method_17410(world.wrapperContained,pos); }
// public static void method_17410(yarnwrap.item.ItemStack world,int pos, ) { net.minecraft.screen.EnchantmentScreenHandler.method_17410(world.wrapperContained,pos); }
// public void method_17411(yarnwrap.item.ItemStack world,yarnwrap.world.World pos) { wrapperContained.method_17411(world.wrapperContained,pos.wrapperContained); }
// public static void method_17411(yarnwrap.item.ItemStack world,yarnwrap.world.World pos, ) { net.minecraft.screen.EnchantmentScreenHandler.method_17411(world.wrapperContained,pos.wrapperContained); }
// public void method_17412(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17412(world.wrapperContained,pos.wrapperContained); }
// public static void method_17412(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.EnchantmentScreenHandler.method_17412(world.wrapperContained,pos.wrapperContained); }
public int getSeed() { return wrapperContained.getSeed(); }
// public static int getSeed() { return net.minecraft.screen.EnchantmentScreenHandler.getSeed(); }
// public java.util.List generateEnchantments(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.item.ItemStack stack,int slot,int level) { return wrapperContained.generateEnchantments(registryManager.wrapperContained,stack.wrapperContained,slot,level); }
// public static java.util.List generateEnchantments(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.item.ItemStack stack,int slot,int level, ) { return net.minecraft.screen.EnchantmentScreenHandler.generateEnchantments(registryManager.wrapperContained,stack.wrapperContained,slot,level); }
public int getLapisCount() { return wrapperContained.getLapisCount(); }
// public static int getLapisCount() { return net.minecraft.screen.EnchantmentScreenHandler.getLapisCount(); }

}