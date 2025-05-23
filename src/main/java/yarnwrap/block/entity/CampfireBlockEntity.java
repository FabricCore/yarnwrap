package yarnwrap.block.entity;
public class CampfireBlockEntity { public net.minecraft.block.entity.CampfireBlockEntity wrapperContained; public CampfireBlockEntity(net.minecraft.block.entity.CampfireBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList itemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.itemsBeingCooked); }
// public void itemsBeingCooked(yarnwrap.util.collection.DefaultedList value) { wrapperContained.itemsBeingCooked = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList itemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.CampfireBlockEntity.itemsBeingCooked); }
// public static void itemsBeingCooked(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.CampfireBlockEntity.itemsBeingCooked = value.wrapperContained; }

// public int[] cookingTimes() { return wrapperContained.cookingTimes; }
// public void cookingTimes(int[] value) { wrapperContained.cookingTimes = value; }
// public static int[] cookingTimes() { return net.minecraft.block.entity.CampfireBlockEntity.cookingTimes; }
// public static void cookingTimes(int[] value, ) { net.minecraft.block.entity.CampfireBlockEntity.cookingTimes = value; }

// public int[] cookingTotalTimes() { return wrapperContained.cookingTotalTimes; }
// public void cookingTotalTimes(int[] value) { wrapperContained.cookingTotalTimes = value; }
// public static int[] cookingTotalTimes() { return net.minecraft.block.entity.CampfireBlockEntity.cookingTotalTimes; }
// public static void cookingTotalTimes(int[] value, ) { net.minecraft.block.entity.CampfireBlockEntity.cookingTotalTimes = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.CampfireBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.CampfireBlockEntity.LOGGER = value; }

public CampfireBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CampfireBlockEntity(pos.wrapperContained,state.wrapperContained); }
public boolean addItem(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack) { return wrapperContained.addItem(world.wrapperContained,entity.wrapperContained,stack.wrapperContained); }
// public static boolean addItem(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.entity.CampfireBlockEntity.addItem(world.wrapperContained,entity.wrapperContained,stack.wrapperContained); }
// public yarnwrap.item.ItemStack method_17504(yarnwrap.recipe.input.SingleStackRecipeInput recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_17504(recipe.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_17504(yarnwrap.recipe.input.SingleStackRecipeInput recipe, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.entity.CampfireBlockEntity.method_17504(recipe.wrapperContained)); }
public yarnwrap.util.collection.DefaultedList getItemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.getItemsBeingCooked()); }
// public static yarnwrap.util.collection.DefaultedList getItemsBeingCooked() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.CampfireBlockEntity.getItemsBeingCooked()); }
// public void updateListeners() { wrapperContained.updateListeners(); }
// public static void updateListeners() { net.minecraft.block.entity.CampfireBlockEntity.updateListeners(); }
// public void litServerTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity blockEntity,Object recipeMatchGetter) { wrapperContained.litServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,recipeMatchGetter); }
// public static void litServerTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity blockEntity,Object recipeMatchGetter, ) { net.minecraft.block.entity.CampfireBlockEntity.litServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,recipeMatchGetter); }
// public void unlitServerTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire) { wrapperContained.unlitServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }
// public static void unlitServerTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire, ) { net.minecraft.block.entity.CampfireBlockEntity.unlitServerTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }
// public void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire) { wrapperContained.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }
// public static void clientTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CampfireBlockEntity campfire, ) { net.minecraft.block.entity.CampfireBlockEntity.clientTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,campfire.wrapperContained); }

}