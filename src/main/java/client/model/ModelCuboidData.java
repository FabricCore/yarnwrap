package yarnwrap.client.model;
public class ModelCuboidData { public net.minecraft.client.model.ModelCuboidData wrapperContained; public ModelCuboidData(net.minecraft.client.model.ModelCuboidData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public org.joml.Vector3f offset() { return wrapperContained.offset; }
// public org.joml.Vector3f dimensions() { return wrapperContained.dimensions; }
// public yarnwrap.client.model.Dilation extraSize() { return new yarnwrap.client.model.Dilation(wrapperContained.extraSize); }
// public boolean mirror() { return wrapperContained.mirror; }
// public yarnwrap.client.util.math.Vector2f textureUV() { return new yarnwrap.client.util.math.Vector2f(wrapperContained.textureUV); }
// public yarnwrap.client.util.math.Vector2f textureScale() { return new yarnwrap.client.util.math.Vector2f(wrapperContained.textureScale); }
// public java.util.Set directions() { return wrapperContained.directions; }
public Object createCuboid(int textureWidth,int textureHeight) { return wrapperContained.createCuboid(textureWidth,textureHeight); }

}