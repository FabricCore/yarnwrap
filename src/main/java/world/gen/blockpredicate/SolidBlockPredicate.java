package yarnwrap.world.gen.blockpredicate;
public class SolidBlockPredicate { public net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained; public SolidBlockPredicate(net.minecraft.world.gen.blockpredicate.SolidBlockPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}