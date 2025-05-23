package yarnwrap.block;
public class BedBlock { public net.minecraft.block.BedBlock wrapperContained; public BedBlock(net.minecraft.block.BedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.block.BedBlock.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.block.BedBlock.color = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty PART() { return new yarnwrap.state.property.EnumProperty(wrapperContained.PART); }
// public void PART(yarnwrap.state.property.EnumProperty value) { wrapperContained.PART = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty PART() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BedBlock.PART); }
// public static void PART(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BedBlock.PART = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty OCCUPIED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.OCCUPIED); }
// public void OCCUPIED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.OCCUPIED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty OCCUPIED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.BedBlock.OCCUPIED); }
// public static void OCCUPIED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.BedBlock.OCCUPIED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BedBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BedBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
// public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.BedBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.BedBlock.SHAPES_BY_DIRECTION = value; }

// public BedBlock(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.block.BedBlock(color.wrapperContained,settings); }
// public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,float spawnAngle) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,spawnAngle); }
// public static java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,float spawnAngle, ) { return net.minecraft.block.BedBlock.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,spawnAngle); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.BedBlock.getColor()); }
// public yarnwrap.util.math.Direction getDirectionTowardsOtherPart(yarnwrap.block.enums.BedPart part,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.math.Direction(wrapperContained.getDirectionTowardsOtherPart(part.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.util.math.Direction getDirectionTowardsOtherPart(yarnwrap.block.enums.BedPart part,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.util.math.Direction(net.minecraft.block.BedBlock.getDirectionTowardsOtherPart(part.wrapperContained,direction.wrapperContained)); }
// public yarnwrap.util.math.Direction getDirection(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Direction(wrapperContained.getDirection(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.Direction getDirection(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Direction(net.minecraft.block.BedBlock.getDirection(world.wrapperContained,pos.wrapperContained)); }
// public void bounceEntity(yarnwrap.entity.Entity entity) { wrapperContained.bounceEntity(entity.wrapperContained); }
// public static void bounceEntity(yarnwrap.entity.Entity entity, ) { net.minecraft.block.BedBlock.bounceEntity(entity.wrapperContained); }
// public boolean wakeVillager(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.wakeVillager(world.wrapperContained,pos.wrapperContained); }
// public static boolean wakeVillager(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.BedBlock.wakeVillager(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.Direction getOppositePartDirection(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getOppositePartDirection(state.wrapperContained)); }
// public static yarnwrap.util.math.Direction getOppositePartDirection(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.math.Direction(net.minecraft.block.BedBlock.getOppositePartDirection(state.wrapperContained)); }
// public Object getBedPart(yarnwrap.block.BlockState state) { return wrapperContained.getBedPart(state.wrapperContained); }
// public static Object getBedPart(yarnwrap.block.BlockState state, ) { return net.minecraft.block.BedBlock.getBedPart(state.wrapperContained); }
// public boolean isBedWorking(yarnwrap.world.World world) { return wrapperContained.isBedWorking(world.wrapperContained); }
// public static boolean isBedWorking(yarnwrap.world.World world, ) { return net.minecraft.block.BedBlock.isBedWorking(world.wrapperContained); }
// public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public static java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection, ) { return net.minecraft.block.BedBlock.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,int possibleOffsets,boolean ignoreInvalidPos) { return wrapperContained.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,possibleOffsets,ignoreInvalidPos); }
// public static java.util.Optional findWakeUpPosition(yarnwrap.entity.EntityType type,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,int possibleOffsets,boolean ignoreInvalidPos, ) { return net.minecraft.block.BedBlock.findWakeUpPosition(type.wrapperContained,world.wrapperContained,pos.wrapperContained,possibleOffsets,ignoreInvalidPos); }
// public int[][] getOnBedOffsets(yarnwrap.util.math.Direction bedDirection) { return wrapperContained.getOnBedOffsets(bedDirection.wrapperContained); }
// public static int[][] getOnBedOffsets(yarnwrap.util.math.Direction bedDirection, ) { return net.minecraft.block.BedBlock.getOnBedOffsets(bedDirection.wrapperContained); }
// public int[][] getAroundAndOnBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.getAroundAndOnBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public static int[][] getAroundAndOnBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection, ) { return net.minecraft.block.BedBlock.getAroundAndOnBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public boolean isBedBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isBedBelow(world.wrapperContained,pos.wrapperContained); }
// public static boolean isBedBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.BedBlock.isBedBelow(world.wrapperContained,pos.wrapperContained); }
// public int[][] getAroundBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection) { return wrapperContained.getAroundBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public static int[][] getAroundBedOffsets(yarnwrap.util.math.Direction bedDirection,yarnwrap.util.math.Direction respawnDirection, ) { return net.minecraft.block.BedBlock.getAroundBedOffsets(bedDirection.wrapperContained,respawnDirection.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53978(Object instance) { return wrapperContained.method_53978(instance); }
// public static com.mojang.datafixers.kinds.App method_53978(Object instance, ) { return net.minecraft.block.BedBlock.method_53978(instance); }
// public void method_55767(yarnwrap.entity.player.PlayerEntity reason) { wrapperContained.method_55767(reason.wrapperContained); }
// public static void method_55767(yarnwrap.entity.player.PlayerEntity reason, ) { net.minecraft.block.BedBlock.method_55767(reason.wrapperContained); }

}