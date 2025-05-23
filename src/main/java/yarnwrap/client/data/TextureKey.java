package yarnwrap.client.data;
public class TextureKey { public net.minecraft.client.data.TextureKey wrapperContained; public TextureKey(net.minecraft.client.data.TextureKey wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.data.TextureKey.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.data.TextureKey.name = value; }

// public yarnwrap.client.data.TextureKey parent() { return new yarnwrap.client.data.TextureKey(wrapperContained.parent); }
// public void parent(yarnwrap.client.data.TextureKey value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.data.TextureKey parent() { return new yarnwrap.client.data.TextureKey(net.minecraft.client.data.TextureKey.parent); }
// public static void parent(yarnwrap.client.data.TextureKey value, ) { net.minecraft.client.data.TextureKey.parent = value.wrapperContained; }

// public TextureKey(java.lang.String name,yarnwrap.client.data.TextureKey parent) { this.wrapperContained = new net.minecraft.client.data.TextureKey(name,parent.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.data.TextureKey.getName(); }
public yarnwrap.client.data.TextureKey getParent() { return new yarnwrap.client.data.TextureKey(wrapperContained.getParent()); }
// public static yarnwrap.client.data.TextureKey getParent() { return new yarnwrap.client.data.TextureKey(net.minecraft.client.data.TextureKey.getParent()); }
// public yarnwrap.client.data.TextureKey of(java.lang.String name) { return new yarnwrap.client.data.TextureKey(wrapperContained.of(name)); }
// public static yarnwrap.client.data.TextureKey of(java.lang.String name, ) { return new yarnwrap.client.data.TextureKey(net.minecraft.client.data.TextureKey.of(name)); }
// public yarnwrap.client.data.TextureKey of(java.lang.String name,yarnwrap.client.data.TextureKey parent) { return new yarnwrap.client.data.TextureKey(wrapperContained.of(name,parent.wrapperContained)); }
// public static yarnwrap.client.data.TextureKey of(java.lang.String name,yarnwrap.client.data.TextureKey parent, ) { return new yarnwrap.client.data.TextureKey(net.minecraft.client.data.TextureKey.of(name,parent.wrapperContained)); }

}