package yarnwrap.client.render.model.json;
public class ModelVariant { public net.minecraft.client.render.model.json.ModelVariant wrapperContained; public ModelVariant(net.minecraft.client.render.model.json.ModelVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(wrapperContained.location); }
// public void location(yarnwrap.util.Identifier value) { wrapperContained.location = value.wrapperContained; }
// public boolean uvLock() { return wrapperContained.uvLock; }
// public void uvLock(boolean value) { wrapperContained.uvLock = value; }
// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.AffineTransformation value) { wrapperContained.rotation = value.wrapperContained; }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
public int getWeight() { return wrapperContained.getWeight(); }

}