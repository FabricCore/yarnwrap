package yarnwrap.client.render.block.entity;
public class BrushableBlockEntityRenderer { public net.minecraft.client.render.block.entity.BrushableBlockEntityRenderer wrapperContained; public BrushableBlockEntityRenderer(net.minecraft.client.render.block.entity.BrushableBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public BrushableBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.BrushableBlockEntityRenderer(context); }
// public float[] getTranslation(yarnwrap.util.math.Direction direction,int dustedLevel) { return wrapperContained.getTranslation(direction.wrapperContained,dustedLevel); }

}