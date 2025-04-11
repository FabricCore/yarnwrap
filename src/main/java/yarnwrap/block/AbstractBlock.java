package yarnwrap.block;
public class AbstractBlock { public net.minecraft.block.AbstractBlock wrapperContained; public AbstractBlock(net.minecraft.block.AbstractBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean dynamicBounds() { return wrapperContained.dynamicBounds; }
// public void dynamicBounds(boolean value) { wrapperContained.dynamicBounds = value; }
// public Object settings() { return wrapperContained.settings; }
// // public void settings(Object value) { wrapperContained.settings = value; }
// public yarnwrap.registry.RegistryKey lootTableKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.lootTableKey); }
// public void lootTableKey(yarnwrap.registry.RegistryKey value) { wrapperContained.lootTableKey = value.wrapperContained; }
// public net.minecraft.util.math.Direction[] DIRECTIONS() { return wrapperContained.DIRECTIONS; }
// public void DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.DIRECTIONS = value; }
// public boolean collidable() { return wrapperContained.collidable; }
// public void collidable(boolean value) { wrapperContained.collidable = value; }
// public float resistance() { return wrapperContained.resistance; }
// public void resistance(float value) { wrapperContained.resistance = value; }
// public boolean randomTicks() { return wrapperContained.randomTicks; }
// public void randomTicks(boolean value) { wrapperContained.randomTicks = value; }
// public yarnwrap.sound.BlockSoundGroup soundGroup() { return new yarnwrap.sound.BlockSoundGroup(wrapperContained.soundGroup); }
// public void soundGroup(yarnwrap.sound.BlockSoundGroup value) { wrapperContained.soundGroup = value.wrapperContained; }
// public float slipperiness() { return wrapperContained.slipperiness; }
// public void slipperiness(float value) { wrapperContained.slipperiness = value; }
// public float velocityMultiplier() { return wrapperContained.velocityMultiplier; }
// public void velocityMultiplier(float value) { wrapperContained.velocityMultiplier = value; }
// public float jumpVelocityMultiplier() { return wrapperContained.jumpVelocityMultiplier; }
// public void jumpVelocityMultiplier(float value) { wrapperContained.jumpVelocityMultiplier = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public AbstractBlock(Object settings) { this.wrapperContained = new net.minecraft.block.AbstractBlock(settings); }
// public yarnwrap.screen.NamedScreenHandlerFactory createScreenHandlerFactory(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.screen.NamedScreenHandlerFactory(wrapperContained.createScreenHandlerFactory(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void onProjectileHit(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hit,yarnwrap.entity.projectile.ProjectileEntity projectile) { wrapperContained.onProjectileHit(world.wrapperContained,state.wrapperContained,hit.wrapperContained,projectile.wrapperContained); }
// public boolean canBucketPlace(yarnwrap.block.BlockState state,yarnwrap.fluid.Fluid fluid) { return wrapperContained.canBucketPlace(state.wrapperContained,fluid.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getSidesShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getSidesShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getCameraCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCameraCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public yarnwrap.block.Block asBlock() { return new yarnwrap.block.Block(wrapperContained.asBlock()); }
public yarnwrap.registry.RegistryKey getLootTableKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.getLootTableKey()); }
public yarnwrap.block.MapColor getDefaultMapColor() { return new yarnwrap.block.MapColor(wrapperContained.getDefaultMapColor()); }
// public float getMaxHorizontalModelOffset() { return wrapperContained.getMaxHorizontalModelOffset(); }
public float getHardness() { return wrapperContained.getHardness(); }
// public float getVerticalModelOffsetMultiplier() { return wrapperContained.getVerticalModelOffsetMultiplier(); }
// public boolean isShapeFullCube(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isShapeFullCube(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isCullingShapeFullCube(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isCullingShapeFullCube(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public com.mojang.datafixers.kinds.App method_54093(java.util.function.Function instance) { return wrapperContained.method_54093(instance); }
public com.mojang.serialization.MapCodec createCodec(java.util.function.Function blockFromSettings) { return wrapperContained.createCodec(blockFromSettings); }
public Object getSettings() { return wrapperContained.getSettings(); }
// public com.mojang.serialization.codecs.RecordCodecBuilder createSettingsCodec() { return wrapperContained.createSettingsCodec(); }
// public void onExploded(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.world.explosion.Explosion explosion,java.util.function.BiConsumer stackMerger) { wrapperContained.onExploded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,explosion.wrapperContained,stackMerger); }
// public void method_55224(java.util.function.BiConsumer stack) { wrapperContained.method_55224(stack); }
// public yarnwrap.util.ItemActionResult onUseWithItem(yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hit) { return new yarnwrap.util.ItemActionResult(wrapperContained.onUseWithItem(stack.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hand.wrapperContained,hit.wrapperContained)); }
// public yarnwrap.util.ActionResult onUse(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.hit.BlockHitResult hit) { return new yarnwrap.util.ActionResult(wrapperContained.onUse(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained,hit.wrapperContained)); }
public yarnwrap.item.Item asItem() { return new yarnwrap.item.Item(wrapperContained.asItem()); }
// public boolean hasComparatorOutput(yarnwrap.block.BlockState state) { return wrapperContained.hasComparatorOutput(state.wrapperContained); }
// public int getOpacity(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getOpacity(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean emitsRedstonePower(yarnwrap.block.BlockState state) { return wrapperContained.emitsRedstonePower(state.wrapperContained); }
// public void randomTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.randomTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean canPathfindThrough(yarnwrap.block.BlockState state,yarnwrap.entity.ai.pathing.NavigationType type) { return wrapperContained.canPathfindThrough(state.wrapperContained,type.wrapperContained); }
// public void prepare(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int flags,int maxUpdateDepth) { wrapperContained.prepare(state.wrapperContained,world.wrapperContained,pos.wrapperContained,flags,maxUpdateDepth); }
// public boolean isSideInvisible(yarnwrap.block.BlockState state,yarnwrap.block.BlockState stateFrom,yarnwrap.util.math.Direction direction) { return wrapperContained.isSideInvisible(state.wrapperContained,stateFrom.wrapperContained,direction.wrapperContained); }
// public int getWeakRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getWeakRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean hasSidedTransparency(yarnwrap.block.BlockState state) { return wrapperContained.hasSidedTransparency(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getOutlineShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getOutlineShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public long getRenderingSeed(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getRenderingSeed(state.wrapperContained,pos.wrapperContained); }
// public void onStateReplaced(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState newState,boolean moved) { wrapperContained.onStateReplaced(state.wrapperContained,world.wrapperContained,pos.wrapperContained,newState.wrapperContained,moved); }
// public boolean hasRandomTicks(yarnwrap.block.BlockState state) { return wrapperContained.hasRandomTicks(state.wrapperContained); }
// public yarnwrap.fluid.FluidState getFluidState(yarnwrap.block.BlockState state) { return new yarnwrap.fluid.FluidState(wrapperContained.getFluidState(state.wrapperContained)); }
// public void onEntityCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity) { wrapperContained.onEntityCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.ShapeContext context) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained,context.wrapperContained)); }
// public boolean canPlaceAt(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlaceAt(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getStateForNeighborUpdate(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction,yarnwrap.block.BlockState neighborState,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.BlockPos neighborPos) { return new yarnwrap.block.BlockState(wrapperContained.getStateForNeighborUpdate(state.wrapperContained,direction.wrapperContained,neighborState.wrapperContained,world.wrapperContained,pos.wrapperContained,neighborPos.wrapperContained)); }
// public java.util.List getDroppedStacks(yarnwrap.block.BlockState state,Object builder) { return wrapperContained.getDroppedStacks(state.wrapperContained,builder); }
// public void onStacksDropped(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack tool,boolean dropExperience) { wrapperContained.onStacksDropped(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tool.wrapperContained,dropExperience); }
// public yarnwrap.block.BlockState mirror(yarnwrap.block.BlockState state,yarnwrap.util.BlockMirror mirror) { return new yarnwrap.block.BlockState(wrapperContained.mirror(state.wrapperContained,mirror.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getCullingShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCullingShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public int getComparatorOutput(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getComparatorOutput(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.sound.BlockSoundGroup getSoundGroup(yarnwrap.block.BlockState state) { return new yarnwrap.sound.BlockSoundGroup(wrapperContained.getSoundGroup(state.wrapperContained)); }
// public float getAmbientOcclusionLightLevel(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAmbientOcclusionLightLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean isTransparent(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isTransparent(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getRaycastShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getRaycastShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public void scheduledTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.scheduledTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public boolean onSyncedBlockEvent(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int type,int data) { return wrapperContained.onSyncedBlockEvent(state.wrapperContained,world.wrapperContained,pos.wrapperContained,type,data); }
// public float calcBlockBreakingDelta(yarnwrap.block.BlockState state,yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calcBlockBreakingDelta(state.wrapperContained,player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState rotate(yarnwrap.block.BlockState state,yarnwrap.util.BlockRotation rotation) { return new yarnwrap.block.BlockState(wrapperContained.rotate(state.wrapperContained,rotation.wrapperContained)); }
// public int getStrongRedstonePower(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.getStrongRedstonePower(state.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.block.BlockRenderType getRenderType(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockRenderType(wrapperContained.getRenderType(state.wrapperContained)); }
// public void onBlockBreakStart(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.onBlockBreakStart(state.wrapperContained,world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public void neighborUpdate(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block sourceBlock,yarnwrap.util.math.BlockPos sourcePos,boolean notify) { wrapperContained.neighborUpdate(state.wrapperContained,world.wrapperContained,pos.wrapperContained,sourceBlock.wrapperContained,sourcePos.wrapperContained,notify); }
// public void onBlockAdded(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,boolean notify) { wrapperContained.onBlockAdded(state.wrapperContained,world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,notify); }
// public boolean canReplace(yarnwrap.block.BlockState state,yarnwrap.item.ItemPlacementContext context) { return wrapperContained.canReplace(state.wrapperContained,context.wrapperContained); }

}