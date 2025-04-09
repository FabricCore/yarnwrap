package yarnwrap.screen;
public class AbstractFurnaceScreenHandler { public net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained; public AbstractFurnaceScreenHandler(net.minecraft.screen.AbstractFurnaceScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public yarnwrap.recipe.RecipeType recipeType() { return new yarnwrap.recipe.RecipeType(wrapperContained.recipeType); }
// public yarnwrap.recipe.book.RecipeBookCategory category() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.category); }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public yarnwrap.inventory.Inventory inventory() { return new yarnwrap.inventory.Inventory(wrapperContained.inventory); }
// public boolean isFuel(yarnwrap.item.ItemStack itemStack) { return wrapperContained.isFuel(itemStack.wrapperContained); }
public float getCookProgress() { return wrapperContained.getCookProgress(); }
public float getFuelProgress() { return wrapperContained.getFuelProgress(); }
public boolean isBurning() { return wrapperContained.isBurning(); }
// public boolean isSmeltable(yarnwrap.item.ItemStack itemStack) { return wrapperContained.isSmeltable(itemStack.wrapperContained); }

}