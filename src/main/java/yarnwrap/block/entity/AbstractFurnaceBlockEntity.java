package yarnwrap.block.entity;
public class AbstractFurnaceBlockEntity { public net.minecraft.block.entity.AbstractFurnaceBlockEntity wrapperContained; public AbstractFurnaceBlockEntity(net.minecraft.block.entity.AbstractFurnaceBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fuelTime() { return wrapperContained.fuelTime; }
// public void fuelTime(int value) { wrapperContained.fuelTime = value; }
// public int burnTime() { return wrapperContained.burnTime; }
// public void burnTime(int value) { wrapperContained.burnTime = value; }
// public int[] BOTTOM_SLOTS() { return wrapperContained.BOTTOM_SLOTS; }
// public void BOTTOM_SLOTS(int[] value) { wrapperContained.BOTTOM_SLOTS = value; }
// public int[] SIDE_SLOTS() { return wrapperContained.SIDE_SLOTS; }
// public void SIDE_SLOTS(int[] value) { wrapperContained.SIDE_SLOTS = value; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap recipesUsed() { return wrapperContained.recipesUsed; }
// public void recipesUsed(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap value) { wrapperContained.recipesUsed = value; }
// public int[] TOP_SLOTS() { return wrapperContained.TOP_SLOTS; }
// public void TOP_SLOTS(int[] value) { wrapperContained.TOP_SLOTS = value; }
// public int cookTimeTotal() { return wrapperContained.cookTimeTotal; }
// public void cookTimeTotal(int value) { wrapperContained.cookTimeTotal = value; }
// public int cookTime() { return wrapperContained.cookTime; }
// public void cookTime(int value) { wrapperContained.cookTime = value; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public int INPUT_SLOT_INDEX() { return wrapperContained.INPUT_SLOT_INDEX; }
// public void INPUT_SLOT_INDEX(int value) { wrapperContained.INPUT_SLOT_INDEX = value; }
// public int FUEL_SLOT_INDEX() { return wrapperContained.FUEL_SLOT_INDEX; }
// public void FUEL_SLOT_INDEX(int value) { wrapperContained.FUEL_SLOT_INDEX = value; }
// public int OUTPUT_SLOT_INDEX() { return wrapperContained.OUTPUT_SLOT_INDEX; }
// public void OUTPUT_SLOT_INDEX(int value) { wrapperContained.OUTPUT_SLOT_INDEX = value; }
public int BURN_TIME_PROPERTY_INDEX() { return wrapperContained.BURN_TIME_PROPERTY_INDEX; }
// public void BURN_TIME_PROPERTY_INDEX(int value) { wrapperContained.BURN_TIME_PROPERTY_INDEX = value; }
public int FUEL_TIME_PROPERTY_INDEX() { return wrapperContained.FUEL_TIME_PROPERTY_INDEX; }
// public void FUEL_TIME_PROPERTY_INDEX(int value) { wrapperContained.FUEL_TIME_PROPERTY_INDEX = value; }
public int COOK_TIME_PROPERTY_INDEX() { return wrapperContained.COOK_TIME_PROPERTY_INDEX; }
// public void COOK_TIME_PROPERTY_INDEX(int value) { wrapperContained.COOK_TIME_PROPERTY_INDEX = value; }
public int COOK_TIME_TOTAL_PROPERTY_INDEX() { return wrapperContained.COOK_TIME_TOTAL_PROPERTY_INDEX; }
// public void COOK_TIME_TOTAL_PROPERTY_INDEX(int value) { wrapperContained.COOK_TIME_TOTAL_PROPERTY_INDEX = value; }
public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
public int DEFAULT_COOK_TIME() { return wrapperContained.DEFAULT_COOK_TIME; }
// public void DEFAULT_COOK_TIME(int value) { wrapperContained.DEFAULT_COOK_TIME = value; }
// public Object matchGetter() { return wrapperContained.matchGetter; }
// // public void matchGetter(Object value) { wrapperContained.matchGetter = value; }
// public java.util.Map fuelTimes() { return wrapperContained.fuelTimes; }
// public void fuelTimes(java.util.Map value) { wrapperContained.fuelTimes = value; }
// public boolean canAcceptRecipeOutput(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.util.collection.DefaultedList slots,int count) { return wrapperContained.canAcceptRecipeOutput(registryManager.wrapperContained,recipe.wrapperContained,slots.wrapperContained,count); }
// public void addFuel(java.util.Map fuelTimes,yarnwrap.registry.tag.TagKey tag,int fuelTime) { wrapperContained.addFuel(fuelTimes,tag.wrapperContained,fuelTime); }
public boolean canUseAsFuel(yarnwrap.item.ItemStack stack) { return wrapperContained.canUseAsFuel(stack.wrapperContained); }
public java.util.Map createFuelTimeMap() { return wrapperContained.createFuelTimeMap(); }
// public int getFuelTime(yarnwrap.item.ItemStack fuel) { return wrapperContained.getFuelTime(fuel.wrapperContained); }
// public boolean isBurning() { return wrapperContained.isBurning(); }
// public void addFuel(java.util.Map fuelTimes,yarnwrap.item.ItemConvertible item,int fuelTime) { wrapperContained.addFuel(fuelTimes,item.wrapperContained,fuelTime); }
// public boolean craftRecipe(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.util.collection.DefaultedList slots,int count) { return wrapperContained.craftRecipe(registryManager.wrapperContained,recipe.wrapperContained,slots.wrapperContained,count); }
// public int getCookTime(yarnwrap.world.World world,yarnwrap.block.entity.AbstractFurnaceBlockEntity furnace) { return wrapperContained.getCookTime(world.wrapperContained,furnace.wrapperContained); }
// public void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,int multiplier,float experience) { wrapperContained.dropExperience(world.wrapperContained,pos.wrapperContained,multiplier,experience); }
public void dropExperienceForRecipesUsed(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.dropExperienceForRecipesUsed(player.wrapperContained); }
// public boolean isNonFlammableWood(yarnwrap.item.Item item) { return wrapperContained.isNonFlammableWood(item.wrapperContained); }
public java.util.List getRecipesUsedAndDropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos) { return wrapperContained.getRecipesUsedAndDropExperience(world.wrapperContained,pos.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.AbstractFurnaceBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void clearFuelTimes() { wrapperContained.clearFuelTimes(); }

}