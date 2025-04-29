package yarnwrap.world.entity;
public class EntityChangeListener { public net.minecraft.world.entity.EntityChangeListener wrapperContained; public EntityChangeListener(net.minecraft.world.entity.EntityChangeListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.entity.EntityChangeListener NONE() { return new yarnwrap.world.entity.EntityChangeListener(wrapperContained.NONE); }
// public void NONE(yarnwrap.world.entity.EntityChangeListener value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.world.entity.EntityChangeListener NONE() { return new yarnwrap.world.entity.EntityChangeListener(net.minecraft.world.entity.EntityChangeListener.NONE); }
// public static void NONE(yarnwrap.world.entity.EntityChangeListener value, ) { net.minecraft.world.entity.EntityChangeListener.NONE = value.wrapperContained; }

public void updateEntityPosition() { wrapperContained.updateEntityPosition(); }
// public static void updateEntityPosition() { net.minecraft.world.entity.EntityChangeListener.updateEntityPosition(); }
// public void remove(Object reason) { wrapperContained.remove(reason); }
// public static void remove(Object reason, ) { net.minecraft.world.entity.EntityChangeListener.remove(reason); }

}