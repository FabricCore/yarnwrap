package yarnwrap.block;
public class BedBlock { public net.minecraft.block.BedBlock wrapperContained; public BedBlock(net.minecraft.block.BedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LEG_1_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LEG_1_SHAPE); }
// public void LEG_1_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LEG_1_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LEG_2_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LEG_2_SHAPE); }
// public void LEG_2_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LEG_2_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LEG_3_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LEG_3_SHAPE); }
// public void LEG_3_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LEG_3_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape TOP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.TOP_SHAPE); }
// public void TOP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.TOP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape LEG_4_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LEG_4_SHAPE); }
// public void LEG_4_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.LEG_4_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty PART() { return new yarnwrap.state.property.EnumProperty(wrapperContained.PART); }
// public void PART(yarnwrap.state.property.EnumProperty value) { wrapperContained.PART = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty OCCUPIED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OCCUPIED); }
// public void OCCUPIED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OCCUPIED = value.wrapperContained; }
// public BedBlock(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.block.BedBlock(color.wrapperContained,settings); }
public yarnwrap.util.math.Direction getDirection(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Direction(wrapperContained.getDirection(world.wrapperContained,pos.wrapperContained)); }
// public void bounceEntity(yarnwrap.entity.Entity entity) { wrapperContained.bounceEntity(entity.wrapperContained); }
// public boolean wakeVillager(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.wakeVillager(world.wrapperContained,pos.wrapperContained); }
public yarnwrap.util.math.Direction getOppositePartDirection(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getOppositePartDirection(state.wrapperContained)); }
public Object getBedPart(yarnwrap.block.BlockState state) { return wrapperContained.getBedPart(state.wrapperContained); }
public boolean isBedWorking(yarnwrap.world.World world) { return wrapperContained.isBedWorking(world.wrapperContained); }
// public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,int possibleOffsets,boolean ignoreInvalidPos) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,possibleOffsets,ignoreInvalidPos); }
// public int[][] getOnBedOffsets(yarnwrap.util.math.Direction bedDirection) { return wrapperContained.getOnBedOffsets(bedDirection.wrapperContained); }
// public int[][] getAroundAndOnBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.getAroundAndOnBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public boolean isBedBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isBedBelow(world.wrapperContained,pos.wrapperContained); }
// public int[][] getAroundBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.getAroundBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53978(Object instance) { return wrapperContained.method_53978(instance); }
// public void method_55767(yarnwrap.entity.player.PlayerEntity reason) { wrapperContained.method_55767(reason.wrapperContained); }
public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,float spawnAngle) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,spawnAngle); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public yarnwrap.util.math.Direction getDirectionTowardsOtherPart(yarnwrap.block.enums.BedPart part,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.getDirectionTowardsOtherPart(part.wrapperContained,direction.wrapperContained)); }

}