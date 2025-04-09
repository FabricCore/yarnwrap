package yarnwrap.entity.mob;
public class CaveSpiderEntity { public net.minecraft.entity.mob.CaveSpiderEntity wrapperContained; public CaveSpiderEntity(net.minecraft.entity.mob.CaveSpiderEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createCaveSpiderAttributes() { return wrapperContained.createCaveSpiderAttributes(); }

}