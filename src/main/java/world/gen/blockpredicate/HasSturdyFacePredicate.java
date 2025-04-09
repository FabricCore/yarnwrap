package yarnwrap.world.gen.blockpredicate;
public class HasSturdyFacePredicate { public net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained; public HasSturdyFacePredicate(net.minecraft.world.gen.blockpredicate.HasSturdyFacePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public yarnwrap.util.math.Direction face() { return new yarnwrap.util.math.Direction(wrapperContained.face); }

}