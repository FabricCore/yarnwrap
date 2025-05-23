package yarnwrap.screen;
public class SmithingScreenHandler { public net.minecraft.screen.SmithingScreenHandler wrapperContained; public SmithingScreenHandler(net.minecraft.screen.SmithingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.screen.SmithingScreenHandler.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.screen.SmithingScreenHandler.world = value.wrapperContained; }

// public int TEMPLATE_ID() { return wrapperContained.TEMPLATE_ID; }
// public void TEMPLATE_ID(int value) { wrapperContained.TEMPLATE_ID = value; }
public static int TEMPLATE_ID() { return net.minecraft.screen.SmithingScreenHandler.TEMPLATE_ID; }
// public static void TEMPLATE_ID(int value, ) { net.minecraft.screen.SmithingScreenHandler.TEMPLATE_ID = value; }

// public int EQUIPMENT_ID() { return wrapperContained.EQUIPMENT_ID; }
// public void EQUIPMENT_ID(int value) { wrapperContained.EQUIPMENT_ID = value; }
public static int EQUIPMENT_ID() { return net.minecraft.screen.SmithingScreenHandler.EQUIPMENT_ID; }
// public static void EQUIPMENT_ID(int value, ) { net.minecraft.screen.SmithingScreenHandler.EQUIPMENT_ID = value; }

// public int MATERIAL_ID() { return wrapperContained.MATERIAL_ID; }
// public void MATERIAL_ID(int value) { wrapperContained.MATERIAL_ID = value; }
public static int MATERIAL_ID() { return net.minecraft.screen.SmithingScreenHandler.MATERIAL_ID; }
// public static void MATERIAL_ID(int value, ) { net.minecraft.screen.SmithingScreenHandler.MATERIAL_ID = value; }

// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
public static int OUTPUT_ID() { return net.minecraft.screen.SmithingScreenHandler.OUTPUT_ID; }
// public static void OUTPUT_ID(int value, ) { net.minecraft.screen.SmithingScreenHandler.OUTPUT_ID = value; }

// public int TEMPLATE_X() { return wrapperContained.TEMPLATE_X; }
// public void TEMPLATE_X(int value) { wrapperContained.TEMPLATE_X = value; }
public static int TEMPLATE_X() { return net.minecraft.screen.SmithingScreenHandler.TEMPLATE_X; }
// public static void TEMPLATE_X(int value, ) { net.minecraft.screen.SmithingScreenHandler.TEMPLATE_X = value; }

// public int EQUIPMENT_X() { return wrapperContained.EQUIPMENT_X; }
// public void EQUIPMENT_X(int value) { wrapperContained.EQUIPMENT_X = value; }
public static int EQUIPMENT_X() { return net.minecraft.screen.SmithingScreenHandler.EQUIPMENT_X; }
// public static void EQUIPMENT_X(int value, ) { net.minecraft.screen.SmithingScreenHandler.EQUIPMENT_X = value; }

// public int MATERIAL_X() { return wrapperContained.MATERIAL_X; }
// public void MATERIAL_X(int value) { wrapperContained.MATERIAL_X = value; }
public static int MATERIAL_X() { return net.minecraft.screen.SmithingScreenHandler.MATERIAL_X; }
// public static void MATERIAL_X(int value, ) { net.minecraft.screen.SmithingScreenHandler.MATERIAL_X = value; }

// public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public void SLOT_Y(int value) { wrapperContained.SLOT_Y = value; }
public static int SLOT_Y() { return net.minecraft.screen.SmithingScreenHandler.SLOT_Y; }
// public static void SLOT_Y(int value, ) { net.minecraft.screen.SmithingScreenHandler.SLOT_Y = value; }

// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void OUTPUT_X(int value) { wrapperContained.OUTPUT_X = value; }
// public static int OUTPUT_X() { return net.minecraft.screen.SmithingScreenHandler.OUTPUT_X; }
// public static void OUTPUT_X(int value, ) { net.minecraft.screen.SmithingScreenHandler.OUTPUT_X = value; }

// public yarnwrap.recipe.RecipePropertySet basePropertySet() { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.basePropertySet); }
// public void basePropertySet(yarnwrap.recipe.RecipePropertySet value) { wrapperContained.basePropertySet = value.wrapperContained; }
// public static yarnwrap.recipe.RecipePropertySet basePropertySet() { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.screen.SmithingScreenHandler.basePropertySet); }
// public static void basePropertySet(yarnwrap.recipe.RecipePropertySet value, ) { net.minecraft.screen.SmithingScreenHandler.basePropertySet = value.wrapperContained; }

// public yarnwrap.recipe.RecipePropertySet templatePropertySet() { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.templatePropertySet); }
// public void templatePropertySet(yarnwrap.recipe.RecipePropertySet value) { wrapperContained.templatePropertySet = value.wrapperContained; }
// public static yarnwrap.recipe.RecipePropertySet templatePropertySet() { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.screen.SmithingScreenHandler.templatePropertySet); }
// public static void templatePropertySet(yarnwrap.recipe.RecipePropertySet value, ) { net.minecraft.screen.SmithingScreenHandler.templatePropertySet = value.wrapperContained; }

// public yarnwrap.recipe.RecipePropertySet additionPropertySet() { return new yarnwrap.recipe.RecipePropertySet(wrapperContained.additionPropertySet); }
// public void additionPropertySet(yarnwrap.recipe.RecipePropertySet value) { wrapperContained.additionPropertySet = value.wrapperContained; }
// public static yarnwrap.recipe.RecipePropertySet additionPropertySet() { return new yarnwrap.recipe.RecipePropertySet(net.minecraft.screen.SmithingScreenHandler.additionPropertySet); }
// public static void additionPropertySet(yarnwrap.recipe.RecipePropertySet value, ) { net.minecraft.screen.SmithingScreenHandler.additionPropertySet = value.wrapperContained; }

// public yarnwrap.screen.Property invalidRecipe() { return new yarnwrap.screen.Property(wrapperContained.invalidRecipe); }
// public void invalidRecipe(yarnwrap.screen.Property value) { wrapperContained.invalidRecipe = value.wrapperContained; }
// public static yarnwrap.screen.Property invalidRecipe() { return new yarnwrap.screen.Property(net.minecraft.screen.SmithingScreenHandler.invalidRecipe); }
// public static void invalidRecipe(yarnwrap.screen.Property value, ) { net.minecraft.screen.SmithingScreenHandler.invalidRecipe = value.wrapperContained; }

public SmithingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.SmithingScreenHandler(syncId,playerInventory.wrapperContained); }
public SmithingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.SmithingScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public SmithingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context,yarnwrap.world.World world) { this.wrapperContained = new net.minecraft.screen.SmithingScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained,world.wrapperContained); }
// public void method_24929(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.method_24929(world.wrapperContained,pos.wrapperContained); }
// public static void method_24929(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.screen.SmithingScreenHandler.method_24929(world.wrapperContained,pos.wrapperContained); }
// public void decrementStack(int slot) { wrapperContained.decrementStack(slot); }
// public static void decrementStack(int slot, ) { net.minecraft.screen.SmithingScreenHandler.decrementStack(slot); }
// public java.util.List getInputStacks() { return wrapperContained.getInputStacks(); }
// public static java.util.List getInputStacks() { return net.minecraft.screen.SmithingScreenHandler.getInputStacks(); }
// public yarnwrap.recipe.input.SmithingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.SmithingRecipeInput(wrapperContained.createRecipeInput()); }
// public static yarnwrap.recipe.input.SmithingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.SmithingRecipeInput(net.minecraft.screen.SmithingScreenHandler.createRecipeInput()); }
// public yarnwrap.screen.slot.ForgingSlotsManager createForgingSlotsManager(yarnwrap.recipe.RecipeManager recipeManager) { return new yarnwrap.screen.slot.ForgingSlotsManager(wrapperContained.createForgingSlotsManager(recipeManager.wrapperContained)); }
// public static yarnwrap.screen.slot.ForgingSlotsManager createForgingSlotsManager(yarnwrap.recipe.RecipeManager recipeManager, ) { return new yarnwrap.screen.slot.ForgingSlotsManager(net.minecraft.screen.SmithingScreenHandler.createForgingSlotsManager(recipeManager.wrapperContained)); }
// public void method_64653(yarnwrap.recipe.input.SmithingRecipeInput recipe) { wrapperContained.method_64653(recipe.wrapperContained); }
// public static void method_64653(yarnwrap.recipe.input.SmithingRecipeInput recipe, ) { net.minecraft.screen.SmithingScreenHandler.method_64653(recipe.wrapperContained); }
public boolean hasInvalidRecipe() { return wrapperContained.hasInvalidRecipe(); }
// public static boolean hasInvalidRecipe() { return net.minecraft.screen.SmithingScreenHandler.hasInvalidRecipe(); }

}