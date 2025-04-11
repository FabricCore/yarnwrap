package yarnwrap.world.gen.blockpredicate;
public class InsideWorldBoundsBlockPredicate { public net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained; public InsideWorldBoundsBlockPredicate(net.minecraft.world.gen.blockpredicate.InsideWorldBoundsBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Vec3i offset() { return new yarnwrap.util.math.Vec3i(wrapperContained.offset); }
// public void offset(yarnwrap.util.math.Vec3i value) { wrapperContained.offset = value.wrapperContained; }

}