package yarnwrap.world.gen.treedecorator;
public class BeehiveTreeDecorator { public net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator wrapperContained; public BeehiveTreeDecorator(net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.Direction BEE_NEST_FACE() { return new yarnwrap.util.math.Direction(wrapperContained.BEE_NEST_FACE); }
// public net.minecraft.util.math.Direction[] GENERATE_DIRECTIONS() { return wrapperContained.GENERATE_DIRECTIONS; }

}