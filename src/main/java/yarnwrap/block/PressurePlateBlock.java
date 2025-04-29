package yarnwrap.block;
public class PressurePlateBlock { public net.minecraft.block.PressurePlateBlock wrapperContained; public PressurePlateBlock(net.minecraft.block.PressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PressurePlateBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PressurePlateBlock.POWERED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PressurePlateBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PressurePlateBlock.CODEC = value; }

// public PressurePlateBlock(yarnwrap.block.BlockSetType type,Object settings) { this.wrapperContained = new net.minecraft.block.PressurePlateBlock(type.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_54036(Object instance) { return wrapperContained.method_54036(instance); }
// public static com.mojang.datafixers.kinds.App method_54036(Object instance, ) { return net.minecraft.block.PressurePlateBlock.method_54036(instance); }
// public yarnwrap.block.BlockSetType method_54037(yarnwrap.block.PressurePlateBlock block) { return new yarnwrap.block.BlockSetType(wrapperContained.method_54037(block.wrapperContained)); }
// public static yarnwrap.block.BlockSetType method_54037(yarnwrap.block.PressurePlateBlock block, ) { return new yarnwrap.block.BlockSetType(net.minecraft.block.PressurePlateBlock.method_54037(block.wrapperContained)); }

}