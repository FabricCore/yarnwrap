package yarnwrap.world.gen.blockpredicate;
public class SolidBlockPredicate { public net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained; public SolidBlockPredicate(net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_39590(Object instance) { return wrapperContained.method_39590(instance); }

}