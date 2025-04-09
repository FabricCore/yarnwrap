package yarnwrap.entity.ai.brain;
public class EntityLookTarget { public net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained; public EntityLookTarget(net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public boolean useEyeHeight() { return wrapperContained.useEyeHeight; }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }

}