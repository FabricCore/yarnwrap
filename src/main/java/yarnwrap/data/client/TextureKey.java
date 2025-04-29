package yarnwrap.data.client;
public class TextureKey { public net.minecraft.data.client.TextureKey wrapperContained; public TextureKey(net.minecraft.data.client.TextureKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.data.client.TextureKey.name; }
// public static void name(java.lang.String value, ) { net.minecraft.data.client.TextureKey.name = value; }

// public yarnwrap.data.client.TextureKey parent() { return new yarnwrap.data.client.TextureKey(wrapperContained.parent); }
// public void parent(yarnwrap.data.client.TextureKey value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.data.client.TextureKey parent() { return new yarnwrap.data.client.TextureKey(net.minecraft.data.client.TextureKey.parent); }
// public static void parent(yarnwrap.data.client.TextureKey value, ) { net.minecraft.data.client.TextureKey.parent = value.wrapperContained; }

// public TextureKey(java.lang.String name,yarnwrap.data.client.TextureKey parent) { this.wrapperContained = new net.minecraft.data.client.TextureKey(name,parent.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.data.client.TextureKey.getName(); }
public yarnwrap.data.client.TextureKey getParent() { return new yarnwrap.data.client.TextureKey(wrapperContained.getParent()); }
// public static yarnwrap.data.client.TextureKey getParent() { return new yarnwrap.data.client.TextureKey(net.minecraft.data.client.TextureKey.getParent()); }
// public yarnwrap.data.client.TextureKey of(java.lang.String name) { return new yarnwrap.data.client.TextureKey(wrapperContained.of(name)); }
// public static yarnwrap.data.client.TextureKey of(java.lang.String name, ) { return new yarnwrap.data.client.TextureKey(net.minecraft.data.client.TextureKey.of(name)); }
// public yarnwrap.data.client.TextureKey of(java.lang.String name,yarnwrap.data.client.TextureKey parent) { return new yarnwrap.data.client.TextureKey(wrapperContained.of(name,parent.wrapperContained)); }
// public static yarnwrap.data.client.TextureKey of(java.lang.String name,yarnwrap.data.client.TextureKey parent, ) { return new yarnwrap.data.client.TextureKey(net.minecraft.data.client.TextureKey.of(name,parent.wrapperContained)); }

}