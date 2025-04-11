package yarnwrap.entity;
public class EntityInteraction { public net.minecraft.entity.EntityInteraction wrapperContained; public EntityInteraction(net.minecraft.entity.EntityInteraction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityInteraction create(java.lang.String key) { return new yarnwrap.entity.EntityInteraction(wrapperContained.create(key)); }

}