package yarnwrap.entity.passive;
public class CowEntity { public net.minecraft.entity.passive.CowEntity wrapperContained; public CowEntity(net.minecraft.entity.passive.CowEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
public Object createCowAttributes() { return wrapperContained.createCowAttributes(); }

}