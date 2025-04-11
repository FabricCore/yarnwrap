package yarnwrap.block;
public class Block { public net.minecraft.block.Block wrapperContained; public Block(net.minecraft.block.Block wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public yarnwrap.block.BlockState defaultState() { return new yarnwrap.block.BlockState(wrapperContained.defaultState); }
// public void defaultState(yarnwrap.block.BlockState value) { wrapperContained.defaultState = value.wrapperContained; }
// public yarnwrap.state.StateManager stateManager() { return new yarnwrap.state.StateManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.state.StateManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public java.lang.ThreadLocal FACE_CULL_MAP() { return wrapperContained.FACE_CULL_MAP; }
// public void FACE_CULL_MAP(java.lang.ThreadLocal value) { wrapperContained.FACE_CULL_MAP = value; }
public yarnwrap.util.collection.IdList STATE_IDS() { return new yarnwrap.util.collection.IdList(wrapperContained.STATE_IDS); }
// public void STATE_IDS(yarnwrap.util.collection.IdList value) { wrapperContained.STATE_IDS = value.wrapperContained; }
// public yarnwrap.item.Item cachedItem() { return new yarnwrap.item.Item(wrapperContained.cachedItem); }
// public void cachedItem(yarnwrap.item.Item value) { wrapperContained.cachedItem = value.wrapperContained; }
// public com.google.common.cache.LoadingCache FULL_CUBE_SHAPE_CACHE() { return wrapperContained.FULL_CUBE_SHAPE_CACHE; }
// public void FULL_CUBE_SHAPE_CACHE(com.google.common.cache.LoadingCache value) { wrapperContained.FULL_CUBE_SHAPE_CACHE = value; }
public int NOTIFY_ALL_AND_REDRAW() { return wrapperContained.NOTIFY_ALL_AND_REDRAW; }
// public void NOTIFY_ALL_AND_REDRAW(int value) { wrapperContained.NOTIFY_ALL_AND_REDRAW = value; }
public int NOTIFY_NEIGHBORS() { return wrapperContained.NOTIFY_NEIGHBORS; }
// public void NOTIFY_NEIGHBORS(int value) { wrapperContained.NOTIFY_NEIGHBORS = value; }
public int NOTIFY_LISTENERS() { return wrapperContained.NOTIFY_LISTENERS; }
// public void NOTIFY_LISTENERS(int value) { wrapperContained.NOTIFY_LISTENERS = value; }
public int NO_REDRAW() { return wrapperContained.NO_REDRAW; }
// public void NO_REDRAW(int value) { wrapperContained.NO_REDRAW = value; }
public int REDRAW_ON_MAIN_THREAD() { return wrapperContained.REDRAW_ON_MAIN_THREAD; }
// public void REDRAW_ON_MAIN_THREAD(int value) { wrapperContained.REDRAW_ON_MAIN_THREAD = value; }
public int FORCE_STATE() { return wrapperContained.FORCE_STATE; }
// public void FORCE_STATE(int value) { wrapperContained.FORCE_STATE = value; }
public int SKIP_DROPS() { return wrapperContained.SKIP_DROPS; }
// public void SKIP_DROPS(int value) { wrapperContained.SKIP_DROPS = value; }
public int MOVED() { return wrapperContained.MOVED; }
// public void MOVED(int value) { wrapperContained.MOVED = value; }
public int NOTIFY_ALL() { return wrapperContained.NOTIFY_ALL; }
// public void NOTIFY_ALL(int value) { wrapperContained.NOTIFY_ALL = value; }
// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public boolean hasTopRim(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasTopRim(world.wrapperContained,pos.wrapperContained); }
public boolean sideCoversSmallSquare(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return wrapperContained.sideCoversSmallSquare(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }
public float getVelocityMultiplier() { return wrapperContained.getVelocityMultiplier(); }
public float getJumpVelocityMultiplier() { return wrapperContained.getJumpVelocityMultiplier(); }
public void replace(yarnwrap.block.BlockState state,yarnwrap.block.BlockState newState,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int flags) { wrapperContained.replace(state.wrapperContained,newState.wrapperContained,world.wrapperContained,pos.wrapperContained,flags); }
// public void spawnBreakParticles(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.spawnBreakParticles(world.wrapperContained,player.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public com.google.common.collect.ImmutableMap getShapesForStates(java.util.function.Function stateToShape) { return wrapperContained.getShapesForStates(stateToShape); }
// public yarnwrap.block.BlockState copyProperty(yarnwrap.block.BlockState source,yarnwrap.block.BlockState target,yarnwrap.state.property.Property property) { return new yarnwrap.block.BlockState(wrapperContained.copyProperty(source.wrapperContained,target.wrapperContained,property.wrapperContained)); }
public yarnwrap.block.BlockState getStateWithProperties(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithProperties(state.wrapperContained)); }
public void dropStack(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.item.ItemStack stack) { wrapperContained.dropStack(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,stack.wrapperContained); }
// public void dropStack(yarnwrap.world.World world,java.util.function.Supplier itemEntitySupplier,yarnwrap.item.ItemStack stack) { wrapperContained.dropStack(world.wrapperContained,itemEntitySupplier,stack.wrapperContained); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
// public void dropExperienceWhenMined(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack tool,yarnwrap.util.math.intprovider.IntProvider experience) { wrapperContained.dropExperienceWhenMined(world.wrapperContained,pos.wrapperContained,tool.wrapperContained,experience.wrapperContained); }
public void randomDisplayTick(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.randomDisplayTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public void dropStacks(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.dropStacks(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public float getSlipperiness() { return wrapperContained.getSlipperiness(); }
public boolean isFaceFullSquare(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Direction side) { return wrapperContained.isFaceFullSquare(shape.wrapperContained,side.wrapperContained); }
public void onEntityLand(yarnwrap.world.BlockView world,yarnwrap.entity.Entity entity) { wrapperContained.onEntityLand(world.wrapperContained,entity.wrapperContained); }
public yarnwrap.block.Block getBlockFromItem(yarnwrap.item.Item item) { return new yarnwrap.block.Block(wrapperContained.getBlockFromItem(item.wrapperContained)); }
// public void precipitationTick(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,Object precipitation) { wrapperContained.precipitationTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,precipitation); }
public int getRawIdFromState(yarnwrap.block.BlockState state) { return wrapperContained.getRawIdFromState(state.wrapperContained); }
public yarnwrap.block.BlockState postProcessState(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.postProcessState(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public void dropStacks(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.Entity entity,yarnwrap.item.ItemStack tool) { wrapperContained.dropStacks(state.wrapperContained,world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained,entity.wrapperContained,tool.wrapperContained); }
// public void appendProperties(Object builder) { wrapperContained.appendProperties(builder); }
public yarnwrap.text.MutableText getName() { return new yarnwrap.text.MutableText(wrapperContained.getName()); }
public float getBlastResistance() { return wrapperContained.getBlastResistance(); }
public yarnwrap.block.BlockState getStateFromRawId(int stateId) { return new yarnwrap.block.BlockState(wrapperContained.getStateFromRawId(stateId)); }
public boolean shouldDropItemsOnExplosion(yarnwrap.world.explosion.Explosion explosion) { return wrapperContained.shouldDropItemsOnExplosion(explosion.wrapperContained); }
public boolean canMobSpawnInside(yarnwrap.block.BlockState state) { return wrapperContained.canMobSpawnInside(state.wrapperContained); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public yarnwrap.util.shape.VoxelShape createCuboidShape(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.createCuboidShape(minX,minY,minZ,maxX,maxY,maxZ)); }
public boolean hasDynamicBounds() { return wrapperContained.hasDynamicBounds(); }
// public void method_9544(yarnwrap.world.World stack) { wrapperContained.method_9544(stack.wrapperContained); }
public void onLandedUpon(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,float fallDistance) { wrapperContained.onLandedUpon(world.wrapperContained,state.wrapperContained,pos.wrapperContained,entity.wrapperContained,fallDistance); }
public void afterBreak(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.item.ItemStack tool) { wrapperContained.afterBreak(world.wrapperContained,player.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained,tool.wrapperContained); }
public java.util.List getDroppedStacks(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntity blockEntity) { return wrapperContained.getDroppedStacks(state.wrapperContained,world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public yarnwrap.block.BlockState getDefaultState() { return new yarnwrap.block.BlockState(wrapperContained.getDefaultState()); }
public void onPlaced(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.LivingEntity placer,yarnwrap.item.ItemStack itemStack) { wrapperContained.onPlaced(world.wrapperContained,pos.wrapperContained,state.wrapperContained,placer.wrapperContained,itemStack.wrapperContained); }
// public void appendTooltip(yarnwrap.item.ItemStack stack,Object context,java.util.List tooltip,yarnwrap.item.tooltip.TooltipType options) { wrapperContained.appendTooltip(stack.wrapperContained,context,tooltip,options.wrapperContained); }
public yarnwrap.item.ItemStack getPickStack(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.item.ItemStack(wrapperContained.getPickStack(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.block.BlockState onBreak(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.block.BlockState(wrapperContained.onBreak(world.wrapperContained,pos.wrapperContained,state.wrapperContained,player.wrapperContained)); }
public void dropStack(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.dropStack(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
public boolean cannotConnect(yarnwrap.block.BlockState state) { return wrapperContained.cannotConnect(state.wrapperContained); }
public yarnwrap.block.BlockState pushEntitiesUpBeforeBlockChange(yarnwrap.block.BlockState from,yarnwrap.block.BlockState to,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.pushEntitiesUpBeforeBlockChange(from.wrapperContained,to.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void dropExperience(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,int size) { wrapperContained.dropExperience(world.wrapperContained,pos.wrapperContained,size); }
public void onBroken(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onBroken(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public void onDestroyedByExplosion(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.explosion.Explosion explosion) { wrapperContained.onDestroyedByExplosion(world.wrapperContained,pos.wrapperContained,explosion.wrapperContained); }
// public void method_9587(yarnwrap.world.World stack) { wrapperContained.method_9587(stack.wrapperContained); }
// public void setDefaultState(yarnwrap.block.BlockState state) { wrapperContained.setDefaultState(state.wrapperContained); }
public void onSteppedOn(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.entity.Entity entity) { wrapperContained.onSteppedOn(world.wrapperContained,pos.wrapperContained,state.wrapperContained,entity.wrapperContained); }
public yarnwrap.state.StateManager getStateManager() { return new yarnwrap.state.StateManager(wrapperContained.getStateManager()); }
// public void method_9596(yarnwrap.world.WorldAccess stack) { wrapperContained.method_9596(stack.wrapperContained); }
public yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext ctx) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(ctx.wrapperContained)); }
public boolean shouldDrawSide(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos otherPos) { return wrapperContained.shouldDrawSide(state.wrapperContained,world.wrapperContained,pos.wrapperContained,side.wrapperContained,otherPos.wrapperContained); }
public java.util.List getDroppedStacks(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntity blockEntity,yarnwrap.entity.Entity entity,yarnwrap.item.ItemStack stack) { return wrapperContained.getDroppedStacks(state.wrapperContained,world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained,entity.wrapperContained,stack.wrapperContained); }
public void dropStacks(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntity blockEntity) { wrapperContained.dropStacks(state.wrapperContained,world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained); }
public void replace(yarnwrap.block.BlockState state,yarnwrap.block.BlockState newState,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int flags,int maxUpdateDepth) { wrapperContained.replace(state.wrapperContained,newState.wrapperContained,world.wrapperContained,pos.wrapperContained,flags,maxUpdateDepth); }
public boolean isShapeFullCube(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.isShapeFullCube(shape.wrapperContained); }

}