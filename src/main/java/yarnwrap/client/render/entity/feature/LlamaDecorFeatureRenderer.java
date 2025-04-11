package yarnwrap.client.render.entity.feature;
public class LlamaDecorFeatureRenderer { public net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer wrapperContained; public LlamaDecorFeatureRenderer(net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TRADER_LLAMA_DECOR() { return new yarnwrap.util.Identifier(wrapperContained.TRADER_LLAMA_DECOR); }
// public void TRADER_LLAMA_DECOR(yarnwrap.util.Identifier value) { wrapperContained.TRADER_LLAMA_DECOR = value.wrapperContained; }
// public net.minecraft.util.Identifier[] LLAMA_DECOR() { return wrapperContained.LLAMA_DECOR; }
// public void LLAMA_DECOR(net.minecraft.util.Identifier[] value) { wrapperContained.LLAMA_DECOR = value; }
// public yarnwrap.client.render.entity.model.LlamaEntityModel model() { return new yarnwrap.client.render.entity.model.LlamaEntityModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.entity.model.LlamaEntityModel value) { wrapperContained.model = value.wrapperContained; }
public LlamaDecorFeatureRenderer(yarnwrap.client.render.entity.feature.FeatureRendererContext context,yarnwrap.client.render.entity.model.EntityModelLoader loader) { this.wrapperContained = new net.minecraft.client.render.entity.feature.LlamaDecorFeatureRenderer(context.wrapperContained,loader.wrapperContained); }

}