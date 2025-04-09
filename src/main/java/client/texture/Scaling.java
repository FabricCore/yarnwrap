package yarnwrap.client.texture;
public class Scaling { public net.minecraft.client.texture.Scaling wrapperContained; public Scaling(net.minecraft.client.texture.Scaling wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.client.texture.Scaling STRETCH() { return new yarnwrap.client.texture.Scaling(wrapperContained.STRETCH); }
public Object getType() { return wrapperContained.getType(); }

}