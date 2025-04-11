package yarnwrap.block;
public class PointedDripstoneBlock { public net.minecraft.block.PointedDripstoneBlock wrapperContained; public PointedDripstoneBlock(net.minecraft.block.PointedDripstoneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty VERTICAL_DIRECTION() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.VERTICAL_DIRECTION); }
// public void VERTICAL_DIRECTION(yarnwrap.state.property.DirectionProperty value) { wrapperContained.VERTICAL_DIRECTION = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty THICKNESS() { return new yarnwrap.state.property.EnumProperty(wrapperContained.THICKNESS); }
// public void THICKNESS(yarnwrap.state.property.EnumProperty value) { wrapperContained.THICKNESS = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TIP_MERGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TIP_MERGE_SHAPE); }
// public void TIP_MERGE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TIP_MERGE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape UP_TIP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_TIP_SHAPE); }
// public void UP_TIP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UP_TIP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOWN_TIP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_TIP_SHAPE); }
// public void DOWN_TIP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOWN_TIP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FRUSTUM_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FRUSTUM_SHAPE); }
// public void FRUSTUM_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FRUSTUM_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape MIDDLE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.MIDDLE_SHAPE); }
// public void MIDDLE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.MIDDLE_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape BASE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BASE_SHAPE); }
// public void BASE_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BASE_SHAPE = value.wrapperContained; }
// public float WATER_DRIP_CHANCE() { return wrapperContained.WATER_DRIP_CHANCE; }
// public void WATER_DRIP_CHANCE(float value) { wrapperContained.WATER_DRIP_CHANCE = value; }
// public float LAVA_DRIP_CHANCE() { return wrapperContained.LAVA_DRIP_CHANCE; }
// public void LAVA_DRIP_CHANCE(float value) { wrapperContained.LAVA_DRIP_CHANCE = value; }
// public int MAX_STALACTITE_GROWTH() { return wrapperContained.MAX_STALACTITE_GROWTH; }
// public void MAX_STALACTITE_GROWTH(int value) { wrapperContained.MAX_STALACTITE_GROWTH = value; }
// public int STALACTITE_FLOOR_SEARCH_RANGE() { return wrapperContained.STALACTITE_FLOOR_SEARCH_RANGE; }
// public void STALACTITE_FLOOR_SEARCH_RANGE(int value) { wrapperContained.STALACTITE_FLOOR_SEARCH_RANGE = value; }
// public yarnwrap.util.shape.VoxelShape DRIP_COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DRIP_COLLISION_SHAPE); }
// public void DRIP_COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DRIP_COLLISION_SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.util.math.BlockPos getDripPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getDripPos(world.wrapperContained,pos.wrapperContained)); }
// public void createParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.fluid.Fluid fluid) { wrapperContained.createParticle(world.wrapperContained,pos.wrapperContained,state.wrapperContained,fluid.wrapperContained); }
// public yarnwrap.util.math.BlockPos getCauldronPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid) { return new yarnwrap.util.math.BlockPos(wrapperContained.getCauldronPos(world.wrapperContained,pos.wrapperContained,fluid.wrapperContained)); }
// public yarnwrap.block.enums.Thickness getThickness(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,boolean tryMerge) { return new yarnwrap.block.enums.Thickness(wrapperContained.getThickness(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,tryMerge)); }
// public void spawnFallingBlock(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnFallingBlock(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public void dripTick(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,float dripChance) { wrapperContained.dripTick(state.wrapperContained,world.wrapperContained,pos.wrapperContained,dripChance); }
// public boolean isPointedDripstoneFacingDirection(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return wrapperContained.isPointedDripstoneFacingDirection(state.wrapperContained,direction.wrapperContained); }
public yarnwrap.fluid.Fluid getDripFluid(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.fluid.Fluid(wrapperContained.getDripFluid(world.wrapperContained,pos.wrapperContained)); }
// public java.util.Optional getSupportingPos(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,int range) { return wrapperContained.getSupportingPos(world.wrapperContained,pos.wrapperContained,state.wrapperContained,range); }
// public yarnwrap.util.math.Direction getDirectionToPlaceAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.getDirectionToPlaceAt(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public boolean isHeldByPointedDripstone(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isHeldByPointedDripstone(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean canPlaceAtWithDirection(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canPlaceAtWithDirection(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.math.BlockPos getTipPos(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int range,boolean allowMerged) { return new yarnwrap.util.math.BlockPos(wrapperContained.getTipPos(state.wrapperContained,world.wrapperContained,pos.wrapperContained,range,allowMerged)); }
public boolean canDrip(yarnwrap.block.BlockState state) { return wrapperContained.canDrip(state.wrapperContained); }
// public boolean isTip(yarnwrap.block.BlockState state,boolean allowMerged) { return wrapperContained.isTip(state.wrapperContained,allowMerged); }
// public boolean isPointingDown(yarnwrap.block.BlockState state) { return wrapperContained.isPointingDown(state.wrapperContained); }
public void createParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.createParticle(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public yarnwrap.fluid.Fluid getDripFluid(yarnwrap.world.World world,yarnwrap.fluid.Fluid fluid) { return new yarnwrap.fluid.Fluid(wrapperContained.getDripFluid(world.wrapperContained,fluid.wrapperContained)); }
// public java.util.Optional searchInDirection(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,Object direction,java.util.function.BiPredicate continuePredicate,java.util.function.Predicate stopPredicate,int range) { return wrapperContained.searchInDirection(world.wrapperContained,pos.wrapperContained,direction,continuePredicate,stopPredicate,range); }
// public boolean isFluidLiquid(yarnwrap.fluid.Fluid fluid) { return wrapperContained.isFluidLiquid(fluid.wrapperContained); }
// public java.util.Optional getFluid(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.getFluid(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isPointingUp(yarnwrap.block.BlockState state) { return wrapperContained.isPointingUp(state.wrapperContained); }
// public void tryGrowStalagmite(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.tryGrowStalagmite(world.wrapperContained,pos.wrapperContained); }
// public void tryGrow(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.tryGrow(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public void place(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.block.enums.Thickness thickness) { wrapperContained.place(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,thickness.wrapperContained); }
// public boolean canGrow(yarnwrap.block.BlockState dripstoneBlockState,yarnwrap.block.BlockState waterState) { return wrapperContained.canGrow(dripstoneBlockState.wrapperContained,waterState.wrapperContained); }
// public boolean isTip(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return wrapperContained.isTip(state.wrapperContained,direction.wrapperContained); }
// public boolean canGrow(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canGrow(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public void tryGrow(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.tryGrow(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void growMerged(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.growMerged(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public boolean canDripThrough(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.canDripThrough(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }

}