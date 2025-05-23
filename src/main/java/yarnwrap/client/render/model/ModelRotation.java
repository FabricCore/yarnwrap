package yarnwrap.client.render.model;
public class ModelRotation { public net.minecraft.client.render.model.ModelRotation wrapperContained; public ModelRotation(net.minecraft.client.render.model.ModelRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.AffineTransformation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(net.minecraft.client.render.model.ModelRotation.rotation); }
// public static void rotation(yarnwrap.util.math.AffineTransformation value, ) { net.minecraft.client.render.model.ModelRotation.rotation = value.wrapperContained; }

// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
// public void directionTransformation(yarnwrap.util.math.DirectionTransformation value) { wrapperContained.directionTransformation = value.wrapperContained; }
// public static yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.client.render.model.ModelRotation.directionTransformation); }
// public static void directionTransformation(yarnwrap.util.math.DirectionTransformation value, ) { net.minecraft.client.render.model.ModelRotation.directionTransformation = value.wrapperContained; }

// public net.minecraft.client.render.model.ModelRotation[][] ROTATION_MAP() { return wrapperContained.ROTATION_MAP; }
// public void ROTATION_MAP(net.minecraft.client.render.model.ModelRotation[][] value) { wrapperContained.ROTATION_MAP = value; }
// public static net.minecraft.client.render.model.ModelRotation[][] ROTATION_MAP() { return net.minecraft.client.render.model.ModelRotation.ROTATION_MAP; }
// public static void ROTATION_MAP(net.minecraft.client.render.model.ModelRotation[][] value, ) { net.minecraft.client.render.model.ModelRotation.ROTATION_MAP = value; }

// public yarnwrap.util.math.AxisRotation xRotation() { return new yarnwrap.util.math.AxisRotation(wrapperContained.xRotation); }
// public void xRotation(yarnwrap.util.math.AxisRotation value) { wrapperContained.xRotation = value.wrapperContained; }
// public static yarnwrap.util.math.AxisRotation xRotation() { return new yarnwrap.util.math.AxisRotation(net.minecraft.client.render.model.ModelRotation.xRotation); }
// public static void xRotation(yarnwrap.util.math.AxisRotation value, ) { net.minecraft.client.render.model.ModelRotation.xRotation = value.wrapperContained; }

// public yarnwrap.util.math.AxisRotation yRotation() { return new yarnwrap.util.math.AxisRotation(wrapperContained.yRotation); }
// public void yRotation(yarnwrap.util.math.AxisRotation value) { wrapperContained.yRotation = value.wrapperContained; }
// public static yarnwrap.util.math.AxisRotation yRotation() { return new yarnwrap.util.math.AxisRotation(net.minecraft.client.render.model.ModelRotation.yRotation); }
// public static void yRotation(yarnwrap.util.math.AxisRotation value, ) { net.minecraft.client.render.model.ModelRotation.yRotation = value.wrapperContained; }

// public java.util.Map faces() { return wrapperContained.faces; }
// public void faces(java.util.Map value) { wrapperContained.faces = value; }
// public static java.util.Map faces() { return net.minecraft.client.render.model.ModelRotation.faces; }
// public static void faces(java.util.Map value, ) { net.minecraft.client.render.model.ModelRotation.faces = value; }

// public java.util.Map invertedFaces() { return wrapperContained.invertedFaces; }
// public void invertedFaces(java.util.Map value) { wrapperContained.invertedFaces = value; }
// public static java.util.Map invertedFaces() { return net.minecraft.client.render.model.ModelRotation.invertedFaces; }
// public static void invertedFaces(java.util.Map value, ) { net.minecraft.client.render.model.ModelRotation.invertedFaces = value; }

// public Object uvModel() { return wrapperContained.uvModel; }
// // public void uvModel(Object value) { wrapperContained.uvModel = value; }
// // public static Object uvModel() { return net.minecraft.client.render.model.ModelRotation.uvModel; }
// // public static void uvModel(Object value, ) { net.minecraft.client.render.model.ModelRotation.uvModel = value; }

// // public ModelRotation(java.lang.String x,int y) { this.wrapperContained = new net.minecraft.client.render.model.ModelRotation(x,y); }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
// public static yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.client.render.model.ModelRotation.getDirectionTransformation()); }
// public yarnwrap.client.render.model.ModelRotation rotate(yarnwrap.util.math.AxisRotation xRotation,yarnwrap.util.math.AxisRotation yRotation) { return new yarnwrap.client.render.model.ModelRotation(wrapperContained.rotate(xRotation.wrapperContained,yRotation.wrapperContained)); }
// public static yarnwrap.client.render.model.ModelRotation rotate(yarnwrap.util.math.AxisRotation xRotation,yarnwrap.util.math.AxisRotation yRotation, ) { return new yarnwrap.client.render.model.ModelRotation(net.minecraft.client.render.model.ModelRotation.rotate(xRotation.wrapperContained,yRotation.wrapperContained)); }
public yarnwrap.client.render.model.ModelBakeSettings getUVModel() { return new yarnwrap.client.render.model.ModelBakeSettings(wrapperContained.getUVModel()); }
// public static yarnwrap.client.render.model.ModelBakeSettings getUVModel() { return new yarnwrap.client.render.model.ModelBakeSettings(net.minecraft.client.render.model.ModelRotation.getUVModel()); }

}