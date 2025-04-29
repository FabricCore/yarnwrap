package yarnwrap.block;
public class SculkCatalystBlock { public net.minecraft.block.SculkCatalystBlock wrapperContained; public SculkCatalystBlock(net.minecraft.block.SculkCatalystBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty BLOOM() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BLOOM); }
// public void BLOOM(yarnwrap.state.property.BooleanProperty value) { wrapperContained.BLOOM = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty BLOOM() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.SculkCatalystBlock.BLOOM); }
// public static void BLOOM(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.SculkCatalystBlock.BLOOM = value.wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider experience() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.experience); }
// public void experience(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.experience = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider experience() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.block.SculkCatalystBlock.experience); }
// public static void experience(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.block.SculkCatalystBlock.experience = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SculkCatalystBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SculkCatalystBlock.CODEC = value; }


}