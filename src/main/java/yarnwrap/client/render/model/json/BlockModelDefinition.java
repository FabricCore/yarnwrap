package yarnwrap.client.render.model.json;
public class BlockModelDefinition { public net.minecraft.client.render.model.json.BlockModelDefinition wrapperContained; public BlockModelDefinition(net.minecraft.client.render.model.json.BlockModelDefinition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional multipartModel() { return wrapperContained.multipartModel; }
// public void multipartModel(java.util.Optional value) { wrapperContained.multipartModel = value; }
// public static java.util.Optional multipartModel() { return net.minecraft.client.render.model.json.BlockModelDefinition.multipartModel; }
// public static void multipartModel(java.util.Optional value, ) { net.minecraft.client.render.model.json.BlockModelDefinition.multipartModel = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.model.json.BlockModelDefinition.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.model.json.BlockModelDefinition.LOGGER = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.model.json.BlockModelDefinition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.model.json.BlockModelDefinition.CODEC = value; }

// public java.util.Optional multipartModel() { return wrapperContained.multipartModel(); }
// // public static java.util.Optional multipartModel() { return net.minecraft.client.render.model.json.BlockModelDefinition.multipartModel(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.BlockModelDefinition.equals(o); }
public java.util.Map load(yarnwrap.state.StateManager stateManager,java.util.function.Supplier idSupplier) { return wrapperContained.load(stateManager.wrapperContained,idSupplier); }
// public static java.util.Map load(yarnwrap.state.StateManager stateManager,java.util.function.Supplier idSupplier, ) { return net.minecraft.client.render.model.json.BlockModelDefinition.load(stateManager.wrapperContained,idSupplier); }
// public com.mojang.datafixers.kinds.App method_67915(Object instance) { return wrapperContained.method_67915(instance); }
// public static com.mojang.datafixers.kinds.App method_67915(Object instance, ) { return net.minecraft.client.render.model.json.BlockModelDefinition.method_67915(instance); }
// public com.mojang.serialization.DataResult method_67917(yarnwrap.client.render.model.json.BlockModelDefinition modelDefinition) { return wrapperContained.method_67917(modelDefinition.wrapperContained); }
// public static com.mojang.serialization.DataResult method_67917(yarnwrap.client.render.model.json.BlockModelDefinition modelDefinition, ) { return net.minecraft.client.render.model.json.BlockModelDefinition.method_67917(modelDefinition.wrapperContained); }
// public void method_68504(yarnwrap.state.StateManager multipartModel) { wrapperContained.method_68504(multipartModel.wrapperContained); }
// public static void method_68504(yarnwrap.state.StateManager multipartModel, ) { net.minecraft.client.render.model.json.BlockModelDefinition.method_68504(multipartModel.wrapperContained); }
// public void method_68505(yarnwrap.state.StateManager simpleModels) { wrapperContained.method_68505(simpleModels.wrapperContained); }
// public static void method_68505(yarnwrap.state.StateManager simpleModels, ) { net.minecraft.client.render.model.json.BlockModelDefinition.method_68505(simpleModels.wrapperContained); }
// public void method_68506(java.util.Map state,yarnwrap.block.BlockState model) { wrapperContained.method_68506(state,model.wrapperContained); }
// public static void method_68506(java.util.Map state,yarnwrap.block.BlockState model, ) { net.minecraft.client.render.model.json.BlockModelDefinition.method_68506(state,model.wrapperContained); }

}