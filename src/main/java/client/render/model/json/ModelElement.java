package yarnwrap.client.render.model.json;
public class ModelElement { public net.minecraft.client.render.model.json.ModelElement wrapperContained; public ModelElement(net.minecraft.client.render.model.json.ModelElement wrapperContained) { this.wrapperContained = wrapperContained; }

public org.joml.Vector3f from() { return wrapperContained.from; }
public boolean shade() { return wrapperContained.shade; }
public java.util.Map faces() { return wrapperContained.faces; }
public org.joml.Vector3f to() { return wrapperContained.to; }
public yarnwrap.client.render.model.json.ModelRotation rotation() { return new yarnwrap.client.render.model.json.ModelRotation(wrapperContained.rotation); }
// public float[] getRotatedMatrix(yarnwrap.util.math.Direction direction) { return wrapperContained.getRotatedMatrix(direction.wrapperContained); }
// public void initTextures() { wrapperContained.initTextures(); }

}