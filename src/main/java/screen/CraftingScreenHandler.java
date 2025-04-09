package yarnwrap.screen;
public class CraftingScreenHandler { public net.minecraft.screen.CraftingScreenHandler wrapperContained; public CraftingScreenHandler(net.minecraft.screen.CraftingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int RESULT_ID() { return wrapperContained.RESULT_ID; }
// public int INPUT_START() { return wrapperContained.INPUT_START; }
// public int INPUT_END() { return wrapperContained.INPUT_END; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public boolean filling() { return wrapperContained.filling; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public yarnwrap.inventory.CraftingResultInventory result() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.result); }
// public yarnwrap.inventory.RecipeInputInventory input() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.input); }
// public void updateResult(yarnwrap.screen.ScreenHandler handler,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.RecipeInputInventory craftingInventory,yarnwrap.inventory.CraftingResultInventory resultInventory,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.updateResult(handler.wrapperContained,world.wrapperContained,player.wrapperContained,craftingInventory.wrapperContained,resultInventory.wrapperContained,recipe.wrapperContained); }

}