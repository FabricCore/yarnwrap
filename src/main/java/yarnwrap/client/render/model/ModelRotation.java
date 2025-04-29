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

// public int MAX_ROTATION() { return wrapperContained.MAX_ROTATION; }
// public void MAX_ROTATION(int value) { wrapperContained.MAX_ROTATION = value; }
// public static int MAX_ROTATION() { return net.minecraft.client.render.model.ModelRotation.MAX_ROTATION; }
// public static void MAX_ROTATION(int value, ) { net.minecraft.client.render.model.ModelRotation.MAX_ROTATION = value; }

// public java.util.Map BY_INDEX() { return wrapperContained.BY_INDEX; }
// public void BY_INDEX(java.util.Map value) { wrapperContained.BY_INDEX = value; }
// public static java.util.Map BY_INDEX() { return net.minecraft.client.render.model.ModelRotation.BY_INDEX; }
// public static void BY_INDEX(java.util.Map value, ) { net.minecraft.client.render.model.ModelRotation.BY_INDEX = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.client.render.model.ModelRotation.index; }
// public static void index(int value, ) { net.minecraft.client.render.model.ModelRotation.index = value; }

// // public ModelRotation(java.lang.String x,int y) { this.wrapperContained = new net.minecraft.client.render.model.ModelRotation(x,y); }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
// public static yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(net.minecraft.client.render.model.ModelRotation.getDirectionTransformation()); }
// public yarnwrap.client.render.model.ModelRotation get(int x,int y) { return new yarnwrap.client.render.model.ModelRotation(wrapperContained.get(x,y)); }
// public static yarnwrap.client.render.model.ModelRotation get(int x,int y, ) { return new yarnwrap.client.render.model.ModelRotation(net.minecraft.client.render.model.ModelRotation.get(x,y)); }
// public yarnwrap.client.render.model.ModelRotation method_4700(yarnwrap.client.render.model.ModelRotation rotation) { return new yarnwrap.client.render.model.ModelRotation(wrapperContained.method_4700(rotation.wrapperContained)); }
// public static yarnwrap.client.render.model.ModelRotation method_4700(yarnwrap.client.render.model.ModelRotation rotation, ) { return new yarnwrap.client.render.model.ModelRotation(net.minecraft.client.render.model.ModelRotation.method_4700(rotation.wrapperContained)); }
// public java.lang.Integer method_4701(yarnwrap.client.render.model.ModelRotation rotation) { return wrapperContained.method_4701(rotation.wrapperContained); }
// public static java.lang.Integer method_4701(yarnwrap.client.render.model.ModelRotation rotation, ) { return net.minecraft.client.render.model.ModelRotation.method_4701(rotation.wrapperContained); }
// public int getIndex(int x,int y) { return wrapperContained.getIndex(x,y); }
// public static int getIndex(int x,int y, ) { return net.minecraft.client.render.model.ModelRotation.getIndex(x,y); }

}