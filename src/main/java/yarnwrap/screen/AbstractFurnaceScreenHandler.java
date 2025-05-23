package yarnwrap.screen;
public class AbstractFurnaceScreenHandler { public net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained; public AbstractFurnaceScreenHandler(net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.screen.AbstractFurnaceScreenHandler.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.world = value.wrapperContained; }

// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.AbstractFurnaceScreenHandler.inventory); }
// public static void inventory(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.inventory = value.wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.screen.AbstractFurnaceScreenHandler.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.propertyDelegate = value.wrapperContained; }

// public yarnwrap.recipe.RecipeType recipeType() { return new yarnwrap.recipe.RecipeType(wrapperContained.recipeType); }
// public void recipeType(yarnwrap.recipe.RecipeType value) { wrapperContained.recipeType = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeType recipeType() { return new yarnwrap.recipe.RecipeType(net.minecraft.screen.AbstractFurnaceScreenHandler.recipeType); }
// public static void recipeType(yarnwrap.recipe.RecipeType value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.recipeType = value.wrapperContained; }

// public yarnwrap.recipe.book.RecipeBookType category() { return new yarnwrap.recipe.book.RecipeBookType(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeBookType value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.recipe.book.RecipeBookType category() { return new yarnwrap.recipe.book.RecipeBookType(net.minecraft.screen.AbstractFurnaceScreenHandler.category); }
// public static void category(yarnwrap.recipe.book.RecipeBookType value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.category = value.wrapperContained; }

// public yarnwrap.recipe.RecipePropertySet recipePropertySet() { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.recipePropertySet); }
// public void recipePropertySet(yarnwrap.recipe.RecipePropertySet value) { wrapperContained.recipePropertySet = value.wrapperContained; }
// public static yarnwrap.recipe.RecipePropertySet recipePropertySet() { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.screen.AbstractFurnaceScreenHandler.recipePropertySet); }
// public static void recipePropertySet(yarnwrap.recipe.RecipePropertySet value, ) { net.minecraft.screen.AbstractFurnaceScreenHandler.recipePropertySet = value.wrapperContained; }

// public AbstractFurnaceScreenHandler(yarnwrap.screen.ScreenHandlerType type,yarnwrap.recipe.RecipeType recipeType,yarnwrap.registry.RegistryKey recipePropertySetKey,yarnwrap.recipe.book.RecipeBookType category,int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.AbstractFurnaceScreenHandler(type.wrapperContained,recipeType.wrapperContained,recipePropertySetKey.wrapperContained,category.wrapperContained,syncId,playerInventory.wrapperContained); }
// public AbstractFurnaceScreenHandler(yarnwrap.screen.ScreenHandlerType type,yarnwrap.recipe.RecipeType recipeType,yarnwrap.registry.RegistryKey recipePropertySetKey,yarnwrap.recipe.book.RecipeBookType category,int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.Inventory inventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.AbstractFurnaceScreenHandler(type.wrapperContained,recipeType.wrapperContained,recipePropertySetKey.wrapperContained,category.wrapperContained,syncId,playerInventory.wrapperContained,inventory.wrapperContained,propertyDelegate.wrapperContained); }
// public boolean isSmeltable(yarnwrap.item.ItemStack itemStack) { return wrapperContained.isSmeltable(itemStack.wrapperContained); }
// public static boolean isSmeltable(yarnwrap.item.ItemStack itemStack, ) { return net.minecraft.screen.AbstractFurnaceScreenHandler.isSmeltable(itemStack.wrapperContained); }
// public boolean isFuel(yarnwrap.item.ItemStack item) { return wrapperContained.isFuel(item.wrapperContained); }
// public static boolean isFuel(yarnwrap.item.ItemStack item, ) { return net.minecraft.screen.AbstractFurnaceScreenHandler.isFuel(item.wrapperContained); }
public float getCookProgress() { return wrapperContained.getCookProgress(); }
// public static float getCookProgress() { return net.minecraft.screen.AbstractFurnaceScreenHandler.getCookProgress(); }
public float getFuelProgress() { return wrapperContained.getFuelProgress(); }
// public static float getFuelProgress() { return net.minecraft.screen.AbstractFurnaceScreenHandler.getFuelProgress(); }
public boolean isBurning() { return wrapperContained.isBurning(); }
// public static boolean isBurning() { return net.minecraft.screen.AbstractFurnaceScreenHandler.isBurning(); }
public yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getOutputSlot()); }
// public static yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.AbstractFurnaceScreenHandler.getOutputSlot()); }

}