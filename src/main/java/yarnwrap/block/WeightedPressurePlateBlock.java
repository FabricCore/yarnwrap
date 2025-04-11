package yarnwrap.block;
public class WeightedPressurePlateBlock { public net.minecraft.block.WeightedPressurePlateBlock wrapperContained; public WeightedPressurePlateBlock(net.minecraft.block.WeightedPressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}