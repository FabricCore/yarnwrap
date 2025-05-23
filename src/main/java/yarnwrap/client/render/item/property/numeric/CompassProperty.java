package yarnwrap.client.render.item.property.numeric;
public class CompassProperty { public net.minecraft.client.render.item.property.numeric.CompassProperty wrapperContained; public CompassProperty(net.minecraft.client.render.item.property.numeric.CompassProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.client.render.item.property.numeric.CompassProperty.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.item.property.numeric.CompassProperty.CODEC = value; }

// public yarnwrap.client.render.item.property.numeric.CompassState state() { return new yarnwrap.client.render.item.property.numeric.CompassState(wrapperContained.state); }
// public void state(yarnwrap.client.render.item.property.numeric.CompassState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.client.render.item.property.numeric.CompassState state() { return new yarnwrap.client.render.item.property.numeric.CompassState(net.minecraft.client.render.item.property.numeric.CompassProperty.state); }
// public static void state(yarnwrap.client.render.item.property.numeric.CompassState value, ) { net.minecraft.client.render.item.property.numeric.CompassProperty.state = value.wrapperContained; }

// public CompassProperty(yarnwrap.client.render.item.property.numeric.CompassState state) { this.wrapperContained = new net.minecraft.client.render.item.property.numeric.CompassProperty(state.wrapperContained); }
// public CompassProperty(boolean wobble,Object target) { this.wrapperContained = new net.minecraft.client.render.item.property.numeric.CompassProperty(wobble,target); }
// public yarnwrap.client.render.item.property.numeric.CompassState method_65645(yarnwrap.client.render.item.property.numeric.CompassProperty property) { return new yarnwrap.client.render.item.property.numeric.CompassState(wrapperContained.method_65645(property.wrapperContained)); }
// public static yarnwrap.client.render.item.property.numeric.CompassState method_65645(yarnwrap.client.render.item.property.numeric.CompassProperty property, ) { return new yarnwrap.client.render.item.property.numeric.CompassState(net.minecraft.client.render.item.property.numeric.CompassProperty.method_65645(property.wrapperContained)); }

}