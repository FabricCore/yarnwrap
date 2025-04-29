package yarnwrap.entity.mob;
public class IllagerEntity { public net.minecraft.entity.mob.IllagerEntity wrapperContained; public IllagerEntity(net.minecraft.entity.mob.IllagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getState() { return wrapperContained.getState(); }
// public static Object getState() { return net.minecraft.entity.mob.IllagerEntity.getState(); }

}