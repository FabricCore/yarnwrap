package yarnwrap.data.client;
public class TextureKey { public net.minecraft.data.client.TextureKey wrapperContained; public TextureKey(net.minecraft.data.client.TextureKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.data.client.TextureKey parent() { return new yarnwrap.data.client.TextureKey(wrapperContained.parent); }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.data.client.TextureKey getParent() { return new yarnwrap.data.client.TextureKey(wrapperContained.getParent()); }
// public yarnwrap.data.client.TextureKey of(java.lang.String name) { return new yarnwrap.data.client.TextureKey(wrapperContained.of(name)); }
// public yarnwrap.data.client.TextureKey of(java.lang.String name,yarnwrap.data.client.TextureKey parent) { return new yarnwrap.data.client.TextureKey(wrapperContained.of(name,parent.wrapperContained)); }

}