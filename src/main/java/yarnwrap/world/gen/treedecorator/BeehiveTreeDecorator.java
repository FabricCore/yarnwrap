package yarnwrap.world.gen.treedecorator;
public class BeehiveTreeDecorator { public net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator wrapperContained; public BeehiveTreeDecorator(net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public float probability() { return wrapperContained.probability; }
// public void probability(float value) { wrapperContained.probability = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.Direction BEE_NEST_FACE() { return new yarnwrap.util.math.Direction(wrapperContained.BEE_NEST_FACE); }
// public void BEE_NEST_FACE(yarnwrap.util.math.Direction value) { wrapperContained.BEE_NEST_FACE = value.wrapperContained; }
// public net.minecraft.util.math.Direction[] GENERATE_DIRECTIONS() { return wrapperContained.GENERATE_DIRECTIONS; }
// public void GENERATE_DIRECTIONS(net.minecraft.util.math.Direction[] value) { wrapperContained.GENERATE_DIRECTIONS = value; }

}