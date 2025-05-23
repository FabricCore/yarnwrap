package yarnwrap.client.render.model.json;
public class MultipartModelCondition { public net.minecraft.client.render.model.json.MultipartModelCondition wrapperContained; public MultipartModelCondition(net.minecraft.client.render.model.json.MultipartModelCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.model.json.MultipartModelCondition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.model.json.MultipartModelCondition.CODEC = value; }

public java.util.function.Predicate instantiate(yarnwrap.state.StateManager value) { return wrapperContained.instantiate(value.wrapperContained); }
// public static java.util.function.Predicate instantiate(yarnwrap.state.StateManager value, ) { return net.minecraft.client.render.model.json.MultipartModelCondition.instantiate(value.wrapperContained); }
// public com.mojang.serialization.Codec method_67954(com.mojang.serialization.Codec group) { return wrapperContained.method_67954(group); }
// public static com.mojang.serialization.Codec method_67954(com.mojang.serialization.Codec group, ) { return net.minecraft.client.render.model.json.MultipartModelCondition.method_67954(group); }

}