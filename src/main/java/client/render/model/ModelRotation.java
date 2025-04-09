package yarnwrap.client.render.model;
public class ModelRotation { public net.minecraft.client.render.model.ModelRotation wrapperContained; public ModelRotation(net.minecraft.client.render.model.ModelRotation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
// public yarnwrap.util.math.DirectionTransformation directionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.directionTransformation); }
// public int MAX_ROTATION() { return wrapperContained.MAX_ROTATION; }
// public java.util.Map BY_INDEX() { return wrapperContained.BY_INDEX; }
// public int index() { return wrapperContained.index; }
public yarnwrap.util.math.DirectionTransformation getDirectionTransformation() { return new yarnwrap.util.math.DirectionTransformation(wrapperContained.getDirectionTransformation()); }
public yarnwrap.client.render.model.ModelRotation get(int x,int y) { return new yarnwrap.client.render.model.ModelRotation(wrapperContained.get(x,y)); }
// public int getIndex(int x,int y) { return wrapperContained.getIndex(x,y); }

}