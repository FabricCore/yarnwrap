package yarnwrap.block.entity;
public class ShulkerBoxBlockEntity { public net.minecraft.block.entity.ShulkerBoxBlockEntity wrapperContained; public ShulkerBoxBlockEntity(net.minecraft.block.entity.ShulkerBoxBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int viewerCount() { return wrapperContained.viewerCount; }
// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public float prevAnimationProgress() { return wrapperContained.prevAnimationProgress; }
// public float animationProgress() { return wrapperContained.animationProgress; }
// public Object animationStage() { return wrapperContained.animationStage; }
// public int[] AVAILABLE_SLOTS() { return wrapperContained.AVAILABLE_SLOTS; }
// public yarnwrap.util.DyeColor cachedColor() { return new yarnwrap.util.DyeColor(wrapperContained.cachedColor); }
public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
public float getAnimationProgress(float delta) { return wrapperContained.getAnimationProgress(delta); }
public Object getAnimationStage() { return wrapperContained.getAnimationStage(); }
public yarnwrap.util.math.Box getBoundingBox(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(state.wrapperContained)); }
// public void pushEntities(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.pushEntities(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateAnimation(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateAnimation(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void readInventoryNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { wrapperContained.readInventoryNbt(nbt.wrapperContained,registries); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public void updateNeighborStates(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updateNeighborStates(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean suffocates() { return wrapperContained.suffocates(); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.ShulkerBoxBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}