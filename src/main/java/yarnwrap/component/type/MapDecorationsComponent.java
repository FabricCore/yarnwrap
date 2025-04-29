package yarnwrap.component.type;
public class MapDecorationsComponent { public net.minecraft.component.type.MapDecorationsComponent wrapperContained; public MapDecorationsComponent(net.minecraft.component.type.MapDecorationsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.MapDecorationsComponent DEFAULT() { return new yarnwrap.component.type.MapDecorationsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.MapDecorationsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.MapDecorationsComponent DEFAULT() { return new yarnwrap.component.type.MapDecorationsComponent(net.minecraft.component.type.MapDecorationsComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.MapDecorationsComponent value, ) { net.minecraft.component.type.MapDecorationsComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.MapDecorationsComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.MapDecorationsComponent.CODEC = value; }

// public yarnwrap.component.type.MapDecorationsComponent with(java.lang.String id,Object decoration) { return new yarnwrap.component.type.MapDecorationsComponent(wrapperContained.with(id,decoration)); }
// public static yarnwrap.component.type.MapDecorationsComponent with(java.lang.String id,Object decoration, ) { return new yarnwrap.component.type.MapDecorationsComponent(net.minecraft.component.type.MapDecorationsComponent.with(id,decoration)); }

}