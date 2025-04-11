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
public BeehiveTreeDecorator(float probability) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator(probability); }
// public boolean method_23464(int pos) { return wrapperContained.method_23464(pos); }
// public java.lang.Float method_28890(yarnwrap.world.gen.treedecorator.BeehiveTreeDecorator decorator) { return wrapperContained.method_28890(decorator.wrapperContained); }
// public void method_35373(yarnwrap.util.math.random.Random blockEntity) { wrapperContained.method_35373(blockEntity.wrapperContained); }
// public boolean method_40032(Object pos) { return wrapperContained.method_40032(pos); }
// public java.util.stream.Stream method_40033(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_40033(pos.wrapperContained); }
// public boolean method_40034(yarnwrap.util.math.Direction direction) { return wrapperContained.method_40034(direction.wrapperContained); }

}