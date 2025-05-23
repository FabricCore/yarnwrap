package yarnwrap.block;
public class AbstractBlock { public net.minecraft.block.AbstractBlock wrapperContained; public AbstractBlock(net.minecraft.block.AbstractBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean dynamicBounds() { return wrapperContained.dynamicBounds; }
// public void dynamicBounds(boolean value) { wrapperContained.dynamicBounds = value; }
// public static boolean dynamicBounds() { return net.minecraft.block.AbstractBlock.dynamicBounds; }
// public static void dynamicBounds(boolean value, ) { net.minecraft.block.AbstractBlock.dynamicBounds = value; }

// public Object settings() { return wrapperContained.settings; }
// // public void settings(Object value) { wrapperContained.settings = value; }
// // public static Object settings() { return net.minecraft.block.AbstractBlock.settings; }
// // public static void settings(Object value, ) { net.minecraft.block.AbstractBlock.settings = value; }

// public java.util.Optional lootTableKey() { return wrapperContained.lootTableKey; }
// public void lootTableKey(java.util.Optional value) { wrapperContained.lootTableKey = value; }
// public static java.util.Optional lootTableKey() { return net.minecraft.block.AbstractBlock.lootTableKey; }
// public static void lootTableKey(java.util.Optional value, ) { net.minecraft.block.AbstractBlock.lootTableKey = value; }

// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public static net.minecraft.util.math.Direction[] DIRECTIONS() { return net.minecraft.block.AbstractBlock.DIRECTIONS; }
// public static void DIRECTIONS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.block.AbstractBlock.DIRECTIONS = value; }

// public boolean collidable() { return wrapperContained.collidable; }
// public void collidable(boolean value) { wrapperContained.collidable = value; }
// public static boolean collidable() { return net.minecraft.block.AbstractBlock.collidable; }
// public static void collidable(boolean value, ) { net.minecraft.block.AbstractBlock.collidable = value; }

// public float resistance() { return wrapperContained.resistance; }
// public void resistance(float value) { wrapperContained.resistance = value; }
// public static float resistance() { return net.minecraft.block.AbstractBlock.resistance; }
// public static void resistance(float value, ) { net.minecraft.block.AbstractBlock.resistance = value; }

// public boolean randomTicks() { return wrapperContained.randomTicks; }
// public void randomTicks(boolean value) { wrapperContained.randomTicks = value; }
// public static boolean randomTicks() { return net.minecraft.block.AbstractBlock.randomTicks; }
// public static void randomTicks(boolean value, ) { net.minecraft.block.AbstractBlock.randomTicks = value; }

// public yarnwrap.sound.BlockSoundGroup soundGroup() { return new yarnwrap.sound.BlockSoundGroup(wrapperContained.soundGroup); }
// public void soundGroup(yarnwrap.sound.BlockSoundGroup value) { wrapperContained.soundGroup = value.wrapperContained; }
// public static yarnwrap.sound.BlockSoundGroup soundGroup() { return new yarnwrap.sound.BlockSoundGroup(net.minecraft.block.AbstractBlock.soundGroup); }
// public static void soundGroup(yarnwrap.sound.BlockSoundGroup value, ) { net.minecraft.block.AbstractBlock.soundGroup = value.wrapperContained; }

// public float slipperiness() { return wrapperContained.slipperiness; }
// public void slipperiness(float value) { wrapperContained.slipperiness = value; }
// public static float slipperiness() { return net.minecraft.block.AbstractBlock.slipperiness; }
// public static void slipperiness(float value, ) { net.minecraft.block.AbstractBlock.slipperiness = value; }

// public float velocityMultiplier() { return wrapperContained.velocityMultiplier; }
// public void velocityMultiplier(float value) { wrapperContained.velocityMultiplier = value; }
// public static float velocityMultiplier() { return net.minecraft.block.AbstractBlock.velocityMultiplier; }
// public static void velocityMultiplier(float value, ) { net.minecraft.block.AbstractBlock.velocityMultiplier = value; }

// public float jumpVelocityMultiplier() { return wrapperContained.jumpVelocityMultiplier; }
// public void jumpVelocityMultiplier(float value) { wrapperContained.jumpVelocityMultiplier = value; }
// public static float jumpVelocityMultiplier() { return net.minecraft.block.AbstractBlock.jumpVelocityMultiplier; }
// public static void jumpVelocityMultiplier(float value, ) { net.minecraft.block.AbstractBlock.jumpVelocityMultiplier = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.block.AbstractBlock.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.block.AbstractBlock.requiredFeatures = value.wrapperContained; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.block.AbstractBlock.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.block.AbstractBlock.translationKey = value; }

// public AbstractBlock(Object settings) { this.wrapperContained = new net.minecraft.block.AbstractBlock(settings); }
public yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(wrapperContained.asItem()); }
// public static yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(net.minecraft.block.AbstractBlock.asItem()); }
// public boolean hasComparatorOutput(yarnwrap.block.BlockState state) { return wrapperContained.hasComparatorOutput(state.wrapperContained); }
// public static boolean hasComparatorOutput(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.hasComparatorOutput(state.wrapperContained); }
// public int getOpacity(yarnwrap.block.BlockState state) { return wrapperContained.getOpacity(state.wrapperContained); }
// public static int getOpacity(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.getOpacity(state.wrapperContained); }
// public boolean emitsRedstonePower(yarnwrap.block.BlockState state) { return wrapperContained.emitsRedstonePower(state.wrapperContained); }
// public static boolean emitsRedstonePower(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.emitsRedstonePower(state.wrapperContained); }
// public void randomTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.randomTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void randomTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.AbstractBlock.randomTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean canPathfindThrough(yarnwrap.block.BlockState state,yarnwrap.entity.ai.pathing.NavigationType type) { return wrapperContained.canPathfindThrough(state.wrapperContained,type.wrapperContained); }
// public static boolean canPathfindThrough(yarnwrap.block.BlockState state,yarnwrap.entity.ai.pathing.NavigationType type, ) { return net.minecraft.block.AbstractBlock.canPathfindThrough(state.wrapperContained,type.wrapperContained); }
// public void prepare(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int flags,int maxUpdateDepth) { wrapperContained.prepare(state.wrapperContained,world.wrapperContained,pos.wrapperContained,flags,maxUpdateDepth); }
// public static void prepare(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int flags,int maxUpdateDepth, ) { net.minecraft.block.AbstractBlock.prepare(state.wrapperContained,world.wrapperContained,pos.wrapperContained,flags,maxUpdateDepth); }
// public boolean isSideInvisible(yarnwrap.block.BlockState state,yarnwrap.block.BlockState stateFrom,yarnwrap.util.math.Direction direction) { return wrapperContained.isSideInvisible(state.wrapperContained,stateFrom.wrapperContained,direction.wrapperContained); }
// public static boolean isSideInvisible(yarnwrap.block.BlockState state,yarnwrap.block.BlockState stateFrom,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.AbstractBlock.isSideInvisible(state.wrapperContained,stateFrom.wrapperContained,direction.wrapperContained); }
// public int getWeakRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getWeakRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static int getWeakRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.AbstractBlock.getWeakRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean hasSidedTransparency(yarnwrap.block.BlockState state) { return wrapperContained.hasSidedTransparency(state.wrapperContained); }
// public static boolean hasSidedTransparency(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.hasSidedTransparency(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getOutlineShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getOutlineShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getOutlineShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getOutlineShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public long getRenderingSeed(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRenderingSeed(state.wrapperContained,pos.wrapperContained); }
// public static long getRenderingSeed(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.getRenderingSeed(state.wrapperContained,pos.wrapperContained); }
// public boolean hasRandomTicks(yarnwrap.block.BlockState state) { return wrapperContained.hasRandomTicks(state.wrapperContained); }
// public static boolean hasRandomTicks(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.hasRandomTicks(state.wrapperContained); }
// public yarnwrap.fluid.FluidState getFluidState(yarnwrap.block.BlockState state) { return new yarnwrap.fluid.FluidState(wrapperContained.getFluidState(state.wrapperContained)); }
// public static yarnwrap.fluid.FluidState getFluidState(yarnwrap.block.BlockState state, ) { return new yarnwrap.fluid.FluidState(net.minecraft.block.AbstractBlock.getFluidState(state.wrapperContained)); }
// public void onEntityCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityCollisionHandler handler) { wrapperContained.onEntityCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained,handler.wrapperContained); }
// public static void onEntityCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityCollisionHandler handler, ) { net.minecraft.block.AbstractBlock.onEntityCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained,handler.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public boolean canPlaceAt(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean canPlaceAt(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.canPlaceAt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getStateForNeighborUpdate(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos neighborPos,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.getStateForNeighborUpdate(state.wrapperContained,world.wrapperContained,tickView.wrapperContained,pos.wrapperContained,direction.wrapperContained,neighborPos.wrapperContained,neighborState.wrapperContained,random.wrapperContained)); }
// public static yarnwrap.block.BlockState getStateForNeighborUpdate(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.world.tick.ScheduledTickView tickView,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos neighborPos,yarnwrap.block.BlockState neighborState,yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractBlock.getStateForNeighborUpdate(state.wrapperContained,world.wrapperContained,tickView.wrapperContained,pos.wrapperContained,direction.wrapperContained,neighborPos.wrapperContained,neighborState.wrapperContained,random.wrapperContained)); }
// public java.util.List getDroppedStacks(yarnwrap.block.BlockState state,Object builder) { return wrapperContained.getDroppedStacks(state.wrapperContained,builder); }
// public static java.util.List getDroppedStacks(yarnwrap.block.BlockState state,Object builder, ) { return net.minecraft.block.AbstractBlock.getDroppedStacks(state.wrapperContained,builder); }
// public void onStacksDropped(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack tool,boolean dropExperience) { wrapperContained.onStacksDropped(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tool.wrapperContained,dropExperience); }
// public static void onStacksDropped(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack tool,boolean dropExperience, ) { net.minecraft.block.AbstractBlock.onStacksDropped(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tool.wrapperContained,dropExperience); }
// public yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,yarnwrap.util.BlockMirror mirror) { return new yarnwrap.block.BlockState(wrapperContained.mirror(state.wrapperContained,mirror.wrapperContained)); }
// public static yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,yarnwrap.util.BlockMirror mirror, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractBlock.mirror(state.wrapperContained,mirror.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getCullingShape(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCullingShape(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getCullingShape(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getCullingShape(state.wrapperContained)); }
// public int getComparatorOutput(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getComparatorOutput(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static int getComparatorOutput(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.getComparatorOutput(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.sound.BlockSoundGroup getSoundGroup(yarnwrap.block.BlockState state) { return new yarnwrap.sound.BlockSoundGroup(wrapperContained.getSoundGroup(state.wrapperContained)); }
// public static yarnwrap.sound.BlockSoundGroup getSoundGroup(yarnwrap.block.BlockState state, ) { return new yarnwrap.sound.BlockSoundGroup(net.minecraft.block.AbstractBlock.getSoundGroup(state.wrapperContained)); }
// public yarnwrap.item.ItemStack getPickStack(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean includeData) { return new yarnwrap.item.ItemStack(wrapperContained.getPickStack(world.wrapperContained,pos.wrapperContained,state.wrapperContained,includeData)); }
// public static yarnwrap.item.ItemStack getPickStack(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean includeData, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.AbstractBlock.getPickStack(world.wrapperContained,pos.wrapperContained,state.wrapperContained,includeData)); }
// public float getAmbientOcclusionLightLevel(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAmbientOcclusionLightLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static float getAmbientOcclusionLightLevel(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.getAmbientOcclusionLightLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isTransparent(yarnwrap.block.BlockState state) { return wrapperContained.isTransparent(state.wrapperContained); }
// public static boolean isTransparent(yarnwrap.block.BlockState state, ) { return net.minecraft.block.AbstractBlock.isTransparent(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getRaycastShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getRaycastShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getRaycastShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getRaycastShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void scheduledTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.scheduledTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void scheduledTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.AbstractBlock.scheduledTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean onSyncedBlockEvent(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int type,int data) { return wrapperContained.onSyncedBlockEvent(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type,data); }
// public static boolean onSyncedBlockEvent(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int type,int data, ) { return net.minecraft.block.AbstractBlock.onSyncedBlockEvent(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type,data); }
// public float calcBlockBreakingDelta(yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calcBlockBreakingDelta(state.wrapperContained,player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static float calcBlockBreakingDelta(yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.calcBlockBreakingDelta(state.wrapperContained,player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState rotate(yarnwrap.block.BlockState state,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.block.BlockState(wrapperContained.rotate(state.wrapperContained,rotation.wrapperContained)); }
// public static yarnwrap.block.BlockState rotate(yarnwrap.block.BlockState state,yarnwrap.util.BlockRotation rotation, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AbstractBlock.rotate(state.wrapperContained,rotation.wrapperContained)); }
// public int getStrongRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getStrongRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static int getStrongRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.AbstractBlock.getStrongRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.block.BlockRenderType getRenderType(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockRenderType(wrapperContained.getRenderType(state.wrapperContained)); }
// public static yarnwrap.block.BlockRenderType getRenderType(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockRenderType(net.minecraft.block.AbstractBlock.getRenderType(state.wrapperContained)); }
// public void onBlockBreakStart(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onBlockBreakStart(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void onBlockBreakStart(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.AbstractBlock.onBlockBreakStart(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void neighborUpdate(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation wireOrientation,boolean notify) { wrapperContained.neighborUpdate(state.wrapperContained,world.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,wireOrientation.wrapperContained,notify); }
// public static void neighborUpdate(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.world.block.WireOrientation wireOrientation,boolean notify, ) { net.minecraft.block.AbstractBlock.neighborUpdate(state.wrapperContained,world.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,wireOrientation.wrapperContained,notify); }
// public void onBlockAdded(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,boolean notify) { wrapperContained.onBlockAdded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,notify); }
// public static void onBlockAdded(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,boolean notify, ) { net.minecraft.block.AbstractBlock.onBlockAdded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,notify); }
// public boolean canReplace(yarnwrap.block.BlockState state,yarnwrap.item.ItemPlacementContext context) { return wrapperContained.canReplace(state.wrapperContained,context.wrapperContained); }
// public static boolean canReplace(yarnwrap.block.BlockState state,yarnwrap.item.ItemPlacementContext context, ) { return net.minecraft.block.AbstractBlock.canReplace(state.wrapperContained,context.wrapperContained); }
// public yarnwrap.screen.NamedScreenHandlerFactory createScreenHandlerFactory(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.screen.NamedScreenHandlerFactory(wrapperContained.createScreenHandlerFactory(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.screen.NamedScreenHandlerFactory createScreenHandlerFactory(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.screen.NamedScreenHandlerFactory(net.minecraft.block.AbstractBlock.createScreenHandlerFactory(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void onProjectileHit(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hit,yarnwrap.entity.projectile.ProjectileEntity projectile) { wrapperContained.onProjectileHit(world.wrapperContained,state.wrapperContained,hit.wrapperContained,projectile.wrapperContained); }
// public static void onProjectileHit(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hit,yarnwrap.entity.projectile.ProjectileEntity projectile, ) { net.minecraft.block.AbstractBlock.onProjectileHit(world.wrapperContained,state.wrapperContained,hit.wrapperContained,projectile.wrapperContained); }
// public boolean canBucketPlace(yarnwrap.block.BlockState state,yarnwrap.fluid.Fluid fluid) { return wrapperContained.canBucketPlace(state.wrapperContained,fluid.wrapperContained); }
// public static boolean canBucketPlace(yarnwrap.block.BlockState state,yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.block.AbstractBlock.canBucketPlace(state.wrapperContained,fluid.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getSidesShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getSidesShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getSidesShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getSidesShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getCameraCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCameraCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getCameraCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getCameraCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public yarnwrap.block.Block asBlock() { return new yarnwrap.block.Block(wrapperContained.asBlock()); }
// public static yarnwrap.block.Block asBlock() { return new yarnwrap.block.Block(net.minecraft.block.AbstractBlock.asBlock()); }
public java.util.Optional getLootTableKey() { return wrapperContained.getLootTableKey(); }
// public static java.util.Optional getLootTableKey() { return net.minecraft.block.AbstractBlock.getLootTableKey(); }
public yarnwrap.block.MapColor getDefaultMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getDefaultMapColor()); }
// public static yarnwrap.block.MapColor getDefaultMapColor() { return new yarnwrap.block.MapColor(net.minecraft.block.AbstractBlock.getDefaultMapColor()); }
// public float getMaxHorizontalModelOffset() { return wrapperContained.getMaxHorizontalModelOffset(); }
// public static float getMaxHorizontalModelOffset() { return net.minecraft.block.AbstractBlock.getMaxHorizontalModelOffset(); }
public float getHardness() { return wrapperContained.getHardness(); }
// public static float getHardness() { return net.minecraft.block.AbstractBlock.getHardness(); }
// public float getVerticalModelOffsetMultiplier() { return wrapperContained.getVerticalModelOffsetMultiplier(); }
// public static float getVerticalModelOffsetMultiplier() { return net.minecraft.block.AbstractBlock.getVerticalModelOffsetMultiplier(); }
// public boolean isShapeFullCube(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isShapeFullCube(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean isShapeFullCube(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.AbstractBlock.isShapeFullCube(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.block.AbstractBlock.getCodec(); }
// public com.mojang.datafixers.kinds.App method_54093(java.util.function.Function instance) { return wrapperContained.method_54093(instance); }
// public static com.mojang.datafixers.kinds.App method_54093(java.util.function.Function instance, ) { return net.minecraft.block.AbstractBlock.method_54093(instance); }
// public com.mojang.serialization.MapCodec createCodec(java.util.function.Function blockFromSettings) { return wrapperContained.createCodec(blockFromSettings); }
// public static com.mojang.serialization.MapCodec createCodec(java.util.function.Function blockFromSettings, ) { return net.minecraft.block.AbstractBlock.createCodec(blockFromSettings); }
public Object getSettings() { return wrapperContained.getSettings(); }
// public static Object getSettings() { return net.minecraft.block.AbstractBlock.getSettings(); }
// public com.mojang.serialization.codecs.RecordCodecBuilder createSettingsCodec() { return wrapperContained.createSettingsCodec(); }
// public static com.mojang.serialization.codecs.RecordCodecBuilder createSettingsCodec() { return net.minecraft.block.AbstractBlock.createSettingsCodec(); }
// public void onExploded(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.explosion.Explosion explosion,java.util.function.BiConsumer stackMerger) { wrapperContained.onExploded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,explosion.wrapperContained,stackMerger); }
// public static void onExploded(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.explosion.Explosion explosion,java.util.function.BiConsumer stackMerger, ) { net.minecraft.block.AbstractBlock.onExploded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,explosion.wrapperContained,stackMerger); }
// public void method_55224(java.util.function.BiConsumer stack) { wrapperContained.method_55224(stack); }
// public static void method_55224(java.util.function.BiConsumer stack, ) { net.minecraft.block.AbstractBlock.method_55224(stack); }
// public yarnwrap.util.ActionResult onUseWithItem(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hit) { return new yarnwrap.util.ActionResult(wrapperContained.onUseWithItem(stack.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hand.wrapperContained,hit.wrapperContained)); }
// public static yarnwrap.util.ActionResult onUseWithItem(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hit, ) { return new yarnwrap.util.ActionResult(net.minecraft.block.AbstractBlock.onUseWithItem(stack.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hand.wrapperContained,hit.wrapperContained)); }
// public yarnwrap.util.ActionResult onUse(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hit) { return new yarnwrap.util.ActionResult(wrapperContained.onUse(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hit.wrapperContained)); }
// public static yarnwrap.util.ActionResult onUse(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hit, ) { return new yarnwrap.util.ActionResult(net.minecraft.block.AbstractBlock.onUse(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hit.wrapperContained)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.block.AbstractBlock.getTranslationKey(); }
// public yarnwrap.util.shape.VoxelShape getInsideCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getInsideCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getInsideCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.AbstractBlock.getInsideCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained)); }
// public void onStateReplaced(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,boolean moved) { wrapperContained.onStateReplaced(state.wrapperContained,world.wrapperContained,pos.wrapperContained,moved); }
// public static void onStateReplaced(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,boolean moved, ) { net.minecraft.block.AbstractBlock.onStateReplaced(state.wrapperContained,world.wrapperContained,pos.wrapperContained,moved); }

}