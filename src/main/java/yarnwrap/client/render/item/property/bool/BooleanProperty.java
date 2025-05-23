package yarnwrap.client.render.item.property.bool;
public class BooleanProperty { public net.minecraft.client.render.item.property.bool.BooleanProperty wrapperContained; public BooleanProperty(net.minecraft.client.render.item.property.bool.BooleanProperty wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.client.render.item.property.bool.BooleanProperty.getCodec(); }

}