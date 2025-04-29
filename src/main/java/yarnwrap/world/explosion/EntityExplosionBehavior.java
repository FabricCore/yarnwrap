package yarnwrap.world.explosion;
public class EntityExplosionBehavior { public net.minecraft.world.explosion.EntityExplosionBehavior wrapperContained; public EntityExplosionBehavior(net.minecraft.world.explosion.EntityExplosionBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public static yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(net.minecraft.world.explosion.EntityExplosionBehavior.entity); }
// public static void entity(yarnwrap.entity.Entity value, ) { net.minecraft.world.explosion.EntityExplosionBehavior.entity = value.wrapperContained; }

public EntityExplosionBehavior(yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.world.explosion.EntityExplosionBehavior(entity.wrapperContained); }
// public java.lang.Float method_29552(yarnwrap.world.explosion.Explosion max) { return wrapperContained.method_29552(max.wrapperContained); }
// public static java.lang.Float method_29552(yarnwrap.world.explosion.Explosion max, ) { return net.minecraft.world.explosion.EntityExplosionBehavior.method_29552(max.wrapperContained); }

}