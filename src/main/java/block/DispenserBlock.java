package yarnwrap.block;
public class DispenserBlock { public net.minecraft.block.DispenserBlock wrapperContained; public DispenserBlock(net.minecraft.block.DispenserBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public java.util.Map BEHAVIORS() { return wrapperContained.BEHAVIORS; }
public yarnwrap.state.property.BooleanProperty TRIGGERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.TRIGGERED); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.dispenser.ItemDispenserBehavior DEFAULT_BEHAVIOR() { return new yarnwrap.block.dispenser.ItemDispenserBehavior(wrapperContained.DEFAULT_BEHAVIOR); }
public void registerBehavior(yarnwrap.item.ItemConvertible provider,yarnwrap.block.dispenser.DispenserBehavior behavior) { wrapperContained.registerBehavior(provider.wrapperContained,behavior.wrapperContained); }
public yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer,double facingOffset,yarnwrap.util.math.Vec3d constantOffset) { return new yarnwrap.util.math.Position(wrapperContained.getOutputLocation(pointer.wrapperContained,facingOffset,constantOffset.wrapperContained)); }
// public yarnwrap.block.dispenser.DispenserBehavior getBehaviorForItem(yarnwrap.world.World world,yarnwrap.item.ItemStack stack) { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.getBehaviorForItem(world.wrapperContained,stack.wrapperContained)); }
// public void dispense(yarnwrap.server.world.ServerWorld world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { wrapperContained.dispense(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
public void registerProjectileBehavior(yarnwrap.item.ItemConvertible projectile) { wrapperContained.registerProjectileBehavior(projectile.wrapperContained); }
public yarnwrap.util.math.Position getOutputLocation(yarnwrap.util.math.BlockPointer pointer) { return new yarnwrap.util.math.Position(wrapperContained.getOutputLocation(pointer.wrapperContained)); }

}