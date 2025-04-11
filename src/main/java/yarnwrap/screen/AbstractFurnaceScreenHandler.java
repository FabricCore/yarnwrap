package yarnwrap.screen;
public class AbstractFurnaceScreenHandler { public net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained; public AbstractFurnaceScreenHandler(net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public yarnwrap.recipe.RecipeType recipeType() { return new yarnwrap.recipe.RecipeType(wrapperContained.recipeType); }
// public void recipeType(yarnwrap.recipe.RecipeType value) { wrapperContained.recipeType = value.wrapperContained; }
// public yarnwrap.recipe.book.RecipeBookCategory category() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.category); }
// public void category(yarnwrap.recipe.book.RecipeBookCategory value) { wrapperContained.category = value.wrapperContained; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.Inventory value) { wrapperContained.inventory = value.wrapperContained; }
// public boolean isFuel(yarnwrap.item.ItemStack itemStack) { return wrapperContained.isFuel(itemStack.wrapperContained); }
public float getCookProgress() { return wrapperContained.getCookProgress(); }
public float getFuelProgress() { return wrapperContained.getFuelProgress(); }
public boolean isBurning() { return wrapperContained.isBurning(); }
// public boolean isSmeltable(yarnwrap.item.ItemStack itemStack) { return wrapperContained.isSmeltable(itemStack.wrapperContained); }

}