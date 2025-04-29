package yarnwrap.entity;
public class Ownable { public net.minecraft.entity.Ownable wrapperContained; public Ownable(net.minecraft.entity.Ownable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.Entity getOwner() { return new yarnwrap.entity.Entity(wrapperContained.getOwner()); }
// public static yarnwrap.entity.Entity getOwner() { return new yarnwrap.entity.Entity(net.minecraft.entity.Ownable.getOwner()); }

}