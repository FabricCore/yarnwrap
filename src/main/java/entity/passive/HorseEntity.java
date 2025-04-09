package yarnwrap.entity.passive;
public class HorseEntity { public net.minecraft.entity.passive.HorseEntity wrapperContained; public HorseEntity(net.minecraft.entity.passive.HorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void setHorseVariant(yarnwrap.entity.passive.HorseColor color,yarnwrap.entity.passive.HorseMarking marking) { wrapperContained.setHorseVariant(color.wrapperContained,marking.wrapperContained); }
public yarnwrap.entity.passive.HorseMarking getMarking() { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.getMarking()); }
// public void setHorseVariant(int variant) { wrapperContained.setHorseVariant(variant); }
// public int getHorseVariant() { return wrapperContained.getHorseVariant(); }

}