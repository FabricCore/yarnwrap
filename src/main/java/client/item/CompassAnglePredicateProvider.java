package yarnwrap.client.item;
public class CompassAnglePredicateProvider { public net.minecraft.client.item.CompassAnglePredicateProvider wrapperContained; public CompassAnglePredicateProvider(net.minecraft.client.item.CompassAnglePredicateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object aimedInterpolator() { return wrapperContained.aimedInterpolator; }
// public Object aimlessInterpolator() { return wrapperContained.aimlessInterpolator; }
public Object compassTarget() { return wrapperContained.compassTarget; }
// public int scatter(int seed) { return wrapperContained.scatter(seed); }
// public float getAimlessAngle(int seed,long time) { return wrapperContained.getAimlessAngle(seed,time); }
// public double getBodyYaw(yarnwrap.entity.Entity entity) { return wrapperContained.getBodyYaw(entity.wrapperContained); }
// public float getAngleTo(yarnwrap.entity.Entity entity,long time,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAngleTo(entity.wrapperContained,time,pos.wrapperContained); }
// public yarnwrap.client.world.ClientWorld getClientWorld(yarnwrap.entity.Entity entity,yarnwrap.client.world.ClientWorld world) { return new yarnwrap.client.world.ClientWorld(wrapperContained.getClientWorld(entity.wrapperContained,world.wrapperContained)); }
// public double getAngleTo(yarnwrap.entity.Entity entity,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAngleTo(entity.wrapperContained,pos.wrapperContained); }
// public boolean canPointTo(yarnwrap.entity.Entity entity,yarnwrap.util.math.GlobalPos pos) { return wrapperContained.canPointTo(entity.wrapperContained,pos.wrapperContained); }
// public float getAngle(yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,int seed,yarnwrap.entity.Entity entity) { return wrapperContained.getAngle(stack.wrapperContained,world.wrapperContained,seed,entity.wrapperContained); }

}