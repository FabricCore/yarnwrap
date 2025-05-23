package yarnwrap.client.render.model.json;
public class ModelVariant { public net.minecraft.client.render.model.json.ModelVariant wrapperContained; public ModelVariant(net.minecraft.client.render.model.json.ModelVariant wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(wrapperContained.modelId); }
// public void modelId(yarnwrap.util.Identifier value) { wrapperContained.modelId = value.wrapperContained; }
// public static yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelVariant.modelId); }
// public static void modelId(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.model.json.ModelVariant.modelId = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.model.json.ModelVariant.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.model.json.ModelVariant.CODEC = value; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.client.render.model.json.ModelVariant.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.client.render.model.json.ModelVariant.MAP_CODEC = value; }

public ModelVariant(yarnwrap.util.Identifier model) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelVariant(model.wrapperContained); }
// public ModelVariant(yarnwrap.util.Identifier location) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelVariant(location.wrapperContained); }
// public yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(wrapperContained.modelId()); }
// // public static yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelVariant.modelId()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.ModelVariant.equals(o); }
public yarnwrap.client.render.model.json.ModelVariant withModel(yarnwrap.util.Identifier modelId) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.withModel(modelId.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant withModel(yarnwrap.util.Identifier modelId, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.withModel(modelId.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_67937(Object instance) { return wrapperContained.method_67937(instance); }
// public static com.mojang.datafixers.kinds.App method_67937(Object instance, ) { return net.minecraft.client.render.model.json.ModelVariant.method_67937(instance); }
// public yarnwrap.client.render.model.json.ModelVariant setState(Object modelState) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.setState(modelState)); }
// public static yarnwrap.client.render.model.json.ModelVariant setState(Object modelState, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.setState(modelState)); }
public yarnwrap.client.render.model.json.ModelVariant with(yarnwrap.client.render.model.json.ModelVariantOperator variantOperator) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.with(variantOperator.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant with(yarnwrap.client.render.model.json.ModelVariantOperator variantOperator, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.with(variantOperator.wrapperContained)); }
public yarnwrap.client.render.model.json.ModelVariant withRotationX(yarnwrap.util.math.AxisRotation amount) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.withRotationX(amount.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant withRotationX(yarnwrap.util.math.AxisRotation amount, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.withRotationX(amount.wrapperContained)); }
public yarnwrap.client.render.model.json.ModelVariant withUVLock(boolean uvLock) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.withUVLock(uvLock)); }
// public static yarnwrap.client.render.model.json.ModelVariant withUVLock(boolean uvLock, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.withUVLock(uvLock)); }
public yarnwrap.client.render.model.json.ModelVariant withRotationY(yarnwrap.util.math.AxisRotation amount) { return new yarnwrap.client.render.model.json.ModelVariant(wrapperContained.withRotationY(amount.wrapperContained)); }
// public static yarnwrap.client.render.model.json.ModelVariant withRotationY(yarnwrap.util.math.AxisRotation amount, ) { return new yarnwrap.client.render.model.json.ModelVariant(net.minecraft.client.render.model.json.ModelVariant.withRotationY(amount.wrapperContained)); }

}