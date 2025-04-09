package yarnwrap.entity.mob;
public class GiantEntity { public net.minecraft.entity.mob.GiantEntity wrapperContained; public GiantEntity(net.minecraft.entity.mob.GiantEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createGiantAttributes() { return wrapperContained.createGiantAttributes(); }

}