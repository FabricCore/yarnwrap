package yarnwrap.client.render.model.json;
public class Transformation { public net.minecraft.client.render.model.json.Transformation wrapperContained; public Transformation(net.minecraft.client.render.model.json.Transformation wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Vector3fc rotation() { return wrapperContained.rotation; }
// public void rotation(org.joml.Vector3fc value) { wrapperContained.rotation = value; }
// public static org.joml.Vector3fc rotation() { return net.minecraft.client.render.model.json.Transformation.rotation; }
// public static void rotation(org.joml.Vector3fc value, ) { net.minecraft.client.render.model.json.Transformation.rotation = value; }

// public org.joml.Vector3fc translation() { return wrapperContained.translation; }
// public void translation(org.joml.Vector3fc value) { wrapperContained.translation = value; }
// public static org.joml.Vector3fc translation() { return net.minecraft.client.render.model.json.Transformation.translation; }
// public static void translation(org.joml.Vector3fc value, ) { net.minecraft.client.render.model.json.Transformation.translation = value; }

// public org.joml.Vector3fc scale() { return wrapperContained.scale; }
// public void scale(org.joml.Vector3fc value) { wrapperContained.scale = value; }
// public static org.joml.Vector3fc scale() { return net.minecraft.client.render.model.json.Transformation.scale; }
// public static void scale(org.joml.Vector3fc value, ) { net.minecraft.client.render.model.json.Transformation.scale = value; }

// public yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.IDENTITY); }
// public void IDENTITY(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.IDENTITY = value.wrapperContained; }
public static yarnwrap.client.render.model.json.Transformation IDENTITY() { return new yarnwrap.client.render.model.json.Transformation(net.minecraft.client.render.model.json.Transformation.IDENTITY); }
// public static void IDENTITY(yarnwrap.client.render.model.json.Transformation value, ) { net.minecraft.client.render.model.json.Transformation.IDENTITY = value.wrapperContained; }

// public org.joml.Vector3fc rotation() { return wrapperContained.rotation(); }
// // public static org.joml.Vector3fc rotation() { return net.minecraft.client.render.model.json.Transformation.rotation(); }
// public org.joml.Vector3fc translation() { return wrapperContained.translation(); }
// // public static org.joml.Vector3fc translation() { return net.minecraft.client.render.model.json.Transformation.translation(); }
// public org.joml.Vector3fc scale() { return wrapperContained.scale(); }
// // public static org.joml.Vector3fc scale() { return net.minecraft.client.render.model.json.Transformation.scale(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.Transformation.equals(o); }
// public void apply(boolean leftHanded) { wrapperContained.apply(leftHanded); }
// public static void apply(boolean leftHanded, ) { net.minecraft.client.render.model.json.Transformation.apply(leftHanded); }

}