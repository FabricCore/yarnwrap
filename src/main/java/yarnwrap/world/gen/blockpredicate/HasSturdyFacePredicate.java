package yarnwrap.world.gen.blockpredicate;
public class HasSturdyFacePredicate { public net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained; public HasSturdyFacePredicate(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }
// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }
// public void face(yarnwrap.util.math.Direction value) { wrapperContained.face = value.wrapperContained; }

}