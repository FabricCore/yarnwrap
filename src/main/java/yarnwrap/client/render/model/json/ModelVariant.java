package yarnwrap.client.render.model.json;
public class ModelVariant { public net.minecraft.client.render.model.json.ModelVariant wrapperContained; public ModelVariant(net.minecraft.client.render.model.json.ModelVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public int weight() { return wrapperContained.weight; }
// public void weight(int value) { wrapperContained.weight = value; }
// public static int weight() { return net.minecraft.client.render.model.json.ModelVariant.weight; }
// public static void weight(int value, ) { net.minecraft.client.render.model.json.ModelVariant.weight = value; }

// public yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(wrapperContained.location); }
// public void location(yarnwrap.util.Identifier value) { wrapperContained.location = value.wrapperContained; }
// public static yarnwrap.util.Identifier location() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelVariant.location); }
// public static void location(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.model.json.ModelVariant.location = value.wrapperContained; }

// public boolean uvLock() { return wrapperContained.uvLock; }
// public void uvLock(boolean value) { wrapperContained.uvLock = value; }
// public static boolean uvLock() { return net.minecraft.client.render.model.json.ModelVariant.uvLock; }
// public static void uvLock(boolean value, ) { net.minecraft.client.render.model.json.ModelVariant.uvLock = value; }

// public yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.rotation); }
// public void rotation(yarnwrap.util.math.AffineTransformation value) { wrapperContained.rotation = value.wrapperContained; }
// public static yarnwrap.util.math.AffineTransformation rotation() { return new yarnwrap.util.math.AffineTransformation(net.minecraft.client.render.model.json.ModelVariant.rotation); }
// public static void rotation(yarnwrap.util.math.AffineTransformation value, ) { net.minecraft.client.render.model.json.ModelVariant.rotation = value.wrapperContained; }

public ModelVariant(yarnwrap.util.Identifier location,yarnwrap.util.math.AffineTransformation rotation,boolean uvLock,int weight) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelVariant(location.wrapperContained,rotation.wrapperContained,uvLock,weight); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.ModelVariant.equals(o); }
public yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(wrapperContained.getLocation()); }
// public static yarnwrap.util.Identifier getLocation() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelVariant.getLocation()); }
public int getWeight() { return wrapperContained.getWeight(); }
// public static int getWeight() { return net.minecraft.client.render.model.json.ModelVariant.getWeight(); }

}