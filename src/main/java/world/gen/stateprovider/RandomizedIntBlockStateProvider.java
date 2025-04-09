package yarnwrap.world.gen.stateprovider;
public class RandomizedIntBlockStateProvider { public net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider wrapperContained; public RandomizedIntBlockStateProvider(net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider source() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.source); }
// public java.lang.String propertyName() { return wrapperContained.propertyName; }
// public yarnwrap.state.property.IntProperty property() { return new yarnwrap.state.property.IntProperty(wrapperContained.property); }
// public yarnwrap.util.math.intprovider.IntProvider values() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.values); }
// public yarnwrap.state.property.IntProperty getIntPropertyByName(yarnwrap.block.BlockState state,java.lang.String propertyName) { return new yarnwrap.state.property.IntProperty(wrapperContained.getIntPropertyByName(state.wrapperContained,propertyName)); }

}