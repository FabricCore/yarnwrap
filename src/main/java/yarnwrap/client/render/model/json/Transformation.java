package yarnwrap.client.render.model.json;
public class Transformation { public net.minecraft.client.render.model.json.Transformation wrapperContained; public Transformation(net.minecraft.client.render.model.json.Transformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.IDENTITY = value.wrapperContained; }
public static yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(net.minecraft.client.render.model.json.Transformation.IDENTITY); }
// public static void IDENTITY(yarnwrap.client.render.model.json.Transformation value, ) { net.minecraft.client.render.model.json.Transformation.IDENTITY = value.wrapperContained; }

public org.joml.Vector3f scale() { return wrapperContained.scale; }
// public void scale(org.joml.Vector3f value) { wrapperContained.scale = value; }
// public static org.joml.Vector3f scale() { return net.minecraft.client.render.model.json.Transformation.scale; }
// public static void scale(org.joml.Vector3f value, ) { net.minecraft.client.render.model.json.Transformation.scale = value; }

public org.joml.Vector3f translation() { return wrapperContained.translation; }
// public void translation(org.joml.Vector3f value) { wrapperContained.translation = value; }
// public static org.joml.Vector3f translation() { return net.minecraft.client.render.model.json.Transformation.translation; }
// public static void translation(org.joml.Vector3f value, ) { net.minecraft.client.render.model.json.Transformation.translation = value; }

public org.joml.Vector3f rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Vector3f value) { wrapperContained.rotation = value; }
// public static org.joml.Vector3f rotation() { return net.minecraft.client.render.model.json.Transformation.rotation; }
// public static void rotation(org.joml.Vector3f value, ) { net.minecraft.client.render.model.json.Transformation.rotation = value; }

public Transformation(org.joml.Vector3f rotation,org.joml.Vector3f translation,org.joml.Vector3f scale) { this.wrapperContained = new net.minecraft.client.render.model.json.Transformation(rotation,translation,scale); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.Transformation.equals(o); }
public void apply(boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.apply(leftHanded,matrices.wrapperContained); }
// public static void apply(boolean leftHanded,yarnwrap.client.util.math.MatrixStack matrices, ) { net.minecraft.client.render.model.json.Transformation.apply(leftHanded,matrices.wrapperContained); }

}