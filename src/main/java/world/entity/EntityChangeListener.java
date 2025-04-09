package yarnwrap.world.entity;
public class EntityChangeListener { public net.minecraft.world.entity.EntityChangeListener wrapperContained; public EntityChangeListener(net.minecraft.world.entity.EntityChangeListener wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.entity.EntityChangeListener NONE() { return new yarnwrap.world.entity.EntityChangeListener(wrapperContained.NONE); }
public void updateEntityPosition() { wrapperContained.updateEntityPosition(); }
// public void remove(Object reason) { wrapperContained.remove(reason); }

}