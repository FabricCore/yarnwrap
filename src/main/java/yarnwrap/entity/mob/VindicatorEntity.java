package yarnwrap.entity.mob;
public class VindicatorEntity { public net.minecraft.entity.mob.VindicatorEntity wrapperContained; public VindicatorEntity(net.minecraft.entity.mob.VindicatorEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE() { return wrapperContained.DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE; }
// public void DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE(java.util.function.Predicate value) { wrapperContained.DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE = value; }
// public java.lang.String JOHNNY_KEY() { return wrapperContained.JOHNNY_KEY; }
// public void JOHNNY_KEY(java.lang.String value) { wrapperContained.JOHNNY_KEY = value; }
// public boolean johnny() { return wrapperContained.johnny; }
// public void johnny(boolean value) { wrapperContained.johnny = value; }
public Object createVindicatorAttributes() { return wrapperContained.createVindicatorAttributes(); }

}