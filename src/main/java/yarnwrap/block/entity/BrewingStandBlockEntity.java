package yarnwrap.block.entity;
public class BrewingStandBlockEntity { public net.minecraft.block.entity.BrewingStandBlockEntity wrapperContained; public BrewingStandBlockEntity(net.minecraft.block.entity.BrewingStandBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int brewTime() { return wrapperContained.brewTime; }
// public void brewTime(int value) { wrapperContained.brewTime = value; }
// public int[] BOTTOM_SLOTS() { return wrapperContained.BOTTOM_SLOTS; }
// public void BOTTOM_SLOTS(int[] value) { wrapperContained.BOTTOM_SLOTS = value; }
// public int[] SIDE_SLOTS() { return wrapperContained.SIDE_SLOTS; }
// public void SIDE_SLOTS(int[] value) { wrapperContained.SIDE_SLOTS = value; }
// public yarnwrap.item.Item itemBrewing() { return new yarnwrap.item.Item(wrapperContained.itemBrewing); }
// public void itemBrewing(yarnwrap.item.Item value) { wrapperContained.itemBrewing = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public boolean[] slotsEmptyLastTick() { return wrapperContained.slotsEmptyLastTick; }
// public void slotsEmptyLastTick(boolean[] value) { wrapperContained.slotsEmptyLastTick = value; }
// public int fuel() { return wrapperContained.fuel; }
// public void fuel(int value) { wrapperContained.fuel = value; }
// public int[] TOP_SLOTS() { return wrapperContained.TOP_SLOTS; }
// public void TOP_SLOTS(int[] value) { wrapperContained.TOP_SLOTS = value; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
public int MAX_FUEL_USES() { return wrapperContained.MAX_FUEL_USES; }
// public void MAX_FUEL_USES(int value) { wrapperContained.MAX_FUEL_USES = value; }
public int BREW_TIME_PROPERTY_INDEX() { return wrapperContained.BREW_TIME_PROPERTY_INDEX; }
// public void BREW_TIME_PROPERTY_INDEX(int value) { wrapperContained.BREW_TIME_PROPERTY_INDEX = value; }
public int FUEL_PROPERTY_INDEX() { return wrapperContained.FUEL_PROPERTY_INDEX; }
// public void FUEL_PROPERTY_INDEX(int value) { wrapperContained.FUEL_PROPERTY_INDEX = value; }
public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public void PROPERTY_COUNT(int value) { wrapperContained.PROPERTY_COUNT = value; }
// public int INPUT_SLOT_INDEX() { return wrapperContained.INPUT_SLOT_INDEX; }
// public void INPUT_SLOT_INDEX(int value) { wrapperContained.INPUT_SLOT_INDEX = value; }
// public int FUEL_SLOT_INDEX() { return wrapperContained.FUEL_SLOT_INDEX; }
// public void FUEL_SLOT_INDEX(int value) { wrapperContained.FUEL_SLOT_INDEX = value; }
public BrewingStandBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.BrewingStandBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public boolean canCraft(yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry,yarnwrap.util.collection.DefaultedList slots) { return wrapperContained.canCraft(brewingRecipeRegistry.wrapperContained,slots.wrapperContained); }
// public boolean[] getSlotsEmpty() { return wrapperContained.getSlotsEmpty(); }
// public void craft(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.collection.DefaultedList slots) { wrapperContained.craft(world.wrapperContained,pos.wrapperContained,slots.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BrewingStandBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}