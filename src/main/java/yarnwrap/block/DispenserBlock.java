package yarnwrap.block;
public class DispenserBlock { public net.minecraft.block.DispenserBlock wrapperContained; public DispenserBlock(net.minecraft.block.DispenserBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.DispenserBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.DispenserBlock.FACING = value.wrapperContained; }

// public java.util.Map BEHAVIORS() { return wrapperContained.BEHAVIORS; }
// public void BEHAVIORS(java.util.Map value) { wrapperContained.BEHAVIORS = value; }
public static java.util.Map BEHAVIORS() { return net.minecraft.block.DispenserBlock.BEHAVIORS; }
// public static void BEHAVIORS(java.util.Map value, ) { net.minecraft.block.DispenserBlock.BEHAVIORS = value; }

// public yarnwrap.state.property.BooleanProperty TRIGGERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.TRIGGERED); }
// public void TRIGGERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.TRIGGERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty TRIGGERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.DispenserBlock.TRIGGERED); }
// public static void TRIGGERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.DispenserBlock.TRIGGERED = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.DispenserBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.DispenserBlock.SCHEDULED_TICK_DELAY = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.DispenserBlock.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.DispenserBlock.LOGGER = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.DispenserBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.DispenserBlock.CODEC = value; }

// public yarnwrap.block.dispenser.ItemDispenserBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.DEFAULT_BEHAVIOR); }
// public void DEFAULT_BEHAVIOR(yarnwrap.block.dispenser.ItemDispenserBehavior value) { wrapperContained.DEFAULT_BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.block.dispenser.ItemDispenserBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(net.minecraft.block.DispenserBlock.DEFAULT_BEHAVIOR); }
// public static void DEFAULT_BEHAVIOR(yarnwrap.block.dispenser.ItemDispenserBehavior value, ) { net.minecraft.block.DispenserBlock.DEFAULT_BEHAVIOR = value.wrapperContained; }

// public void method_10008(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap map) { wrapperContained.method_10008(map); }
// public static void method_10008(it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap map, ) { net.minecraft.block.DispenserBlock.method_10008(map); }
// public void registerBehavior(yarnwrap.item.ItemConvertible provider,yarnwrap.block.dispenser.DispenserBehavior behavior) { wrapperContained.registerBehavior(provider.wrapperContained,behavior.wrapperContained); }
// public static void registerBehavior(yarnwrap.item.ItemConvertible provider,yarnwrap.block.dispenser.DispenserBehavior behavior, ) { net.minecraft.block.DispenserBlock.registerBehavior(provider.wrapperContained,behavior.wrapperContained); }
// public yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer,double facingOffset,yarnwrap.util.math.Vec3d constantOffset) { return new yarnwrap.util.math.Position(wrapperContained.getOutputLocation(pointer.wrapperContained,facingOffset,constantOffset.wrapperContained)); }
// public static yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer,double facingOffset,yarnwrap.util.math.Vec3d constantOffset, ) { return new yarnwrap.util.math.Position(net.minecraft.block.DispenserBlock.getOutputLocation(pointer.wrapperContained,facingOffset,constantOffset.wrapperContained)); }
// public yarnwrap.block.dispenser.DispenserBehavior getBehaviorForItem(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.getBehaviorForItem(world.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.block.dispenser.DispenserBehavior getBehaviorForItem(yarnwrap.world.World world,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.block.dispenser.DispenserBehavior(net.minecraft.block.DispenserBlock.getBehaviorForItem(world.wrapperContained,stack.wrapperContained)); }
// public void dispense(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { wrapperContained.dispense(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static void dispense(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.DispenserBlock.dispense(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public void registerProjectileBehavior(yarnwrap.item.ItemConvertible projectile) { wrapperContained.registerProjectileBehavior(projectile.wrapperContained); }
// public static void registerProjectileBehavior(yarnwrap.item.ItemConvertible projectile, ) { net.minecraft.block.DispenserBlock.registerProjectileBehavior(projectile.wrapperContained); }
// public yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer) { return new yarnwrap.util.math.Position(wrapperContained.getOutputLocation(pointer.wrapperContained)); }
// public static yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer, ) { return new yarnwrap.util.math.Position(net.minecraft.block.DispenserBlock.getOutputLocation(pointer.wrapperContained)); }

}