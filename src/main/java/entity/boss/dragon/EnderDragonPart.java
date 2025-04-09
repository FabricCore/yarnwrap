package yarnwrap.entity.boss.dragon;
public class EnderDragonPart { public net.minecraft.entity.boss.dragon.EnderDragonPart wrapperContained; public EnderDragonPart(net.minecraft.entity.boss.dragon.EnderDragonPart wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions partDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.partDimensions); }
public java.lang.String name() { return wrapperContained.name; }
public yarnwrap.entity.boss.dragon.EnderDragonEntity owner() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.owner); }

}