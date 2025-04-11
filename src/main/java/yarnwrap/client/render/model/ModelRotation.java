package yarnwrap.client.render.model;
public class ModelRotation { public net.minecraft.client.render.model.ModelRotation wrapperContained; public ModelRotation(net.minecraft.client.render.model.ModelRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.AffineTransformation value) { wrapperContained.rotation = value.wrapperContained; }
// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
// public void directionTransformation(yarnwrap.util.math.DirectionTransformation value) { wrapperContained.directionTransformation = value.wrapperContained; }
// public int MAX_ROTATION() { return wrapperContained.MAX_ROTATION; }
// public void MAX_ROTATION(int value) { wrapperContained.MAX_ROTATION = value; }
// public java.util.Map BY_INDEX() { return wrapperContained.BY_INDEX; }
// public void BY_INDEX(java.util.Map value) { wrapperContained.BY_INDEX = value; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
public yarnwrap.client.render.model.ModelRotation get(int x,int y) { return new yarnwrap.client.render.model.ModelRotation(wrapperContained.get(x,y)); }
// public int getIndex(int x,int y) { return wrapperContained.getIndex(x,y); }

}