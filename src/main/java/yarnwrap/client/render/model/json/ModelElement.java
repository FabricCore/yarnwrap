package yarnwrap.client.render.model.json;
public class ModelElement { public net.minecraft.client.render.model.json.ModelElement wrapperContained; public ModelElement(net.minecraft.client.render.model.json.ModelElement wrapperContained) { this.wrapperContained = wrapperContained; }

public org.joml.Vector3f from() { return wrapperContained.from; }
// public void from(org.joml.Vector3f value) { wrapperContained.from = value; }
// public static org.joml.Vector3f from() { return net.minecraft.client.render.model.json.ModelElement.from; }
// public static void from(org.joml.Vector3f value, ) { net.minecraft.client.render.model.json.ModelElement.from = value; }

public boolean shade() { return wrapperContained.shade; }
// public void shade(boolean value) { wrapperContained.shade = value; }
// public static boolean shade() { return net.minecraft.client.render.model.json.ModelElement.shade; }
// public static void shade(boolean value, ) { net.minecraft.client.render.model.json.ModelElement.shade = value; }

public java.util.Map faces() { return wrapperContained.faces; }
// public void faces(java.util.Map value) { wrapperContained.faces = value; }
// public static java.util.Map faces() { return net.minecraft.client.render.model.json.ModelElement.faces; }
// public static void faces(java.util.Map value, ) { net.minecraft.client.render.model.json.ModelElement.faces = value; }

public org.joml.Vector3f to() { return wrapperContained.to; }
// public void to(org.joml.Vector3f value) { wrapperContained.to = value; }
// public static org.joml.Vector3f to() { return net.minecraft.client.render.model.json.ModelElement.to; }
// public static void to(org.joml.Vector3f value, ) { net.minecraft.client.render.model.json.ModelElement.to = value; }

public yarnwrap.client.render.model.json.ModelRotation rotation() { return new yarnwrap.client.render.model.json.ModelRotation(wrapperContained.rotation); }
// public void rotation(yarnwrap.client.render.model.json.ModelRotation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelRotation rotation() { return new yarnwrap.client.render.model.json.ModelRotation(net.minecraft.client.render.model.json.ModelElement.rotation); }
// public static void rotation(yarnwrap.client.render.model.json.ModelRotation value, ) { net.minecraft.client.render.model.json.ModelElement.rotation = value.wrapperContained; }

public ModelElement(org.joml.Vector3f from,org.joml.Vector3f to,java.util.Map faces,yarnwrap.client.render.model.json.ModelRotation rotation,boolean shade) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelElement(from,to,faces,rotation.wrapperContained,shade); }
// public float[] getRotatedMatrix(yarnwrap.util.math.Direction direction) { return wrapperContained.getRotatedMatrix(direction.wrapperContained); }
// public static float[] getRotatedMatrix(yarnwrap.util.math.Direction direction, ) { return net.minecraft.client.render.model.json.ModelElement.getRotatedMatrix(direction.wrapperContained); }
// public void initTextures() { wrapperContained.initTextures(); }
// public static void initTextures() { net.minecraft.client.render.model.json.ModelElement.initTextures(); }

}