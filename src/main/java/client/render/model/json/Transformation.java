package yarnwrap.client.render.model.json;
public class Transformation { public net.minecraft.client.render.model.json.Transformation wrapperContained; public Transformation(net.minecraft.client.render.model.json.Transformation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.IDENTITY); }
public org.joml.Vector3f scale() { return wrapperContained.scale; }
public org.joml.Vector3f translation() { return wrapperContained.translation; }
public org.joml.Vector3f rotation() { return wrapperContained.rotation; }
public void apply(boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.apply(leftHanded,matrices.wrapperContained); }

}