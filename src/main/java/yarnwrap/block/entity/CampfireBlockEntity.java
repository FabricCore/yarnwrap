package yarnwrap.block.entity;
public class CampfireBlockEntity { public net.minecraft.block.entity.CampfireBlockEntity wrapperContained; public CampfireBlockEntity(net.minecraft.block.entity.CampfireBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList itemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.itemsBeingCooked); }
// public void itemsBeingCooked(yarnwrap.util.collection.DefaultedList value) { wrapperContained.itemsBeingCooked = value.wrapperContained; }
// public int[] cookingTimes() { return wrapperContained.cookingTimes; }
// public void cookingTimes(int[] value) { wrapperContained.cookingTimes = value; }
// public int[] cookingTotalTimes() { return wrapperContained.cookingTotalTimes; }
// public void cookingTotalTimes(int[] value) { wrapperContained.cookingTotalTimes = value; }
// public Object matchGetter() { return wrapperContained.matchGetter; }
// // public void matchGetter(Object value) { wrapperContained.matchGetter = value; }
public CampfireBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CampfireBlockEntity(pos.wrapperContained,state.wrapperContained); }
public java.util.Optional getRecipeFor(yarnwrap.item.ItemStack stack) { return wrapperContained.getRecipeFor(stack.wrapperContained); }
public boolean addItem(yarnwrap.entity.LivingEntity user,yarnwrap.item.ItemStack stack,int cookTime) { return wrapperContained.addItem(user.wrapperContained,stack.wrapperContained,cookTime); }
// public yarnwrap.item.ItemStack method_17504(yarnwrap.recipe.input.SingleStackRecipeInput recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_17504(recipe.wrapperContained)); }
public yarnwrap.util.collection.DefaultedList getItemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getItemsBeingCooked()); }
public void spawnItemsBeingCooked() { wrapperContained.spawnItemsBeingCooked(); }
// public void updateListeners() { wrapperContained.updateListeners(); }
public void litServerTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire) { wrapperContained.litServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }
public void unlitServerTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire) { wrapperContained.unlitServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }
public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }

}