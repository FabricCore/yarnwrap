package yarnwrap.block;
public class DetectorRailBlock { public net.minecraft.block.DetectorRailBlock wrapperContained; public DetectorRailBlock(net.minecraft.block.DetectorRailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.DetectorRailBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.DetectorRailBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.SHAPE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.DetectorRailBlock.SHAPE); }
// public static void SHAPE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.DetectorRailBlock.SHAPE = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.DetectorRailBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.DetectorRailBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DetectorRailBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DetectorRailBlock.CODEC = value; }

// public java.util.List getCarts(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.lang.Class entityClass,java.util.function.Predicate entityPredicate) { return wrapperContained.getCarts(world.wrapperContained,pos.wrapperContained,entityClass,entityPredicate); }
// public static java.util.List getCarts(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.lang.Class entityClass,java.util.function.Predicate entityPredicate, ) { return net.minecraft.block.DetectorRailBlock.getCarts(world.wrapperContained,pos.wrapperContained,entityClass,entityPredicate); }
// public void updatePoweredStatus(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updatePoweredStatus(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void updatePoweredStatus(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.DetectorRailBlock.updatePoweredStatus(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateNearbyRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean unpowering) { wrapperContained.updateNearbyRails(world.wrapperContained,pos.wrapperContained,state.wrapperContained,unpowering); }
// public static void updateNearbyRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean unpowering, ) { net.minecraft.block.DetectorRailBlock.updateNearbyRails(world.wrapperContained,pos.wrapperContained,state.wrapperContained,unpowering); }
// public yarnwrap.util.math.Box getCartDetectionBox(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Box(wrapperContained.getCartDetectionBox(pos.wrapperContained)); }
// public static yarnwrap.util.math.Box getCartDetectionBox(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Box(net.minecraft.block.DetectorRailBlock.getCartDetectionBox(pos.wrapperContained)); }
// public boolean method_31643(yarnwrap.entity.Entity cart) { return wrapperContained.method_31643(cart.wrapperContained); }
// public static boolean method_31643(yarnwrap.entity.Entity cart, ) { return net.minecraft.block.DetectorRailBlock.method_31643(cart.wrapperContained); }
// public boolean method_31644(yarnwrap.entity.Entity entity) { return wrapperContained.method_31644(entity.wrapperContained); }
// public static boolean method_31644(yarnwrap.entity.Entity entity, ) { return net.minecraft.block.DetectorRailBlock.method_31644(entity.wrapperContained); }

}