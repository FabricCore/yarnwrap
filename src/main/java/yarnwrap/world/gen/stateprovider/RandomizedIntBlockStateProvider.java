package yarnwrap.world.gen.stateprovider;
public class RandomizedIntBlockStateProvider { public net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider wrapperContained; public RandomizedIntBlockStateProvider(net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider source() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.source); }
// public void source(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.source = value.wrapperContained; }
// public java.lang.String propertyName() { return wrapperContained.propertyName; }
// public void propertyName(java.lang.String value) { wrapperContained.propertyName = value; }
// public yarnwrap.state.property.IntProperty property() { return new yarnwrap.state.property.IntProperty(wrapperContained.property); }
// public void property(yarnwrap.state.property.IntProperty value) { wrapperContained.property = value.wrapperContained; }
// public yarnwrap.util.math.intprovider.IntProvider values() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.values); }
// public void values(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.values = value.wrapperContained; }
public RandomizedIntBlockStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider source,java.lang.String propertyName,yarnwrap.util.math.intprovider.IntProvider values) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider(source.wrapperContained,propertyName,values.wrapperContained); }
public RandomizedIntBlockStateProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider source,yarnwrap.state.property.IntProperty property,yarnwrap.util.math.intprovider.IntProvider values) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider(source.wrapperContained,property.wrapperContained,values.wrapperContained); }
// public yarnwrap.state.property.IntProperty getIntPropertyByName(yarnwrap.block.BlockState state,java.lang.String propertyName) { return new yarnwrap.state.property.IntProperty(wrapperContained.getIntPropertyByName(state.wrapperContained,propertyName)); }
// public yarnwrap.state.property.IntProperty method_34364(yarnwrap.state.property.Property property) { return new yarnwrap.state.property.IntProperty(wrapperContained.method_34364(property.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_34365(Object instance) { return wrapperContained.method_34365(instance); }
// public boolean method_34368(java.lang.String property) { return wrapperContained.method_34368(property); }
// public boolean method_34369(yarnwrap.state.property.Property property) { return wrapperContained.method_34369(property.wrapperContained); }

}