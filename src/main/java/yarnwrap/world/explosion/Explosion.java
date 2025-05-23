package yarnwrap.world.explosion;
public class Explosion { public net.minecraft.world.explosion.Explosion wrapperContained; public Explosion(net.minecraft.world.explosion.Explosion wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.LivingEntity getCausingEntity() { return new yarnwrap.entity.LivingEntity(wrapperContained.getCausingEntity()); }
// public static yarnwrap.entity.LivingEntity getCausingEntity() { return new yarnwrap.entity.LivingEntity(net.minecraft.world.explosion.Explosion.getCausingEntity()); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }
// public static yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(net.minecraft.world.explosion.Explosion.getEntity()); }
public float getPower() { return wrapperContained.getPower(); }
// public static float getPower() { return net.minecraft.world.explosion.Explosion.getPower(); }
// public yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world,yarnwrap.entity.Entity source) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.createDamageSource(world.wrapperContained,source.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world,yarnwrap.entity.Entity source, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.world.explosion.Explosion.createDamageSource(world.wrapperContained,source.wrapperContained)); }
public yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPosition()); }
// public static yarnwrap.util.math.Vec3d getPosition() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.explosion.Explosion.getPosition()); }
// public yarnwrap.entity.LivingEntity getCausingEntity(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.LivingEntity(wrapperContained.getCausingEntity(entity.wrapperContained)); }
// public static yarnwrap.entity.LivingEntity getCausingEntity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.LivingEntity(net.minecraft.world.explosion.Explosion.getCausingEntity(entity.wrapperContained)); }
public Object getDestructionType() { return wrapperContained.getDestructionType(); }
// public static Object getDestructionType() { return net.minecraft.world.explosion.Explosion.getDestructionType(); }
public boolean canTriggerBlocks() { return wrapperContained.canTriggerBlocks(); }
// public static boolean canTriggerBlocks() { return net.minecraft.world.explosion.Explosion.canTriggerBlocks(); }
public boolean preservesDecorativeEntities() { return wrapperContained.preservesDecorativeEntities(); }
// public static boolean preservesDecorativeEntities() { return net.minecraft.world.explosion.Explosion.preservesDecorativeEntities(); }
public yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(wrapperContained.getWorld()); }
// public static yarnwrap.server.world.ServerWorld getWorld() { return new yarnwrap.server.world.ServerWorld(net.minecraft.world.explosion.Explosion.getWorld()); }

}