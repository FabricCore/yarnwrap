package yarnwrap.entity.boss.dragon;
public class EnderDragonPart { public net.minecraft.entity.boss.dragon.EnderDragonPart wrapperContained; public EnderDragonPart(net.minecraft.entity.boss.dragon.EnderDragonPart wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.entity.boss.dragon.EnderDragonPart.name; }
// public static void name(java.lang.String value, ) { net.minecraft.entity.boss.dragon.EnderDragonPart.name = value; }

public yarnwrap.entity.boss.dragon.EnderDragonEntity owner() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.boss.dragon.EnderDragonEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.boss.dragon.EnderDragonEntity owner() { return new yarnwrap.entity.boss.dragon.EnderDragonEntity(net.minecraft.entity.boss.dragon.EnderDragonPart.owner); }
// public static void owner(yarnwrap.entity.boss.dragon.EnderDragonEntity value, ) { net.minecraft.entity.boss.dragon.EnderDragonPart.owner = value.wrapperContained; }

// public yarnwrap.entity.EntityDimensions partDimensions() { return new yarnwrap.entity.EntityDimensions(wrapperContained.partDimensions); }
// public void partDimensions(yarnwrap.entity.EntityDimensions value) { wrapperContained.partDimensions = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions partDimensions() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.boss.dragon.EnderDragonPart.partDimensions); }
// public static void partDimensions(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.boss.dragon.EnderDragonPart.partDimensions = value.wrapperContained; }

public EnderDragonPart(yarnwrap.entity.boss.dragon.EnderDragonEntity owner,java.lang.String name,float width,float height) { this.wrapperContained = new net.minecraft.entity.boss.dragon.EnderDragonPart(owner.wrapperContained,name,width,height); }

}