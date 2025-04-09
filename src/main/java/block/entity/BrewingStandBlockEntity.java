package yarnwrap.block.entity;
public class BrewingStandBlockEntity { public net.minecraft.block.entity.BrewingStandBlockEntity wrapperContained; public BrewingStandBlockEntity(net.minecraft.block.entity.BrewingStandBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int brewTime() { return wrapperContained.brewTime; }
// public int[] BOTTOM_SLOTS() { return wrapperContained.BOTTOM_SLOTS; }
// public int[] SIDE_SLOTS() { return wrapperContained.SIDE_SLOTS; }
// public yarnwrap.item.Item itemBrewing() { return new yarnwrap.item.Item(wrapperContained.itemBrewing); }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public boolean[] slotsEmptyLastTick() { return wrapperContained.slotsEmptyLastTick; }
// public int fuel() { return wrapperContained.fuel; }
// public int[] TOP_SLOTS() { return wrapperContained.TOP_SLOTS; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
public int MAX_FUEL_USES() { return wrapperContained.MAX_FUEL_USES; }
public int BREW_TIME_PROPERTY_INDEX() { return wrapperContained.BREW_TIME_PROPERTY_INDEX; }
public int FUEL_PROPERTY_INDEX() { return wrapperContained.FUEL_PROPERTY_INDEX; }
public int PROPERTY_COUNT() { return wrapperContained.PROPERTY_COUNT; }
// public int INPUT_SLOT_INDEX() { return wrapperContained.INPUT_SLOT_INDEX; }
// public int FUEL_SLOT_INDEX() { return wrapperContained.FUEL_SLOT_INDEX; }
// public boolean canCraft(yarnwrap.recipe.BrewingRecipeRegistry brewingRecipeRegistry,yarnwrap.util.collection.DefaultedList slots) { return wrapperContained.canCraft(brewingRecipeRegistry.wrapperContained,slots.wrapperContained); }
// public boolean[] getSlotsEmpty() { return wrapperContained.getSlotsEmpty(); }
// public void craft(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.collection.DefaultedList slots) { wrapperContained.craft(world.wrapperContained,pos.wrapperContained,slots.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BrewingStandBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}