package yarnwrap.screen;
public class CraftingScreenHandler { public net.minecraft.screen.CraftingScreenHandler wrapperContained; public CraftingScreenHandler(net.minecraft.screen.CraftingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public int RESULT_ID() { return wrapperContained.RESULT_ID; }
// public void RESULT_ID(int value) { wrapperContained.RESULT_ID = value; }
// public int INPUT_START() { return wrapperContained.INPUT_START; }
// public void INPUT_START(int value) { wrapperContained.INPUT_START = value; }
// public int INPUT_END() { return wrapperContained.INPUT_END; }
// public void INPUT_END(int value) { wrapperContained.INPUT_END = value; }
// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public boolean filling() { return wrapperContained.filling; }
// public void filling(boolean value) { wrapperContained.filling = value; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public yarnwrap.inventory.CraftingResultInventory result() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.result); }
// public void result(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.result = value.wrapperContained; }
// public yarnwrap.inventory.RecipeInputInventory input() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.input = value.wrapperContained; }
public CraftingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.CraftingScreenHandler(syncId,playerInventory.wrapperContained); }
public CraftingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.CraftingScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void updateResult(yarnwrap.screen.ScreenHandler handler,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.RecipeInputInventory craftingInventory,yarnwrap.inventory.CraftingResultInventory resultInventory,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.updateResult(handler.wrapperContained,world.wrapperContained,player.wrapperContained,craftingInventory.wrapperContained,resultInventory.wrapperContained,recipe.wrapperContained); }
// public void method_17400(yarnwrap.item.ItemStack world,yarnwrap.entity.player.PlayerEntity pos) { wrapperContained.method_17400(world.wrapperContained,pos.wrapperContained); }
// public void method_17401(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.method_17401(world.wrapperContained,pos.wrapperContained); }
// public void method_17402(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17402(world.wrapperContained,pos.wrapperContained); }
// public void method_59962(yarnwrap.recipe.RecipeEntry world,yarnwrap.world.World pos) { wrapperContained.method_59962(world.wrapperContained,pos.wrapperContained); }

}