package yarnwrap.block;
public class WeightedPressurePlateBlock { public net.minecraft.block.WeightedPressurePlateBlock wrapperContained; public WeightedPressurePlateBlock(net.minecraft.block.WeightedPressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}