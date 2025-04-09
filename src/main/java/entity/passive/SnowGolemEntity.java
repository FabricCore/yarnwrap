package yarnwrap.entity.passive;
public class SnowGolemEntity { public net.minecraft.entity.passive.SnowGolemEntity wrapperContained; public SnowGolemEntity(net.minecraft.entity.passive.SnowGolemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte HAS_PUMPKIN_FLAG() { return wrapperContained.HAS_PUMPKIN_FLAG; }
// public yarnwrap.entity.data.TrackedData SNOW_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SNOW_GOLEM_FLAGS); }
public Object createSnowGolemAttributes() { return wrapperContained.createSnowGolemAttributes(); }
public void setHasPumpkin(boolean hasPumpkin) { wrapperContained.setHasPumpkin(hasPumpkin); }
public boolean hasPumpkin() { return wrapperContained.hasPumpkin(); }

}