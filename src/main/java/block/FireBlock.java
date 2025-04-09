package yarnwrap.block;
public class FireBlock { public net.minecraft.block.FireBlock wrapperContained; public FireBlock(net.minecraft.block.FireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public java.util.Map DIRECTION_PROPERTIES() { return wrapperContained.DIRECTION_PROPERTIES; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap spreadChances() { return wrapperContained.spreadChances; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap burnChances() { return wrapperContained.burnChances; }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public java.util.Map shapesByState() { return wrapperContained.shapesByState; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void registerFlammableBlock(yarnwrap.block.Block block,int burnChance,int spreadChance) { wrapperContained.registerFlammableBlock(block.wrapperContained,burnChance,spreadChance); }
// public int getSpreadChance(yarnwrap.block.BlockState state) { return wrapperContained.getSpreadChance(state.wrapperContained); }
// public int getBurnChance(yarnwrap.block.BlockState state) { return wrapperContained.getBurnChance(state.wrapperContained); }
// public boolean isRainingAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRainingAround(world.wrapperContained,pos.wrapperContained); }
// public boolean areBlocksAroundFlammable(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.areBlocksAroundFlammable(world.wrapperContained,pos.wrapperContained); }
// public int getBurnChance(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBurnChance(world.wrapperContained,pos.wrapperContained); }
// public void trySpreadingFire(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int spreadFactor,yarnwrap.util.math.random.Random random,int currentAge) { wrapperContained.trySpreadingFire(world.wrapperContained,pos.wrapperContained,spreadFactor,random.wrapperContained,currentAge); }
// public yarnwrap.block.BlockState getStateForPosition(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getStateForPosition(world.wrapperContained,pos.wrapperContained)); }
public void registerDefaultFlammables() { wrapperContained.registerDefaultFlammables(); }
// public yarnwrap.block.BlockState getStateWithAge(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int age) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithAge(world.wrapperContained,pos.wrapperContained,age)); }
// public int getFireTickDelay(yarnwrap.util.math.random.Random random) { return wrapperContained.getFireTickDelay(random.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }

}