package yarnwrap.client.render.model.json;
public class Transformation { public net.minecraft.client.render.model.json.Transformation wrapperContained; public Transformation(net.minecraft.client.render.model.json.Transformation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.IDENTITY = value.wrapperContained; }
public org.joml.Vector3f scale() { return wrapperContained.scale; }
// public void scale(org.joml.Vector3f value) { wrapperContained.scale = value; }
public org.joml.Vector3f translation() { return wrapperContained.translation; }
// public void translation(org.joml.Vector3f value) { wrapperContained.translation = value; }
public org.joml.Vector3f rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Vector3f value) { wrapperContained.rotation = value; }
public void apply(boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.apply(leftHanded,matrices.wrapperContained); }

}