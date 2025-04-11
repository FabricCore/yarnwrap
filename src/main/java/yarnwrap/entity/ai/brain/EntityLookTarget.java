package yarnwrap.entity.ai.brain;
public class EntityLookTarget { public net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained; public EntityLookTarget(net.minecraft.entity.ai.brain.EntityLookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
// public boolean useEyeHeight() { return wrapperContained.useEyeHeight; }
// public void useEyeHeight(boolean value) { wrapperContained.useEyeHeight = value; }
public EntityLookTarget(yarnwrap.entity.Entity entity,boolean useEyeHeight) { this.wrapperContained = new net.minecraft.entity.ai.brain.EntityLookTarget(entity.wrapperContained,useEyeHeight); }
public yarnwrap.entity.Entity getEntity() { return new yarnwrap.entity.Entity(wrapperContained.getEntity()); }

}