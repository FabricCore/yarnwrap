package yarnwrap.world.explosion;
public class EntityExplosionBehavior { public net.minecraft.world.explosion.EntityExplosionBehavior wrapperContained; public EntityExplosionBehavior(net.minecraft.world.explosion.EntityExplosionBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }

}