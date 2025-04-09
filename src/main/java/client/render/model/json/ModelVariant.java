package yarnwrap.client.render.model.json;
public class ModelVariant { public net.minecraft.client.render.model.json.ModelVariant wrapperContained; public ModelVariant(net.minecraft.client.render.model.json.ModelVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
// public yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(wrapperContained.location); }
// public boolean uvLock() { return wrapperContained.uvLock; }
// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
public int getWeight() { return wrapperContained.getWeight(); }

}