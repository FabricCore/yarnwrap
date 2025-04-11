package yarnwrap.util.hit;
public class EntityHitResult { public net.minecraft.util.hit.EntityHitResult wrapperContained; public EntityHitResult(net.minecraft.util.hit.EntityHitResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }

}