package yarnwrap.screen;
public class CraftingScreenHandler { public net.minecraft.screen.CraftingScreenHandler wrapperContained; public CraftingScreenHandler(net.minecraft.screen.CraftingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.CraftingScreenHandler.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.CraftingScreenHandler.player = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.CraftingScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.CraftingScreenHandler.context = value.wrapperContained; }

// public int RESULT_ID() { return wrapperContained.RESULT_ID; }
// public void RESULT_ID(int value) { wrapperContained.RESULT_ID = value; }
public static int RESULT_ID() { return net.minecraft.screen.CraftingScreenHandler.RESULT_ID; }
// public static void RESULT_ID(int value, ) { net.minecraft.screen.CraftingScreenHandler.RESULT_ID = value; }

// public int INPUT_START() { return wrapperContained.INPUT_START; }
// public void INPUT_START(int value) { wrapperContained.INPUT_START = value; }
// public static int INPUT_START() { return net.minecraft.screen.CraftingScreenHandler.INPUT_START; }
// public static void INPUT_START(int value, ) { net.minecraft.screen.CraftingScreenHandler.INPUT_START = value; }

// public int INPUT_END() { return wrapperContained.INPUT_END; }
// public void INPUT_END(int value) { wrapperContained.INPUT_END = value; }
// public static int INPUT_END() { return net.minecraft.screen.CraftingScreenHandler.INPUT_END; }
// public static void INPUT_END(int value, ) { net.minecraft.screen.CraftingScreenHandler.INPUT_END = value; }

// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public static int INVENTORY_START() { return net.minecraft.screen.CraftingScreenHandler.INVENTORY_START; }
// public static void INVENTORY_START(int value, ) { net.minecraft.screen.CraftingScreenHandler.INVENTORY_START = value; }

// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public static int INVENTORY_END() { return net.minecraft.screen.CraftingScreenHandler.INVENTORY_END; }
// public static void INVENTORY_END(int value, ) { net.minecraft.screen.CraftingScreenHandler.INVENTORY_END = value; }

// public int HOTBAR_START() { return wrapperContained.HOTBAR_START; }
// public void HOTBAR_START(int value) { wrapperContained.HOTBAR_START = value; }
// public static int HOTBAR_START() { return net.minecraft.screen.CraftingScreenHandler.HOTBAR_START; }
// public static void HOTBAR_START(int value, ) { net.minecraft.screen.CraftingScreenHandler.HOTBAR_START = value; }

// public int HOTBAR_END() { return wrapperContained.HOTBAR_END; }
// public void HOTBAR_END(int value) { wrapperContained.HOTBAR_END = value; }
// public static int HOTBAR_END() { return net.minecraft.screen.CraftingScreenHandler.HOTBAR_END; }
// public static void HOTBAR_END(int value, ) { net.minecraft.screen.CraftingScreenHandler.HOTBAR_END = value; }

// public boolean filling() { return wrapperContained.filling; }
// public void filling(boolean value) { wrapperContained.filling = value; }
// public static boolean filling() { return net.minecraft.screen.CraftingScreenHandler.filling; }
// public static void filling(boolean value, ) { net.minecraft.screen.CraftingScreenHandler.filling = value; }

public CraftingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.CraftingScreenHandler(syncId,playerInventory.wrapperContained); }
public CraftingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.CraftingScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void updateResult(yarnwrap.screen.ScreenHandler handler,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.RecipeInputInventory craftingInventory,yarnwrap.inventory.CraftingResultInventory resultInventory,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.updateResult(handler.wrapperContained,world.wrapperContained,player.wrapperContained,craftingInventory.wrapperContained,resultInventory.wrapperContained,recipe.wrapperContained); }
// public static void updateResult(yarnwrap.screen.ScreenHandler handler,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.RecipeInputInventory craftingInventory,yarnwrap.inventory.CraftingResultInventory resultInventory,yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.screen.CraftingScreenHandler.updateResult(handler.wrapperContained,world.wrapperContained,player.wrapperContained,craftingInventory.wrapperContained,resultInventory.wrapperContained,recipe.wrapperContained); }
// public void method_17401(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.method_17401(world.wrapperContained,pos.wrapperContained); }
// public static void method_17401(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.screen.CraftingScreenHandler.method_17401(world.wrapperContained,pos.wrapperContained); }
// public void method_17402(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17402(world.wrapperContained,pos.wrapperContained); }
// public static void method_17402(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.CraftingScreenHandler.method_17402(world.wrapperContained,pos.wrapperContained); }

}