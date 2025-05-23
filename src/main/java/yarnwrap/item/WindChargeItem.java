package yarnwrap.item;
public class WindChargeItem { public net.minecraft.item.WindChargeItem wrapperContained; public WindChargeItem(net.minecraft.item.WindChargeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float POWER() { return wrapperContained.POWER; }
// public void POWER(float value) { wrapperContained.POWER = value; }
public static float POWER() { return net.minecraft.item.WindChargeItem.POWER; }
// public static void POWER(float value, ) { net.minecraft.item.WindChargeItem.POWER = value; }

// public yarnwrap.util.math.Position method_58670(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.Position(wrapperContained.method_58670(pointer.wrapperContained,facing.wrapperContained)); }
// public static yarnwrap.util.math.Position method_58670(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing, ) { return new yarnwrap.util.math.Position(net.minecraft.item.WindChargeItem.method_58670(pointer.wrapperContained,facing.wrapperContained)); }
// public yarnwrap.entity.projectile.WindChargeEntity method_61665(yarnwrap.entity.player.PlayerEntity world2,yarnwrap.world.World shooter,yarnwrap.server.world.ServerWorld stack) { return new yarnwrap.entity.projectile.WindChargeEntity(wrapperContained.method_61665(world2.wrapperContained,shooter.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.entity.projectile.WindChargeEntity method_61665(yarnwrap.entity.player.PlayerEntity world2,yarnwrap.world.World shooter,yarnwrap.server.world.ServerWorld stack, ) { return new yarnwrap.entity.projectile.WindChargeEntity(net.minecraft.item.WindChargeItem.method_61665(world2.wrapperContained,shooter.wrapperContained,stack.wrapperContained)); }

}