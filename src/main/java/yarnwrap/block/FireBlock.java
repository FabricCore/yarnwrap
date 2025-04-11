package yarnwrap.block;
public class FireBlock { public net.minecraft.block.FireBlock wrapperContained; public FireBlock(net.minecraft.block.FireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
// public java.util.Map DIRECTION_PROPERTIES() { return wrapperContained.DIRECTION_PROPERTIES; }
// public void DIRECTION_PROPERTIES(java.util.Map value) { wrapperContained.DIRECTION_PROPERTIES = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap spreadChances() { return wrapperContained.spreadChances; }
// public void spreadChances(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.spreadChances = value; }
public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public void UP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UP = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap burnChances() { return wrapperContained.burnChances; }
// public void burnChances(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.burnChances = value; }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
// public void UP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public java.util.Map shapesByState() { return wrapperContained.shapesByState; }
// public void shapesByState(java.util.Map value) { wrapperContained.shapesByState = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public void registerFlammableBlock(yarnwrap.block.Block block,int burnChance,int spreadChance) { wrapperContained.registerFlammableBlock(block.wrapperContained,burnChance,spreadChance); }
// public int getSpreadChance(yarnwrap.block.BlockState state) { return wrapperContained.getSpreadChance(state.wrapperContained); }
// public int getBurnChance(yarnwrap.block.BlockState state) { return wrapperContained.getBurnChance(state.wrapperContained); }
// public boolean isRainingAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isRainingAround(world.wrapperContained,pos.wrapperContained); }
// public boolean areBlocksAroundFlammable(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.areBlocksAroundFlammable(world.wrapperContained,pos.wrapperContained); }
// public int getBurnChance(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getBurnChance(world.wrapperContained,pos.wrapperContained); }
// public void trySpreadingFire(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,int spreadFactor,yarnwrap.util.math.random.Random random,int currentAge) { wrapperContained.trySpreadingFire(world.wrapperContained,pos.wrapperContained,spreadFactor,random.wrapperContained,currentAge); }
// public boolean method_10197(Object entry) { return wrapperContained.method_10197(entry); }
// public yarnwrap.block.BlockState getStateForPosition(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getStateForPosition(world.wrapperContained,pos.wrapperContained)); }
public void registerDefaultFlammables() { wrapperContained.registerDefaultFlammables(); }
// public yarnwrap.block.BlockState getStateWithAge(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,int age) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithAge(world.wrapperContained,pos.wrapperContained,age)); }
// public int getFireTickDelay(yarnwrap.util.math.random.Random random) { return wrapperContained.getFireTickDelay(random.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }
// public boolean method_31017(yarnwrap.block.BlockState state) { return wrapperContained.method_31017(state.wrapperContained); }

}