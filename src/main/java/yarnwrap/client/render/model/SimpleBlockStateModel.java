package yarnwrap.client.render.model;
public class SimpleBlockStateModel { public net.minecraft.client.render.model.SimpleBlockStateModel wrapperContained; public SimpleBlockStateModel(net.minecraft.client.render.model.SimpleBlockStateModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.BlockModelPart part() { return new yarnwrap.client.render.model.BlockModelPart(wrapperContained.part); }
// public void part(yarnwrap.client.render.model.BlockModelPart value) { wrapperContained.part = value.wrapperContained; }
// public static yarnwrap.client.render.model.BlockModelPart part() { return new yarnwrap.client.render.model.BlockModelPart(net.minecraft.client.render.model.SimpleBlockStateModel.part); }
// public static void part(yarnwrap.client.render.model.BlockModelPart value, ) { net.minecraft.client.render.model.SimpleBlockStateModel.part = value.wrapperContained; }

public SimpleBlockStateModel(yarnwrap.client.render.model.BlockModelPart part) { this.wrapperContained = new net.minecraft.client.render.model.SimpleBlockStateModel(part.wrapperContained); }

}