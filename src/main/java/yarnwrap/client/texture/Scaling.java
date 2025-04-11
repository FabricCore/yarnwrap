package yarnwrap.client.texture;
public class Scaling { public net.minecraft.client.texture.Scaling wrapperContained; public Scaling(net.minecraft.client.texture.Scaling wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.client.texture.Scaling STRETCH() { return new yarnwrap.client.texture.Scaling(wrapperContained.STRETCH); }
// public void STRETCH(yarnwrap.client.texture.Scaling value) { wrapperContained.STRETCH = value.wrapperContained; }
public Object getType() { return wrapperContained.getType(); }

}