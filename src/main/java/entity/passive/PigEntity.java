package yarnwrap.entity.passive;
public class PigEntity { public net.minecraft.entity.passive.PigEntity wrapperContained; public PigEntity(net.minecraft.entity.passive.PigEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.SaddledComponent saddledComponent() { return new yarnwrap.entity.SaddledComponent(wrapperContained.saddledComponent); }
// public yarnwrap.entity.data.TrackedData BOOST_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BOOST_TIME); }
// public yarnwrap.entity.data.TrackedData SADDLED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SADDLED); }
public Object createPigAttributes() { return wrapperContained.createPigAttributes(); }

}