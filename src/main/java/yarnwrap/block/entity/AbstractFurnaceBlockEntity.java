package yarnwrap.block.entity;
public class AbstractFurnaceBlockEntity { public net.minecraft.block.entity.AbstractFurnaceBlockEntity wrapperContained; public AbstractFurnaceBlockEntity(net.minecraft.block.entity.AbstractFurnaceBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int[] BOTTOM_SLOTS() { return wrapperContained.BOTTOM_SLOTS; }
// public void BOTTOM_SLOTS(int[] value) { wrapperContained.BOTTOM_SLOTS = value; }
// public static int[] BOTTOM_SLOTS() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.BOTTOM_SLOTS; }
// public static void BOTTOM_SLOTS(int[] value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.BOTTOM_SLOTS = value; }

// public int[] SIDE_SLOTS() { return wrapperContained.SIDE_SLOTS; }
// public void SIDE_SLOTS(int[] value) { wrapperContained.SIDE_SLOTS = value; }
// public static int[] SIDE_SLOTS() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.SIDE_SLOTS; }
// public static void SIDE_SLOTS(int[] value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.SIDE_SLOTS = value; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.AbstractFurnaceBlockEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.inventory = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap recipesUsed() { return wrapperContained.recipesUsed; }
// public void recipesUsed(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap value) { wrapperContained.recipesUsed = value; }
// public static it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap recipesUsed() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.recipesUsed; }
// public static void recipesUsed(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.recipesUsed = value; }

// public int[] TOP_SLOTS() { return wrapperContained.TOP_SLOTS; }
// public void TOP_SLOTS(int[] value) { wrapperContained.TOP_SLOTS = value; }
// public static int[] TOP_SLOTS() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.TOP_SLOTS; }
// public static void TOP_SLOTS(int[] value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.TOP_SLOTS = value; }

// public int cookingTotalTime() { return wrapperContained.cookingTotalTime; }
// public void cookingTotalTime(int value) { wrapperContained.cookingTotalTime = value; }
// public static int cookingTotalTime() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.cookingTotalTime; }
// public static void cookingTotalTime(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.cookingTotalTime = value; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.block.entity.AbstractFurnaceBlockEntity.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.propertyDelegate = value.wrapperContained; }

// public int INPUT_SLOT_INDEX() { return wrapperContained.INPUT_SLOT_INDEX; }
// public void INPUT_SLOT_INDEX(int value) { wrapperContained.INPUT_SLOT_INDEX = value; }
// public static int INPUT_SLOT_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.INPUT_SLOT_INDEX; }
// public static void INPUT_SLOT_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.INPUT_SLOT_INDEX = value; }

// public int FUEL_SLOT_INDEX() { return wrapperContained.FUEL_SLOT_INDEX; }
// public void FUEL_SLOT_INDEX(int value) { wrapperContained.FUEL_SLOT_INDEX = value; }
// public static int FUEL_SLOT_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.FUEL_SLOT_INDEX; }
// public static void FUEL_SLOT_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.FUEL_SLOT_INDEX = value; }

// public int OUTPUT_SLOT_INDEX() { return wrapperContained.OUTPUT_SLOT_INDEX; }
// public void OUTPUT_SLOT_INDEX(int value) { wrapperContained.OUTPUT_SLOT_INDEX = value; }
// public static int OUTPUT_SLOT_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.OUTPUT_SLOT_INDEX; }
// public static void OUTPUT_SLOT_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.OUTPUT_SLOT_INDEX = value; }

// public int BURN_TIME_PROPERTY_INDEX() { return wrapperContained.BURN_TIME_PROPERTY_INDEX; }
// public void BURN_TIME_PROPERTY_INDEX(int value) { wrapperContained.BURN_TIME_PROPERTY_INDEX = value; }
public static int BURN_TIME_PROPERTY_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.BURN_TIME_PROPERTY_INDEX; }
// public static void BURN_TIME_PROPERTY_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.BURN_TIME_PROPERTY_INDEX = value; }

// public int FUEL_TIME_PROPERTY_INDEX() { return wrapperContained.FUEL_TIME_PROPERTY_INDEX; }
// public void FUEL_TIME_PROPERTY_INDEX(int value) { wrapperContained.FUEL_TIME_PROPERTY_INDEX = value; }
public static int FUEL_TIME_PROPERTY_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.FUEL_TIME_PROPERTY_INDEX; }
// public static void FUEL_TIME_PROPERTY_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.FUEL_TIME_PROPERTY_INDEX = value; }

// public int COOK_TIME_PROPERTY_INDEX() { return wrapperContained.COOK_TIME_PROPERTY_INDEX; }
// public void COOK_TIME_PROPERTY_INDEX(int value) { wrapperContained.COOK_TIME_PROPERTY_INDEX = value; }
public static int COOK_TIME_PROPERTY_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.COOK_TIME_PROPERTY_INDEX; }
// public static void COOK_TIME_PROPERTY_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.COOK_TIME_PROPERTY_INDEX = value; }

// public int COOK_TIME_TOTAL_PROPERTY_INDEX() { return wrapperContained.COOK_TIME_TOTAL_PROPERTY_INDEX; }
// public void COOK_TIME_TOTAL_PROPERTY_INDEX(int value) { wrapperContained.COOK_TIME_TOTAL_PROPERTY_INDEX = value; }
public static int COOK_TIME_TOTAL_PROPERTY_INDEX() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.COOK_TIME_TOTAL_PROPERTY_INDEX; }
// public static void COOK_TIME_TOTAL_PROPERTY_INDEX(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.COOK_TIME_TOTAL_PROPERTY_INDEX = value; }

// public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
public static int PROPERTY_COUNT() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.PROPERTY_COUNT; }
// public static void PROPERTY_COUNT(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.PROPERTY_COUNT = value; }

// public int DEFAULT_COOK_TIME() { return wrapperContained.DEFAULT_COOK_TIME; }
// public void DEFAULT_COOK_TIME(int value) { wrapperContained.DEFAULT_COOK_TIME = value; }
public static int DEFAULT_COOK_TIME() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOK_TIME; }
// public static void DEFAULT_COOK_TIME(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOK_TIME = value; }

// public Object matchGetter() { return wrapperContained.matchGetter; }
// // public void matchGetter(Object value) { wrapperContained.matchGetter = value; }
// // public static Object matchGetter() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.matchGetter; }
// // public static void matchGetter(Object value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.matchGetter = value; }

// public int litTimeRemaining() { return wrapperContained.litTimeRemaining; }
// public void litTimeRemaining(int value) { wrapperContained.litTimeRemaining = value; }
// public static int litTimeRemaining() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.litTimeRemaining; }
// public static void litTimeRemaining(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.litTimeRemaining = value; }

// public int litTotalTime() { return wrapperContained.litTotalTime; }
// public void litTotalTime(int value) { wrapperContained.litTotalTime = value; }
// public static int litTotalTime() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.litTotalTime; }
// public static void litTotalTime(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.litTotalTime = value; }

// public int cookingTimeSpent() { return wrapperContained.cookingTimeSpent; }
// public void cookingTimeSpent(int value) { wrapperContained.cookingTimeSpent = value; }
// public static int cookingTimeSpent() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.cookingTimeSpent; }
// public static void cookingTimeSpent(int value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.cookingTimeSpent = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.CODEC = value; }

// public short DEFAULT_LIT_TIME_REMAINING() { return wrapperContained.DEFAULT_LIT_TIME_REMAINING; }
// public void DEFAULT_LIT_TIME_REMAINING(short value) { wrapperContained.DEFAULT_LIT_TIME_REMAINING = value; }
// public static short DEFAULT_LIT_TIME_REMAINING() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_LIT_TIME_REMAINING; }
// public static void DEFAULT_LIT_TIME_REMAINING(short value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_LIT_TIME_REMAINING = value; }

// public short DEFAULT_LIT_TOTAL_TIME() { return wrapperContained.DEFAULT_LIT_TOTAL_TIME; }
// public void DEFAULT_LIT_TOTAL_TIME(short value) { wrapperContained.DEFAULT_LIT_TOTAL_TIME = value; }
// public static short DEFAULT_LIT_TOTAL_TIME() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_LIT_TOTAL_TIME; }
// public static void DEFAULT_LIT_TOTAL_TIME(short value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_LIT_TOTAL_TIME = value; }

// public short DEFAULT_COOKING_TIME_SPENT() { return wrapperContained.DEFAULT_COOKING_TIME_SPENT; }
// public void DEFAULT_COOKING_TIME_SPENT(short value) { wrapperContained.DEFAULT_COOKING_TIME_SPENT = value; }
// public static short DEFAULT_COOKING_TIME_SPENT() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOKING_TIME_SPENT; }
// public static void DEFAULT_COOKING_TIME_SPENT(short value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOKING_TIME_SPENT = value; }

// public short DEFAULT_COOKING_TOTAL_TIME() { return wrapperContained.DEFAULT_COOKING_TOTAL_TIME; }
// public void DEFAULT_COOKING_TOTAL_TIME(short value) { wrapperContained.DEFAULT_COOKING_TOTAL_TIME = value; }
// public static short DEFAULT_COOKING_TOTAL_TIME() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOKING_TOTAL_TIME; }
// public static void DEFAULT_COOKING_TOTAL_TIME(short value, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.DEFAULT_COOKING_TOTAL_TIME = value; }

// public AbstractFurnaceBlockEntity(yarnwrap.block.entity.BlockEntityType blockEntityType,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.recipe.RecipeType recipeType) { this.wrapperContained = new net.minecraft.block.entity.AbstractFurnaceBlockEntity(blockEntityType.wrapperContained,pos.wrapperContained,state.wrapperContained,recipeType.wrapperContained); }
// public boolean canAcceptRecipeOutput(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.input.SingleStackRecipeInput input,yarnwrap.util.collection.DefaultedList inventory,int maxCount) { return wrapperContained.canAcceptRecipeOutput(dynamicRegistryManager.wrapperContained,recipe.wrapperContained,input.wrapperContained,inventory.wrapperContained,maxCount); }
// public static boolean canAcceptRecipeOutput(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.input.SingleStackRecipeInput input,yarnwrap.util.collection.DefaultedList inventory,int maxCount, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.canAcceptRecipeOutput(dynamicRegistryManager.wrapperContained,recipe.wrapperContained,input.wrapperContained,inventory.wrapperContained,maxCount); }
// public int getFuelTime(yarnwrap.item.FuelRegistry fuelRegistry,yarnwrap.item.ItemStack stack) { return wrapperContained.getFuelTime(fuelRegistry.wrapperContained,stack.wrapperContained); }
// public static int getFuelTime(yarnwrap.item.FuelRegistry fuelRegistry,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.getFuelTime(fuelRegistry.wrapperContained,stack.wrapperContained); }
// public boolean isBurning() { return wrapperContained.isBurning(); }
// public static boolean isBurning() { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.isBurning(); }
// public boolean craftRecipe(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.input.SingleStackRecipeInput input,yarnwrap.util.collection.DefaultedList inventory,int maxCount) { return wrapperContained.craftRecipe(dynamicRegistryManager.wrapperContained,recipe.wrapperContained,input.wrapperContained,inventory.wrapperContained,maxCount); }
// public static boolean craftRecipe(yarnwrap.registry.DynamicRegistryManager dynamicRegistryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.recipe.input.SingleStackRecipeInput input,yarnwrap.util.collection.DefaultedList inventory,int maxCount, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.craftRecipe(dynamicRegistryManager.wrapperContained,recipe.wrapperContained,input.wrapperContained,inventory.wrapperContained,maxCount); }
// public int getCookTime(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.AbstractFurnaceBlockEntity furnace) { return wrapperContained.getCookTime(world.wrapperContained,furnace.wrapperContained); }
// public static int getCookTime(yarnwrap.server.world.ServerWorld world,yarnwrap.block.entity.AbstractFurnaceBlockEntity furnace, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.getCookTime(world.wrapperContained,furnace.wrapperContained); }
// public void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int multiplier,float experience) { wrapperContained.dropExperience(world.wrapperContained,pos.wrapperContained,multiplier,experience); }
// public static void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int multiplier,float experience, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.dropExperience(world.wrapperContained,pos.wrapperContained,multiplier,experience); }
// public void method_17761(java.util.List recipe) { wrapperContained.method_17761(recipe); }
// public static void method_17761(java.util.List recipe, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.method_17761(recipe); }
public void dropExperienceForRecipesUsed(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.dropExperienceForRecipesUsed(player.wrapperContained); }
// public static void dropExperienceForRecipesUsed(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.dropExperienceForRecipesUsed(player.wrapperContained); }
public java.util.List getRecipesUsedAndDropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos) { return wrapperContained.getRecipesUsedAndDropExperience(world.wrapperContained,pos.wrapperContained); }
// public static java.util.List getRecipesUsedAndDropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.getRecipesUsedAndDropExperience(world.wrapperContained,pos.wrapperContained); }
// public void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.AbstractFurnaceBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.AbstractFurnaceBlockEntity blockEntity, ) { net.minecraft.block.entity.AbstractFurnaceBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public java.lang.Integer method_53790(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.method_53790(recipe.wrapperContained); }
// public static java.lang.Integer method_53790(yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.block.entity.AbstractFurnaceBlockEntity.method_53790(recipe.wrapperContained); }

}