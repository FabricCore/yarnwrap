package yarnwrap.block;
public class WeightedPressurePlateBlock { public net.minecraft.block.WeightedPressurePlateBlock wrapperContained; public WeightedPressurePlateBlock(net.minecraft.block.WeightedPressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public WeightedPressurePlateBlock(int weight,yarnwrap.block.BlockSetType type,Object settings) { this.wrapperContained = new net.minecraft.block.WeightedPressurePlateBlock(weight,type.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54072(Object instance) { return wrapperContained.method_54072(instance); }
// public yarnwrap.block.BlockSetType method_54073(yarnwrap.block.WeightedPressurePlateBlock block) { return new yarnwrap.block.BlockSetType(wrapperContained.method_54073(block.wrapperContained)); }
// public java.lang.Integer method_54074(yarnwrap.block.WeightedPressurePlateBlock block) { return wrapperContained.method_54074(block.wrapperContained); }

}