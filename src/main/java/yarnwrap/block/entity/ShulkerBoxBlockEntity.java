package yarnwrap.block.entity;
public class ShulkerBoxBlockEntity { public net.minecraft.block.entity.ShulkerBoxBlockEntity wrapperContained; public ShulkerBoxBlockEntity(net.minecraft.block.entity.ShulkerBoxBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int viewerCount() { return wrapperContained.viewerCount; }
// public void viewerCount(int value) { wrapperContained.viewerCount = value; }
// public static int viewerCount() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.viewerCount; }
// public static void viewerCount(int value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.viewerCount = value; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.ShulkerBoxBlockEntity.inventory); }
// public static void inventory(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.inventory = value.wrapperContained; }

// public float lastAnimationProgress() { return wrapperContained.lastAnimationProgress; }
// public void lastAnimationProgress(float value) { wrapperContained.lastAnimationProgress = value; }
// public static float lastAnimationProgress() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.lastAnimationProgress; }
// public static void lastAnimationProgress(float value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.lastAnimationProgress = value; }

// public float animationProgress() { return wrapperContained.animationProgress; }
// public void animationProgress(float value) { wrapperContained.animationProgress = value; }
// public static float animationProgress() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.animationProgress; }
// public static void animationProgress(float value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.animationProgress = value; }

// public Object animationStage() { return wrapperContained.animationStage; }
// // public void animationStage(Object value) { wrapperContained.animationStage = value; }
// // public static Object animationStage() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.animationStage; }
// // public static void animationStage(Object value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.animationStage = value; }

// public int[] AVAILABLE_SLOTS() { return wrapperContained.AVAILABLE_SLOTS; }
// public void AVAILABLE_SLOTS(int[] value) { wrapperContained.AVAILABLE_SLOTS = value; }
// public static int[] AVAILABLE_SLOTS() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.AVAILABLE_SLOTS; }
// public static void AVAILABLE_SLOTS(int[] value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.AVAILABLE_SLOTS = value; }

// public yarnwrap.util.DyeColor cachedColor() { return new yarnwrap.util.DyeColor(wrapperContained.cachedColor); }
// public void cachedColor(yarnwrap.util.DyeColor value) { wrapperContained.cachedColor = value.wrapperContained; }
// public static yarnwrap.util.DyeColor cachedColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.ShulkerBoxBlockEntity.cachedColor); }
// public static void cachedColor(yarnwrap.util.DyeColor value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.cachedColor = value.wrapperContained; }

// public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
public static int INVENTORY_SIZE() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.INVENTORY_SIZE; }
// public static void INVENTORY_SIZE(int value, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.INVENTORY_SIZE = value; }

public ShulkerBoxBlockEntity(yarnwrap.util.DyeColor color,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ShulkerBoxBlockEntity(color.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public ShulkerBoxBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ShulkerBoxBlockEntity(pos.wrapperContained,state.wrapperContained); }
public float getAnimationProgress(float tickProgress) { return wrapperContained.getAnimationProgress(tickProgress); }
// public static float getAnimationProgress(float tickProgress, ) { return net.minecraft.block.entity.ShulkerBoxBlockEntity.getAnimationProgress(tickProgress); }
public Object getAnimationStage() { return wrapperContained.getAnimationStage(); }
// public static Object getAnimationStage() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.getAnimationStage(); }
public yarnwrap.util.math.Box getBoundingBox(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(state.wrapperContained)); }
// public static yarnwrap.util.math.Box getBoundingBox(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.math.Box(net.minecraft.block.entity.ShulkerBoxBlockEntity.getBoundingBox(state.wrapperContained)); }
// public void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.pushEntities(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.pushEntities(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateAnimation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateAnimation(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateAnimation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.updateAnimation(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void readInventoryNbt() { wrapperContained.readInventoryNbt(); }
// public static void readInventoryNbt() { net.minecraft.block.entity.ShulkerBoxBlockEntity.readInventoryNbt(); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.entity.ShulkerBoxBlockEntity.getColor()); }
// public void updateNeighborStates(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighborStates(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updateNeighborStates(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.updateNeighborStates(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean suffocates() { return wrapperContained.suffocates(); }
// public static boolean suffocates() { return net.minecraft.block.entity.ShulkerBoxBlockEntity.suffocates(); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ShulkerBoxBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ShulkerBoxBlockEntity blockEntity, ) { net.minecraft.block.entity.ShulkerBoxBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}