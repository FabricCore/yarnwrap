package yarnwrap.client.render.model.json;
public class MultipartModelComponent { public net.minecraft.client.render.model.json.MultipartModelComponent wrapperContained; public MultipartModelComponent(net.minecraft.client.render.model.json.MultipartModelComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional selector() { return wrapperContained.selector; }
// public void selector(java.util.Optional value) { wrapperContained.selector = value; }
// public static java.util.Optional selector() { return net.minecraft.client.render.model.json.MultipartModelComponent.selector; }
// public static void selector(java.util.Optional value, ) { net.minecraft.client.render.model.json.MultipartModelComponent.selector = value; }

// public Object model() { return wrapperContained.model; }
// // public void model(Object value) { wrapperContained.model = value; }
// // public static Object model() { return net.minecraft.client.render.model.json.MultipartModelComponent.model; }
// // public static void model(Object value, ) { net.minecraft.client.render.model.json.MultipartModelComponent.model = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.model.json.MultipartModelComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.model.json.MultipartModelComponent.CODEC = value; }

// public MultipartModelComponent(java.util.Optional model) { this.wrapperContained = new net.minecraft.client.render.model.json.MultipartModelComponent(model); }
// public java.util.Optional selector() { return wrapperContained.selector(); }
// // public static java.util.Optional selector() { return net.minecraft.client.render.model.json.MultipartModelComponent.selector(); }
// public Object model() { return wrapperContained.model(); }
// // public static Object model() { return net.minecraft.client.render.model.json.MultipartModelComponent.model(); }
public java.util.function.Predicate init(yarnwrap.state.StateManager value) { return wrapperContained.init(value.wrapperContained); }
// public static java.util.function.Predicate init(yarnwrap.state.StateManager value, ) { return net.minecraft.client.render.model.json.MultipartModelComponent.init(value.wrapperContained); }

}