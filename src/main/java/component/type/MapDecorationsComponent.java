package yarnwrap.component.type;
public class MapDecorationsComponent { public net.minecraft.component.type.MapDecorationsComponent wrapperContained; public MapDecorationsComponent(net.minecraft.component.type.MapDecorationsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.MapDecorationsComponent DEFAULT() { return new yarnwrap.component.type.MapDecorationsComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.component.type.MapDecorationsComponent with(java.lang.String id,Object decoration) { return new yarnwrap.component.type.MapDecorationsComponent(wrapperContained.with(id,decoration)); }

}