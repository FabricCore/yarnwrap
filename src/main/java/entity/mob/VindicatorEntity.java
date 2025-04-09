package yarnwrap.entity.mob;
public class VindicatorEntity { public net.minecraft.entity.mob.VindicatorEntity wrapperContained; public VindicatorEntity(net.minecraft.entity.mob.VindicatorEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE() { return wrapperContained.DIFFICULTY_ALLOWS_DOOR_BREAKING_PREDICATE; }
// public java.lang.String JOHNNY_KEY() { return wrapperContained.JOHNNY_KEY; }
// public boolean johnny() { return wrapperContained.johnny; }
public Object createVindicatorAttributes() { return wrapperContained.createVindicatorAttributes(); }

}